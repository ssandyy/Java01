package javajan;

/* 
\t	It is used to insert a tab in the text at this point.
\'	It is used to insert a single quote character in the text at this point.
\"	It is used to insert a double quote character in the text at this point.
\r	It is used to insert a carriage return in the text at this point.
\\	It is used to insert a backslash character in the text at this point.
\n	It is used to insert a new line in the text at this point.
\f	It is used to insert a form feed in the text at this point.
\b	It is used to insert a backspace in the text at this point.
*/

public class EscapeSequence{

    public static void main(String[] args) {
        System.out.println("do you know what is \"3\\4\" ?");  // Hello Sandy, How are you doing today? do you know what is "3\4" ?
        System.out.println("Name \f sandeep"); 
        System.out.println("hello sandy, \bGood Morning!");   // hello sandy,Good Morning!
        System.out.println("hello sandy,\tGood Morning!");   //hello sandy,    Good Morning!
        System.out.println("Hello Coder, \r how are you?");   //  how are you?
    }
}
