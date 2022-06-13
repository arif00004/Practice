public class ForeverYoung {
    private int age;
    private String name;
    private String message;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setAge(int age) {
        this.age = age;
    }
        public void getAge() {
            if (age > 18) {
                System.out.println("Age is just a number");
            } else {
                System.out.println(age);
            }
    }

        public static void main(String[] args){
        ForeverYoung age = new ForeverYoung();

        age.setAge(28);

        age.getAge();

    }

}

