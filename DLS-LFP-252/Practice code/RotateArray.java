import java.util.Arrays;

public class RotateArray 
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6};
  
        for(int j=1; j<=3; j++)
        {
            int last = arr[6-1];
            for(int i=6-1;i>0;i--)
            {
                arr[i]= arr[i-1];
          }
                arr[0]= last;
        }    
                    System.out.println(Arrays.toString(arr));    
        }
    }
