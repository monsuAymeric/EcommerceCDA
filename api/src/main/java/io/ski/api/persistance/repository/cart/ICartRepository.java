package io.ski.api.persistance.repository.cart;

import io.ski.api.persistance.entity.Cart;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICartRepository {
    @Query(CartQueries.FIND_BY_USER)
    List<Cart> findByUser(final long id);
}
