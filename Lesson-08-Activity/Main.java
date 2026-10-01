class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

		void print(String text){
    		System.out.println(text);
		}

		double FtoC(double fahrenheit){
			double celsius = (fahrenheit - 32.0) * 5.0 / 9.0;
			return celsius;
		}
		double sphereVolume(double r){
			double volume = 4.0/3.0 * Math.PI * Math.pow(r,3);
			return volume;
		}
		double coneVolume(double r, double h){
			double volume = Math.PI * Math.pow(r, 2) * (h/3.0);
			return volume;
		}
		double distance(double x1, double y1, double x2, double y2){
			double result = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
			return result;
		}

  void init(){
	print("Hello, World!");
  }

  
 
}