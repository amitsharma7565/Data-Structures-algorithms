class BubbleShort {
    public static void main(String[] args) {
        int a[]={10,11,5,4,2};
        
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int temp=a[j-1];
                    a[j-1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
           System.out.println(a[i]); 
        }

    }
}