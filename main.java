public class Main {
  public static void main(String[] args) {
    //winter, spring, summer, autumn
    //warm jacket, t-shirt, swimming suite, rain coat
    Scanner =
    Double temperature = 30.0;
    
      if (temperature <= 5 ) {
        System.out.println("Wear a super warm clothes");
    } 
    else if (temperature > 5 && temperature <= 15) {
      System.out.println("Wear a warm clothes");
    } 
    else if (temperature > 15 && temperature <= 30) {
      System.out.println("Wear a normal clothes");
    }
        else if (temperature >= 30 ){
          System.out.println("Wear a cooling clothes");
        }
    else {
      System.out.println("Invalid temperature");
    }
  }
}
