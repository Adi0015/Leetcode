/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1 ;
        int end = n ;
        
        while (start <= end ){
            int mid = start +  (end-start )/2 ;
            boolean status = isBadVersion(mid);
            if (status == true && isBadVersion(mid - 1) == false){return mid ;} 
            if (status == true ){end = mid -1 ;}
            else{ start = mid +1 ;}
        }
        return -1;
    }
}