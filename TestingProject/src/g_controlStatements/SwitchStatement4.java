//WAP TO PRINT MENU CARD MENU CASES
package g_controlStatements;

public class SwitchStatement4 
{
 public static void main(String[] args) 
 {
	int Menu=4;
	
	switch(Menu)
	{
	case 1:
		System.out.println("STARTES==MANCHAU SOUP AND MANCHURIAN AVAILABLE");
		break;
		
	case 2:
		System.out.println("MAIN COURSE==PANNER HANDI AND RUMALI ROTI AVAILABLE");
		break;
		
	case 3:
		System.out.println("MAIN COURSE==KAJU CURRY AND TANDOORI ROTI AVAILABLE");
		break;
		
	case 4:
		System.out.println("MAIN COURSE==DUM BIRYANI AND SALAD AVAILABLE");
		break;
		
	case 5:
		System.out.println("DESEART==ICE CREAM,SIZZLING BROWNII AVAILABLE");
		break;
		
		default:
		System.out.println("SORRY HOTEL CLOSED AVAILABLE");
	}

 }

}
