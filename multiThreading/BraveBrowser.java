package multiThreading;

public class BraveBrowser extends Thread {
	
	public void run() {
		System.out.println("-------Check Brave BRowser-------------");
		try {Thread.sleep(2000);} catch(Exception e) {System.out.println(e);}
		System.out.println("------Brave Browser Working -------");
	}
	
	
	
	public static void main(String[] args) {
		BraveBrowser bb = new BraveBrowser();
		bb.start();
	}

}
