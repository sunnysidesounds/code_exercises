package DesignPatterns.CreationalPatterns.SingletonPattern;

public class Singleton {

    private static Singleton singleton = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }
    // Other methods protected by singleton class

}
