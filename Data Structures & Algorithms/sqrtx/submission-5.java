class Solution {
    public  int mySqrt(int x){
        int i;
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        for (i=2;i<=x/2;i++){
            long sq=(long)  i*i;
            if(sq==x){
                return i;
            }
            if(sq>x){
                return i-1;
            }
        }
        return i-1;
    }
}