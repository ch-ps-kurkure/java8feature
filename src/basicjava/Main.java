package basicjava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
      public static void main(String[] args)
      {
    	  
    	  System.out.println("-------------------------");
    	System.out.println("this is just testing");
    	System.out.println("----------------------------");
    	System.out.println("Method Overriding & Method Overloading Example");
    	  Student student=new Student();
    	 student.read("python");
    	 Person person= new Person();
    	 person.showDetails();
    	 Ram ram=new Ram();
    	  ram.doWork(person);
      
      
    System.out.println("-----------------------");
      System.out.println("Duplicate Char in Sting chaek");
  
      StringCharCountandPrint dupli=new StringCharCountandPrint();
      dupli.duplicateString("javata");
      
      
      System.out.println("---------------------");
      System.out.println("Find last Two Char in String");
      
      FindLastTwoCharString last=new FindLastTwoCharString();
      last.findLasttwo("chhaya");
      
      System.out.println("-----------------------------");
      System.out.println("java 8 feature lamda function");
      
      //Create parent class object call method
      javaeight myinter=new MyInterImpl();
      myinter.sayHello();
      
      
      
      // Anonymous class implements Interface
      javaeight i=new javaeight() {

		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			System.out.println("anonymous class implement interface");
		}
    	  
      };
     i.sayHello(); 
      
      //lambda Expression using functional interface
      
      javaeight i1 = ()->System.out.println("using lambda call method");
      i1.sayHello();
      
      
      SumInter sum=(a,b)->{
    	  return a+b;
      };
      System.out.println(sum.sum(4, 2));
      
      
      System.out.println("--------------------");
      System.out.println("Stram Api");
      
      List<Integer> list= List.of(2,73,7,8,9,0);
      
      
      List<Integer> list2=new ArrayList<>();
      list2.add(23);
      list2.add(56);
      list2.add(67);
      
      
      List<Integer> arraylist=new ArrayList<>();
      for(int ch : list) {
    	  if(ch%2==0) {
    		  arraylist.add(ch);
    	  }
      }
      
      System.out.println("without stream api even num "+arraylist);
      
      Stream<Integer> stream= list.stream();
     List<Integer> newlist= stream.filter(f->f%2==0).collect(Collectors.toList());
     System.out.println("using stream api"+newlist); 
     
     
     List<Integer> newlist1=list.stream().filter(f->f%2==0).collect(Collectors.toList());
     System.out.println(newlist1);
     
     Stream<Object> emptystream=Stream.empty();
     emptystream.forEach(e->{
    	 System.out.println(e);
     });
     
     String name[] = {"chhaya","Uttam","ankit","divya"};
     Stream<String> stram1=Stream.of(name);
     stram1.forEach(e->{
    	 System.out.println(e);
     });
     
     
   //  using builder
     Stream.builder().build();
     List<Integer> number=List.of(23,78,9,0,6,1);
     List<Integer> newNumber=number.stream().map(p->p*p).collect(Collectors.toList());
     System.out.println(newNumber);
     
     Integer interger=number.stream().min((x,y)->x.compareTo(y)).get();
     System.out.println(interger);
     
     
     System.out.println("---------------------------");
     System.out.println("method  Reference------>");
     
     
      }
}