package com.lib.word.exceptions;

public class InvalidException extends RuntimeException {

    private static final long serialVersionUID = -2310258305005783968L;

    public InvalidException(String word) {
        super(String.format("invalid word %s exception", word));
    }
}
