package per.owisho.book.thinkingInJava.chapter21_2_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import per.owisho.book.thinkingInJava.chapter21_2_1.LiftOff;

public class CachedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<5;i++){
			exec.execute(new LiftOff());
		}
		System.out.println("执行完成");
		exec.shutdown();
	}
	
}
