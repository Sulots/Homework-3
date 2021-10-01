package com.company;


import java.util.Random;

public class Main {


    public static void main(String[] args) {
        firstMethod();    //კენტი რიცხვები 0 დან 30 ის ჩათვლით.
        secondMethod();   //საშუალო არითმეტიკული.
        thirdMethod();    //მინიმალური ელემენტი.
        fourthMethod();   //რენდომ რიცხვი.
    }


        static void firstMethod () {

            for (int oddNumber = 1; oddNumber < 30; oddNumber++) {
                if (oddNumber % 2 > 0) {
                    System.out.println(oddNumber);
                }
            }
        }

        static void secondMethod () {
            double[] myNumbers = {1, 5, 16, 25, 62, 90, 100, 560, 600};

            double sum = 0;
            for (double myNumber : myNumbers) {
                sum += myNumber;
            }
            System.out.println(sum / myNumbers.length);
        }

            static void thirdMethod() {
                int[] array1 = {30, 232, 565, 6565, 1, 23, 99, 0, 65};
                int minValue = array1[0];
                for (int i = 1; i < array1.length; i++) {
                    if (array1[i] < minValue) {
                        minValue = array1[i];
                    }
                }
                System.out.println("minimal value is " + minValue);
            }

        static void fourthMethod() {
                int maxNumber = 100;
                int minNumber = 0;
                Random randomNumber = new Random();
                int mynmb = minNumber + randomNumber.nextInt(maxNumber);
                System.out.println(mynmb);
            }


}







