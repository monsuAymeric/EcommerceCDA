package io.ski.api.presentation.controller.reference;

import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.business.service.reference.IReferenceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ModifyReferenceController {
    private IReferenceService referenceService;

    /**
     * Injects the reference service.
     *
     * @param referenceService the reference service
     */
    public ModifyReferenceController(IReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    /**
     * Modifies the reference.
     *
     * @param reference the reference to modify
     */
    @PostMapping("/refs/modify")
    public void modifyReference(final ReferenceDto reference) {
        referenceService.modifyReference(reference);
    }
}