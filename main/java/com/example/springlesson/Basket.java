package com.example.springlesson;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Component
@SessionScope
public class Basket {
    private List<Integer> item;

    public Basket(List<Integer> item) {
        this.item = new ArrayList<Integer>();
    }

    public List<Integer> addItems(List<Integer> id) {
        item.addAll(id);
        return id;
    }

    public List<Integer> getItems() {
        return item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(item, basket.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item);
    }
}
