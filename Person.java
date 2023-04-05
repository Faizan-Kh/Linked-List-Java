public class Person {
    private String cNIC;
    private String name;
    private int age;

    public Person(String cNIC, String name, int age) {
        this.cNIC = cNIC;
        this.name = name;
        this.age = age;
    }

    public String getcNIC() {
        return cNIC;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setcNIC(String cNIC) {
        this.cNIC = cNIC;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "cNIC=" + cNIC + ", name=" + name + ", age=" + age + '}';
    }
}
