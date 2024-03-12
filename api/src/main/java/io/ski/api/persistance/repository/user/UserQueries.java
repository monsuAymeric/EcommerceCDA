package io.ski.api.persistance.repository.user;

public class UserQueries {
    public static final String FIND_BY_USERNAME = "SELECT u FROM User u WHERE u.username = :username";
}
