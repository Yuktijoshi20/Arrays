import java.util.*;
public class Array1 {

    // find the  third last element

    public static int findthirdlargest(int arr[]){
     Arrays.sort(arr);
   System.out.print("third last element of array is : ");

     int result=arr[arr.length-3];

return result;
    }
    public static void main(String args[]){
  int arr[]={2,6,1,9,7,4};
 System.out.println(findthirdlargest(arr));

    }

}