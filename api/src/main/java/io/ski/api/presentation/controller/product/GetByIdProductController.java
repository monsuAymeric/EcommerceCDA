package io.ski.api.presentation.controller.product;

import io.ski.api.business.dto.ProductDto;
import io.ski.api.business.service.product.IProductService;
import io.ski.api.persistance.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetByIdProductController {
    private IProductService productService;

    /**
     * Injects the product service.
     *
     * @param productService the product service
     */
    @Autowired
    public GetByIdProductController(IProductService productService) {
        this.productService = productService;
    }

    /**
     * Returns the product with the given id.
     *
     * @param id the id of the product
     * @return the product with the given id
     */
    @GetMapping("/products/{id}")
    public ProductDto getByIdProduct(final @PathVariable Long id) {
        return productService.getByIdProduct(id);
    }
}