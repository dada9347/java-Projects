package javaproject;

class MyTask extends Thread{
	private String taskName;
	
	public MyTask(String taskName) {
		this.taskName=getName();
	}
	public void run() {
		for(int i=1;i<=5;i++){
			System.out.println(taskName +"steps"+i);
			try {
				Thread.sleep(5000);;
			}catch(Exception e) {
				System.out.println(taskName+"was interrupted");
			}
		}
	}
	// TODO Auto-generated method stub

}
public class SimpleCocurrency{
	public static void main(String[]args) {
		MyTask t1=new MyTask("mg");
		MyTask t2=new MyTask("pn");
		t1.start();
		t2.start();
	}
}

