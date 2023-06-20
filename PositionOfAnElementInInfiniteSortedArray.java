
// Find Position of an Element in Infinite Sorted Array
// not use array.length method because we dont know the size its infinite array
class PositionOfAnElementInInfiniteSortedArray{
     public static void main(String[] args) {
        int[] a={2,5,7,9,10,12,14,18,20,22,25,28,30,33};
        int target=33;
        ans(a,target);
   
    }
    public static void ans(int a[], int target){
         int start=0;
     int end=1;
     while(target>a[end]){
      int temp=end+1;
      end=end+(end-start+1)*2;
      start=temp;
     }
     serachTarget(a,start,end, target);
    }
    
    public static int serachTarget(int a[], int start, int end, int target){
       while(start<=end){
         int mid=(start+end)/2;
         if(a[mid]<target){
             start=mid+1;
         }
         else if(a[mid]==target){
             System.out.println("target found in"+mid);
             break;
         }
         else{
             end=mid-1;
         }
     }
     return -1;
    }
   
}