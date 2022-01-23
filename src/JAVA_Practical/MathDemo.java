package JAVA_Practical;

import java.math.*;
//import java.util.*;

public class MathDemo {

    public static void main(String[] args) {

        BigInteger bInt  = BigInteger.valueOf(999999999);
        BigInteger aInt  = BigInteger.valueOf(999999999);
        
        BigDecimal bDec = BigDecimal.valueOf(9999999999999999999.34534534d);
  
        System.out.println(bInt.add(aInt));
        System.out.println(bDec);
        
        System.out.println(Math.pow(4, 2));
        System.out.println(Math.max(5, 8));
        
    }
}
