package home.corp.docker_maven;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @GetMapping("/")
    public ResponseEntity<String> main(){
        return ResponseEntity.ok("Main -> ok  -> date: " + new Date());
    }

    @GetMapping("/test")
    public ResponseEntity<String> test(){
        return ResponseEntity.ok("Test -> ok  -> date: " + new Date());
    }
}