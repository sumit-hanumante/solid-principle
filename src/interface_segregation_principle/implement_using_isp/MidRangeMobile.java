package interface_segregation_principle.implement_using_isp;

import java.awt.image.ImageConsumer;

/**
 * Created by sumit on 9/18/2018.
 */
public class MidRangeMobile implements IMobile {
    @Override
    public void call() {
        System.out.println("I can scan call");
    }
}
