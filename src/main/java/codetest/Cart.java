package itminds.codetest;

import java.util.List;
import java.util.ArrayList;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cart {

    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int id;
    @ElementCollection(targetClass = Item.class, fetch = FetchType.EAGER)
    private List<Item> items = new ArrayList<>();

    Cart() {}

    Cart(List<Item> items) {
        this.items = items;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return this.items;
    }
    
    public void setItem(List<Item> item) {
        this.items = item;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }
}
