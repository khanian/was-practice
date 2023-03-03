package org.example.counter;

public class Counter implements Runnable {
    private int count = 0;

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getValue() {
        return count;
    }

    @Override
    public void run() {
        // thread safety 하지 않아서 동기화가 필요하다.
        // 상태를 유지하게 stateful 하면 안됨. servlet 객체는 싱클톤이어서
        synchronized (this) {
            this.increment();
            System.out.println("Value of Thread After increment " + Thread.currentThread().getName() + " " + this.getValue()); //1
            this.decrement();
            System.out.println("Value of Thread at last " + Thread.currentThread().getName() + " " + this.getValue()); //0
        }
    }
}
