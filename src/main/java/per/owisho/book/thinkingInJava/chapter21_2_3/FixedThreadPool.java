package per.owisho.book.thinkingInJava.chapter21_2_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import per.owisho.book.thinkingInJava.chapter21_2_1.LiftOff;

public class FixedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i=0;i<5;i++){
			exec.execute(new LiftOff());
		}
		exec.shutdown();
	}
	
}
