package io.ski.api.persistance.repository.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import io.ski.api.persistance.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    /**
     * Find user by username
     * 
     * @param username the username
     * @return A list of users with the given username
     */
    @Query(UserQueries.FIND_BY_USERNAME)
    List<User> findByUsername(final String username);

    /**
     * Find user by email
     * 
     * @param email the email
     * @return The user with the given email
     */
    @Query(UserQueries.FIND_BY_EMAIL)
    User findByEmail(final String email);
}
