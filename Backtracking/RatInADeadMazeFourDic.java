public class RatInADeadMazeFourDic {
    public static void  print(int sr,int sc,int er,int ec,String str,int maze[][]){
        if(sr<0||sc<0)return;
        if(sr>er||sc>ec) return;
        if(sr==er&&sc==ec) System.out.println(str);
        if(maze[sr][sc]==0) return; //block
        if(maze[sr][sc]==-1) return; //this  was already visited
        maze[sr][sc]= -1;
       
        //go right
    print(sr,  sc+1, er, ec,str+"R",maze) ;
    //go down
    print(sr+1,  sc, er, ec,str+"D",maze) ;
    //go left
    print(sr,  sc-1, er, ec,str+"L",maze) ;
    //go up
    print(sr-1,  sc, er, ec,str+"U",maze) ;
    maze[sr][sc] = 1;

    }
    public static void main(String[] args) {
        int row=3;
        int col=4;
        int maze[][]={{1,0,1,1},{1,1,1,1},{1,1,0,1}};
        print(0,0,row-1,col-1,"",maze);
    }
}
