package ua.lviv.iot.shoppingproject.exceptions;

public class OrderNotFoundException extends Exception {
    public OrderNotFoundException(String message) {
        super(message);
    }
    public OrderNotFoundException(){}
}
