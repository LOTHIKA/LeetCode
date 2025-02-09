/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        if(n==1){
            return n;
        }
        int start = 1;
        int end = n;
        int badversion = 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(isBadVersion(mid)){
                badversion = mid;
                end = mid - 1;
            }
            else{
                start = mid+1;
            }
        }
        return badversion;
    }
}