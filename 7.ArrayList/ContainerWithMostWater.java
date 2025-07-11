import java.util.*;
public class ContainerWithMostWater{
    public static int storeWater(ArrayList<Integer> height){
        int maxWater = 0;
        //find the max maxWater
        for(int i = 0;i<height.size();i++){
            for(int j = i+1;j<height.size();j++){
                //Calculate the height of the water
                int ht = Math.min(height.get(i),height.get(j));
                //Calculate the width btw two lines
                int width = j-i;
                //Calculate the current amount of water that can be stored
                int currWater = ht*width;
                //Update the maxWater if the current amount of water is greater
                maxWater= Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    } 
    public static int optimisedStoreWater(ArrayList<Integer> height){
        int maxWater = 0;
        int lp = 0;
        int rp = height.size() - 1;
        while(lp<rp){
            //Calculate water area
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp - lp;
            int currWater = ht*width;
            maxWater = Math.max(maxWater,currWater);
            //Update ptr
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(storeWater(height));
        System.out.println(optimisedStoreWater(height));
    }
}