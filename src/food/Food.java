
package food;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Food {

    
    
      String foodID;
      String foodName;
      String foodDescription;
      double foodPrice;
      int foodCalorie;
      String foodType;
      Scanner input = new Scanner (System.in);
      public void foodN(){
          System.out.println("enter food Name length between 5-15");
          foodName = input.next();
          while(true){
                    
                   
                        if (foodName.length()>5 && foodName.length()<30)
                        {
                            break;
                            
                        }
                        else
                        {
                            System.out.println("food name invalid");
                            System.out.println("enter food Name length between 5-15");
                            foodName = input.next();
                        }
                        
                    }
          
      }
      public void foodD(){
          
          System.out.println("enter food Description");
                foodDescription =input.next();
                int count = 1;
 
        for (int i = 0; i < foodDescription.length() - 1; i++)
        {
            if ((foodDescription.charAt(i) == ' ') && (foodDescription.charAt(i + 1) != ' '))
            {
                count++;
            }
        }
                while(count>5 && count<50){
                
                        if (count>5 && count<50)
                        {
                            break;
                            
                        }
                        else
                        {
                            System.out.println("food Description invalid");
                            System.out.println("enter food Description");
                            
                        }
                        
                    }
      }
    public void foodP(){
        System.out.println("enter food Price");
        foodPrice = input.nextDouble();
        while(true){
                    
                        if (foodPrice>5 && foodPrice<150)
                        {
                            break;
                            
                        }
                        else
                        {
                            System.out.println("food price invalid");
                            System.out.println("enter food Price");
                            foodPrice = input.nextDouble();
                        }
                        
                    }
    }
    public void foodC(){
        System.out.println("enter food Calorie");
     foodCalorie = input.nextInt();
        
    while(true){
                     
                        if (foodCalorie<1000)
                        {
                            break;
                            
                        }
                        else
                        {
                            System.out.println("food calories invalid");
                            System.out.println("enter food Calorie");
     foodCalorie = input.nextInt();
                        }
                        
                    }
       
    }
      
          
      

     
    public static void addFood(String foodID,String foodDescription,double foodPrice,int foodCalorie,String foodType,String foodName) throws IOException{
        File f_t = new File("./food.txt");
        FileWriter food = new FileWriter(f_t,true); 
        if (f_t.exists() == false) {
            f_t.createNewFile();
        }
        food.append(foodID + " " + foodName + " " + foodDescription + " " + String.valueOf(foodPrice) +" " + String.valueOf(foodCalorie) + " " + foodType +"\n"); 
    }
    public static boolean updateFood() throws IOException{
        File f_t = new File("./food.txt");
        FileWriter food = new FileWriter(f_t,true); 
        Scanner input = new Scanner(System.in);
        Scanner sh = new Scanner(f_t);
        int count = 0;
        while (sh.hasNext()) {

               count++;
        }
        String[][] editing = new String[count][6];
        sh = new Scanner(f_t);
        count = 0;
        while (sh.hasNext()) {

            editing[count] = sh.nextLine().split(" ");
            count++;
        }
        Scanner sh1 = new Scanner(f_t);
        String edit = "";
        String foodName = "", foodDescription = "", foodPrice = "",foodCalorie = "",foodType = "";
        while (true) {
            System.out.print("Enter the Food ID to Edit: ");
            edit = input.nextLine();
            boolean flag = true;
            for (int i = 0; i < editing.length; i++) {
                String s = editing[i][0];
                if (s.compareTo(edit) == 0) {
                    editing[i][1] = null;
                    editing[i][2] = null;
                    flag = false;
                    System.out.println("Please change the information: ");
                    while (true) {
                        int k = 0;
                        System.out.print("Enter Food Name: ");
                        foodName = input.nextLine();
                        for (; k < foodName.length(); k++) {
                            char ch = foodName.charAt(k);
                            if (Character.isAlphabetic(ch) != true) {
                                break;
                            }
                        }
                        if (k == foodName.length()) {
                            break;
                        }

                    }
                    editing[i][1] = foodName;
                    while (true) {
                        int k = 0;
                        System.out.print("Enter Food Description: ");
                        foodDescription = input.nextLine();
                        for (; k < foodDescription.length(); k++) {
                            char ch = foodDescription.charAt(k);
                            if (Character.isAlphabetic(ch) != true) {
                                break;
                            }
                        }
                        if (k == foodDescription.length()) {
                            break;
                        }
                    }
                    editing[i][2] = foodDescription;
                 
                        
                        System.out.print("Enter Food Price: ");
                        foodPrice = input.nextLine();
                        
                        
                  
                    editing[i][3] = foodPrice;
                  
                       
                    while (true) {
                        int k = 0;
                        System.out.print("Enter Food Type: ");
                        foodType = input.nextLine();
                        for (; k < foodType.length(); k++) {
                            char ch = foodType.charAt(k);
                            if (Character.isAlphabetic(ch) != true) {
                                break;
                            }
                        }
                        if (k == foodType.length()) {
                            break;
                        }
                    }
                    editing[i][5] = foodType;
                }
                break;
            }
            if (flag == true) {
                System.out.println("ID is not Valid");
                return false;
            } else {
                break;
            }
        }
        return true;
    }
    
    public void  main() throws IOException{
       
        int c=0;
        while(c==0){
            System.out.println("welcome");
            System.out.println("enter /n 1. ADD food /n 2. update food /n 3. end  ");
            c=input.nextInt();
            if (c==1){
                System.out.println("enter food ID");
                foodID = input.next();
                foodN();
                foodD();
                foodP();
                foodC();
                System.out.println("enter food Type");
                foodType = input.next();
            addFood( foodID, foodDescription, foodPrice, foodCalorie, foodType, foodName);
            }
            else if (c==2){
                boolean updateFood = updateFood();
                System.out.println("food updated");
            }
            else if (c==3){break;}
            else {
                System.out.println("invalid input");
            System.out.println("enter /n 1. ADD food /n 2. update food /n 3. end  ");
            c=input.nextInt();
            }
            
            System.out.println("enter /n 1. ADD food /n 2. update food /n 3. end  ");
            c=input.nextInt();
      
      }
    }
    
    public static void main (String[] args)
{
    try
    {
        Food obj = new Food ();
        obj.main();
        
    }
    catch (Exception e)
    {
        e.printStackTrace ();
    }
}
}

  
