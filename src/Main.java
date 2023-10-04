import java.lang.Math;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angle;
        boolean var = false;
        do
        {
            System.out.println("Input count of angles: ");
            angle = scanner.nextInt();
            if (angle < 3) System.out.println("You are wrong, polygon has more than 2 angles, repeat please");
        } while (angle < 3);
        int[]arrX = new int[angle];
        int[]arrY = new int[angle];
        do
        {
            if (var) System.out.println("you are wrong, repeat plese");
            var = false;
            for (int i = 1; i <= angle; i++)
            {
                System.out.println("input coordinates " + i + " point");
                arrX[i-1] = scanner.nextInt();
                arrY[i-1] = scanner.nextInt();
            }
            for (int i = 0; i < angle-1; i++)
            {
                for (int j = 1; j < angle;j++)
                {
                    if(arrX[i] == arrX[j] && arrY[i] == arrY[j] && i != j)
                    {
                        var = true;
                        break;
                    }
                }
            }
        } while (var);
        int s = 0;
        //S = 0.5 * (a[i].x * a[i+1].y - a[i].y * a[i+1].x)
        for (int  i = 0; i < angle-1; i++) s += 0.5 * (arrX[i] * arrY[i+1] - arrY[i] * arrX[i+1]);
        System.out.println("S = " + Math.abs(s));
    }
}
