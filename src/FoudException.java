
import java.util.Date;

public class FoudException {

	public static void main(String[] args) {

		//Date date =null;
		Date date =new Date();
		Date today =new Date();


		try {
			System.out.println(date.getClass().getName());// erreur avec date = null
			System.out.println(today.getClass().getName());
		} catch (Exception e) {
			System.out.println("erreur : "+e);
			System.out.println("ignore...");
		}
		finally{
			System.out.println("plus de bug !!");
		} 

	}
}


