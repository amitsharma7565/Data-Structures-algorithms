

class LinearSearchExcercise {
  public static void main(String[] args) {
    int a[]={1,1,2,34,5,6,7};
    int target=87;
    boolean ans=search(a,target);
    System.out.println(ans);
  }

  static boolean search(int[]arr, int target){
    if(arr.length==0){
      return false;
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]==target){
        return true;
      }
    }
    return false;
  }
}