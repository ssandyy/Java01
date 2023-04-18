package javajan;

/*
%s --> String
%d --> digits
*/

public class StringFormatting {
    public static void main(String[] args) {
        
        String greetingTemplete = "Hello, dear %s!, Good %s!";
        String firstName = "sandy";
        
        String morning = "morning";
        String noon = "Afternoon";
        String night = "night";

        String formattedString = String.format(greetingTemplete, firstName, noon);
        System.out.println(formattedString);  // Hello, dear sandy!, Good morning!

        System.out.printf("Now we are having %d subjects in class %d \n", 5,6);  // Now we are having 5 subjects in class 6
    }
}