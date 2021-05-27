package Block4.Person;

import Block4.Person.Person;

public class Main {
    public static void main(String[] args) {
        Runnable person1 = new Person("Horst");
        Runnable person2 = new Person("Martin");

        Thread thread1 = new Thread(person1);
        Thread thread2 = new Thread(person2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
