package unidad1;

public class UD1_Parte1_copia2 {
	public static void main(String[] args) {
		boolean a, b, c, d;
		
		a=true;
		b=true;
		c=false;
		d=false;
		
		System.out.println("true Y true = " + (a && b));
		System.out.println("true Y false = " + (a && c));
		System.out.println("false Y false = " + (c && d));
		System.out.println("true O true = " + (a || b));
		System.out.println("true O false = " + (a || c));
		System.out.println("false O false = " + (b || d));
		System.out.println("NO true = " + !a);
		System.out.println("NO true = " + !c);
		System.out.println("(3<4 Y true = " + ((3<4) && a));
		
	}
}
