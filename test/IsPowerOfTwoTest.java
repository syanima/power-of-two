import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class IsPowerOfTwoTest {
    @Test
    public void should_give_true_for_power_of_two() {
        IsPowerOfTwo obj = new IsPowerOfTwo(16);
        assertEquals(true, obj.isPower());
    }
    @Test
    public void should_give_false_for_power_of_two() {
        IsPowerOfTwo obj = new IsPowerOfTwo(19);
        assertEquals(false, obj.isPower());
    }
    @Test
    public void should_give_true_for_the_number_which_is_power_of_two() {
        IsPowerOfTwo obj = new IsPowerOfTwo(32);
        assertEquals(true, obj.isPowerOfTwo());
    }
    @Test
    public void should_give_false_for_the_number_which_is_not_power_of_two() {
        IsPowerOfTwo obj = new IsPowerOfTwo(87);
        assertEquals(false, obj.isPowerOfTwo());
    }
    @Test
    public void should_give_true_for_the_number_which_is_power_of_two_using_reg_ex() {
        IsPowerOfTwo obj = new IsPowerOfTwo(4);
        assertEquals(true, obj.ispowerOfTwoUsingregEx());
    }
    @Test
    public void should_give_false_for_the_number_which_is_not_power_of_two_using_reg_ex() {
        IsPowerOfTwo obj = new IsPowerOfTwo(7);
        assertEquals(false, obj.ispowerOfTwoUsingregEx());
    }
}
