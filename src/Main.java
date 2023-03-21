import static java.lang.System.*;
 
class Plate {
 
    public int food;
    public Plate(int food) {
        this.food = food;
    }
 
    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;
 
        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }
 
    void info() {
        out.println("plate: " + food);
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean hungry;
 
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }
 
    void info() {
        String isHungry = !hungry ? "Все! не лезет" : "Же не маж, па си жур";
        out.println(name + ": " + isHungry);
    }
 
    void eat(Plate plate) {
        if (hungry && plate.decreaseFood(appetite))
            hungry = false;
    }
}

public class Main {
    public static
    void main(String[] args) {
        Cat[] cats = {new Cat("Чани", 50), new Cat("Пауль", 50), new Cat("Стилгар", 25), new Cat("Джессика", 5), new Cat("Шаддам", 1)};
Plate plate = new Plate( 120);
 
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
    }
}