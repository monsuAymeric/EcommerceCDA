package io.ski.api.persistance.repository.cart;

import io.ski.api.persistance.entity.Cart;
import io.ski.api.persistance.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ICartRepository extends JpaRepository<Product, Long> {
    @Query(CartQueries.FIND_BY_USER)
    Cart findByUser(final long id);
}
