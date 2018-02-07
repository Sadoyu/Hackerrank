import java.util.Scanner;
public class Solution{
    static int surfaceArea(int[][] a, int h, int w){
        int area = 0;
        for(int i=0;i<h;i++){
            for (int j=0;j<w;j++){
                area += (4*a[i][j])+2;
                if(j>0)
                    area -= 2*Math.min(a[i][j-1], a[i][j]);
                if(i>0)
                    area -= 2*Math.min(a[i-1][j], a[i][j]);
            }
        }
        return area;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int[][] a = new int[h][w];
        for(int i=0;i<h;i++){
           for(int j=0;j<w;j++){
                a[i][j] = in.nextInt();
            }
        }
        System.out.println(surfaceArea(a, h, w));
    }
}
