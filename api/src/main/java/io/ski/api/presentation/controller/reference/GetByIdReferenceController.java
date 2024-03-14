package io.ski.api.presentation.controller.reference;

import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.business.service.reference.IReferenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetByIdReferenceController {
    private IReferenceService referenceService;

    /**
     * Injects the reference service.
     *
     * @param referenceService the reference service
     */
    public GetByIdReferenceController(IReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    /**
     * Returns the reference with the given id.
     *
     * @param id the id of the reference
     * @return the reference with the given id
     */
    @GetMapping("/refs/{id}")
    public ReferenceDto getByIdReference(final @PathVariable Long id) {
        return referenceService.getByIdReference(id);
    }
}