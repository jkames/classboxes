import java.util.Random;

class Thread1 extends Thread{
    public void run(){
       assignment16a.num = assignment16a.rand.nextInt(100);
        System.out.println("random number is: " + assignment16a.num);
    }
}

class Thread2 extends Thread{
    public void run(){
       if(assignment16a.num%2 == 0){
           System.out.println("thread 2: "+assignment16a.num*assignment16a.num);
       }
    }
}

class Thread3 extends Thread{
    public void run(){
        if(assignment16a.num%2 != 0)
            System.out.println("thread 3: "+assignment16a.num*assignment16a.num*assignment16a.num);

    }
}

public class assignment16a{
    public static Random rand = new Random();
    public static int num;

    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();

        thread.start();
        while(thread.isAlive()){
            System.out.println("Waiting...");
        }
        thread2.start();
        thread3.start();

    }
}
