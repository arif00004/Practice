public class Arrays {
    public static void main(String[] args) {
        //Arrays
        //int [] numbers = new int[3]; - Declare Array Size

        /**
         * to Insert number we can do this
         * numbers[0] = 2;
         * numbers[1] = 0;
         * numbers[3] = 2;
         * There will be error if you go over your array size
         */
        int[] numbers = {2,0, 1} ;
        //^ This way you dont need to declare index size, it will increase as you inser value.
        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(numbers.length);

        /** boolean[] booleans = new boolean [2];
        System.out.println((java.util.Arrays.toString(booleans)));

        String[] string = new String [2];
        System.out.println(java.util.Arrays.toString(string));
*/
    }
}
