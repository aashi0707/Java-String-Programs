package StringPrograms;

public class RemoveSpaces {

	public static void main(String[] args) {
		 String s="   g oo d  m orn  i n gg gg";
		 for(int i=0;i<s.length();i++) {
			 char ch=s.charAt(i);
			 if(ch!=' ') {
				 System.out.print(ch);
			 }
		 }

	}

}
