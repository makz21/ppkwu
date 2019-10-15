package pl.weeia.makz.zadanie1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest controller for reverse string
 */
@RestController
public class RevController {

    /**
     * Method to reverse string
     *
     * @param stringToRev string to reverse
     * @return String reversed
     */
    @GetMapping("/rev")
    public String rev(@RequestParam(value = "stringToRev") String stringToRev) {
        return new StringBuilder(stringToRev).reverse().toString();
    }
}
