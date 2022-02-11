import java.util.Scanner;
/** * ±©Á¦Ñ­»· */ public class Fenshuaqiang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] ss = s.split(" ");
        int n = Integer.valueOf(ss[0]);
        int m = Integer.valueOf(ss[1]);
        int[][] points = new int[m][4];

        for (int i = 0; i < m; i++) {
            s = scanner.nextLine();
            ss = s.split(" ");
            points[i][0] = Integer.valueOf(ss[0]);
            points[i][1] = Integer.valueOf(ss[1]);
            points[i][2] = Integer.valueOf(ss[2]);
            points[i][3] = Integer.valueOf(ss[3]);
        }

        int[][] walls = new int[n][n];

        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            int x2 = points[i][2];
            int y2 = points[i][3];

            for (int j = x1; j <= x2; j++) {
                for (int k = y1; k <= y2; k++) {
                    walls[j][k] += 1;
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (walls[i][j] > 1) {
                    sum += (walls[i][j] - 1);
                }
            }
        }

        System.out.println(sum);
    }
}