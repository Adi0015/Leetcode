class Solution {
public int arrangeCoins(int n) {
        int start = 0;
        int end = n;

        while(start<=end){
            double mid = start + (end-start)/2;

            if(mid*(mid+1)/2>n) {end = (int)mid-1;}
            else if(mid*(mid+1)/2<n) {start = (int)mid+1;}
            else {return (int)mid;}
        }
        return end;
    }
}