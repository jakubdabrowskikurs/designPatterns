package strategy;

public class Main {

    private static String textToFormat = "wzoRzec Strategia Bardzo Fajny W Niedzię";

    public static void main(String[] args) {
        StringFormatter stringFormatterC = new StringFormatter("capitalize");
        System.out.println(stringFormatterC.format(textToFormat));

        StringFormatter stringFormatterU = new StringFormatter("upperCase");
        System.out.println(stringFormatterU.format(textToFormat));

        StringFormatter stringFormatterL = new StringFormatter("lowerCase");
        System.out.println(stringFormatterL.format(textToFormat));

        System.out.println("--------------------");
        FormatterContext context = new FormatterContext();

        context.set(new CapitalizeFormatter());
        context.print(textToFormat);

        context.set(new UpperCaseFormatter());
        context.print(textToFormat);

        context.set(new LowerCaseFormatter());
        context.print(textToFormat);
    }
}
