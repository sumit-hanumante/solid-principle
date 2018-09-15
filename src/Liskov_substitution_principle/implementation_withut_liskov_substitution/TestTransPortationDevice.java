package Liskov_substitution_principle.implementation_withut_liskov_substitution;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sumit on 9/15/2018.
 */
public class TestTransPortationDevice {
    public static void main(String[] args) {

        List<TransportationDevice> transportationDevices = new ArrayList<>();

        transportationDevices.add(new Car());
        transportationDevices.add(new Bicycle());

        transportationDevices.forEach(TransportationDevice::startEngine);
    }
}

