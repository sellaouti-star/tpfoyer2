package tn.esprit.tpfoyer.mapper;

import org.mapstruct.Mapper;
import tn.esprit.tpfoyer.dto.FoyerDto;
import tn.esprit.tpfoyer.entity.Foyer;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FoyerMapper {

    // Entity → DTO
    FoyerDto toDto(Foyer foyer);

    // DTO → Entity
    Foyer toEntity(FoyerDto dto);

    // List mappings
    List<FoyerDto> toDtoList(List<Foyer> foyers);

    List<Foyer> toEntityList(List<FoyerDto> dtos);
}
