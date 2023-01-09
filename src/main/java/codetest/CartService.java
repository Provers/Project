package itminds.codetest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartService {
    
    @Autowired
    CartRepository cartRepository;

    @Autowired
    ItemRepository itemRepository;

    public List<Cart>getAllCarts() {
        return cartRepository.findAll();
    }

    Cart newCart(Cart newCart) {
        return cartRepository.save(newCart);
    }

    Cart addItemToCart(Integer Itemid, Integer Cartid) {
        Cart cartobj = cartRepository.findById(Cartid).get();
        if (itemRepository.existsById(Itemid)) {
            cartobj.addItem(itemRepository.findById(Itemid).get());
            cartRepository.save(cartobj);
            return cartobj;
        } else{
            return cartobj;
        }
    }

    Cart removeItemFromCart(Integer itemId, Integer cartid) {
        Cart cartobj = cartRepository.findById(cartid).get();
        cartobj.removeItem(itemRepository.findById(itemId).get());
        cartRepository.save(cartobj);
        return cartobj;
    }

    Cart getCart(int id) {
        return cartRepository.findById(id).get();
    }
}
