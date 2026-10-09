
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}
	double gpa(double GPA){
		if (GPA > 90)
			return GPA*1.1;
		else
			return GPA;
	}
	boolean isGraduating(String gradelevel, int credits){
		if (gradelevel == ("Senior") && credits >= 44)
			return true;
		else
			return false;
	}
	String BMI(double weight, double height){
		double BMIvalue = (weight * 703)/ (height * weight);
		if (BMIvalue <= 18.4)
			return "Underweight";
		else if (BMIvalue >= 25.0 && BMIvalue <= 39.9)
			return "Overweight";
		else
			return "Obese";
	}
	double shippingCost(double weight){
		if (weight <= 10)
			return 0.00;
		else if (weight <= 15)
			return 5.00;
		else if (weight <= 25)
			return 10.00;
		else
			return 10.00 + (weight - 25) * 0.02;
	}
	boolean blueOrViolet(double freq){
		if ((freq >= 600 && freq <= 670) ||(freq >= 700 && freq <= 750))
			return true;
		else
			return false;
	}

	void init(){
		
	

  }

 
  
}