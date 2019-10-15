package pl.weeia.makz.zadanie1;

/**
 * Class used for validate strings
 */
public class ValidateUtils {

    /**
     * Method to resolve that string is number
     *
     * @param string to validate
     * @return boolean
     */
    public static boolean isNumeric(String string) {
        return string.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * Method to resolve that string is a Alphanumeric
     *
     * @param string to validate
     * @return boolean
     */
    public static boolean isAlphanumeric(String string) {
        return !string.matches("[a-zA-Z0-9]+");
    }

    /**
     * Method to resolve that string is string
     *
     * @param string to validate
     * @return boolean
     */
    public static boolean isString(String string) {
        return !string.matches("[a-zA-Z]+");
    }
}
