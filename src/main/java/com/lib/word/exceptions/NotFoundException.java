package com.lib.word.exceptions;

public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = -2310258305005783968L;

    public NotFoundException(String word) {
        super(String.format("Word with Id %s not found", word));
    }

}
