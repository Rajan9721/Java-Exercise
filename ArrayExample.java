public class ArrayExample {
    public static void main(String[] args){
        int a[] = {10 , 12, 13, 14, 16};
        int n = a.length;
        String r = "Rajan MCA";
        System.out.println("String length: "+ r.length());
        System.out.println("Length of the array: " +n);
        for(int i = 0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
