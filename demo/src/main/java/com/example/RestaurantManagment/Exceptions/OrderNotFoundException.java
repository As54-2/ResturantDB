package com.example.RestaurantManagment.Exceptions;

public class OrderNotFoundException extends RuntimeException {
    public OrderNotFoundException(String message) {
        super((message));
    }
}
