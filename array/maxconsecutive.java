public class maxconsecutive {
     
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                 count++;
                  
            }
            else if(nums[i]==0){
               
                if(maxcount<count){
                       maxcount=count;
                       
                }
                 count=0;
               
            }
            
            
        }
        if(count>maxcount){
                return count;
            }else{
                  return maxcount;
            }
        
    }
   
    public static void main(String[] args) {

        maxconsecutive obj = new maxconsecutive();

        int[] nums = {1,1,0,1,1,1};

        System.out.println(obj.findMaxConsecutiveOnes(nums));
    }
}

    

