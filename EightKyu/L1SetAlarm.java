package EightKyu;

public class L1SetAlarm {
    public static boolean setAlarm(boolean employed, boolean vacation) {

        if(employed == true && vacation == true){
            // If employed and vacation are true, return false
            return false;
        }
        if(employed == false && vacation == true){
            // If employed is false and vacation is true, return false
            return false;
        }
        if (employed == false && vacation == false){
            //if employed and vacation is false, return false
            return false;
        }
        else{
            //Otherwise return true
            return true;
        }

        /*Best Practice:
        return employed && !vacation;
         */



    }

}

