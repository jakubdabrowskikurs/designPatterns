package singleton;

    public class D_SingletonStaticClass {

        private D_SingletonStaticClass() {}

        public static D_SingletonStaticClass getInstance() {
            return SingletonHolder.INSTANCE;
        }

        private static class SingletonHolder {
            private static final D_SingletonStaticClass INSTANCE = new D_SingletonStaticClass();
        }
    }

