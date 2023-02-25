package views;

import java.util.Scanner;
import models.Product;
import utils.Validator;

public class SalesView {
    private final Product product;

    public SalesView(Product product) {
        this.product = product;
    }

    public void getInputs() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите наименование товара: ");
        String name = Validator.validateName(scanner);
        product.setName(name);

        System.out.print("Введите количество: ");
        int quantity = Validator.validateQuantityInput(scanner);
        product.setQuantity(quantity);

        System.out.print("Введите цену: ");
        double price = Validator.validatePriceInput(scanner);
        product.setPrice(price);
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
