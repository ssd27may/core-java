
public class CarSwap {

    // why car swap does not work ?
    // becoz java is pass by value, when you pass car 1 and car2, you are actually passing the value of address locations of car1 and car2.
    // new references are created in method pointing the the memory locations
    // so inside the method you have total 4 car variable pointing to 2 memory location.
    // so if you change the location of cars inside the method it does not have any effect on cars outside
    public static void main(String[] args) {
        Car car1 = new Car("Mercedez");
        Car car2 = new Car("BMW");
        System.out.println("car1" +car1.getName());
        System.out.println("car2" +car2.getName());
        try {
            swap(car1, car2);
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("car1" +car1.getName());
        System.out.println("car2" +car2.getName());
    }
    
    private static void swap(Car car1, Car car2) throws CloneNotSupportedException {
        
        //this will not work
//        Car tempCar = car2;
//        car2 = car1;
//        car1 = tempCar;
        
        //this will work so you have to clone it to actually make work
        Car tempCar = (Car) car2.clone();
        car2.setName(car1.getName());
        car1.setName(tempCar.getName());
        
    }
//    
//    public static void main(String args[]) {
//        Car car = new Car("BMW");
//        System.out.println("Brand of Car Inside main() before: "+ car.getName());
//        printBrand(car);
//        System.out.println("Brand of Car Inside main()after: "+ car.getName());
//     }
//    
//    // see the magic... if u uncomment the below line then result will be bmw, maruti, and maruti
//    // that means car brand has actually changed
//    
//    // this is because when you pass a reference to a method you are passing value of the address location
//    // now inside the print brand, you have two car references pointing to same memory location
//    // so if u change one other changes
//    // but if you reassign car inside the printbrand method then you are pointing car variable of the method to some other location
//    
//     public static void printBrand(Car car){
////         car.setName("Maruti");
//         Car car2 = new Car("Maruti");
//         car = car2;
//         System.out.println("Brand of Car Inside printBrand(): "+car.getName());
//     }
//
}
