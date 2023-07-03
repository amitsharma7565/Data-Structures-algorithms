class FindTheElementIn2dArray {
          
    public static void main(String[] args) {
        int a[][]={{18,19,20},
            {21,22,23},
            {24,25,26}
        };
               int target=23;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]==23){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}