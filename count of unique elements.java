import java.util.Arrays;
public class Abc{
    public static void main(String[] args){
        int[] arr={1,4,3,3,2};
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            
                while(i<arr.length-1 && arr[i]==arr[i+1]){
                    i++;
                }
                count++;
            
        }
        System.out.println("count of unique elements is " + count);
    }
}