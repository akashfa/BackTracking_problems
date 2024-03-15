public class MazeFourDirec {
    
    private static void maze(int sr, int sc, int er, int ec,String str,boolean[][]isVisited) {
        if(sr<0||sc<0)return;
        if(sr>er||sc>ec) return ;
        if(isVisited[sr][sc]==true)  return;
        if(sr==er&&sc==ec) System.out.println(str);
        //right
    isVisited[sr][sc]=true;
    maze(sr,  sc+1, er, ec,str+"R",isVisited) ;
    maze(sr+1,  sc, er, ec,str+"D",isVisited) ;
    maze(sr-1,  sc, er, ec,str+"U",isVisited) ;
    maze(sr,  sc-1, er, ec,str+"L",isVisited) ;
    isVisited[sr][sc]=false;


   

 
    
    }
    public static void main(String[] args) {
        int row=3;
        int col=3;
        boolean[][] isVisited=new boolean[row][col];
       maze(0,0,row-1,col-1,"",isVisited);
      
    }
}
