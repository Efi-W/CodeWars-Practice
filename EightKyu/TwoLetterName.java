package EightKyu;

public class TwoLetterName {

    public static String abbrevName(String name) {

        char fn = name.charAt(0); // fn = first character of string
        char ln = name.charAt(name.indexOf(' ') + 1); // ln = first char of last name

        String initial = fn + "." + ln;
        //join fn and ln together in a string with a . inbetween.

        initial = initial.toUpperCase();
        //convert string to uppercase

        return initial;
        //return

    }

}
//Best practice

/*public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}

*/
