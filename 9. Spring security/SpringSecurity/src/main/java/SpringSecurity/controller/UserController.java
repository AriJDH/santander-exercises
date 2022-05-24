package SpringSecurity.controller;

import SpringSecurity.dto.UserDTO;
import SpringSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signUp")
    public ResponseEntity<String> signUp(@RequestBody UserDTO userDTO) {
        if (userService.addUser(userDTO)) {
            return ResponseEntity.ok().body("User created");
        } else {
            return ResponseEntity.ok().body("User not created");
        }
    }

    @GetMapping("/login")
    public ResponseEntity<String> login(@RequestBody UserDTO userDTO) {
        if (userService.login(userDTO)) {
            return ResponseEntity.ok().body("Login successfully");
        } else {
            return ResponseEntity.ok().body("Invalid credentials");
        }
    }
}
