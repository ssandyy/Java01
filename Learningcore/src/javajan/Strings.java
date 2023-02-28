package javajan;

public class Strings {
    public static void main(String[] args) {
        String name1 = "Sandy";
        String name2 = "bawa";

        // Concateination..
        System.out.println(name1+ " "+name2);  //o/p:- Sandy bawa

        name1 = "Mr."+ name1;
        System.out.println(name1+ " "+name2);  // O/P: Mr. Sandy bawa

        //CharAt(); to know character in specfic index
        System.out.println(name1.charAt(3)); //O/P: S

        //compareTo
        System.out.println(name1.compareTo(name2));  //O/p: -21 (because its false and its indecate string alue gap)

        //concat()
        name2 = name2.concat(", How are you?");
        System.out.println(name2);

        //contains() -> to search element
        System.out.println(name1.contains("sandy"));
        System.out.println(name1.contains("bawa"));

    }
}
