public class VariableTest {
    //Primitive data types
    public static void main(String[] args) {
        byte theByte = 1;
        short theShort = 1000;
        int theInt = 433211;
        long theLong = 7366352L;
        double theDouble = 19.99d;
        float theFloat = 3.1f;
        boolean theBoolean = true;
        char theChar = 'A';

        //reference types
        String theString = new String("arif's practice");


        //output of above
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(theDouble);
        System.out.println(theFloat);
        System.out.println(theBoolean);
        System.out.println(theChar);
        System.out.println(theString);
        System.out.println(theString.toUpperCase()); // Get result in Uppercase

    }
}