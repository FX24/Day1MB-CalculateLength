import java.util.Scanner;

class CalculateLength {
  public static void main(String[] args) {

    Calculate calculateService = new Calculate();
    Input inputService = new Input();

    double[]arr = inputService.getInput();
    double length = calculateService.calculateLength(arr[0],arr[1],arr[2],arr[3]);
    System.out.println(length);
  }
}

class Calculate {
  public double calculateLength (double x1,double y1,double x2,double y2) {    
        double x = Math.pow(x2-x1,2);
        double y = Math.pow(y2-y1,2);
        return Math.pow((x+y) , 0.5);
  }
}

class Input {
  public double[] getInput() {
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

    double[]arr = {x1,y1,x2,y2};
    return arr;
  }
}
