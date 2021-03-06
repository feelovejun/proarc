/*
 * Copyright (C) 2012 Jan Pokorsky
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package cz.cas.lib.proarc.common.mods.custom;

import cz.cas.lib.proarc.common.mods.ModsUtils;
import cz.cas.lib.proarc.common.mods.custom.ArrayMapper.ArrayItem;
import cz.cas.lib.proarc.common.mods.custom.PhysicalDescriptionMapper.ExtentItem;
import cz.cas.lib.proarc.common.mods.custom.PhysicalDescriptionMapper.ExtentPair;
import cz.cas.lib.proarc.common.mods.custom.PhysicalDescriptionMapper.NoteItem;
import cz.cas.lib.proarc.common.mods.custom.PhysicalDescriptionMapper.UnkownItem;
import cz.cas.lib.proarc.mods.ModsDefinition;
import cz.cas.lib.proarc.mods.ObjectFactory;
import java.util.Arrays;
import java.util.List;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jan Pokorsky
 */
public class PhysicalDescriptionMapperTest {

    private ObjectFactory factory = new ObjectFactory();

    public PhysicalDescriptionMapperTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testRead() {
        String xml = "<mods xmlns='http://www.loc.gov/mods/v3'>"
                + "<physicalDescription>"
                + "<extent>extent1[0]</extent>"
                + "<extent>size1[1]</extent>"
                + "<note/>"
                + "<extent>extent2[3]</extent>"
                + "<extent>size2[4]</extent>"
                + "<extent>extent3[5]</extent>"
                + "<internetMediaType>m</internetMediaType>"
                + "</physicalDescription>"
                + "</mods>";
        ModsDefinition mods = ModsUtils.unmarshal(xml, ModsDefinition.class);
        List<ArrayItem> expectedItems = Arrays.asList(
                new ExtentItem(0, "extent1[0]"),
                new ExtentItem(1, "size1[1]"),
                new ExtentItem(2, "extent2[3]"),
                new ExtentItem(3, "size2[4]"),
                new ExtentItem(4, "extent3[5]"),
                new NoteItem(5, "", null)
//                new UnkownItem(6)
                );

        PhysicalDescriptionMapper instance = new PhysicalDescriptionMapper();
        List<ArrayItem> result = instance.map(mods);
//        assertArrayEquals(expectedItems.toArray(), result.toArray());
        assertThat(result, Is.is(expectedItems));
    }

    @Test
    public void testWritePairs() {
        String xml = "<mods xmlns='http://www.loc.gov/mods/v3'>"
                + "<physicalDescription>"
                + "<extent>extent1[0]</extent>"
                + "<extent>size1[1]</extent>"
                + "<internetMediaType>m</internetMediaType>"
                + "<extent>extent2[3]</extent>"
                + "<extent>size2[4]</extent>"
                + "<extent>extent3[5]</extent>"
                + "</physicalDescription>"
                + "</mods>";
        ModsDefinition mods = ModsUtils.unmarshal(xml, ModsDefinition.class);

        List<ExtentPair> pairs = Arrays.asList(
//                new ExtentPair("extent1[0]", 0, "size1[1]", 1), // delete
                new ExtentPair("extent2-updated[3]", 2, "size2-updated[4]", 3), // update
                new ExtentPair("extent3[5]", 4, null, null), // add size
                new ExtentPair("extent[new][7]", null, "size[new][8]", null) // add
                );
        PhysicalDescriptionMapper instance = new PhysicalDescriptionMapper();
        instance.mapPairs(mods, pairs);
        List<ArrayItem> result = instance.map(mods);
        List<ArrayItem> expectedItems = Arrays.asList(
                new ExtentItem(0, "extent2-updated[3]"),
                new ExtentItem(1, "size2-updated[4]"),
                new ExtentItem(2, "extent3[5]"),
                new ExtentItem(3, null),
                new ExtentItem(4, "extent[new][7]"),
                new ExtentItem(5, "size[new][8]")
//                new UnkownItem(6)
                );
        assertThat(result, Is.is(expectedItems));
    }

    @Test
    public void testToPairs() {
        List<ArrayItem> items = Arrays.asList(
                new ExtentItem(0, "extent1[0]"),
                new ExtentItem(1, "size1[1]"),
                new UnkownItem(2),
                new ExtentItem(3, "extent2[3]"),
                new ExtentItem(4, "size2[4]"),
                new ExtentItem(5, "extent3[5]")
                );
        List<ExtentPair> expected = Arrays.asList(
                new ExtentPair("extent1[0]", 0, "size1[1]", 1),
                new ExtentPair("extent2[3]", 3, "size2[4]", 4),
                new ExtentPair("extent3[5]", 5, null, null)
                );
        List<ExtentPair> result = PhysicalDescriptionMapper.toPairs(items);
        assertThat(result, Is.is(expected));
    }

    @Test
    public void testToExtents() {
        List<ExtentPair> pairs = Arrays.asList(
                new ExtentPair("extent1[0]", 0, "size1[1]", 1),
                new ExtentPair("extent2[3]", 3, "size2[4]", 4),
                new ExtentPair("extent3[5]", 5, null, null),
                new ExtentPair("extent[new][7]", null, "size[new][8]", null)
                );
        List<ExtentItem> expected = Arrays.asList(
                new ExtentItem(0, "extent1[0]"),
                new ExtentItem(1, "size1[1]"),
                new ExtentItem(3, "extent2[3]"),
                new ExtentItem(4, "size2[4]"),
                new ExtentItem(5, "extent3[5]"),
                new ExtentItem(null, null),
                new ExtentItem(null, "extent[new][7]"),
                new ExtentItem(null, "size[new][8]")
                );
        List<ExtentItem> result = PhysicalDescriptionMapper.toExtents(pairs);
        assertThat(result, Is.is(expected));
    }
}
