package javajan;
import java.util.regex.*;
import java.util.regex.Pattern;

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