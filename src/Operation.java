
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
	
	
	//division  exo 1.2
	public static int div(int a,int b)throws Exception  {

		if (b==0) {
			throw new Exception("Division par zéro impossible");
		}
		return  a/b;

	}



	public static void main(String[] args) {

		
		// exo 1.2
		try {
			System.out.println("division: "+div(5,0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("addition :"+add(5,2));
			System.out.println("soustration :"+sub(5,2));
			System.out.println("multiplication:"+mul(5,2));
		}
	

	}

}
