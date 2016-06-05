
public class methodparam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=40;
		int b=30;
		function(a,b);

	}
public  static void function(int a,int b){
	System.out.println("before swapping:"+a+" "+b);
	int c=a;
	a=b;
	b=c;
	System.out.println("after swapping:"+a+" "+b);
}
}
