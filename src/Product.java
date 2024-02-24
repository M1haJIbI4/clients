/**
 * Класс, описывающий товар.
 */
public class Product {

    private String name;

    // Конструктор
    public Product(String name) {
        this.name = name;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
