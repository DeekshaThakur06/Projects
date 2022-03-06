
public class Runnables implements Runnable {
 public void run() {
	 System.out.println("Runnable interface implementing.");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Runnables r = new Runnables();
	Thread rn = new Thread(r);
	rn.start();

	}

}
