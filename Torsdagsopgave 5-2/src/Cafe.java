import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
//import java.io.FileNotFoundExeption;

public class Cafe {

private ArrayList<String> coffeeMenu;

public ArrayList<String> getCoffeeMenu(){
    return coffeeMenu;
}


public String loadMenuData() {

    try {
        File file = new File("coffees.txt");
        Scanner scan = new Scanner(file);
        //scan.nextLine();
        while(scan.hasNextLine()){
            coffeeMenu.add(scan.nextLine());
        }

    } catch (FileNotFoundException e) {
        System.out.println("File not found. Check path anf filename");
    }
}
}