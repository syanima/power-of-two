import java.util.regex.Pattern;

/**
 * Created by syanima on 01/03/16.
 */

public class IsPowerOfTwo {
    private int number;
    private String binaryRepresentation;
    public IsPowerOfTwo(int number){
        this.number = number;
    }
    public boolean isPower(){
        return ((number-1) | (number)) == (number * 2 - 1);
    }

    public boolean isPowerOfTwo(){
        return (number & number - 1)==0;
    }

    public boolean ispowerOfTwoUsingregEx(){
        String rg = "^10*$";
        binaryRepresentation  = Integer.toBinaryString(number);
        return Pattern.matches(rg,binaryRepresentation);
    }

    public static void main(String[] args) {
        IsPowerOfTwo power = new IsPowerOfTwo(8);
        System.out.println(power.isPower());
        IsPowerOfTwo pow = new IsPowerOfTwo(6);
        System.out.println(pow.isPowerOfTwo());
        IsPowerOfTwo po = new IsPowerOfTwo(64);
        System.out.println(po.ispowerOfTwoUsingregEx());
    }
}
