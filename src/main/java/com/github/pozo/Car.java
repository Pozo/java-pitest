package com.github.pozo;

public class Car {
    final String brandName;
    final int doorsNumber;
    final int wheelsNumber;

    public Car(String brandName, int doorsNumber, int wheelsNumber) {
        this.brandName = brandName;
        this.doorsNumber = doorsNumber;
        this.wheelsNumber = wheelsNumber;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public boolean hasTwoDoor() {
        if (doorsNumber == 2) {
            return true;
        } else {
            return false;
        }
    }

    public int add(int a, int b) {
        return a + b;
    }

    public boolean doorsNumberIsEven() {
        return doorsNumber % 2 == 0;
    }

    public boolean isJapan() {
        if (brandName.equals("Toyota")) {
            return true;
        } else if (brandName.equals("Honda")) {
            return true;
        } else {
            return false;
        }
    }
}
