package com.example.springlesson;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class BasketController {
    private BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }

    @GetMapping("/add")
        public List<Integer> addIndex (@RequestParam List<Integer> item) {
        return basketService.addIndex(item);
    }
    @GetMapping("/get")
    public List<Integer> getIndex() {
        return basketService.getIndex();
    }
}
