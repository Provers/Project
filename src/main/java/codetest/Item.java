package itminds.codetest;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    
    private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) int id;
    private String Name;
    private String Description;
    private float Price;

    Item() {}

    Item(String name, float price) {
        this.Name = name;
        this.Description = "";
        this.setPrice(price);
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        this.Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        this.Description = description;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

}
