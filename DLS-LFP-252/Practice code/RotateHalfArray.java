import java.util.Arrays;

public class RotateHalfArray {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8};
        int size = arr.length/2;
        for(int j=1; j<=2; j++)
        {
            int last = arr[size-1];
            for(int i=size-1;i>0;i--)
            {
                arr[i]= arr[i-1];
          }
                arr[0]= last;
        }    
                    System.out.println(Arrays.toString(arr));    
        }
}
