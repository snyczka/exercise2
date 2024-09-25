
import java.util.Hashtable;
import java.util.List;
import java.util.MissingResourceException;
import java.util.concurrent.ExecutorService;
import javax.management.openmbean.KeyAlreadyExistsException;
import obligatorio2.project_exceptions.NoVendorExeption;

public class Admin {

    private Hashtable<Integer, Client> users;
    private Hashtable<Integer, Product> catalogue;
    private Hashtable<Integer, Seller> vendors;
    private ExecutorService openMarket;

    public Hashtable<Integer,Client> getUsers() {
        return this.users;
    }

    public Hashtable<Integer, Product> getCatalogue() {
        return this.catalogue;
    }

    public Hashtable<Integer,Seller> getVendors() {
        return this.vendors;
    }

    public ExecutorService getOpenMarket() {
        return this.openMarket;
    }

    public void addClient(int id, String userName, String email, int priorityLevel){
        try {
            if(this.users.containsKey(id)){
                throw new KeyAlreadyExistsException();
            }
            Client success = new Client(id, userName, email, priorityLevel);
            this.users.put(id, success);
        } catch (KeyAlreadyExistsException badKey) {

        }
    }

    public void addVendor(int id, String name, String contact){
        try {
            if(this.vendors.containsKey(id)){
                throw new KeyAlreadyExistsException();
            }
            Client success = new Client(id, name, contact);
            this.users.put(id, success);
        } catch (KeyAlreadyExistsException badKey) {

        }
    }

    public void addProduct(int id, String name, float price, int stock, int vendorId){
        try {
            if(this.catalogue.containsKey(id)){
                throw new KeyAlreadyExistsException();
            }
            if(!this.vendors.containsKey(vendorId)){
                throw new NoVendorExeption();
            }
            Product success = new Product(id, name, price, stock);
            this.catalogue.put(id, success);

        } catch (KeyAlreadyExistsException badKey, NoVendorExeption badVendor) {
        }

    }

}
