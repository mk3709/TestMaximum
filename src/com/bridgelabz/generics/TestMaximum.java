package com.bridgelabz.generics;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Optional;


class TestMaximum<T extends Comparable<? super T>>{
     T  value1;
     T  value2;
     T value3;

     public TestMaximum(T value1, T value2, T value3)

    {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
    }
            public T findMax()
            {
                return TestMaximum.findMax(value1,value2,value3);
            }

            public static <T extends Comparable<? super T>> T findMax(T num1,T num2,T num3){

               return Optional.of(num1).stream().max((a, b)->a.compareTo(b)).orElse(null);

            }


        public static void main (String[]args){
            // Test Case 1: Max at 1st position
         TestMaximum<Integer> integerTestMaximum= new TestMaximum<>(10,5,8);
         Integer maxResult = integerTestMaximum.findMax();
            System.out.println("Max Result"+maxResult);

            TestMaximum<Float> floatTestMaximum= new TestMaximum<>(0.7f,0.6f,0.8f);
            Float maxFloatResult = floatTestMaximum.findMax();
            System.out.println("Max Result"+maxFloatResult);

         TestMaximum<String> stringTestMaximum= new TestMaximum<>("Apple","Peach","Banana");
         String maxStringResult = stringTestMaximum.findMax();
            System.out.println("Max Result"+maxStringResult);
        }
    }
