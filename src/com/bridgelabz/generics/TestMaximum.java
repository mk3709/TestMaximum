package com.bridgelabz.generics;

public class TestMaximum {
            // Generic method to find the maximum of three objects
            public static <T extends Comparable<T>> T findMax(T x, T y, T z) {
                T max = x;

                if (y.compareTo(max) > 0) {
                    max = y;
                }

                if (z.compareTo(max) > 0) {
                    max = z;
                }

                return max;
            }

            public static void main(String[] args) {
                // Test Case 1: Max at 1st position
                Integer max1 = findMax(5, 3, 2);
                System.out.println("Test Case 1 - Maximum: " + max1);

                // Test Case 2: Max at 2nd position
                Integer max2 = findMax(4, 8, 6);
                System.out.println("Test Case 2 - Maximum: " + max2);

                // Test Case 3: Max at 3rd position
                Integer max3 = findMax(1, 3, 7);
                System.out.println("Test Case 3 - Maximum: " + max3);
            }
        }
