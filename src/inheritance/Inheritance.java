package inheritance;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Inheritance {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sounds();
        System.out.println(d.getLegs());
    }
}

class Animal {
    private int legs = 2;
    void sounds() {
        System.out.println("Inheritance.Animal sounds...");
    }

    public int getLegs() {
        return legs;
    }
}

class Dog extends Animal {
    private int legs = 4;
    void sounds() {
        System.out.println("Inheritance.Dog sounds...");
    }

    @Override
    public int getLegs() {
        return legs;
    }
}