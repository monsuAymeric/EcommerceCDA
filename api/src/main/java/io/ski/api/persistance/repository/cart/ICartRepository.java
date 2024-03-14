package io.ski.api.persistance.repository.cart;

import io.ski.api.persistance.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICartRepository extends JpaRepository<Cart, Long> {
    @Query(CartQueries.FIND_BY_USER)
    Cart findByUser(final long id_user);
}
