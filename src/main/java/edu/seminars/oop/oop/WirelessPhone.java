package edu.seminars.oop.oop;

public abstract class WirelessPhone extends AbstractPhone {
    private String protocol;
    public WirelessPhone(int year, String company, String protocol) {
        super(year, company);
        this.protocol = protocol;
    }
}
