package com.bridgelabz.generics;

public class TestMaximum {

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


        public static void main (String[]args){
            // Test Case 1: Max at 1st position

            Integer max1 = findMax(5, 3, 2);
            System.out.println("Test Case 1 - Maximum: " + max1);


            Integer max2 = findMax(3, 5, 2);
            System.out.println("Test Case 1 - Maximum: " + max2);

            Integer max3 = findMax(4, 8, 6);
            System.out.println("Test Case 2 - Maximum: " + max3);


            Float max4 = findMax(0.8f, 0.4f, 0.6f);
            System.out.println("Test Case 1 - Maximum: " + max4);


            // Test Case 2: Max at 2nd position

            Float max5 = findMax(0.4f, 0.8f, 0.6f);
            System.out.println("Test Case 2 - Maximum: " + max5);

            // Test Case 3: Max at 3rd position
            Float max6 = findMax(0.1f, 0.3f, 0.7f);
            System.out.println("Test Case 3 - Maximum: " + max6);


            String max7 = findMax("Apple", "Peach", "Banana");
            System.out.println("Test Case 1 - Maximum: " + max7);


            String max8 = findMax("Apple", "Peach", "Banana");
            System.out.println("Test Case 2 - Maximum: " + max8);

            String max9 = findMax("Banana", "Apple", "Peach");
            System.out.println("Test Case 3 - Maximum: " + max9);


        }
    }
