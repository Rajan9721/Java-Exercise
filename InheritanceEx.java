class Animal {
    void Eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}
public class InheritanceEx {
    public static void main(String[] args){
        Dog obj = new Dog();
        obj.Eat();
        obj.bark();
    }
}
