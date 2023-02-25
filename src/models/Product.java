package models;

import interfaces.Fiscal;
import interfaces.Income;

public class Product implements Income, Fiscal {
    private String name;
    private int quantity;
    private double price;
    private static final double TAX_RATE = 0.2;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Геттери та сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Реалізація методів інтерфейсів Income та Fiscal
    @Override
    public double getIncome() {
        return quantity * price;
    }

    @Override
    public double getTax() {
        return getIncome() * TAX_RATE;
    }

    @Override
    public double getNetIncome() {
        return getIncome() - getTax();
    }
}
