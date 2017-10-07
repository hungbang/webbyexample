package entity;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by KAI on 10/7/17.
 */
public class Product implements Serializable{

    private String id = UUID.randomUUID().toString();
    private String name;

    public Product(String productName) {
        this.name = productName;
    }


    public String getId() {
        return id;
    }

    public Product setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "ID: "+ id + " name: "+ name;
    }
}
