package io.ski.api.persistance.repository.cart;

public class CartQueries {
    public static final String FIND_BY_USER = "Select c FROM Cart c WHERE c.user = :id_user";
}
