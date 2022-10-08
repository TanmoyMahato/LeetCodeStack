class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int dayCount[] = new int[temp.length];
        
        int i=0;
        int j=i+1;
        
        while(i < temp.length){
            while(j <= temp.length){
                if(j == temp.length){
                    dayCount[i] = 0;
                    break;                
                }
                else if(temp[i] < temp[j]){
                    dayCount[i] = j-i;  
                    break;
                }
                j++;
            }
            i++;
            j=i+1;
        }
        
        return dayCount;
    }
}