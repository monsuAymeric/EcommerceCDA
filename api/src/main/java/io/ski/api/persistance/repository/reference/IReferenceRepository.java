package io.ski.api.persistance.repository.reference;

import io.ski.api.persistance.entity.Reference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IReferenceRepository extends JpaRepository<Reference, Long> {

    @Query(ReferenceQueries.FIND_BY_NAME)
    List<Reference> findByName(final String name);
}
