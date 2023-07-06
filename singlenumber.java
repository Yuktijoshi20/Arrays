public class singlenumber {

    
    public static int singleNumber(int[] nums) {

        int xor=0;
        for(int n:nums){
            xor=xor^n;
        }
        return xor;
    }


    public static void main(String args[]){
        int nums[] = {7,2,2,4,4};
       
        System.out.println(singleNumber(nums));
    }
}
    
