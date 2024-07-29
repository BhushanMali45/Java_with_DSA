public class trappedwater {

    public static int trapwater(int height[]){
        int n=height.length;
        //calculate left max bounadry==axuliary array
        int leftmaxboundry[]=new int[n];
          leftmaxboundry[0]=height[0];
        for(int i=1;i<n;i++){
            leftmaxboundry[i]=Math.max(height[i], leftmaxboundry[i-1]);

        }
        //calculate right max bounadry==axuliary array
           int rightmaxboundry[]=new int[n];
           rightmaxboundry[n-1]=height[n-1];
           for(int i=n-2;i>=0;i--){
            rightmaxboundry[i]=Math.max(height[i], rightmaxboundry[i+1]);
           }


           ///loop
           int trappedwater=0;
           for(int i=0;i<n;i++){
        //water level=Math.min(Leftmax boundary,right max boundry)
  
        int waterlevel=Math.min(rightmaxboundry[i], leftmaxboundry[i]);

        //trapped water +=waterlevel -height[i]*width;//w-h
    trappedwater +=waterlevel-height[i];
           }
           return trappedwater;

    }
    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trapwater(height));
    }
}
