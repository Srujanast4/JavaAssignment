
class StaticVariable{  
   int number;  
   String address;  
   static String college ="ITS";  
     
   StaticVariable(int n,String a){  
   number = n;  
   address = a;  
   }  
 void display ()
 {
	 System.out.println(number+" "+address);
	 }  
  
 public static void main(String args[]){
 StaticVariable a2 = new StaticVariable(101,"presidio apartment");  
 StaticVariable a3 = new StaticVariable(102,"rexford apartment");  
 StaticVariable a1=new StaticVariable(103,"paragon");
 a1.display();  
 a2.display();  
 a3.display();  
 }  
} 