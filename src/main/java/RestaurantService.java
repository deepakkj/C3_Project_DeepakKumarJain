import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class RestaurantService {
    private static List<Restaurant> restaurants = new ArrayList<>();

    private Restaurant findByName(String restaurantName){
        for(Restaurant restaurant: restaurants) {
            if(restaurant.getName().equals(restaurantName)) {
                return restaurant;
            }
        }
        return null;
    }


    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException{
        Restaurant restaurant =findByName(restaurantName);
        if (restaurant == null){
            throw new restaurantNotFoundException(restaurantName);
        }else{
            return restaurant;
        }
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }
}
