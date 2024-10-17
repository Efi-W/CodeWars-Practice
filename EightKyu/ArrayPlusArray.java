package EightKyu;

public class ArrayPlusArray {

    public class Sum {

        public static int arrayPlusArray(int[] arr1, int[] arr2) {
            int sumArray[] = new int[arr1.length];
            //Create new array

            int sum = 0; //set sum to 0
            for (int i = 0; i < sumArray.length; i++)
            //int i = 0, run loop through array for elements.
            {
                sumArray[i] = arr1[i] + arr2[i];
                //sum array is equal to elements of arr1 + arr2
                sum += sumArray[i];
                //find total sum


            }
            return sum; //return sum


            //Best Practice:
           /* import java.util.stream.*;

            public class Sum {

                public static int arrayPlusArray(int[] arr1, int[] arr2) {
                    return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
                }

            }


            */

        }

    }

}
