
public class Hanoitower{
	//method to create variable for number of discs, first disc, second disc and destination disc third disc
	public static void HanoiTower(int disc, char source, char dest, char aux) { 
		

		//check if 
	    if (disc == 1) { 
	        System.out.println("Move disc 1 from rod " + source +" to rod "+ dest + "  destination"); 
	        return; 
	    } 
	    
	    else {
	    HanoiTower(disc - 1, source, aux, dest); 
	    System.out.println("move disc "+ disc + " from rod " + source +" to rod " + dest + "  destination"); 
	    HanoiTower(disc - 1, aux, dest, source); 
	    }
	} 
	 
	// Driver code
	public static void  main(String args[]) 
	{ 
		int disc = 5; // Number of discs 

		//calling out the function and passing in arguments
	    HanoiTower(disc, 'A', 'B', 'C');  
	} 
	}
	 
	
