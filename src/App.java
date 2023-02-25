// Входная точка в программу/приложение
public class App {

    public static void main(String[] args) {

        // Создание экземпляров Model, View и Controller.
        Product model = new Product();
        SalesView view = new SalesView();
        ProductController controller = new ProductController(model, view);

        // Запуск программы/приложения.
        controller.runApp();
    }
}
