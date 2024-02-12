package ru.academits.samoilov.range;

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
    }
}

