package io.ski.api.persistance.repository.reference;

public class ReferenceQueries {

    private ReferenceQueries() {
        throw new IllegalStateException("Utility class not meant for instantiation!");
    }

    public static final String FIND_BY_NAME = "Select r FROM Reference r WHERE r.name = :name";
}
