 package StringPrograms;

public class FirstLastCharacter {

	public static void main(String[] args) {
		String s="welcome";
		System.out.println("First ele: "+s.charAt(0));
		System.out.println("Last ele: "+s.charAt(s.length()-1));
		
		System.out.println("~~~~~~~~~~~~~~");
		int[] a= {10,20,30,40,50};
		System.out.println("First ele: "+a[0]);
		System.out.println("Second ele: "+a[a.length-1]);
	}

}
