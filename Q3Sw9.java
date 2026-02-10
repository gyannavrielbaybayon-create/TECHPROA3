class Task1 extends Thread {
    public void run() {
        for (int i = 1; i <=5; i++) {
        System.out.println("Task 1 running: " + i);
        try{
            Thread.sleep(500); //pause for 0.5 second
        } catch (InterruptedException e) {
            System.out.println(e);
            }
        }
    }
}
class Task2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 2 running: " + i);
        try{
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
            }
        }
    }
}
// this is ConcurrencyExample
public class Q3Sw9 {
	public static void main(String[] args) {
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		t1.start(); //starts task 1
		t2.start(); //starts task 2
	}
}
