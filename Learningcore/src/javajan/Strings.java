package javajan;

import java.util.Arrays;

/*
-------------------------------------------------
charAt()	Returns the character at the specified index (position) -> char
codePointAt()	Returns the Unicode of the character at the specified index	-> int
codePointBefore()	Returns the Unicode of the character before the specified index	-> int
codePointCount()	Returns the number of Unicode values found in a string.	-> int
compareTo()	Compares two strings lexicographically	-> int
compareToIgnoreCase()	Compares two strings lexicographically, ignoring case differences	->int
concat()	Appends a string to the end of another string	-> String
contains()	Checks whether a string contains a sequence of characters	-> boolean
contentEquals()	Checks whether a string contains the exact same sequence of characters of the specified CharSequence or StringBuffer	boolean
copyValueOf()	Returns a String that represents the characters of the character array	-> String
endsWith()	Checks whether a string ends with the specified character(s)	-> boolean
equals()	Compares two strings. Returns true if the strings are equal, and false if not	-> boolean
equalsIgnoreCase()	Compares two strings, ignoring case considerations	boolean
format()	Returns a formatted string using the specified locale, format string, and arguments	-> String
getBytes()	Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array	byte[]
getChars()	Copies characters from a string to an array of chars	-> void
hashCode()	Returns the hash code of a string	-> int
indexOf()	Returns the position of the first found occurrence of specified characters in a string	-> int
intern()	Returns the canonical representation for the string object	-> String
isEmpty()	Checks whether a string is empty or not	-> boolean
lastIndexOf()	Returns the position of the last found occurrence of specified characters in a string	-> int
length()	Returns the length of a specified string	-> int
matches()	Searches a string for a match against a regular expression, and returns the matches ->boolean
offsetByCodePoints()	Returns the index within this String that is offset from the given index by codePointOffset code points	int
regionMatches()	Tests if two string regions are equal	-> boolean
replace()	Searches a string for a specified value, and returns a new string where the specified values are replaced	-> String
replaceFirst()	Replaces the first occurrence of a substring that matches the given regular expression with the given replacement	String
replaceAll()	Replaces each substring of this string that matches the given regular expression with the given replacement	String
split()	Splits a string into an array of substrings	-> String[]
startsWith()	Checks whether a string starts with specified characters	-> boolean
subSequence()	Returns a new character sequence that is a subsequence of this sequence	CharSequence
substring()	Returns a new string which is the substring of a specified string	-> String
toCharArray()	Converts this string to a new character array	-> char[]
toLowerCase()	Converts a string to lower case letters	String
toString()	Returns the value of a String object	-> String
toUpperCase()	Converts a string to upper case letters	-> String
trim()	Removes whitespace from both ends of a string	-> String
valueOf()	Returns the string representation of the specified value	-> String
---------------------------------------
 */



public class Strings {
    public static void main(String[] args) {
        String name1 = "     Sandy Kr    ";
        String name2 = "bawa";
        String name3 = "Ji";

        // Concatination..
        System.out.println(name1+ " "+name2);  //o/p:- Sandy bawa
        name1 = "Mr."+ name1;
        System.out.println(name1+ " "+name2);  // O/P: Mr. Sandy bawa

        //concat()
        name2 = name3.concat(", How are you?");
        System.out.println(name2);

        //CharAt(); to know character in specfic index
        System.out.println(name1.charAt(3)); //O/P: S

        //compareTo
        System.out.println("compareTo()   --> " +name1.compareTo(name2));  //O/p: -21 (because its false and its indecate string value gap)
        

        //contains() -> to search element
        System.out.println("contains() ->"+name1.contains("sandy")); // False
        System.out.println("contains() ->"+name1.contains("Sandy")); // True
        System.out.println("contains() ->"+name1.contains("bawa")); // False
        
        // endsWith() -> to check the end element in string
        System.out.println("endsWith() ->"+name3.endsWith("i")); // true : name3=Ji which is ending with 'i'
        System.out.println("endsWith() ->"+name3.endsWith("x")); // false : name3=Ji which is not ending with 'x'

        // equals()
        System.out.println("equals() -->"+name2.equals(name1));

        System.out.println(name1.length());
        System.out.println(name1.isBlank());
        System.out.println(name1.isEmpty());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.startsWith("he"));
        System.out.println(name1.replace("y", "eep"));
        System.out.println(name1.trim());
        System.out.println(name1.trim().length()); //16 
        System.out.println(name1.strip());  // Mr.     Sandy Kr
        System.out.println(name1.strip().length());  //16
        System.out.println(name1.substring(0,4));   // Mr.
        System.out.println(Arrays.toString(name1.toCharArray()));      // [M, r, .,  ,  ,  ,  ,  , S, a, n, d, y,  , K, r,  ,  ,  ,  ]
        System.out.println(name1.split("y"));
        System.out.println("Arrays.toString" + Arrays.toString(name1.split("y")));
        
        
        String name4 = "Sandy";
        String name5 = new String("Sandy");
        String name6 = "sandy";
        System.out.println(name4.equals(name5)); //true  
        System.out.println(name4 == name5);    // false
        System.out.println(name4.equals(name6));  // false
        System.out.println(name4.equalsIgnoreCase(name6)); // true



    }
}