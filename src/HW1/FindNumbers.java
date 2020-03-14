package HW1;

public class FindNumbers {

	public static void main(String[] args) {
		String src1 = "qwqwe123wewerw2343dfdf56hh6g";
		// 123,2343,56,6
		System.out.println(findNumbers(src1));

		String src2 = "qwqwe12.3.345wewerw67;43dfdf5-6hh6";
		// 12,3,345,67,43,5,6,6
		System.out.println(findNumbers(src2));
	}

	static String findNumbers(String text) {
		StringBuilder myString = new StringBuilder();
		boolean numberWasFound = false;
		for (int i=0; i<text.length(); i++){
		    char ch=text.charAt(i);
		    if (Character.isDigit(ch)){
		        myString.append(ch);
		        numberWasFound=true;
            }else {
		        if (numberWasFound){
		            myString.append(",");
                }
            }
            if (myString.toString().endsWith(",")){
		        myString.deleteCharAt(myString.toString().lastIndexOf(","));
            }
        }
        return myString.toString();
    }
}
