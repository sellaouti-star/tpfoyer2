package tn.esprit.tpfoyer.controller;/*
package tn.esprit.tpfoyer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.dto.ChambreDto;
import tn.esprit.tpfoyer.service.ChambreService;

import java.util.List;

@RestController
@RequestMapping("/chambres")
@RequiredArgsConstructor
public class ChambreController {

    private final ChambreService chambreService;

    // ========================
    // GET ALL
    // ========================
    @GetMapping
    public ResponseEntity<List<ChambreDto>> getAllChambres() {
        List<ChambreDto> chambres = chambreService.findAllChambre();
        return ResponseEntity.ok(chambres);
    }

    // ========================
    // GET BY ID
    // ========================
    @GetMapping("/{id}")
    public ResponseEntity<ChambreDto> getChambreById(@PathVariable Long id) {
        ChambreDto chambre = chambreService.findChambreById(id);
        return ResponseEntity.ok(chambre);
    }

    // ========================
    // CREATE
    // ========================
    @PostMapping
    public ResponseEntity<ChambreDto> createChambre(@RequestBody ChambreDto dto) {
        ChambreDto created = chambreService.addChambre(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    // ========================
    // UPDATE
    // ========================
    @PutMapping("/{id}")
    public ResponseEntity<ChambreDto> updateChambre(@PathVariable Long id, @RequestBody ChambreDto dto) {
        ChambreDto updated = chambreService.updateChambre(id, dto);
        return ResponseEntity.ok(updated);
    }

    // ========================
    // DELETE
    // ========================
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteChambre(@PathVariable Long id) {
        chambreService.deleteChambre(id);
        return ResponseEntity.noContent().build();
    }
}*/
