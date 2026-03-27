package java10;

public class stringLiteral {
public static void main(String[]args) {
	String data= """
			
			        + "		int a=10;\r\n"
					+ "		var b=20;		//local varibale type inference\r\n"
					+ "		var name=\"kiet mca\";\r\n"
					+ "		var value=10.34; \r\n"
					+ "		var c=0.0;\r\n"
					+ "		c=39.56;    		// var me hum koi v data type bana sakte hai , saaath he oose update v kar sakte hai lekin  ooska datatype change nhi kar sakte\r\n"
					+ "		\r\n"
					+ "		String name1=new String(\"this is string\");\r\n"
					+ "		var name2=new String(\"this is new String\");		// left me bina string likeh hum string declare kar sakte hai lekin iska instant variable nhi banega\r\n"
					+ "		int val[] =new int[] {23,45,48,54};\r\n"
					+ "		for(var v:val) {\r\n"
					+ "			System.out.println(v);\r\n"
					
			
			""";
}
}
