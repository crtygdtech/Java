class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  double[] convert(double[] celsius){
    double fahrenheit = new double[celsius.length];

    for(int x=0; x<celsius.length; x++){
      fahrenheit[x] = CelsiusToFarhenheit(celsius[x]);
    }
    return fahrenheit;
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends["Carl","Amy","Julia","Pedro"];
    
  }

  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}