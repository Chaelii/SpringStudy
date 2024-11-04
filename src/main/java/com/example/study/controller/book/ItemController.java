//package com.example.study.controller.book;
//
//import com.example.study.entity.Item;
//import com.example.study.model.AddBookInput;
//import com.example.study.model.AddItemInput;
//import com.example.study.repository.BookRepository;
//import com.example.study.repository.ItemRepository;
//import com.example.study.service.ItemService;
//import jakarta.validation.Valid;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class ItemController {
//
//    private ItemRepository itemRepository;
//    private ItemService itemService;
//    public ItemController(ItemRepository itemRepository, ItemService itemService) {
//        this.itemRepository = itemRepository;
//        this.itemService = itemService;
//    }
//
//    @GetMapping("/items")
//    public List<Item> getItems() {
//        List<Item> items = itemRepository.findAll();
//        return items;
//    }
//
////    @PostMapping("/items")
////    public ResponseEntity<Item> addItems(@RequestBody Item item) {
////        Item savedItem = itemRepository.save(item);
////        return ResponseEntity.ok(savedItem);
////    }
//
//    @PostMapping("/items")
//    public long addItems(@RequestBody @Valid AddItemInput input) {
//        long id = itemService.addItem(input);
//        return id;
//    }
//
//    @PutMapping("/items/{id}")
//    public void updateItems(
//            @PathVariable long id,
//            @RequestBody AddItemInput input
//    ) {
//        itemService.updateItem(id, input);
//    }
//}
