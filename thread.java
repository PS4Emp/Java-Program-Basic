public class Multi extends Thread{
public void run(){
System.out.println("thread is runnning");
}

public static void thread(String[] args){
Multi t1 = new Multi();

t1.start();
}
}
