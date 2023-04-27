package shita.controllers;

import org.springframework.web.bind.annotation.*;
import shita.data.model.User;
import shita.dto.requests.RegisterUserRequest;
import shita.dto.responses.RegisterUserResponse;
import shita.services.UserService;
import shita.services.UserServiceImpl;

@RestController
public class UserController {
    private final UserService userService = new UserServiceImpl();

    @PostMapping("/user")
    public RegisterUserResponse registerNewUser(@RequestBody RegisterUserRequest user) {
        return userService.registerNewUser(user);
    }

    @GetMapping("/user/{id}")
    public User findUserId(@PathVariable int id) {
        return userService.findUser(id);
    }
}
