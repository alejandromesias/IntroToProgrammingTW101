package com.amesiastwu;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int numberToFactor){
        int number = numberToFactor;

        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                factors.add(i);
                number /= i;
            }
        }
        return factors;
    }
}
