// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
    int n= 563354;
      int count=0;
      int even=0;
      int totalcount = 0;
      while(n>0){
          int ld = n%10;
          totalcount=totalcount+1;;
          if(ld%2!=0){
              count=count+1;
          }
          else{
              even=even+1;
          }
          if(n==ld){
              System.out.println("first digit :" + ld);
          }
          n=n/10;
      }
      System.out.println("Odd count :"+count);
      System.out.println("Total :"+totalcount);
      System.out.println("Even :"+ even);
    }
}
