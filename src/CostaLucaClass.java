
/**
 * 
 * 	Classe Sommatoria
 * 
 *  <u>4/5/2022</u>
 * 
 * @author <b>Costa Luca</b>
 * 
 * @version 0
 * 
 *
 */


public class CostaLucaClass {
	
	public CostaLucaClass() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int CostaMet(int f) {
		
		int r=1;
		for(int i=f; i<0; i++) {
			
			r=r*1;
			
		}
		
		return r;
		
		
	}
	

	public static void main(String[] args) {

		CostaLucaClass c = new CostaLucaClass();
		
		System.out.println(c.CostaMet(5));
		System.out.println(c.CostaMet(6));
		
		
	}

}
