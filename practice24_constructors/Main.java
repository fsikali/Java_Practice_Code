public class Main {   
    // Create a class attribute 

    int count; 

    //Create a class constructor for the Main class 

    public Main() { 
        count = 10;
    } 

    // Create the main method 

    public static void main(String[] args) { 
        // Create an object of class Main ( This will call the constructor )
        Main car = new Main(); 
        // Print the value of count 
        System.out.println("I have counted " + car.count + " cars");

    }

} 
 
  
   
    
     
       
         