class Solution {
    public int mySqrt(int x) { 
    if(x==1){return 1;}
    int start = 0 ;
    int end = x/2  ; 
    while (start<=end){
      int mid = start + (end-start)/2; 
      long sq = (long)mid*mid;  // mid = 4 , mid = 16 
      if (sq == x){return mid;}
      if (sq < x && (long)(mid+1)*(mid+1) > x){return mid;}
      if (sq < x){start = mid+1;}
      else{end = mid - 1;}
    }
    return -1 ;
}
}