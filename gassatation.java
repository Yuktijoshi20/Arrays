public class gassatation {
    static public int canCompleteCircuit(int[] gas, int[] cost) {
        int startingPoint = 0;
        int surplus = 0;
        int deficit = 0;
        for(int i = 0; i<gas.length; i++){
            surplus += gas[i] - cost[i];
            if(surplus<0){
                deficit+=surplus;
                surplus =0; 
                startingPoint = i+1; 
            }
        }
      
        if((deficit+surplus)>=0){
            return startingPoint;
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args) {
        int []gas={1,2,3,4,5}; 
        int []cost={3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas,cost));
    }
}



    