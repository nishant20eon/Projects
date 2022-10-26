public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Thread name: " + Thread.currentThread().getName());
//        System.out.println(new Thread().currentThread().getThreadGroup());
        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();
        MyThread[] threads ={thread1,thread2};
        thread1.start();
        thread2.start();

        for(Thread ithThread : threads)
        {
            System.out.println("Thread waiting started :"+ System.currentTimeMillis());

        }
//        Thread.sleep(10);
//        synchronized (thread1)
//        {
//            System.out.println("Thread waiting started :"+ System.currentTimeMillis());
//            thread1.wait(10);
//
//            thread2.wait(10);
//            System.out.println("Thread waiting completed :"+ System.currentTimeMillis());
//        }

//        Here main thread1 calling wait() so, main thread1 will wait for 10 milisec of thread1
//        means whichever thread1 calling wait() that thread1 will wait
        System.out.println("After starting new thread1");



//        start() -> start0() {this is a native call it means this a system call} -> run()
    }

    public static void waitForMe(Thread thread) throws InterruptedException {
        synchronized (thread)
        {
            thread.wait(50);
        }
    }
//    1.57
        private static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("inside run function : thread : " + Thread.currentThread().getName());
            System.out.println("Thread Started");
            int sum = 0;
            for (int i = 0; i <= 10; i++)
                sum += i;

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(sum);


        }
        }

}



//        starvation