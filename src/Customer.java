import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий клиента магазина.
 */
public class Customer {

    private int id;
    private String name;
    private List<Order> orders;

    // Конструктор
    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * Добавляет заказ в список заказов клиента.
     *
     * @param order заказ, который добавляется
     */
    public void addOrder(Order order) {
        this.orders.add(order);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orders=" + orders +
                '}';
    }
}
