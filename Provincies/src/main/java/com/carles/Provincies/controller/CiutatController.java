package com.carles.Provincies.controller;

import com.carles.Provincies.model.Ciutat;
import com.carles.Provincies.model.CiutatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ciutats")
public class CiutatController {



        @Autowired
    CiutatsRepository CiutatsRepository;
        @GetMapping
        public List<Ciutat> obtenirCiutats() {
            return (List<Ciutat>) CiutatsRepository.findAll();
        }
        @GetMapping("/{id}")
        public ResponseEntity<Ciutat> obtenirCiutatPerId(@PathVariable(value = "id") Long id) {
            Optional<Ciutat> ciutat = CiutatsRepository.findById(id);
            if (ciutat.isPresent()) {
                return ResponseEntity.ok().body(ciutat.get());
            } else {
                return ResponseEntity.notFound().build();
            }
        }
        @PostMapping
        public Ciutat crearCiutat(@RequestBody Ciutat ciutat) {
            return CiutatsRepository.save(ciutat);
        }
        @DeleteMapping("/{id}")
        public void eliminarCiutat(@PathVariable Long id) {
            CiutatsRepository.deleteById(id);
        }
        @PutMapping("/{id}")
        public ResponseEntity<Ciutat> actualitzarCiutat(@PathVariable Long id, @RequestBody Ciutat
                ciutatActualitzada) {
            Optional<Ciutat> optionalCiutat = CiutatsRepository.findById(id);
            if (optionalCiutat.isPresent()) {
                Ciutat ciutat = optionalCiutat.get();
                ciutat.setNom(ciutatActualitzada.getNom());
                ciutat.setPoblacio(ciutatActualitzada.getPoblacio());
                ciutat.setDescripcio(ciutatActualitzada.getDescripcio());
                ciutat.setImatge(ciutatActualitzada.getImatge());
                return ResponseEntity.ok().body(CiutatsRepository.save(ciutat));
            } else {
                return ResponseEntity.notFound().build();
            }
        }
    }

