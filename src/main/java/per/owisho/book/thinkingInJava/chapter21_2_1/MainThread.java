package per.owisho.book.thinkingInJava.chapter21_2_1;

public class MainThread {

	public static void main(String[] args) {
		/*Thread thread =new Thread(new LiftOff());
		thread.start();*/
		LiftOff launch = new LiftOff();
		launch.run();
		System.out.println("Waiting For LiftOff");
	}
	
}
