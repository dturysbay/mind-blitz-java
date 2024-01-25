package kz.memory.blitz.MemoryBlitz.service;

import kz.memory.blitz.MemoryBlitz.model.ConfirmationToken;
import kz.memory.blitz.MemoryBlitz.repository.ConfirmationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor

public class ConfirmationTokenService {
    private final ConfirmationTokenRepository repository;
    public void saveConfirmationToken(ConfirmationToken token){
        repository.save(token);
    }
}
