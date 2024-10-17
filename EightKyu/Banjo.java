package EightKyu;
public class Banjo {
    public static String areYouPlayingBanjo(String name) {


        if (name.startsWith("R") || name.startsWith("r")){
            //If name starts with upper or lower case "R"
            return name + " plays banjo";
            //They play banjo
        }
        else{
            return name + " does not play banjo";
            //If not, they don't.
        }

    }
}