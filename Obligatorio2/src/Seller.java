
import java.util.List;


public class Seller {

    private int id;
    private String name;
    private String contact;
    private List<Product> offerings;
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return this.contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<Product> getOfferings() {
        return this.offerings;
    }

    public void setOfferings(List<Product> offerings) {
        this.offerings = offerings;
    }


    

}
