import entities.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    
    private static UserRepository userRepository;

    public Optional<User> buscar (Long userId){
        return userRepository.findById(userId);
    }
    @Transactional
    public static User salvar(User user){
        return userRepository.save(user);
    }

    @Transactional
    public void excluir(Long userId){

        userRepository.deleteById(userId);
  
