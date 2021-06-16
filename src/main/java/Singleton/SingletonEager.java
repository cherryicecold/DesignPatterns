
package Singleton;

public class SingletonEager {
    private static SingletonEager singletonEager = new SingletonEager();

    private SingletonEager(){

    }

    public static SingletonEager getSingletonEagerInsance(){
        return singletonEager;
    }
}

 class SingletonExample{
    public static void main(String[] args) {
        SingletonEager instance1 = SingletonEager.getSingletonEagerInsance();
        System.out.println(instance1);

        SingletonEager instance2 = SingletonEager.getSingletonEagerInsance();
        System.out.println(instance2);
    }
}
