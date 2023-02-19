import java.security.Signature;

public class Runner {

    public static void main(String args[]){
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton1.getData());

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton2.getData().toUpperCase());

        singleton2.setData("Data changed");

        Singleton singleton3 = Singleton.getInstance();
        System.out.println(singleton3.getData());
    }
}
