package itminds.codetest;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CartController {
    
    @Autowired
    CartService cartservice;

    @GetMapping("/")
    String home() {
        return "Welcome to the shopping cart api";
    }

    @GetMapping("/carts")
    List<Cart> all() {
        return cartservice.getAllCarts();
    }

    @GetMapping("/carts/{id}")
    Cart one(@PathVariable int id) {
        return cartservice.getCart(id);
    }

    @PostMapping("/carts")
    Cart newCart(@RequestBody Cart newCart) {
        return cartservice.newCart(newCart);
    }

    @PostMapping("/carts/{cartid}/add/{itemid}")
    Cart AddtoCart(@PathVariable int cartid, @PathVariable int itemid) {
        return cartservice.addItemToCart(itemid, cartid);
    }

    @DeleteMapping("/carts/{cartid}/remove/{itemid}")
    Cart removeFromCart(@PathVariable int cartid, @PathVariable int itemid) {
        return cartservice.removeItemFromCart(itemid, cartid);
    }

}
