package io.ski.api.presentation.controller.product;

import io.ski.api.business.dto.ProductDto;
import io.ski.api.business.service.product.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetAllProductController {
    private IProductService productService;

    /**
     * Injects the product service.
     *
     * @param productService the user service
     */
    public GetAllProductController(IProductService productService) {
        this.productService = productService;
    }

    /**
     * Gets all products.
     *
     * @return a list of all products
     */
    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return productService.getAllProduct();
    }
}