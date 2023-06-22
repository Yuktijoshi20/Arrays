import java.util.*;
public class nth_element {

    // find Nth largest element of array
    public static int findnthterm(int arr[], int n){
        Arrays.sort(arr);

         int result= arr[arr.length-n];
         return result;

    }
    public static void main(String args[]){
        Scanner obj= new Scanner(System.in);

        int arr[]={2,6,8,1,5,3};

        System.out.println("enter the number");
        int n= obj.nextInt();
        System.out.print("the element you are looking for is : ");
        System.out.println(findnthterm(arr, n));

        obj.close();
    }

}