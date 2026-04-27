package tn.esprit.tpfoyer.service;/*
package tn.esprit.tpfoyer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.dto.ChambreDto;
import tn.esprit.tpfoyer.entity.Chambre;
import tn.esprit.tpfoyer.exception.ResourceNotFoundException;
import tn.esprit.tpfoyer.mapper.ChambreMapper;
import tn.esprit.tpfoyer.repository.ChambreRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChambreService {

    private final ChambreRepository chambreRepository;
    private final ChambreMapper mapper;

    public ChambreDto addChambre(ChambreDto chambreDto) {
        return mapper.toDto(chambreRepository.save(mapper.toEntity(chambreDto)));
    }


    public List<ChambreDto> findAllChambre() {
        return mapper.toDtoList(chambreRepository.findAll());
    }


    public ChambreDto findChambreById(Long id) {
        Chambre chambre = chambreRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Chambre non trouvé avec l'id : " + id));
        return mapper.toDto(chambre);
    }


    public ChambreDto updateChambre(Long id, ChambreDto chambre) {
        Chambre existingChambre = chambreRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Chambre non trouvé avec l'id : " + id));

        // Mise à jour des champs
        existingChambre.setNom(chambre.getNom());
        existingChambre.setCapacite(chambre.getCapacite());

        return mapper.toDto(chambreRepository.save(existingChambre));
    }

    public void deleteChambre(Long id) {
        if (!chambreRepository.existsById(id)) {
            throw new ResourceNotFoundException("Chambre non trouvé avec l'id : " + id);
        }
        chambreRepository.deleteById(id);
    }
}*/
