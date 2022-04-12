import entities.User;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repositories.UserRepository;
import services.UserService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;
    private UserService userService;

    @GetMapping
    public List<User> listar(){
        return userRepository.findAll();
    }

    @GetMapping("{userId}")
    public ResponseEntity<User> buscar (@PathVariable Long userId) {
        Optional<User> user = userRepository.findById(userId);

        if (user.isPresent()) {
            return ResponseEntity.ok(user.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User adicionar(@Valid @RequestBody User user){
        return UserService.salvar(user);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<User> atualizar (@PathVariable Long userId,@Valid @RequestBody User user){
        if(!userRepository.existsById(userId)){
            return ResponseEntity.notFound().build();
        }
        user.setId(userId);
        user = userService.salvar(user);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Void> remover(@PathVariable Long userId){
        if(!userRepository.existsById(userId)){
            return ResponseEntity.notFound().build();
        }

        userService.excluir(userId);
        return ResponseEntity.noContent().build();
    }
}