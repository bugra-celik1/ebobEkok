import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
   int n1,n2;



   Scanner inp = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz:");
        n1 = inp.nextInt();
        System.out.print("n2 sayısını giriniz:");
        n2 = inp.nextInt();

        if(n1 > n2){
            int b = n2;
            while(b >= 1 ){
                if(n1 % b == 0 && n2 % b == 0){
                    System.out.println(b);
                    break;
                }
                b--;
            }
            int d=1;
            while(d <= n1 * n2){
                if(d % n1 == 0 && d % n2 == 0){
                    System.out.println(d);
                    break;
                }
                d++;
            }

        }else {
            int b = n1;
            while (b >= 1) {
                if (n1 % b == 0 && n2 % b == 0) {
                    System.out.println(b);
                    break;
                }
                b--;
            }
            int d = 1;
            while (d <= n1 * n2) {
                if (d % n1 == 0 && d % n2 == 0) {
                    System.out.println(d);
                    break;
                }
                d++;

            }
        }




    }
}