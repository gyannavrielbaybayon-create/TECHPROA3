class MyTask implements Runnable {
    private String taskName;
    
    MyTask(String taskName) {
        this.taskName = taskName;
    }
    
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(taskName + " is running - step " + i);
            try {
                Thread.sleep(600);
            }catch (InterruptedException e) {
                System.out.println(e);
            }
         }
    }
}
public class Q3Sw10 {
	public static void main(String[] args) {
	
	System.out.println("Code complete");
	}
}
