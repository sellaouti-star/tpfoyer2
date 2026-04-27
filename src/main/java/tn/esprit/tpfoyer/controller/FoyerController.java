package tn.esprit.tpfoyer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.tpfoyer.dto.FoyerDto;
import tn.esprit.tpfoyer.exception.ResourceNotFoundException;
import tn.esprit.tpfoyer.service.FoyerService;

import java.util.List;

@RestController
@RequestMapping("/foyers")
@RequiredArgsConstructor
public class FoyerController {

    private final FoyerService foyerService;

    // ========================
    // GET ALL
    // ========================
    @GetMapping
    public ResponseEntity<List<FoyerDto>> getAllFoyers() {
        List<FoyerDto> foyers = foyerService.findAllFoyer();
        return ResponseEntity.ok(foyers);
    }

    // ========================
    // GET BY ID
    // ========================
    @GetMapping("/{id}")
    public ResponseEntity<FoyerDto> getFoyerById(@PathVariable Long id) {
        FoyerDto foyer = foyerService.findFoyerById(id);
        return ResponseEntity.ok(foyer);
    }

    // ========================
    // CREATE
    // ========================
    @PostMapping
    public ResponseEntity<FoyerDto> createFoyer(@RequestBody FoyerDto dto) {
        FoyerDto created = foyerService.addFoyer(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(created);
    }

    // ========================
    // UPDATE
    // ========================
    @PutMapping("/{id}")
    public ResponseEntity<FoyerDto> updateFoyer(@PathVariable Long id, @RequestBody FoyerDto dto) {
        FoyerDto updated = foyerService.updateFoyer(id, dto);
        return ResponseEntity.ok(updated);
    }

    // ========================
    // DELETE
    // ========================
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFoyer(@PathVariable Long id) {
        foyerService.deleteFoyer(id);
        return ResponseEntity.noContent().build();
    }
}