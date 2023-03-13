package javajan;
import java.util.regex.*;
import java.util.regex.Pattern;

/*
 [abc]  -> a, b or c
 [^abc] -> any character expect a,b,c
 [a-z] -> a to z
 [A-Z] -> A to Z
 [a-zA-Z] -> a to z , A to Z
 [0-9] -> 0 to 9

 []?  ->  Occur 0 or 1 time only
 []+  ->  Occurs 1 or more times.
 []*  ->  Occur 0 or more times./**
[]{n} -> Occurs n times
[]{n,} -> Occurs n or more times
[]{y,z} -> Occurs minimum y and max Z times.


 */



public class RegularExpression {
    public static void main(String[] args) {
        String sampleText = "Hello Coder, your email is coder789@gmail.com and phone number is 9955646562";
        
        // Mail Id   extractor
        String mailPattern = "[a-zA-Z0-9_\\d]+@gmail\\.com";
        Pattern p = Pattern.compile(mailPattern);
        System.out.println(sampleText);
        Matcher m = p.matcher(sampleText);
        m.find();
        String mailAddress = m.group();
        System.out.println(mailAddress);

        // Phone number extractor
        String phonePattern = "[6789][0-9]{9}";
        Pattern ph = Pattern.compile(phonePattern);
        Matcher phone = ph.matcher(sampleText);
        phone.find();
        String phoneNumber = phone.group();
        System.out.println(phoneNumber);
    }
}