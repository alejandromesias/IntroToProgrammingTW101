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
         return Integer.toString(integer);
     }
}
