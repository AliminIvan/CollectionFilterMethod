package com.ivanalimin;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

    }

    public static <T> T[] filter(T[] array, Filter filter) {
        T[] result = Arrays.copyOf(array, array.length);
        for (T t : result) {
            filter.apply(t);
        }
        return result;
    }
}
