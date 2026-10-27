class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  String spaces(int N){
    String bld="";
     for(int x = 0; x < N; x++){
      bld="";
     }
     return bld;
  }
  double harmonic(int N){
    double sum = 0;
    for (int x=1; x <= N; x++){
      sum += 1.0/x;
    }
    return sum;
  }
  double sine(int N, double x){
    double sum = 0;
    double term = x;
    for (int i = 1; i <= N; i++){
      sum += term;
      int p = 2 * i - 1;
      term = -term * x * x / ((p + 1) * (p + 2));
    }
    return sum;
  }
  void fib(int N){
    int a = 0;
    int b = 1;
    for (int i = 0; i < N; i++){
      if (i = N - 1){
        print(a);
      }
      else{
        System.out.println(a + ", ");
      }
      int next = a + b;
      a = b;
      b = next;
    }
  }
  void nRow(int row){
    for (int col = 1; col <= 12; col++){
      System.out.println((row * col) + " ");
    }
    print("");
  }
  void mTable(){
    for (int row = 1; row <= 12; row++){
      nRow(row);
    }
  }

  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
    
  }


  
}