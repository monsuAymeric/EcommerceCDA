package io.ski.api.presentation.controller.reference;

import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.business.service.reference.IReferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class GetAllReferenceController {
    private IReferenceService referenceService;

    /**
     * Injects the reference service.
     *
     * @param referenceService the reference service
     */
    @Autowired
    public GetAllReferenceController(IReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    /**
     * Gets all references.
     *
     * @return a list of all references
     */
    @GetMapping("/refs")
    public List<ReferenceDto> getAllReferences() {
        return referenceService.getAllReferences();
    }
}