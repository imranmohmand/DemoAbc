package String;

public class StringManipulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//replace();  // replace old character/value to new character/new value
		
		
		String str="i am good tester!";
		System.out.println(str.replace("a", "e"));
		System.out.println(str.replace("good", "great"));
		String re=str.replace("tester", "programmer");
		System.out.println(re);
														// everything in double cod "" is caseSensitive
		String re1=str.replace("Tester", "programmer");//T will make no change
		System.out.println(re1);
		
		String re2=str.replace("TESTER", "programmer");
		System.out.println(re);
		String re3=str.replace("!", "?");
		System.out.println(re3);
		
		String st="i am good tester#1";
		String replace=st.replace("1","2");
		System.out.println(replace);
		
		System.out.println("-------------------Task TWO-----------------");
		System.out.println();
		
		//Task 2
		String str5="12hello 3234 world 465%^%";
	String	ReplaceNoCharacter=str5.replaceAll("[0-9]","");
		System.out.println(ReplaceNoCharacter);
		String OnlyCharacter=ReplaceNoCharacter.replaceAll("[^A-Za-z]","");//^ replace everything except A-Za-z
		System.out.println(OnlyCharacter);
		
		
		System.out.println();
		
		
		
		String excep="1hello234";
		String leaveNUmberOnly=excep.replaceAll("[^0-9]","");
		
		System.out.println(leaveNUmberOnly);
		

	}

}
