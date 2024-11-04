//package com.example.study.service;
//
//import com.example.study.entity.Item;
//import com.example.study.model.AddItemInput;
//import com.example.study.repository.ItemRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ItemService {
//    private ItemRepository itemRepository;
//
//    public ItemService(ItemRepository itemRepository) {
//        this.itemRepository = itemRepository;
//    }
//
//    public long addItem(AddItemInput input) {
//        Item item = Item.builder()
//                .name(input.getName())
//                .description(input.getDescription())
//                .startingPrice(String.valueOf(input.getStartingPrice()))
//                .build();
//        Item savedItem = itemRepository.save(item);
//        return savedItem.getId();
//    }
//
//    public void updateBook(long id, AddItemInput input) {
//        Item item = itemRepository.findById(id)
//                .orElseThrow(()-> new RuntimeException("해당 item이 없음"));
//                        item.setName(input.getItemName());
//        book.setPrice(String.valueOf(input.getBookPrice()));
//        bookRepository.save(book);
//    }
//
//}
