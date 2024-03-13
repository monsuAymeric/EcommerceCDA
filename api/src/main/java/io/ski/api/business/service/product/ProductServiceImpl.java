package io.ski.api.business.service.product;

import io.ski.api.business.convert.ProductConvert;
import io.ski.api.business.dto.ProductDto;
import io.ski.api.persistance.repository.product.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    private IProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(final IProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @Override
    public void createProduct(final ProductDto product) {
        productRepository.save(ProductConvert.getInstance().dtoToEntity(product));
    }

    @Override
    public List<ProductDto> getAllProduct() {
        return ProductConvert.getInstance().entityListToDtoList(productRepository.findAll());
    }

    @Override
    public ProductDto getByIdProduct(long id) {
        return ProductConvert.getInstance().entityToDto(productRepository.findById(id).orElse(null));
    }

    @Override
    public ProductDto getByRefProduct(long reference) {
        return ProductConvert.getInstance().entityToDto(productRepository.findByRef(reference));
    }

    @Override
    public void modifyProduct(final ProductDto product) {
        productRepository.save(ProductConvert.getInstance().dtoToEntity(product));
    }

    @Override
    public void deleteProduct(final long id) {
        productRepository.deleteById(id);
    }
}
