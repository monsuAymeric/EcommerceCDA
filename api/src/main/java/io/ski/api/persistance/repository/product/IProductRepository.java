package io.ski.api.persistance.repository.product;

import io.ski.api.persistance.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IProductRepository extends JpaRepository<Product, Long> {
    @Query(ProductQueries.FIND_BY_REF)
    Product findByRef(final long id_ref);
}
