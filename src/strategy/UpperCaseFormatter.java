package strategy;

public class UpperCaseFormatter implements TextFormatterStrategy {
    public String format(String text) {
        return text.toUpperCase();
    }
}
