package multiThreading;

public class FirefoxBrowser implements Runnable {

	public void run() {
		System.out.println("-------Check Brave BRowser-------------");
		try {Thread.sleep(2000);} catch(Exception e) {System.out.println(e);}
		System.out.println("------Brave Browser Working -------");
	}
	
	
	public static void main(String[] args) {
		
		Runnable fb = new FirefoxBrowser();
		Thread T1 = new Thread(fb);
		T1.start();
	}

}
