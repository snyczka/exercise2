
import java.util.List;

public class Client {

    private int id;
    private String email;
    private List<Product> shoppingCart;
    private int priorityLevel;


    public Client(int id, String email) {
        this.id = id;
        this.email = email;
        this.shoppingCart = List.of();
        this.priorityLevel = 5;
    }


    public Client(int id, String email, int priorityLevel) {
        this.id = id;
        this.email = email;
        this.shoppingCart = List.of();
        this.priorityLevel = priorityLevel;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Product> getShoppingCart() {
        return this.shoppingCart;
    }

    public void setShoppingCart(List<Product> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public int getPriorityLevel() {
        return this.priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }


    
}
