    class Vehicle{
        int maxSpeed = 120;
    }
    class Car extends Vehicle{
        int maxSpeed = 180;
        void display(){
            System.out.println("Maximum Speed: "+ super.maxSpeed);
        }
    }
    public class SuperKeywordEx {
        public static void main(String[] args){
            Car c = new Car();
            c.display();
        }
}
