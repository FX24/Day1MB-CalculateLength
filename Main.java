import java.util.Scanner;

class Main {
  public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x1,x2,y1,y2;

        System.out.print("x1: ");
        x1 = scan.nextDouble();
        System.out.print("y1: ");
        y1 = scan.nextDouble();
        System.out.print("x2: ");
        x2 = scan.nextDouble();
        System.out.print("y2: ");
        y2 = scan.nextDouble();

        double x = x2-x1;
        double y = y2-y1;

        double length = Math.pow(x,2) + Math.pow(y,2);
        length = Math.pow(length, 0.5);
        System.out.println(length);
    }
}
