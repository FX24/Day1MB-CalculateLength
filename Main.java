class Main {
  public static void main(String[] args) {

    Calculate calculateService = new Calculate();
    Input inputService = new Input();

    double[]arr = inputService.getInput();
    double length = calculateService.calculateLength(arr[0],arr[1],arr[2],arr[3]);
    System.out.println(length);
  }
}
