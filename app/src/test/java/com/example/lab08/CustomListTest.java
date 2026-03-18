package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // should fail
        assertTrue(list.hasCity(calgary));
    }

    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        list.deleteCity(calgary);
        assertFalse(list.hasCity(calgary));
    }

    public void testCountCities() {
        CustomList list = new CustomList();
        assertEquals(0, list.countCities());
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        assertEquals(1, list.countCities());
        list.deleteCity(calgary);
        assertEquals(0, list.countCities());
        assertFalse(list.hasCity(calgary));
    }
}
