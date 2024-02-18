import java.lang.reflect.Type;

public class Player {
    private String name;
    private int age;
    private Type category;

    public Player(String name, int age, Type category) {
        this.name = name;
        this.age = age;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Type getCategory() {
        return category;
    }

    public void setCategory(Type category) {
        this.category = category;
    }
}
