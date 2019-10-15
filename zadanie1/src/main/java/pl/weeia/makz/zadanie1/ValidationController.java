package pl.weeia.makz.zadanie1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Rest controller for validate string
 */
@RestController
public class ValidationController {

    /**
     * Method to validate string
     *
     * @param stringToValidate string to validate
     * @return string value with information about stringToValidate
     */
    @GetMapping("/validate")
    public String validate(@RequestParam(value = "stringToValidate") String stringToValidate) {
        if (ValidateUtils.isAlphanumeric(stringToValidate)) {
            return "it is alphanumeric";
        } else if (ValidateUtils.isNumeric(stringToValidate)) {
            return "it is numeric";
        }
        {
            return "it is string";
        }

    }
}
