package io.ski.api.persistance.repository.user;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import io.ski.api.persistance.entity.User;

public interface IUserRepository extends JpaRepository<User, Long> {

    /**
     * Find user by username
     * 
     * @param username the username
     * @return A list of users with the given username
     */
    @Query(UserQueries.FIND_BY_USERNAME)
    List<User> findByUsername(final String username);
}
