class Solution {

    public boolean canWePlace(int[] position, int dist ,int m){
        int cnt=1;
        int last = position[0];
        for(int i =0;i<position.length;i++){
           if(position[i]-last>= dist){
            cnt++;
            last = position[i];
           }
           if(cnt>=m) return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1;
        int high = position [position.length-1]-position[0];
        int ans =0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (canWePlace(position,mid,m)==true){
                 ans= mid;
                 low= mid+1;
            }

            else{
                high = mid-1;
            }
        }
        return high ;
        
    }
}