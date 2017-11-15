enum Gender { male, female }

public class Author {
    private String name;
    private int age;
    private Gender sex;

    public Author() {}

    public Author(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        if (sex.equals("male")) {
            this.sex = Gender.male;
        } else if (sex.equals("female")) {
            this.sex = Gender.female;
        }
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public Gender getSex() {
        return this.sex;
    }
}
