package com.github.pozo;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void settersGetters() throws Exception {
        // GIVEN
        String toyota = "Toyota";
        int doors = 2;
        int wheels = 4;

        Car car = new Car(toyota, doors, wheels);
        // WHEN
        String brandName = car.getBrandName();
        int doorsNumber = car.getDoorsNumber();
        int wheelsNumber = car.getWheelsNumber();
        // THEN
        assertEquals(toyota, brandName);
        assertEquals(doors, doorsNumber);
        assertEquals(wheels, wheelsNumber);
    }

    @Test
    public void hasTwoDoor() throws Exception {
        // GIVEN
        Car car = new Car("Toyota", 2, 4);
        // WHEN
        boolean hasTwoDoor = car.hasTwoDoor();
        // THEN
        assertTrue(true);
    }

    @Test
    public void hasNotTwoDoor() throws Exception {
        // GIVEN
        Car car = new Car("Toyota", 3, 4);
        // WHEN
        boolean hasTwoDoor = car.hasTwoDoor();
        // THEN
        assertFalse(hasTwoDoor);
    }

    @Test
    public void doorsNumberIsEven() throws Exception {
        // GIVEN
        Car car = new Car("Toyota", 4, 4);
        // WHEN
        boolean isEven = car.doorsNumberIsEven();
        // THEN
        assertTrue(isEven);
    }

    @Test
    public void add() throws Exception {
        // GIVEN
        Car car = new Car("Toyota", 4, 4);
        // WHEN
        int result = car.add(2, 2);
        // THEN
        assertEquals(4,result);
    }

    @Test
    public void isJapanToyota() throws Exception {
        // GIVEN
        Car car = new Car("Toyota", 3, 4);
        // WHEN
        boolean result = car.isJapan();
        // THEN
        assertTrue(result);
    }

    @Test
    public void isJapanHonda() throws Exception {
        // GIVEN
        Car car = new Car("Honda", 3, 4);
        // WHEN
        boolean result = car.isJapan();
        // THEN
        assertTrue(result);
    }

    @Test
    public void isNotJapan() throws Exception {
        // GIVEN
        Car car = new Car("Audi", 3, 4);
        // WHEN
        boolean result = car.isJapan();
        // THEN
        assertFalse(result);
    }
}