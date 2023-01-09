package itminds.codetest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item>getAllItems() {
        return itemRepository.findAll();
    }

    Item newItem(Item newItem) {
        return itemRepository.save(newItem);
    }

    Item getItem(int id) {
        return itemRepository.findById(id).get();
    }


}
