package Ref;

public class Refdemo {
    public static void main(String[] args) {
		System.out.println("Learning Method reference");
		//Provide Implementation of WorkInter
		
		Workinter work=()->{
			System.out.println("Work inter ");
		};
		
		work.dotask();
    	// Statuc method refer
		//Classname::methodName
		
		Workinter work2= Stuff::doStuff;
    	work2.dotask();
    	
    	Runnable rannable= Stuff::threadTask;
    	Thread d=new Thread(rannable);
    	d.start();
    	
    	
    	//Referring non static Method
    	//Object::methodName
    	Stuff ob=new Stuff();
    	Runnable run1=ob::PrintNum;
    	Thread d1=new Thread(run1);
    	d1.start();
	}
}
