package Singleton;

import java.util.concurrent.SynchronousQueue;

public class SingletonSynchronized {
    private static SingletonSynchronized singletonSynchronized;

    public static synchronized SingletonSynchronized getInstance(){
        if (singletonSynchronized == null)
            singletonSynchronized = new SingletonSynchronized();
        return singletonSynchronized;
    }
}

class SingletonSynchrnonizedExample{
    public static void main(String[] args) {
        SingletonSynchronized instance1 = SingletonSynchronized.getInstance();
        System.out.println(instance1);
        SingletonSynchronized instance2 = SingletonSynchronized.getInstance();
        System.out.println(instance2);

        SingletonSynchronizedBlock inst1 = SingletonSynchronizedBlock.getInstance();
        System.out.println(inst1);
        SingletonSynchronizedBlock inst2 = SingletonSynchronizedBlock.getInstance();
        System.out.println(inst2);
    }

}


    class SingletonSynchronizedBlock {
        private static SingletonSynchronizedBlock instance;

        public static  SingletonSynchronizedBlock getInstance(){
            if (instance == null){
                synchronized(SingletonSynchronizedBlock.class) {
                    instance = new SingletonSynchronizedBlock();
                }
            }

            return instance;
        }
    }
