
class FindPeakElementIntheArrayBinaraySearch {
    public static void main(String[] args) {
       int[] a={1,2,3,4,5,10,11,8,4,2,1};
       int start=0;
       int end=a.length-1;
   
   ;
      while(start<end){
          int mid=(start+end)/2;
           if(a[mid]>a[mid+1]){
               end=mid;
           }
           else{
               start=mid+1;   
           }
      }
 System.out.println(end);
    }
}