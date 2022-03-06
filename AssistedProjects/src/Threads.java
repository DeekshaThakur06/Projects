
public class Threads extends Thread{
 
     public void run() {
		System.out.println("Program executions using extended thread class.");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Threads td = new Threads();
     td.start();
     System.out.println("TO get name of main thread:" + Thread.currentThread().getName());
     System.out.println("Thread name of this class:" + Threads.currentThread().getName());
     System.out.println("Default Priority Of thread is:" +(Thread.currentThread().getPriority()));
     System.out.println("Setting Priority of thread");
     td.setPriority(8);
     System.out.println("Getting Priority of thread:" + Thread.currentThread().getPriority());
	}

}
