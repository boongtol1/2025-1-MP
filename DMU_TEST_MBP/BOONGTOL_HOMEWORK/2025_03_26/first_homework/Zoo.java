package DMU_TEST_MBP.first_homework;

public class Zoo {
    public static void main(String[] args) {
        // 동물 배열 생성
        Animal[] animals = {
            new Lion("심바", 5),
            new Penguin("포로로", 3),
            new Snake("나가", 2)
        };

        // 모든 동물의 행동과 정보 출력
        for (Animal a : animals) {
            a.displayInfo();                    // 이름, 나이, 종류 출력
            ((AnimalBehavior)a).makeSound();    // 소리 출력
            ((AnimalBehavior)a).move();         // 이동 방식 출력
            System.out.println();               // 한 줄 공백
        }
    }
}