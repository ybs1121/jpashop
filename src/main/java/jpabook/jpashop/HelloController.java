package jpabook.jpashop;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/test")
    public ResponseEntity<String> hello(){
        String testData = "test";
        return ResponseEntity.status(HttpStatus.OK).body(testData);
    }
}
