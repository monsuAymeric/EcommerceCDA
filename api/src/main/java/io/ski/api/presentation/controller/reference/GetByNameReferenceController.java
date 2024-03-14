package io.ski.api.presentation.controller.reference;

import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.business.service.reference.IReferenceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetByNameReferenceController {
    private IReferenceService referenceService;

    /**
     * Injects the reference service.
     *
     * @param referenceService the reference service
     */
    public GetByNameReferenceController(IReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    /**
     * Returns the reference with the given name.
     *
     * @param name the username of the users
     * @return the references with the given name
     */
    @GetMapping("/refs/{name}")
    public List<ReferenceDto> getByNameReference(final @PathVariable String name) {
        return referenceService.getByNameReference(name);
    }
}