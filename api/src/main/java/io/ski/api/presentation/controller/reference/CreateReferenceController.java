package io.ski.api.presentation.controller.reference;

import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.business.service.reference.IReferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateReferenceController {
    private IReferenceService referenceService;

    /**
     * Injects the reference service.
     *
     * @param referenceService the reference service
     */
    @Autowired
    public CreateReferenceController(IReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    /**
     * Creates a new reference.
     *
     * @param reference the reference to create
     */
    @PostMapping("/refs")
    public void createReference(final ReferenceDto reference) {
        referenceService.createReference(reference);
    }
}