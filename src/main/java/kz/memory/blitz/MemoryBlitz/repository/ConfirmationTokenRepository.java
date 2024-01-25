package kz.memory.blitz.MemoryBlitz.repository;

import kz.memory.blitz.MemoryBlitz.model.ConfirmationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfirmationTokenRepository extends JpaRepository<ConfirmationToken,Long>{
    @Query
    Optional<ConfirmationToken> findByToken(String token);
}
