package Liskov_substitution_principle.with_liskov_substitution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumit on 9/15/2018.
 */
public class TestTransPortationDevice {
    public static void main(String[] args) {

        DevicesWithEngines devicesWithEngines = new Car();
        devicesWithEngines.startEngine();

        DevicesWithoutEngines devicesWithoutEngines = new Bicycle();
        devicesWithoutEngines.startMoving();
    }
}

