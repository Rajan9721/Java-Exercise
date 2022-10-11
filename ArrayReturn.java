public class ArrayReturn {
    public static double[] ArrayReturnT(){
        double arr[] = new double[3];
        arr[0] = 10.5;
        arr[1] = 15.5;
        arr[2] = 20.5;
        return arr;
    }
    public static void main(String args[]){
        double a[];
        a = ArrayReturnT();
        for(int i = 0; i<a.length;  i++){
            System.out.print(a[i]+" ");
        }

    }
}
