package kz.memory.blitz.MemoryBlitz.service;

import kz.memory.blitz.MemoryBlitz.model.AppUser;
import kz.memory.blitz.MemoryBlitz.enums.AppUserRole;
import kz.memory.blitz.MemoryBlitz.model.RegistrationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private EmailValidator emailValidator;
    private final AppUserService service;
    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(isValidEmail){
            throw new IllegalStateException("Email not valid");
        }
       return service.singUpUser(
               new AppUser(
                       request.getFirstName(),
                       request.getLastName(),
                       request.getEmail(),
                       request.getPassword(),
                       AppUserRole.USER
               )
       );
    }
}
