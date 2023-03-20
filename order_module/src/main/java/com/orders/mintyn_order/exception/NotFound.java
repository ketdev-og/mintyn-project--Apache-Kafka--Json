package com.orders.mintyn_order.exception;

public class NotFound extends RuntimeException{
    public NotFound(String message) {
        super(message);
    }

    public NotFound(String message, Throwable cause) {
        super(message, cause);
    }
}
