import java.util.ArrayList;

public class List {
  
  public static void main(String[] args) {
    
    // create baseball items list
    ArrayList<String> baseballItems = new ArrayList<String>();

  // add 4 items to the list
  baseballItems.add("Glove");
  baseballItems.add("Ball");
  baseballItems.add("Bat");
  baseballItems.add("Helmet");

  // Simple for loop
  System.out.println("\n=====> For loop example");
  for (int i = 0; i < baseballItems.size(); i++) {
    System.out.println(baseballItems.get(i));
  }

  }
  
}
