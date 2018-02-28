import java.util.Scanner;


public class masodfok {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner bemenet = new Scanner(System.in);
		
		
		System.out.println("a= ");
		String sztring = bemenet.nextLine();
		double a = Double.parseDouble(sztring);
		
		System.out.println("b= ");
		sztring = bemenet.nextLine();
		double b = Double.parseDouble(sztring);
		
		System.out.println("c= ");
		sztring = bemenet.nextLine();
		double c = Double.parseDouble(sztring);
		

		double x1 = 0, x2 = 0;
		double diszkriminans;
	    double nevezo;
	    int megoldasok = 0;

	    if (a != 0) {
	    	nevezo = 2 * a;
	        diszkriminans = b * b - 4 * a * c;

	        if (diszkriminans > 0) {
	            diszkriminans = Math.sqrt(diszkriminans);
	            x1 = (-b + diszkriminans) / nevezo;
	            x2 = (-b - diszkriminans) / nevezo;
	            megoldasok = 2;
	        }
	        else if (diszkriminans == 0) {
	            x1 = -b / nevezo;
	            megoldasok = 1;
	        }
		}	    
		
	    switch (megoldasok) {
			case 2:
	            System.out.println("2 megoldás");
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
				
				break;
	
			case 1:
	            System.out.println("1 megoldás");
				System.out.println("x = " + x1);
				
				break;
	
			default:
				System.out.println("Nincs megoldás	");
				break;
		}
		
	}
	
}