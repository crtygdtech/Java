class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  int allowance(){
    double money = 0.01;
    int days = 1;

    while (money < 5.0){
      money = money * 2;
      days ++;
    }
    return days;
  }
  void addTwoNumbers(){
    int n1 = (int)(Math.random()*(10-1 +1)+1);
    int n2 = (int)(Math.random()*(10-1 +1)+1);
    int sum = n1 + n2;

    System.out.println("What is " + n1 + "+" + n2 + "?");
    int guess = Input.readInt();

    while !(guess = sum){
      System.out.println("Wrong, try again");
      guess = Input.readInt();
    }
    System.out.println("Correct");
  }

  int GCF(int a, int b){
    int gcf = 1;
    int smaller = a;
    if (b < a){
      smaller = b;
    }
    for (int i = smaller; i >= 1; i--){
      if (a % i == 0 && b % i == 0){
        gcf = i;
      }
    }
    return gcf;
  }

  void init(){
    
  }



  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}