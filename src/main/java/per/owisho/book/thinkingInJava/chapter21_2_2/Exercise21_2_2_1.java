package per.owisho.book.thinkingInJava.chapter21_2_2;

public class Exercise21_2_2_1{

	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			new Thread(new Exercise21_2_2_1Thread()).start();
		}
		System.out.println("线程启动结束");
	}

}

class Exercise21_2_2_1Thread implements Runnable{
	
private static int count = 0;
	
	private final int id = count++;
	
	public Exercise21_2_2_1Thread() {
		System.out.println(id +"开始输出");
	}
	
	public void run() {
		for(int i=0;i<3;i++){
			System.out.println(id+"正在打印");
		}
		Thread.yield();
	}
	
}
