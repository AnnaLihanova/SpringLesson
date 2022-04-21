package com.example.springlesson;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService {

    private Basket basket;

    public BasketServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public List<Integer> addIndex(List<Integer> index) {
        return basket.addItems(index);
    }

    @Override
    public List<Integer> getIndex() {
        return basket.getItems();
    }
}
