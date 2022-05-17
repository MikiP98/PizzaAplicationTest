package pl.mikolaj.pokora.pizzaaplicationtest.remote.rest.dto.responce;

import java.util.List;

public class OrderCollectionDto {
    private List<OrderDto> orders;


    public OrderCollectionDto() {
    }

    public OrderCollectionDto(List<OrderDto> orders) {
        this.orders = orders;
    }


    public List<OrderDto> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderDto> orders) {
        this.orders = orders;
    }
}
