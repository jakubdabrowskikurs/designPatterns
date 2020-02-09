package strategy;

public class LowerCaseFormatter implements TextFormatterStrategy {
    public String format(String text) {
        return text.toLowerCase();
    }
}
