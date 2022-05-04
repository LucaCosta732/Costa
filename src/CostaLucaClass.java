
/**
 * 
 * 	<u>Classe Sommatoria</u>
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
		
		int r = 1;
		for(int i=f; i<0; i++) {
			
			r = r + i;
		}
		
		return r;
		
		
	}
	

	public static void main(String[] args) {

		CostaLucaClass c = new CostaLucaClass();
		
		System.out.println(c.CostaMet(5));
		System.out.println(c.CostaMet(6));
		
		
		//Test A  f = 5 risAtt = 15 ott = 1  | f = 3 risAtt = 6 ott = 1 | f = 2 risAtt = 3 ott = 1
		
	}

}
