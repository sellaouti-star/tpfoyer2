package tn.esprit.tpfoyer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer.exception.ResourceNotFoundException;
import tn.esprit.tpfoyer.dto.FoyerDto;
import tn.esprit.tpfoyer.entity.Foyer;
import tn.esprit.tpfoyer.mapper.FoyerMapper;
import tn.esprit.tpfoyer.repository.FoyerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FoyerService {

    private final FoyerRepository foyerRepository;
    private final FoyerMapper mapper;

    public FoyerDto addFoyer(FoyerDto foyerDto) {
        return mapper.toDto(foyerRepository.save(mapper.toEntity(foyerDto)));
    }


    public List<FoyerDto> findAllFoyer() {
        return mapper.toDtoList(foyerRepository.findAll());
    }


    public FoyerDto findFoyerById(Long id) {
        Foyer foyer = foyerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Foyer non trouvé avec l'id : " + id));
        return mapper.toDto(foyer);
    }


    public FoyerDto updateFoyer(Long id, FoyerDto foyer) {
        Foyer existingFoyer = foyerRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Foyer non trouvé avec l'id : " + id));

        // Mise à jour des champs
        existingFoyer.setNomFoyer(foyer.getNomFoyer());
        existingFoyer.setCapacite(foyer.getCapacite());

        return mapper.toDto(foyerRepository.save(existingFoyer));
    }

    public void deleteFoyer(Long id) {
        if (!foyerRepository.existsById(id)) {
            throw new ResourceNotFoundException("Foyer non trouvé avec l'id : " + id);
        }
        foyerRepository.deleteById(id);
    }
}