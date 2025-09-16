package com.vishnu.designpatterns.creational.singleton;

public class SingletonDriver {
    public static void main(String[] args) {
        // Early Initialization.
        SingletonEarlyInitialization instance1 = SingletonEarlyInitialization.getInstance();
        SingletonEarlyInitialization instance2 = SingletonEarlyInitialization.getInstance();
        System.out.println("Early Init: " + (instance1 == instance2));  // true

        // Lazy Initialization.
        SingletonLazyInitialization lazy1 = SingletonLazyInitialization.getInstance();
        SingletonLazyInitialization lazy2 = SingletonLazyInitialization.getInstance();
        System.out.println("Lazy Init: " + (lazy1 == lazy2));  // true

        Runnable task = () -> {
            SingletonLazyInitialization obj = SingletonLazyInitialization.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + obj.hashCode());
        };

        Thread t1 = new Thread(task, "T1");
        Thread t2 = new Thread(task, "T2");

        t1.start();
        t2.start();


        // Thread Safe.
        SingletonThreadSafe ts1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe ts2 = SingletonThreadSafe.getInstance();
        System.out.println("Thread Safe: " + (ts1 == ts2));  // true

        // Double lock.
        SingletonDoublelock dl1 = SingletonDoublelock.getInstance();
        SingletonDoublelock dl2 = SingletonDoublelock.getInstance();
        System.out.println("Double Lock: " + (dl1 == dl2));  // true

        // Bill Pugh Singleton.
        BillPughSingleton bp1 = BillPughSingleton.getInstance();
        BillPughSingleton bp2 = BillPughSingleton.getInstance();
        System.out.println("Bill Pugh: " + (bp1 == bp2));  // true

        // Extra: Print hashcodes so you can visually check
        System.out.println("\nHashCodes:");

        // Early Init
        System.out.println("Early Init hashcode instance1: " + instance1.hashCode());
        System.out.println("Early Init hashcode instance2: " + instance2.hashCode());

        // Lazy Init
        System.out.println("Lazy Init hashcode lazy1: " + lazy1.hashCode());
        System.out.println("Lazy Init hashcode lazy2: " + lazy2.hashCode());

        // Thread Safe
        System.out.println("Thread Safe hashcode ts1: " + ts1.hashCode());
        System.out.println("Thread Safe hashcode ts2: " + ts2.hashCode());

        // Double Lock
        System.out.println("Double Lock hashcode dl1: " + dl1.hashCode());
        System.out.println("Double Lock hashcode dl2: " + dl2.hashCode());

        // Bill Pugh
        System.out.println("Bill Pugh hashcode bp1: " + bp1.hashCode());
        System.out.println("Bill Pugh hashcode bp2: " + bp2.hashCode());

        SingletonEnum e1 = SingletonEnum.INSTANCE;
        SingletonEnum e2 = SingletonEnum.INSTANCE;

        // Verify both are same
        System.out.println("Enum Singleton: " + (e1 == e2));  // true
        System.out.println("e1 hashcode: " + e1.hashCode());
        System.out.println("e2 hashcode: " + e2.hashCode());
        e1.showMessage();
    }
}
