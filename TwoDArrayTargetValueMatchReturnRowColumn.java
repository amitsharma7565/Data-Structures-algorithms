import java.util.*;
class TwoDArrayTargetValueMatchReturnRowColumn {
  public static void main(String[] args) {
    int a[][]={
      {1,3,4},
      {5,6,7},
      {8,9,10}
    };
    int target=6;
    for(int i=0;i<a.length;i++){
      for(int j=0;j<a[i].length;j++){
        if(a[i][j]==target){
          System.out.println("Row is"+i+""+"column is"+j);
        }
      }
    }

  }
}