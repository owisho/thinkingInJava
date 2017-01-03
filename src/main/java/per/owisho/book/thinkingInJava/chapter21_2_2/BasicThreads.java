package per.owisho.book.thinkingInJava.chapter21_2_2;

import per.owisho.book.thinkingInJava.chapter21_2_1.LiftOff;

public class BasicThreads {

	/*public static void main(String[] args) {
		for(int i=0;i<5;i++){
			test(i);
		}
	}
	
	public static void test(int i){
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting For LiftOff"+i);
	}*/
	
	public static void main(String[] args) {
		Thread t = new Thread(new LiftOff());
		t.start();
		System.out.println("Waiting For LiftOff");
	}
	
}
