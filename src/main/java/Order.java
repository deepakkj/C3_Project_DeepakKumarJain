import java.util.ArrayList;
import java.util.List;

public class Order {
    int orderTotal;
    private static List<Item> cart = new ArrayList<>();

    public Order(){
        this.orderTotal = 0;
        this.cart= new ArrayList<>();
    }

    public List<Item> getCart(){
        return this.cart;
    }

    public int getOrderTotal(List<Item> userCart) {
        for(Item item: userCart) {
            this.orderTotal += item.getPrice();
        }
        return this.orderTotal;
    }

    public void addToCart(String name, int price) {
        Item newItem = new Item(name,price);
        cart.add(newItem);
    }
}
