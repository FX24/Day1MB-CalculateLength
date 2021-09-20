class Calculate {
  public double calculateLength (double x1,double y1,double x2,double y2) {    
        double x = Math.pow(x2-x1,2);
        double y = Math.pow(y2-y1,2);
        return Math.pow((x+y) , 0.5);
  }
}
