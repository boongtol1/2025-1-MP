package DMU_TEST_MBP.first_homework;

public abstract class Animal {
    protected String name; // 동물 이름
    protected int age;      // 동물 나이

    // 생성자: 이름과 나이를 초기화
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 동물의 종류를 반환하는 추상 메소드 (자식 클래스에서 반드시 구현)
    public abstract String getSpecies();

    // 동물의 이름, 나이, 종류를 출력
    public void displayInfo() {
        System.out.println("이름: " + name + ", 나이: " + age + ", 종: " + getSpecies());
    }
}