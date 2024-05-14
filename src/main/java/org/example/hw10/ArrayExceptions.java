package org.example.hw10;

public class ArrayExceptions extends Exception {
    public ArrayExceptions(String message) {
        super(message);
    }

    public ArrayExceptions(String message, Throwable cause) {
        super(message, cause);
    }
}

class ArraySizeException extends ArrayExceptions {
    public ArraySizeException(String message) {
        super(message);
    }
}

class ArrayDataException extends ArrayExceptions {
    public ArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
