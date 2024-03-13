package io.ski.api.presentation.controller.reference;

import io.ski.api.business.service.reference.IReferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteReferenceController {
    private IReferenceService referenceService;

    /**
     * Injects the reference service.
     * @param referenceService the reference service
     */
    @Autowired
    public DeleteReferenceController(IReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    /**
     * Deletes the reference with the given id.
     * @param id the id of the reference
     */
    @DeleteMapping("/refs/{id}")
    public void deleteReference(final @PathVariable long id) {
        referenceService.deleteReference(id);
    }
}