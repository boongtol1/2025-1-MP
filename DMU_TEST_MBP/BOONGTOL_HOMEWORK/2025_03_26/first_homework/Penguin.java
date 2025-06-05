package DMU_TEST_MBP.first_homework;

public class Penguin extends Animal implements AnimalBehavior {
    public Penguin(String name, int age) {
        super(name, age);
    }

    public String getSpecies() {
        return "Penguin";
    }

    public void makeSound() {
        System.out.println("꽥꽥!");
    }

    public void move() {
        System.out.println("펭귄이 뒤뚱뒤뚱 걷습니다.");
    }
}
