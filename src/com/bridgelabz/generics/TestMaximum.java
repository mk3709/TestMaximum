package com.bridgelabz.generics;

public class TestMaximum {

        public static Float  findMax(Float x, Float y, Float z) {

            Float max = x;

            if (y.compareTo(max) > 0) {
                max = y;
            }

                    if (z.compareTo(max) > 0) {
                        max = z;
                    }

        public static void main(String[] args) {
            // Test Case 1: Max at 1st position
            Float max1 = findMax(0.5f, 0.3f, 0.2f);
            System.out.println("Test Case 1 - Maximum: " + max1);

            // Test Case 2: Max at 2nd position
            Float max2 = findMax(0.4f, 0.8f, 0.6f);
            System.out.println("Test Case 2 - Maximum: " + max2);

            // Test Case 3: Max at 3rd position
            Float max3 = findMax(0.1f, 0.3f, 0.7f);
            System.out.println("Test Case 3 - Maximum: " + max3);
        }
    }
