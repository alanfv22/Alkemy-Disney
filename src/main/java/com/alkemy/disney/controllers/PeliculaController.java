package com.alkemy.disney.controllers;


import com.alkemy.disney.DTOS.PeliculaDTO;
import com.alkemy.disney.services.implementaciones.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("peliculas")
public class PeliculaController {

    @Autowired
    private PeliculaService peliculaService;

    @PostMapping
    public ResponseEntity<PeliculaDTO> save(@RequestBody PeliculaDTO pelicula){
        PeliculaDTO peliculaGuardado =peliculaService.save(pelicula);
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculaGuardado);

    }
    @GetMapping
    public ResponseEntity<List< PeliculaDTO>> getAll() {
        List <PeliculaDTO> peliculas= peliculaService.getAll();
        return ResponseEntity.status(HttpStatus.CREATED).body(peliculas);

    }
}
