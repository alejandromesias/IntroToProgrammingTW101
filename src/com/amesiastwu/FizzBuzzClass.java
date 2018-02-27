package com.amesiastwu;

public class FizzBuzzClass {
     public void FizzBuzz(){
         final int inicio = 1;
         final int fin = 20;

         for(int i = inicio; i <= fin; i++ ){
             String numberToPrint = evaluateNumber(i);
             System.out.println(numberToPrint);
         }

     }

     private String evaluateNumber(int integer){

         if(integer % 3 == 0 && integer % 5 == 0){
             return "FizzBuzz";
         }

         if(integer % 3 == 0){
             return "Fizz";
         }

         if(integer % 5 == 0){
             return "Buzz";
         }

         return Integer.toString(integer);
     }
}
