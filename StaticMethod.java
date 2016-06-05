class StaticMethod{  
     int rollno;  
     String name;  
     static String college = "OU";  
       
     static void change(){  
     college = "NPU";  
     }  
  
     StaticMethod(int r, String n){  
     rollno = r;  
     name = n;  
     }  
  
     void display ()
     {
    	 System.out.println(rollno+" "+name+" "+college);
    	 }  
  
    public static void main(String args[]){  
    StaticMethod.change();  
  
    StaticMethod s1 = new StaticMethod (111,"Prathyusha");  
    StaticMethod s2 = new StaticMethod (222,"Srujana");  
    StaticMethod s3 = new StaticMethod (333,"Lakshmi");  
  
    s1.display();  
    s2.display();  
    s3.display();  
    }  
}  