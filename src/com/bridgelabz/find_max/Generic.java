package com.bridgelabz.find_max;

public class Generic {
    static <E extends Comparable<E>>
    void compare(E[] arrValue) {

        E max = arrValue[0];

        for (int i = 1; i < arrValue.length; i++) {

            int result = max.compareTo(arrValue[i]);

            if(result < 0) {
                max = arrValue[i];
            }
        }
        printMax(max);
    }

    public static <E> void printMax(E max) {
        System.out.println("Amongst the three the maximum is " + max);
    }
}
