package com.edlas.com.edlasapp.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceFoundException extends RuntimeException {

    private static final long seriaLVersionUID = 1L;

    public ResourceFoundException(String mensaje) {
        super(mensaje);

    }

}
