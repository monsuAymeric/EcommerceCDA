package io.ski.api.persistance.repository.product;

public class ProductQueries {
    public static final String FIND_BY_REF = "Select p FROM Product p WHERE p.reference = :id_ref";
}
