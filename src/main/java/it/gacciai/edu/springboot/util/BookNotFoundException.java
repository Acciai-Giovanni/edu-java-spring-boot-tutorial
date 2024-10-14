package it.gacciai.edu.springboot.util;

public class BookNotFoundException extends RuntimeException {

    public BookNotFoundException() {
        super();
    }

    public BookNotFoundException(Throwable cause) {
        super(cause);
    }
    // ...
}