public interface IReturnOrder {

    /**
     * Возвращает товар в магазин.
     *
     * @param product  товар, который возвращается
     * @param quantity количество возвращаемого товара
     * @return 
     */
    void returnProduct(Product product, int quantity);

}
