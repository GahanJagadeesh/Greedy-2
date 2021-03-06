//Time complexity:O(n)
//Space complexity:O(n)

class Solution {
    public int candy(int[] ratings) {
        if(ratings==null || ratings.length==0){
            return 0;
        }
        int[] candies=new int[ratings.length];
        Arrays.fill(candies,1);
        for(int i=1;i<candies.length;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                candies[i]=Math.max(candies[i],candies[i+1]+1);
            }
        }
        int sum=0;
        for(int i:candies){
            sum+=i;
        }
        return sum;
    }
}