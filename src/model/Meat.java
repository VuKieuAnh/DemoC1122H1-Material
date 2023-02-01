package model;

import java.time.LocalDate;

public class Meat extends Material {
//    Mot lop bt khong dc chua phuong thuc abstract
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost()*weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        return getCost()*0.9;
    }
}
