package io.ski.api.presentation.controller.reference;

import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.business.service.reference.IReferenceService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CreateReferenceController {
    private IReferenceService referenceService;

    /**
     * Injects the reference service.
     *
     * @param referenceService the reference service
     */
    public CreateReferenceController(IReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    /**
     * Creates a new reference.
     *
     * @param reference the reference to create
     */
    @PostMapping("/refs")
    public void createReference(@RequestBody ReferenceDto reference) {
        referenceService.createReference(reference);
    }
}