public class reversearray {

  public static void  reverse(int arr[]){
    int si=0;
    int ei=arr.length-1;
    while(si<ei){
        int temp=arr[si];
        arr[si]=arr[ei];
        arr[ei]=temp;
        si++;
        ei--;

    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
  }



     public static void main(String[] args) {
     int arr[]={2,4,6,8,10};

     reverse(arr);
     }
}
