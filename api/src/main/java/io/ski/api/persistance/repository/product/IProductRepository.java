package io.ski.api.persistance.repository.product;

import io.ski.api.persistance.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IProductRepository extends JpaRepository<Product, Long> {
    @Query(ProductQueries.FIND_BY_REF)
    List<Product> findByRef(final long id_ref);
}
