package factory_method;

public class Main {
    public static void main(String[] args) {
        FiguresFactory figuresFactory = new FiguresFactory();
        figuresFactory.getFigure(3);
    }
}
