package singleton;

public class D_SingletonStaticClass {

    private volatile static D_SingletonStaticClass instance;

    private D_SingletonStaticClass() {
    }

    public static D_SingletonStaticClass getInstance() {
        if (instance == null) {
            synchronized (D_SingletonStaticClass.class) {
                if (instance == null) {
                    instance = new D_SingletonStaticClass();
                }
            }
        }

        return instance;
    }

}
