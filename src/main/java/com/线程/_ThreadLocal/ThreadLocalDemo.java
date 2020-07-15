package com.线程._ThreadLocal;

/**
 * @author liyiruo
 */
public class ThreadLocalDemo {
    static class Bank {
        private ThreadLocal<Integer> local = new ThreadLocal<Integer>() {
            @Override
            protected Integer initialValue() {
                return 0;
            }
        };

        public Integer get() {
            return local.get();
        }

        public void set(Integer money) {
            local.set(local.get() + money);
        }
    }

    static class Tranfer implements Runnable {
        private Bank bank;

        Tranfer(Bank bank) {
            this.bank = bank;
        }

        @Override
        public void run() {

            for (int i = 0; i < 10; i++) {
                bank.set(10);
                System.out.println(Thread.currentThread().getName() + "账户余额： " + bank.get());
            }

        }
    }

    public static void main(String[] args) {

        Bank bank = new Bank();
        Tranfer tranfer = new Tranfer(bank);

        Thread thread1 = new Thread(tranfer, "客户1");
        Thread thread2 = new Thread(tranfer, "客户2");
        thread1.start();
        thread2.start();

    }


}
