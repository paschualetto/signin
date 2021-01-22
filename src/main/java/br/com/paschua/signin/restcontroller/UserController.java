package br.com.paschua.signin.restcontroller;

import br.com.paschua.signin.entity.User;
import br.com.paschua.signin.repository.UserRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fernando
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAll() {
        return userRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

//    @PostMapping(path = "/add")
//    public User add(@RequestBody User user) {
//        return userRepository.save(user);
//    }
    @PostMapping(path = "/add")
    public @ResponseBody
    User add(@RequestParam String name, @RequestParam String email) {
        User u = new User();
        u.setName(name);
        u.setEmail(email);
        return userRepository.save(u);
    }

    @PutMapping(path = "/update/{id}")
    public User update(@RequestBody User newUser, @PathVariable Long id) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(newUser.getName());
                    user.setEmail(newUser.getEmail());
                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }
}
