package hacker_rank_submissions.algorithms.warmup;
import java.util.Scanner;

/**
 * Created by kredlapa on 10/6/2015.
 */
public class staircase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i=0; i<n; i++) {
            for (int k=0; k<n-1-i; k++) {
                System.out.print(" ");
            }
            for (int j=0; j<1+i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
