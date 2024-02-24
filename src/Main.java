public class Main {

    public static void main(String[] args) {
        Store store = new Store();

        // Добавление клиентов
        store.addCustomer(new Customer(1, "Иван Иванов"));
        store.addCustomer(new PromotionalCustomer(2, "Петр Петров", "Скидка 10%"));
        store.addCustomer(new Customer(3, "Мария Сидорова"));
        store.addCustomer(new PromotionalCustomer(4, "Елена Кузнецова", "Скидка 15%"));

        // Добавление заказов
        store.getCustomerById(1).addOrder(new Order(1, 100));
        store.getCustomerById(2).addOrder(new Order(2, 200));
        store.getCustomerById(3).addOrder(new Order(3, 300));
        store.getCustomerById(4).addOrder(new Order(4, 400));

        // Возврат товаров
        store.returnProduct(new Product("Товар 1"), 2);
        store.returnProduct(new Product("Товар 2"), 1);
        store.returnProduct(new Product("Товар 3"), 3);

        // Сохранение лога в файл
        store.saveLogToFile();

        System.out.println(store);
    }
}
