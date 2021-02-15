import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    LocalTime openingTime = LocalTime.parse("10:30:00");
    LocalTime closingTime = LocalTime.parse("22:00:00");
    Restaurant restaurant =new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
    Order order = new Order();

    @Test
    public void should_add_price_of_all_items() {

        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);
        order.addToCart("Sweet corn soup",119);
        order.addToCart("Vegetable lasagn",269);

        List<Item> cart = order.getCart();

        int orderTotal = order.getOrderTotal(cart);
        assertEquals(orderTotal,388);
    }

    @Test
    public void should_return_total_as_zero_if_cart_is_empty() {

        restaurant.addToMenu("Sweet corn soup",119);
        restaurant.addToMenu("Vegetable lasagne", 269);

        List<Item> cart = order.getCart();

        int orderTotal = order.getOrderTotal(cart);
        assertEquals(orderTotal,0);
    }
}
