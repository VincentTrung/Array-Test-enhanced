//ICS4U Array Test
//Vincent Trung
//Mr.Loo
//October 15 2021
/////////////////////////////////////////////

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //create input object
    Scanner input = new Scanner(System.in);

    System.out.print("How many students: ");
    int studentNum = input.nextInt();
    System.out.print("How many assessments: ");
    int markNum = input.nextInt();  
    input.nextLine();
    //read dummy input

    //create average variables to collect the different average
    //create the arrays for name and marks and declare the size
    double classAverage=0;
    double sum;
    double averages [] = new double [studentNum];
    double marks [][] = new double [studentNum][markNum];
    String names [] = new String [studentNum];

    
        
    
    //get name of the student
    for (int i= 0 ; i < studentNum;i++){
      System.out.print("Enter student name "+(i+1)+": ");
      names [i] = input.nextLine();
      //collect their marks
      for (int j =0; j < markNum;j++){
        System.out.print("Enter mark "+(j+1)+":");
        marks[i][j] = input.nextDouble();
      }
      input.nextLine(); //read dummy before string
    }
  System.out.print("How many decimals to round to: ");
  int decimal = input.nextInt();
  input.nextLine();
  //read dummy string 

  System.out.println("");
  System.out.println("Average");
  System.out.println("=======");

  //loop through the names and marks to figure out their averages
  for (int x =0; x < studentNum;x++){
    sum = 0;
    System.out.print(names[x]+":"); //print the name of student
    //add up all the marks 
    for (int y = 0; y < markNum; y++){
        sum += marks[x][y]; 
    }
    averages[x] = Math.round((sum/markNum)*Math.pow(10,decimal))/Math.pow(10.0,decimal); //round to 1 decimals
    System.out.println(averages[x]+"%"); //print the average next to name
  }

  System.out.println("");//space

  //loop through the averages to add the divide by the number of students for overall average
  for (int a = 0 ; a <studentNum; a++){
    classAverage += averages[a];
  }
  classAverage = Math.round((classAverage / studentNum)*Math.pow(10,decimal))/Math.pow(10.0,decimal);//round to 1 deciaml
  System.out.println("Class Average: "+classAverage+"%");



  }
}