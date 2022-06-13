public class Switch {
    public static void main(String[] args) {
        //Switch statement allows check things without if statements only on one value. Cant do  mixing && etc

        String gender = "Female";

        switch (gender) {
            case "Female":
                System.out.println("I am a female");
                break;
            case "Male" :
                System.out.println("I am a male");
                break;
            case "Prefer not to say" :
                System.out.println("Prefer not to say");
                break;
            default:


        }

    }
}
