package JavaCoding;

/*Implement ticket reservation application using multithreading where it has available seats information.
 *  Create 4 threads to access this data to book tickets and ensure data consistency Ex 
 *   available seats=10 T1 requires 6 seats T2 requires 3 seats T2 requires 4 seats
 *   If available seats < seats required proper error message should get printed*/


class T1 extends Thread{
	 public void run() {
		 for(int i=1;i<=6;i++) {
		 System.out.println("Seat=6");
		 try{Thread.sleep(1000);}
		 catch (Exception e) {}
	
	 }
}

}
class T2 extends Thread{
	 public void run() {
		 for(int i=1;i<=5;i++) {
	 System.out.println("Seat=5");
		 try{Thread.sleep(1000);}
		 catch (Exception e) {}
	 }

} 

}
class T3 extends Thread{
	 public void run() {
		 for(int i=1;i<=3;i++) {
		 System.out.println("Seat=3");
		 try{Thread.sleep(1000);}
		 catch (Exception e) {}
	
	 }
}

}
class T4 extends Thread{
	 public void run() {
		 for(int i=1;i<=4;i++) {
		 System.out.println("Seat=4");
		 try{Thread.sleep(1000);}
		 catch (Exception e) {}
	
	 }
}

}
public class MultiTHreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1 object1= new T1();
		 T2 object2= new T2();
		 T3 object3= new T3();
		 T4 object4= new T4();
		 object1.start();
		 try{Thread.sleep(1000);}
			 catch (Exception e) {}
		 object2.start();
		 try{Thread.sleep(1000);}
		 catch (Exception e) {}
		object3.start();
		try{Thread.sleep(1000);}
		catch (Exception e) {}
		object4.start();

		 
	}

}
