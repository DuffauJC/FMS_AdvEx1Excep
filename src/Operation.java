
public class Operation {

	public static int add(int a,int b) {

		return a+b;
	}
	public static int sub(int a,int b) {

		return a-b;
	}
	public static int mul(int a,int b) {

		return a*b;
	}
	public static int div(int a,int b) {
		int c=0;
		
		return b!=c ? a/b : 0;
	}


	public static void main(String[] args) {

		System.out.println("addition :"+add(5,2));
		System.out.println("soustration :"+sub(5,2));
		System.out.println("multiplication:"+mul(5,2));
		System.out.println("division: "+div(5,2));
		System.out.println("division par zéro : "+div(3,0));

	}

}
