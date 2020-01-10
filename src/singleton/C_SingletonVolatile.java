package singleton;

public class C_SingletonVolatile {

    private volatile static C_SingletonVolatile instance;

    private C_SingletonVolatile() {
    }

    public static C_SingletonVolatile getInstance() {
        if (instance == null) {
            synchronized (C_SingletonVolatile.class) {
                if (instance == null) {
                    instance = new C_SingletonVolatile();
                }
            }
        }

        return instance;
    }

}
