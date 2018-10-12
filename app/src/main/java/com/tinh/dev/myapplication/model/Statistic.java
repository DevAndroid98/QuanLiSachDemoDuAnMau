package com.tinh.dev.myapplication.model;

public class Statistic  {


    private double staDay,staMonth,staYear;

    public double getStaDay() {
        return staDay;
    }

    public void setStaDay(double staDay) {
        this.staDay = staDay;
    }

    public double getStaMonth() {
        return staMonth;
    }

    public void setStaMonth(double staMonth) {
        this.staMonth = staMonth;
    }

    public double getStaYear() {
        return staYear;
    }

    public void setStaYear(double staYear) {
        this.staYear = staYear;
    }

    public Statistic(double staDay, double staMonth, double staYear) {

        this.staDay = staDay;
        this.staMonth = staMonth;
        this.staYear = staYear;
    }
}
