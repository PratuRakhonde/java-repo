//WAP TO PRINT SEASON CASES


package g_controlStatements;

public class SwitchStatement3
{
	public static void main(String[] args)
	{
    int season=9;
    
    switch (season)
    {
    case 1:
    	System.out.println("THIS IS SPRING");
    	break;
    	
    case 2:
    	System.out.println("THIS IS SUMMER ");
    	break;
    	
    case 3:
    	System.out.println("THIS IS MONSOON ");
    	break;
    	
    case 4:
    	System.out.println("THIS IS OUTUMN ");
    	break;
    	
    case 5:
    	System.out.println("THIS IS PREWINTER ");
    	break;
    	
    case 6:
    	System.out.println("THIS IS WINTER ");
    	break;
    	
    	default:
    		System.out.println("ENTERED SEASON NOT EXIST");
    }

	}

}
