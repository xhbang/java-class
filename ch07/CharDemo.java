public class CharDemo
{

    public static void main(String[] args)
    {
        char a[] = { 'a', '5', '?', 'A', ' ', '$', 'жа' };
        for (int i = 0; i < a.length; i++) {
            if (Character.isDigit(a[i]))
                System.out.println(a[i] + " is a digit.");
            if (Character.isLetter(a[i]))
                System.out.println(a[i] + " is a letter.");
            if (Character.isWhitespace(a[i]))
                System.out.println(a[i] + " is whitespace.");
            if (Character.isUpperCase(a[i]))
                System.out.println(a[i] + " is uppercase.");
            if (Character.isLowerCase(a[i]))
                System.out.println(a[i] + " is lowercase.");
            if (Character.isJavaIdentifierPart(a[i]))
                System.out.println(a[i]
                        + " may be part of java Identifier part.");
            if (Character.isJavaIdentifierStart(a[i]))
                System.out.println(a[i]
                        + " may be part of java Identifier Start.");
            if (Character.isUnicodeIdentifierPart(a[i]))
                System.out.println(a[i]
                        + " may be part of a Unicode identifier .");
            if (Character.isUnicodeIdentifierStart(a[i]))
                System.out
                        .println(a[i]
                                + " may be the first character in a Unicode identifier.");

        }
    }

}

