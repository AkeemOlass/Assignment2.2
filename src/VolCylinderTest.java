import org.junit.Assert;

import static org.junit.Assert.*;

public class VolCylinderTest {
    @org.junit.Test
    public void vol() throws Exception {

            float expected_result = VolCylinder.vol( 5 ,  8) ;
        System.out.println("the expected result is " + expected_result);
            Assert.assertEquals( expected_result , 52 , (float) 0.0001);
    }

}