class A{
    int x, y;
    void getData(int a, int b){
        x = a;
        y = b;
    }
    int add(){
        System.out.println("Super class method.");
        return (x+y);
    }
}
class B extends A{
    int multi(){
        System.out.println("Derived class method");
        return x*y;
    }
}
public class InheritanceEx2 {
    public static void main(String[] args){
        int sum, multi;
        B obj = new B();
        obj.getData(5,3);
        sum = obj.add();
        System.out.println("Addition = "+ sum);
        multi = obj.multi();
        System.out.println("Multiplication = "+ multi);
    }
}
