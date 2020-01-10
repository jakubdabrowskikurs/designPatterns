package singleton;

public class B_SingletonSynchronized {

    private static B_SingletonSynchronized instance;

    private B_SingletonSynchronized() {
    }

    public static synchronized B_SingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new B_SingletonSynchronized();
        }

        return instance;
    }

}
