package com.bridgelabz.generics;

public class TestMaximum {
    public static void main(String[] args) {


        System.out.println("Test case 1: " + testMaxNumber(7, 3, 5));
        System.out.println("Test case 2: " + testMaxNumber(2,8,5));
        System.out.println("Test case 3: " + testMaxNumber(6, 9, 12));

    }
        // Method to find the maximum of three integers
        public static int testMaxNumber(Integer x, Integer y, Integer z) {
            Integer max = x;

            if (y.compareTo(max) > 0) {
                max = y;
            }

            if (z.compareTo(max) > 0) {
                max = z;
            }

            return max;
        }
    }


