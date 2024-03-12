package io.ski.api.persistance.repository.product;

public class ProductQueries {
    public static final String FIND_BY_REF = "Select r FROM Refs r where r.id_ref = :id_ref";
}
