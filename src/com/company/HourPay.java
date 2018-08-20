package com.company;



public class HourPay implements Worker {

    private  int ID;
    private String name;
    private  double average;
    private double rate;

    HourPay(){

    }

         HourPay(int ID, String name, double rate) {

             this.ID = ID;
             this.name = name;
             this.rate = rate;
             calculationPay();

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

    public double getRate() {
        return rate;
    }

    @Override
    public double calculationPay() {

        this.average = 20.8 * 8 * rate;

        return average;

    }



    @Override
    public String toString() {
        return "HourPay{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", average=" + average +
                ", rate=" + rate +
                '}';
    }


}

