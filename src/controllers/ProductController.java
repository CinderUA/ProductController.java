package controllers;

import models.Product;
import utils.Validator;
import views.SalesView;

import java.text.DecimalFormat;

// Controller
public class ProductController {
    private final Product model;
    private final SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        String name = Validator.validateName(view.getScanner());
        model.setName(name);

        int quantity = Validator.validateQuantityInput(view.getScanner());
        model.setQuantity(quantity);

        float price = Validator.validatePriceInput(view.getScanner());
        model.setPrice(price);

        // Выполняем расчеты
        float revenue = model.calculateRevenue();
        float tax = model.calculateTax();

        // Округляем результаты до двух знаков после запятой
        DecimalFormat df = new DecimalFormat("#.##");
        revenue = Float.parseFloat(df.format(revenue));
        tax = Float.parseFloat(df.format(tax));

        // Формируем строку вывода
        String output = String.format("Название товара: %s\n" +
                "Количество товара: %d\n" +
                "Цена товара: %.2f\n\n" +
                "Выручка: %.2f\n" +
                "Налог: %.2f\n", name, quantity, price, revenue, tax);

        view.getOutput(output);
    }

}