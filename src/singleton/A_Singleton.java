package singleton;

public class A_Singleton {

    private static A_Singleton instance;

    private A_Singleton() {
    }

    public static A_Singleton getInstance() {
        if (instance == null) {
            instance = new A_Singleton();
        }

        return instance;
    }

}
