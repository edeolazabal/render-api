package com.upc.renderapi.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RenderController {

    @GetMapping("{dato}")
    public ResponseEntity<String> saludo(@PathVariable String dato) {
        return new ResponseEntity<>("Hola "+ dato, HttpStatus.OK);
    }
    @GetMapping("/suma")
    public ResponseEntity<Double> suma(@PathParam(value = "dato1") Double dato1, @PathParam(value = "dato2") Double dato2) {
        double salida = dato1 + dato2;
        return new ResponseEntity<>(salida, HttpStatus.OK);
    }

}
