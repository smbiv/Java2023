package edu.seminars.oop.oop;

public class WirePhone extends AbstractPhone {
    public WirePhone(int year, String company) {
        super(year, company);
    }

    @Override
    public void call(int outputNumber) {
        System.out.println("*Вы слышите гудки в трубке*");
    }

    @Override
    public void ring(int inputNumber) {
        System.out.println("*Дзинь-дзинь-дзинь*");
    }
}
