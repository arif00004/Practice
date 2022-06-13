public class IfStatement {
    public static void main(String[] args) {
        //if statements to evaluate conditions

        int age = 17;
        if (age >= 18) {
            System.out.println("I am an adult");
         } else if (age >= 16 && age < 18) { // Combining conditions
            System.out.println("I am almost and adult");
        } else {
            System.out.println("I am not an adult"); // If none of the above conditions met
        }

        //Ternary Operator, only used when evaluating one condition/value

        String message = age >= 18 ?
                "Hooray... I am and adult" :
                "I am not an adult";
        System.out.println(message);
    }
}
