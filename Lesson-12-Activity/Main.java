class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  String creditCardType(String cardNumber){
    if (cardNumber.substring(0,1).equals("4")){
      return "Visa";
    }
    else if (cardNumber.substring(0,2).equals("34") || 
    cardNumber.substring(0,2).equals("37")){
      return "American Express";
    }
    else if (cardNumber.substring(0,2).equals("36")){
      return "Diners Club";
    }
    else if (cardNumber.substring(0,2).equals("51") || 
    cardNumber.substring(0,2).equals("55")){
      return "Mastercard";
    }
    else if (cardNumber.substring(0,4).equals("6011") || 
    cardNumber.substring(0,2).equals("65")){
      return "Discover";
    }
    else{
      return "Unknown";
    }
  }
  String pigLatin(String word){
    if(word.length(0)){
      return word;
    }
    return word.substring(1)+ word.substring(0,1) + "ay";
  }
  String nycLocate(String zipcode){
    if (zipcode.substring(0,3).equals("100") || 
    zipcode.substring(0,3).equals("101") || 
    zipcode.substring(0,3).equals("102")){
      return "Manhattan";
    }
    else if (zipcode.substring(0,3).equals("103")){
      return "Staten Island";
    }
    else if (zipcode.substring(0,3).equals("104")){
      return "Bronx";
    }
    else if (zipcode.substring(0,3).equals("112")){
      return "Brooklyn";
    }
    else if (zipcode.substring(0,3).equals("113") || 
    zipcode.substring(0,3).equals("114") || 
    zipcode.substring(0,3).equals("111")){
      return "Queens";
    }
    else{
      return "Invalid zipcode";
    }
  }
  String getMonth(String date){
    String m = date.substring(0,2);

    if (m.equals("01")){
      return "January";
    }
    if (m.equals("02")){
      return "February";
    }
    if (m.equals("03")){
      return "March";
    }
    if (m.equals("04")){
      return "April";
    }
    if (m.equals("05")){
      return "May";
    }
    if (m.equals("06")){
      return "June";
    }
    if (m.equals("07")){
      return "July";
    }
    if (m.equals("08")){
      return "August";
    }
    if (m.equals("09")){
      return "September";
    }
    if (m.equals("10")){
      return "October";
    }
    if (m.equals("11")){
      return "November";
    }
    if (m.equals("12")){
      return "December";
    }
    else{
      return "Invalid month";
    }
  }
  boolean validatePswd(String pswd){
    if (pswd.length() < 5 || pswd.length() > 8){
      return false;
    }

    else if (pswd.indexOf("^") || pswd.indexOf("*") || 
    pswd.indexOf("(") || pswd.indexOf(")")){
      return false;
    }
    else{
      return true;
    }
  }

  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }

  
  
}