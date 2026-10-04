class Solution {
    public boolean isBoomerang(int[][] points) {
        for(int i=0;i<points.length;i++){
            for(int j =i+1;j<points.length;j++){
                if(points[i][0] == points[j][0] && 
                   points[i][1] == points[j][1]){
                    return false;
                }
               
            }
        } 
         int x1 = points[0][0];
        int y1 = points[0][1];

        int x2 = points[1][0];
        int y2 = points[1][1];

        int x3 = points[2][0];
        int y3 = points[2][1];

        if((y2-y1)*(x3-x1) == (y3-y1)*(x2-x1)){
            return false;
        }
        return true;       
    }
}