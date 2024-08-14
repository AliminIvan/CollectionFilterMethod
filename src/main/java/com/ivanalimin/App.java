package com.ivanalimin;

import java.util.Arrays;
/*
Напишите метод filter, который принимает на вход массив любого типа, вторым арументом метод должен принимать клас,
реализующий интерфейс Filter, в котором один метод - Object apply(Object o).

Метод должен быть реализован так чтобы возращать новый масив, к каждому элементу которого была применена функция apply
 */
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
