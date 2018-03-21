
public class Teglalaphasznalo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Teglalap a_objektum = new Teglalap(2);
	    Teglalap b_objektum = new Teglalap(5, 6);
	    
	    Teglalap c_objektum = a_objektum;
	    
	    
	    System.out.println(a_objektum);
	    System.out.println(b_objektum);
	    System.out.println(c_objektum);
	    System.out.println(" ");
	    
	    a_objektum.setOldalak(5);
	    
	    System.out.println(a_objektum);
	    System.out.println(b_objektum);
	    System.out.println(c_objektum);
	    System.out.println(" ");
	    
	    a_objektum.setOldalak(3, 5);
	    
	    System.out.println(a_objektum);
	    System.out.println(b_objektum);
	    System.out.println(c_objektum);
	    System.out.println(" ");
	    
	    
	   System.out.println(a_objektum == b_objektum);
	   System.out.println(a_objektum == c_objektum);
	   System.out.println(a_objektum.egyenloE(c_objektum));
	    
	    
	}

}
