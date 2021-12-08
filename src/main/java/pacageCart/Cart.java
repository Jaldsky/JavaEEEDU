package pacageCart;

public class Cart {
    private String name;
    private int quantity;

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }
}
