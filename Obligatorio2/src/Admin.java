
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ExecutorService;

public class Admin {

    private Hashtable<String, Client> users;
    private List<Product> catalogue;
    private Hashtable<String, Seller> vendors;
    private ExecutorService openMarket;

    public Hashtable<String,Client> getUsers() {
        return this.users;
    }

    public List<Product> getCatalogue() {
        return this.catalogue;
    }

    public Hashtable<String,Seller> getVendors() {
        return this.vendors;
    }

    public ExecutorService getOpenMarket() {
        return this.openMarket;
    }



}
