package DMU_TEST_MBP.first_homework;

public class Snake extends Animal implements AnimalBehavior {
    public Snake(String name, int age) {
        super(name, age);
    }

    public String getSpecies() {
        return "Snake";
    }

    public void makeSound() {
        System.out.println("쉬이익~");
    }

    public void move() {
        System.out.println("뱀이 스르르 기어갑니다.");
    }
}

