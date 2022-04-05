
import java.util.Date;

public class FoudException {

	public static void main(String[] args) {

		Date date =null;
		Date today =new Date();


		try {
			System.out.println(date.getClass().getName());
			System.out.println(today.getClass().getName());
		} catch (java.lang.NullPointerException e) {
			System.out.println("erreur : "+e.getMessage());
			System.out.println("ignore...");
		}finally{
            if ( today != null ) {
            	System.out.println(today.getClass().getName());
            }
            if ( date != null ) {
            	System.out.println(date.getClass().getName());
            }
			
		}
		
	}

}
