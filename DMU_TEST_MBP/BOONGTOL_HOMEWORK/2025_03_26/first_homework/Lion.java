package DMU_TEST_MBP.first_homework;

public class Lion extends Animal implements AnimalBehavior {
    public Lion(String name, int age) {
        super(name, age);
    }

    // 동물 종류 반환
    public String getSpecies() {
        return "Lion";
    }

    // 사자가 내는 소리 출력
    public void makeSound() {
        System.out.println("어흥!");
    }

    // 사자의 이동 방식 출력
    public void move() {
        System.out.println("사자가 사뿐사뿐 걷습니다.");
    }
}