//Класс, описывающий объявление акционного клиента

public class PromotionalCustomer extends Customer implements IReturnOrder {

    private String promotionName;
    private static int numOfParticipants = 0;

    public PromotionalCustomer(int id, String name, String promotionName) {
        super(id, name);
        this.promotionName = promotionName;
        numOfParticipants++;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public static int getNumOfParticipants() {
        return numOfParticipants;
    }

    @Override
    public void returnProduct(Product product, int quantity) {
        // Логика возврата товара акционным клиентом
    }

    @Override
    public String toString() {
        return "PromotionalCustomer{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", promotionName='" + promotionName + '\'' +
                '}';
    }
}
