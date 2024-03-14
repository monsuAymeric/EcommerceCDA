package io.ski.api.persistance.repository.user;

public class UserQueries {

    private UserQueries() {
        throw new IllegalStateException("Utility class not meant for instantiation!");
    }

    public static final String FIND_BY_USERNAME = "SELECT u FROM User u WHERE u.username = :username";
}
