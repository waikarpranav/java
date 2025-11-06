class first extends Thread{
        public void run(){
            System.out.println("this is thread one");
        }
}
class second extends Thread{
    public void run(){
        System.out.println("this is thread two");
    }
}


public class MULTITHREADING {
    public static void main(String[] args) {
        first t1= new first();
        second t2=  new second();

        t1.start();
        t2.start();
    }
}
