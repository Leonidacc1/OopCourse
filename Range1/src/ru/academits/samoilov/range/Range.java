package ru.academits.samoilov.range;

import java.util.Scanner;

public class Range {
    private double from;
    private double to;

    public Range(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return this.from;
    }

    public void setFrom(double from) {
        this.from = from;
    }

    public double getTo() {
        return this.to;
    }

    public void setTo(double to) {
        this.to = to;
    }

    public double getLenght() {
        return this.to - this.from;
    }

    public boolean isInside(double point) {
        return point >= this.from && point <= this.to;
    }

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

