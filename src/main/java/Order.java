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
        return -1;
    }

    public void addToCart(String name, int price) {
    }
}
