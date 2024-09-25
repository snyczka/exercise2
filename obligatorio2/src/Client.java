
import java.util.List;
import java.util.Objects;

public class Client {

    private int id;
    private String userName;
    private String email;
    private List<Product> shoppingCart;
    private int priorityLevel;


    public Client(int id, String email, String userName) {
        this.id = id;
        this.userName = userName;
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

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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



    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Client)) {
            return false;
        }
        Client client = (Client) o;
        return id == client.id && Objects.equals(email, client.email) && Objects.equals(shoppingCart, client.shoppingCart) && priorityLevel == client.priorityLevel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    

    
}
