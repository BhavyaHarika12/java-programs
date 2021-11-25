import java.util.Arrays;
public class Maxmin{
    public static void main(String[] args){
        int[] a={5,3,1,7,4};
        int l = a.length
        Arrays.sort(a);
        System.out.println("maximum number is " + a[l-1]);
        System.out.println("minimum number is " + a[0]);

    }
}