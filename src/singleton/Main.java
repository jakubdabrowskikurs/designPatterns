package singleton;

public class Main {
    public static void main(String[] args) {
        A_Singleton ASingleton = A_Singleton.getInstance();
        A_Singleton ASingleton2 = A_Singleton.getInstance();

        System.out.println(ASingleton.hashCode());

        System.out.println(ASingleton2.hashCode());
    }
}
