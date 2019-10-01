package pl.weeia.makz.zadanie1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RevController {
    String input;

    @GetMapping("/rev")
    public String rev(@RequestParam(value="stringToRev") String stringToRev) {
        return  input = new StringBuilder(stringToRev).reverse().toString();
    }
}
