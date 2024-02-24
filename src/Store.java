import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий магазин.
 */
public class Store {

    private List<Customer> customers;
    private List<Order> orders;
    private List<Product> products;

    // Конструктор
    public Store() {
        this.customers = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Добавляет клиента в список клиентов магазина.
     *
     * @param customer клиент, который добавляется
     */
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    /**
     * Возвращает клиента по его идентификатору.
     *
     * @param id идентификатор клиента
     * @return клиент с указанным идентификатором
     */
    public Customer getCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    /**
     * Добавляет заказ в список заказов магазина.
     *
     * @param order заказ, который добавляется
     */
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    /**
     * Добавляет товар в список товаров магазина.
     *
     * @param product товар, который добавляется
     */
    public void addProduct(Product product) {
        this.products.add(product);
    }

    /**
     * Возвращает товар по его названию.
     *
     * @param name название товара
     * @return товар с указанным названием
     */
    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Возвращает товар в магазин.
     *
     * @param product  товар, который возвращается
     * @param quantity количество возвращаемого товара
     */
    public void returnProduct(Product product, int quantity) {
        // Логика возврата товара в магазин

    }

    /**
     * Сохраняет лог работы магазина в файл.
     */
    public void saveLogToFile() {
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("store_log.txt"))) {
            writer.write("Лог работы магазина:\n");
            for (Customer customer : customers) {
                writer.write("Клиент: " + customer.getName() + "\n");
                writer.write("Заказы:\n");
                for (Order order : customer.getOrders()) {
                    writer.write("  Заказ №" + order.getId() + ": " + order.getAmount() + "\n");
                }
                writer.write("Возвращенные товары:\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    @Override
    public String toString() {
        return "Store{" +
                "customers=" + customers +
                ", orders=" + orders +
                ", products=" + products +
                '}';
    }
}
