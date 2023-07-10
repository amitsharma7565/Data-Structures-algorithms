// Selection sort
import java.util.*;
class SelectionSort {
    public static void main(String[] args) {
       int a[]={5,2,3,1,78,4,7};
    selection(a);
    System.out.println(Arrays.toString(a));
    }
    
    public static void selection(int[] a){
          for(int i=0;i<a.length;i++){
            //   ingore the last value in every loop because max is store in the last every irration
        int last=a.length-i-1;
        int max= getMaxValue(a,0,last);
        swap(a,max,last);
       }
    }
    public static void swap(int[] a, int first, int second){
        int temp=a[first];
        a[first]=a[second];
        a[second]=temp;
    }
    
    public static int getMaxValue(int a[],int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(a[max]<a[i]){
                // index it will return 
                max=i;
            }
        }
  return max;
    }
}