package HW1;

public class CapitalizeLetter {

	public static void main(String[] args) {
		String source1 = "as gtet E rt wo wi ywe Aa tryu";
		// As gtEt E rt wO wI YwE AA trYU
		System.out.println(capitalize(source1)); 

		String source2 = "ay yY ttt ghthnh ";
		// AY YY ttt ghthnh
		String res = capitalize(source2);
		System.out.println(res);
	}

	static String capitalize(String src) {
StringBuilder result = new StringBuilder();
String myString = "aoueiy";
for (int i=0; i<src.length(); i++){
    char ch=src.charAt(i);
    if (myString.indexOf(ch)!=-1){
        result.append(Character.toUpperCase(ch));
    }else {
        result.append(ch);
    }
}
		return result.toString();
	}
}
