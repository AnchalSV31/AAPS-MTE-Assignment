import java.util.*;

public class RottenOranges {
    static class Pair{
        int row;
        int col;
        int tm;
        Pair(int row, int col, int tm){
            this.row=row;
            this.col=col;
            this.tm=tm;
        }
    }
    public static int rottenOranges(int[][] grid){
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        int[][] vis= new int[n][m];
        int cntFresh=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    vis[i][j]=2;
                }else{
                    vis[i][j]=0;
                }
                if(grid[i][j]==1) cntFresh++;
            }
        }
        int tm=0;
        int[] drow={-1,0,+1,0};
        int[] dcol={0,1,0,-1};
        int cnt=0;

        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tm;
            tm=Math.max(tm,t);
            q.remove();
            for(int i=0; i<4; i++){
                int nr=r+drow[i];
                int nc=c+dcol[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && vis[nr][nc]==0 && grid[nr][nc]==1){
                    q.add(new Pair(nr, nc, t+1));
                    vis[nr][nc]=2;
                    cnt++;
                }
            }
        }
        if(cnt!=cntFresh) return -1;
        return tm;
    }

    public static void main(String[] args) {
        int[][] grid={{0,1,2},{0,1,1},{2,1,1}};
        System.out.println(rottenOranges(grid));
    }
}
