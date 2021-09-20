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
