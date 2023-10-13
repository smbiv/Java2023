package edu.seminars.oop.oop;

public class CellPhone extends WirelessPhone {
    public CellPhone(int year, String company) {
        super(year, company, "GSM");
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("Вызываю номер " + outputNumber);
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("Вас вызывает абонент " + inputNumber);
    }
}