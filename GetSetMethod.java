public class GetSetMethod {

    private String name;
    private int number;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        if (number<=5) {
            this.number = 6;
        } else {
            System.out.println(number);
        }
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        GetSetMethod car1 = new GetSetMethod();
        GetSetMethod car2 = new GetSetMethod();

        car1.setName("Honda");
        car2.setNumber(3);

        System.out.println(car1.getName());
        System.out.println(car1.getNumber());

    }
}
