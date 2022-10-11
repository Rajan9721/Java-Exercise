class Student{
    int roll;
    void getRoll(int x){
        roll = x;
    }
    void putRoll(){
        System.out.println("Student roll no.: "+roll);
    }
}
class Test extends Student{
    int m1, m2;
    void getMark(int x, int y){
        m1 = x;
        m2 = y;
    }
    void putMark(){
        System.out.println("Mark 1: "+m1);
        System.out.println("Mark 2: "+m2);
    }
}
class Result extends Test{
    void Display(){
        putRoll();
        putMark();
        int Total = m1+m2;
        System.out.println("Result= "+Total);
    }
}
public class InheritanceMultilevelEx03 {
    public static void main(String[] args){
        Result obj = new Result();
        obj.getRoll(101);
        obj.getMark(88,85);
        obj.Display();
    }
}
