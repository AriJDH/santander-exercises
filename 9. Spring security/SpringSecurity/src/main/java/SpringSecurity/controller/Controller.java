package SpringSecurity.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@PreAuthorize("hasAuthority('ALL')")
public class Controller {

    @GetMapping("/helloWorld")
    //@PreAuthorize("hasAuthority('ALL')")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok().body("Hello world");
    }
    @GetMapping("/helloUser")
    //@PreAuthorize("hasAuthority('ADMIN') OR hasAuthority('USER')")
    public ResponseEntity<String> helloUser() {
        return ResponseEntity.ok().body("Hello user");
    }

    @GetMapping("/helloAdmin")
    //@PreAuthorize("hasAuthority('ADMIN')")
    public ResponseEntity<String> helloAdmin() {
        return ResponseEntity.ok().body("Hello admin");
    }
}
