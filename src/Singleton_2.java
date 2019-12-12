
//懒汉线程不安全方式
public class Singleton_2 {
    private static Singleton_2 instance;
    private Singleton_2(){}
    public static Singleton_2 getInstance(){
        if(instance == null){
            instance = new Singleton_2();
        }
        return instance;
    }
}

//懒汉线程安全
class Singleton2{
    private static Singleton2 instance;
    private Singleton2(){};
    public static synchronized Singleton2 getInstance(){
        if(instance == null){
            instance = new Singleton2();
        }
        return instance;
    }
}

//饿汉线程安全；
class Singleton3{
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){};
    public static Singleton3 getInstance(){
        return instance;
    }
}

//双锁线程安全：懒汉线程安全
class Singleton4{
    private static volatile Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(instance == null){
            synchronized (Singleton4.class){
                instance = new Singleton4();
            }
        }
        return instance;
    }
}

//内部静态类: 懒汉线程安全(静态内部类只能被外部父类调用）
class Singleton5{
    private static class Singleton5Holder{
        private static Singleton5 instance = new Singleton5();
    }
    private Singleton5(){};
    public static Singleton5 getInstance(){
        return Singleton5Holder.instance;
    }


}
