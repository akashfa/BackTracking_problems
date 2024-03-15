public class RatInADeadMaze {
    public static void print(int sr,int sc,int er,int ec,String str,int[][]maze){
      
      if(sr>er||sc>ec) return;
      if(sr==er&&sc==ec) System.out.println(str);
      if(maze[sr][sc]==0)return;

      print(sr,  sc+1, er, ec,str+"R",maze) ;
      print(sr+1,  sc, er, ec,str+"D",maze) ;
      
    }
    public static void main(String[] args) {
        int row=4;
        int col=6;
        int maze[][]={{1,1,1,0,1,1},
                      {0,1,1,1,1,1},
                      {1,0,1,1,1,1},
                      {1,1,0,1,1,1}};
        print(0,0,row-1,col-1,"",maze);
    }
}
