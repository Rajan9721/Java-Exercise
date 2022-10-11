public class continue1 {
    public static void main(String[] args){
        int n = 0;
        while(n<14){
            if(n%3==0){
                n++;
                continue;
            }
            System.out.println("Result is: "+n);
            n++;
        }
    }
}
