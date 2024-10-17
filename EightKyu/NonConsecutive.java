package EightKyu;

public class NonConsecutive {
    class FirstNonConsecutive {

        static Integer find(final int[] array) {

            for (int i = 0; i < array.length-1; i++) {
                //loop through array
                if (array[i] +1 !=array[i+1]) {
                    //if array[i] + 1 is not equal to array [i + 1]
                    return array[i+1];
                    //return array
                }

            }
            return null;

        }

    }







}


