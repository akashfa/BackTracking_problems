class MazeTwoDrice{
    private static int maze(int sr, int sc, int er, int ec) {
        System.out.println("sr:"+sr+" sc:"+sc+"  er:"+er+"  ec:"+ec);
        if(sr>er||sc>ec) return 0;
        if(sr==er&&sc==ec) return 1;
        //right
  
   int down= maze(sr+1,  sc, er, ec) ;
   System.out.println("D: "+down);
   int right=  maze(sr,  sc+1, er, ec) ;
   System.out.println("R: "+right);

 return right+down;
    
    }
    public static void main(String[] args) {
        int row=3;
        int col=3;
      int countWay=  maze(1,1,row,col);
      System.out.println(countWay);
    }

   
}