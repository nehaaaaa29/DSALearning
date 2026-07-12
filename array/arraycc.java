



public class arraycc {
  public static void binary(int arr[],int key){

int small=0;
int big=arr.length-1;


while(small<=big){
  int mid=(small+big)/2;
  if(arr[mid]==key){
    System.out.println(mid);
  
   return;
  }
   else if(arr[mid]>key){
        big=mid-1;
  }
   else if(arr[mid]<key){
          small=mid+1;
  }
  else{
    System.out.println("Not found");
  }
}

  }
//linear
/*public static void linear(int arr[]){
  int largest=Integer.MIN_VALUE;

  for(int i=0;i<arr.length;i++){
    if(arr[i]>largest){
         largest=arr[i];
    }

  }
  System.out.println(largest);

}*/
        
    public static void main(String[] args) {
     int arr[]={2,4,6,8,10,12,14};
     int key=10;
    // linear(arr);
    binary(arr, key);

    }
}
