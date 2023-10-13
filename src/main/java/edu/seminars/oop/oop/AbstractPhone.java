package edu.seminars.oop.oop;

public abstract class AbstractPhone {
    protected String company;
    protected int year;

    protected AbstractPhone(int year, String company) {
        this.company = company;
        this.year = year;
    }

    public abstract void call(int outputNumber);

    public abstract void ring(int inputNumber);
}
