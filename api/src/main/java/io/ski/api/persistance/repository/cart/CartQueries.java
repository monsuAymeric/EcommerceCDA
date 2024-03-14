package io.ski.api.persistance.repository.cart;

public class CartQueries {

    private CartQueries() {
        throw new IllegalStateException("Utility class not meant for instantiation!");
    }

    public static final String FIND_BY_USER = "Select c FROM Cart c WHERE c.user = :id_user";
}
