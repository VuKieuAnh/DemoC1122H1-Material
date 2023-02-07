package model;

import java.time.LocalDate;

public class Bot extends Material {
    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public LocalDate getExpiryDate() {
        return null;
    }
}
