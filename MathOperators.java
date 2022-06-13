public class MathOperators {
    public static void main(String[] args) {
      //Arithmetic Operators

      int ten = 10;
      int two = 2;
      int addition = ten + two;
      int substraction = ten - two;
        System.out.println("Addition:" +addition);
        System.out.println("Substraction:" +substraction);

       // Alternative and easy way
        System.out.println(10 + 2);
        System.out.println((10 - 2) + 7);
        System.out.println(10 * 2);
        System.out.println(10 % 2);
        System.out.println(10 / 2);

        //Math operator
      System.out.println(Math.abs(-10));
      System.out.println(Math.max (10, 2));
      System.out.println(Math.min (10, 2));

      // Remove decimal from number
      System.out.println((int) Math.min (10.0, 25.0));

      //Comparison Operators

      int number1 = 10;
      int number2 = 15;
      boolean isNumber1larger = number1 > number2;
      System.out.println(number1 > number2);
      System.out.println(number1 >= number2);
      System.out.println(number1 == number2);
      System.out.println(number1 < number2);
      System.out.println(number1 <= number2);
      System.out.println(number1 != number2);

      //Logical Operators
      boolean isAdult = false;
      boolean isStudent = true;
      boolean haveCar = false;
      System.out.println(isAdult && isStudent);
      System.out.println(isAdult || isStudent);
      System.out.println((isAdult || isStudent) && haveCar);
      System.out.println((!isAdult || isStudent) && haveCar);
      System.out.println((isAdult == true));
      //OR alternatively the above statement can be done this way. ! used to flip value
      System.out.println((!isAdult));
      System.out.println((isAdult));

      // Using additional info
      String name = "Mark";
      System.out.println((10 > 8 || 2 <= 2) && isAdult && name.contains("M"));




    }
}
