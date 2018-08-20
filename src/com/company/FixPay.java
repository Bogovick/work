package com.company;

import java.util.Scanner;

public class FixPay implements Worker {

    private  int ID;
    private String name;
    private  double average;
    private double fix;


    FixPay(int ID, String name, double fix){
this.ID = ID;
this.name = name;
this.fix = fix;
calculationPay();
    }


    @Override
        public double calculationPay() {



        this.average = fix;
        return average;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return average;
    }

    public double getFix() {
        return fix;
    }

    @Override
    public String toString() {
        return "FixPay{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", average=" + average +
                ", fix=" + fix +
                '}';
    }
}
