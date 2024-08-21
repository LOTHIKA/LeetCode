class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        int sum=0;
        while(num>0){
            int rem = num%10;
            num/=10;
            sum=num+rem;
            if(sum<10){
                break;
            }
            num=sum;
            sum=0;
        }
        return sum;
    }
}