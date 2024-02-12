package ru.academits.samoilov.range.main;

import ru.academits.samoilov.range.Range;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два числа для определения начала и конца вещественного диапазона:");
        System.out.println("Начало диапазона:");
        double from = scanner.nextDouble();
        System.out.println("Конец диапазона:");
        double to = scanner.nextDouble();
        System.out.println("Введите число для проверки принадлежности данному диапазону:");
        double checkNumber = scanner.nextDouble();
        Range range = new Range(from, to);
        range.setFrom(from);
        range.setTo(to);
        System.out.println("Начало диапазона: " + range.getFrom());
        System.out.println("Конец диапазона: " + range.getTo());
        System.out.println(range.isInside(checkNumber));
        System.out.println("Длина всего вещественного диапазона = " + range.getLenght());
    }
}