package jpabook.jpashop.exception;

public class NotEnounghStockException extends RuntimeException{

    public NotEnounghStockException() {
        super();
    }

    public NotEnounghStockException(String message) {
        super(message);
    }

    public NotEnounghStockException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnounghStockException(Throwable cause) {
        super(cause);
    }

}
