import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildrenPriceTest {
    
    ChildrenPrice childrenPrice = new ChildrenPrice();
    
    @Test
    public void should_return_1_5_when_rental_days_2() {
        double result = childrenPrice.getCharge(2);
        
        assertEquals(1.5, result, 0);
    }
    
    @Test
    public void should_return_3_when_rental_days_4() {
        double result = childrenPrice.getCharge(4);
        
        assertEquals(3, result, 0);
    }
    
}