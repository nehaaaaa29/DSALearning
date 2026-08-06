
import java.util.ArrayList;

public class insertHeap {
 
     static class Heap{
        ArrayList<Integer>arr=new ArrayList<>();
     public  void add(int data){
        //add at lat index
        arr.add(data);
        int x= arr.size()-1;
        int par=(x-1)/2;
        while(arr.get(x)<arr.get(par)){
            int temp=arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);

        }

     }
     public int peek(){
        int min=arr.get(0);
        return min;
     }
     public void heapify(int i){
        int left=2*i+1;
        int right=2*i+2;
        int minidx=i;
        if(left<arr.size() && arr.get(minidx)>arr.get(left)){
            minidx=left;
        }
        if(right<arr.size() && arr.get(minidx)>arr.get(right)){
            minidx=right;
        }
        if(minidx !=i){
            int temp=arr.get(i);
            arr.set(i,arr.get(minidx));
            arr.set(minidx, temp);
            heapify(minidx);
        }


     }

     public int remove(){
        int data=arr.get(0);
         int temp=arr.get(0);
         //step 1 swap first and last index
            arr.set(0, arr.size()-1);
            arr.set(arr.size()-1, temp);
            //remove the last 

            arr.remove(arr.size()-1);
            //heapify
            heapify(0);
            return data;

     }

     }
    public static void main(String[] args) {
        
    }
}
