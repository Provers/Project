package itminds.codetest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    
    @Autowired
    ItemService itemservice;

    @GetMapping("/items")
    List<Item> all() {
        return itemservice.getAllItems();
    }

    @PostMapping("/items")
    Item newItem(@RequestBody Item newItem) {
        return itemservice.newItem(newItem);
    }

    @GetMapping("/items/{id}")
    Item one(@PathVariable int id) {
        return itemservice.getItem(id);
    }
}
