//MULTILEVEL INHERRITANCE IN ANOTHER METHOD VIA CREATING NEW CLASS CALL [C_CMultipleLevelInheritance003]

package i_inheritance;

public class C_CMultipleLevelInheritance003 {

	public static void main(String[] args) 
	{
	 C_Laptop l=new C_Laptop();
	 l.Lenovo();
	 l.Sony();
	 
	 C_Tablet t=new C_Tablet();
	 t.Lenovo();
	 t.Sony();
	 t.Samsung();
	 t.Nokia();
	 
	 C_Mobile m=new C_Mobile();
	 m.Lenovo();
	 m.Sony();
	 m.Samsung();
	 m.Nokia();
	 m.realme();
	 m.vivo();
	}

}
