/**
 * Класс, описывающий заказ клиента.
 */
public class Order {

    private int id;
    private int amount;

    // Конструктор
    public Order(int id, int amount) {
        this.id = id;
        this.amount = amount;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }
}
