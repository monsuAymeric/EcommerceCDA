package io.ski.api.presentation.controller.reference;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.ski.api.business.dto.ProductDto;
import io.ski.api.business.dto.ReferenceDto;
import io.ski.api.business.service.reference.IReferenceService;

@RestController
@CrossOrigin
public class GetByProductIdController {
    private IReferenceService referenceService;

    /**
     * Injects the reference service.
     *
     * @param referenceService the reference service
     */
    public GetByProductIdController(IReferenceService referenceService) {
        this.referenceService = referenceService;
    }

    /**
     * Returns the reference with the given product id.
     *
     * @param id the id of the product
     * @return the reference with the given product id
     */
    @GetMapping("/refs/product")
    public ReferenceDto getByProduct(final @RequestBody ProductDto product) {
        return referenceService.getByProduct(product);
    }
}
