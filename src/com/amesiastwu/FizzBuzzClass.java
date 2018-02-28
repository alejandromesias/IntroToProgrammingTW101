package com.amesiastwu;

public class FizzBuzzClass {
     public static void FizzBuzz(){
         final int inicio = 1;
         final int fin = 100;

         for(int i = inicio; i <= fin; i++ ){
             String numberToPrint = evaluateNumber(i);
             System.out.println(numberToPrint);
         }

     }

     private static String evaluateNumber(int integer){
         int firstDivisor = 3;
         int secondDivisor = 5;

         if(integer % firstDivisor == 0 && integer % secondDivisor == 0){
             return "FizzBuzz";
         }

         if(integer % firstDivisor == 0){
             return "Fizz";
         }

         if(integer % secondDivisor == 0){
             return "Buzz";
         }

         return Integer.toString(integer);
     }
}
