package HomeWork5_TQ;

/*
	17. In lifecycle of Thread write a program to show use of join,sleep,synchronize,volatile all
	used in a program. 
*/

Public class Counter 
{
    // volatile ensures visibility of changes across threads
    private volatile int count = 0;

    // synchronized method to avoid race conditions
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread 
{
    private Counter counter;

    public IncrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " incremented count to " + counter.getCount());

                // Sleep for 500 ms
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
    }
}

public class Question_17 
{
    public static void main(String[] args) 
    {
        Counter counter = new Counter();

        IncrementThread t1 = new IncrementThread(counter);
        IncrementThread t2 = new IncrementThread(counter);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();
        t2.start();

        try {
            // Main thread waits for t1 and t2 to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        System.out.println("Final count: " + counter.getCount());
    }
}

/* 
Output - 

Thread-1 incremented count to 1
Thread-2 incremented count to 2
Thread-1 incremented count to 3
Thread-2 incremented count to 4
Thread-1 incremented count to 5
Thread-2 incremented count to 6
Thread-1 incremented count to 7
Thread-2 incremented count to 8
Thread-1 incremented count to 9
Thread-2 incremented count to 10
Final count: 10

*/