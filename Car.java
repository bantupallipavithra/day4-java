public class Car{
	public String displayDetails(String name ,String model, String price){
	return "Showroom name: "+name +"\nCar model: "+model + "\nCar price " +price;	
}
	
		public static void main (String[]args){
		Car cherry=new Car();
		String details=cherry.displayDetails("Elite Motors","Tesla model s","80000");
		String details2=cherry.displayDetails("Elite Motors","BMW X5","80000");
		System.out.println(details);
		System.out.println(details2);

}
}