package Test;

import java.math.BigInteger;

public class factorial {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger rvalue = BigInteger.ONE;
        for(int i = 2; i <= value; i++) {
            rvalue = rvalue.multiply(BigInteger.valueOf(i));
        }
        return rvalue; // your implementation here
    }
}
