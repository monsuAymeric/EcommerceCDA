package io.ski.api.business.service.reference;

import io.ski.api.business.convert.ProductConvert;
import io.ski.api.business.convert.ReferenceConvert;
import io.ski.api.business.dto.ProductDto;
import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.persistance.entity.Reference;
import io.ski.api.persistance.repository.reference.IReferenceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferenceServiceImpl implements IReferenceService {

    private IReferenceRepository referenceRepository;

    public ReferenceServiceImpl(final IReferenceRepository referenceRepository) {
        this.referenceRepository = referenceRepository;
    }

    @Override
    public void createReference(final ReferenceDto reference) {
        referenceRepository.save(ReferenceConvert.getInstance().dtoToEntity(reference));
    }

    @Override
    public List<ReferenceDto> getAllReferences() {
        return ReferenceConvert.getInstance().entityListToDtoList(referenceRepository.findAll());
    }

    @Override
    public ReferenceDto getByIdReference(final Long id) {
        return ReferenceConvert.getInstance().entityToDto(referenceRepository.findById(id).orElse(null));
    }

    @Override
    public List<ReferenceDto> getByNameReference(String name) {
        return ReferenceConvert.getInstance().entityListToDtoList(referenceRepository.findByName(name));
    }

    @Override
    public void modifyReference(final ReferenceDto reference) {
        referenceRepository.save(ReferenceConvert.getInstance().dtoToEntity(reference));
    }

    @Override
    public void deleteReference(final long id) {
        referenceRepository.deleteById(id);
    }

    @Override
    public ReferenceDto getByProduct(final ProductDto product) {
        final Reference reference = referenceRepository
                .findByProduct(ProductConvert.getInstance().dtoToEntity(product));
        return reference != null ? ReferenceConvert.getInstance().entityToDto(reference) : null;
    }
}
