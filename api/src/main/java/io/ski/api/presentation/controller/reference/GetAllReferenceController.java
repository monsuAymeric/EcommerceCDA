package io.ski.api.presentation.controller.reference;

import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.business.service.reference.IReferenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllReferenceController {
    private IReferenceService referenceService;

    /**
     * Injects the reference service.
     *
     * @param referenceService the reference service
     */
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