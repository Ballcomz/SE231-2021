package Lab10;

public class TestString {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = new String("Welcome to Java");
        String s3 = "Welcome to Java";

        // System.out.println("s1==s2 is "+(s1==s2));
        // System.out.println("s1==s3 is "+(s1==s3));


        // System.out.println("Java".matches("Java"));
        // System.out.println("Java".equals("Java"));
        // System.out.println("Java is fun".matches("Java.*"));
        // System.out.println("Java is cool".equals("Java.*"));

        // String s = "a+b$#c".replaceAll("[$+#]", "NNN");
        // System.out.println(s);

        // String[] tokens = "Java,C?C#,C++".split("[.,:;?]");
        
        // for (int i = 0; i < tokens.length; i++)
        // System.out.println(tokens[i]);

        StringBuilder sb = new StringBuilder("ABCDEF");
        sb.replace(1, 3, "XYZ");
        System.out.println(sb); //here sb value is AXYZDEF
        sb.append("CAMT");
        System.out.println(sb);

    }
}
