package lucas.my_first_api.controller;

import lucas.my_first_api.model.User;
import lucas.my_first_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> list(){
        return repository.findAll();
    }
    @PostMapping
    public void save(@RequestBody User user){
        repository.save(user);
    }
    @PutMapping
    public void update(@RequestBody User user){
        repository.save(user);
    }
    @GetMapping("/{username}")
    public User find(@PathVariable("username") String username){
        return repository.findByUsername(username);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }
}
