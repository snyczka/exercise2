
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


}
