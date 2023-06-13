class FloorOfNumber{
  public static void main(String args[]){
        int a[]={2,4,5,7,9,11,12};
    int start=0;
    int end=a.length-1;
    int target=1;
    while(start<=end){
      int mid=(start+end)/2;
      if(a[mid]<target){
        start=mid+1;
      }
      else{
        end=mid-1;
      }
      if(a[mid]==target){
        System.out.println("found in "+mid);
        break;
      }
      if(start>end){
        System.out.println(a[end]+"is the Floor element");
        break;
      }
      if(a[0]>target){
        System.out.println("out of the array");
        break;
      }
    }
  }
}