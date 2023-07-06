public class majorityelement {
    public static int majorityElement(int[] nums) {


     int maj= nums[0];
     int count=1;

     for(int i=0;i<nums.length;i++){
         if(nums[i] == maj){
             count++;
         }
         else{
         count--;
         }
         if(count==0){
             maj=nums[i];
             count=1;
         }
     }
                    return maj;
    }

    public static void main(String args[]){
      int nums[] ={1,1,1,3,5,3,4,6,3,3};
System.out.println(majorityElement(nums));
    }
    
}