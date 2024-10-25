package com.mycompany.mid.term.exercise;
import java.util.Arrays;

public class MIDTERMEXERCISE {

    public static void main(String[] args) {
        String Name[] = {"BOSS","BLOCK","BRAWN","BRAYNT","CLORKSAN"};
        int Age[] = {30,24,23,37,23};
        int Point[] = {473,133,115,1161,1225};
        
        int age2[] = new int[Age.length];
        int point2[] = new int[Point.length];
        String name2[] = new String[Name.length];//array1
        for (int i = 0; i < Age.length; i++) {
            age2[i] = Age[i];
            point2[i] = Point[i];
            name2[i] = Name[i];
        }
        
        int Age1 = Age[0];
        String Name1 = Name[1];
        int Point1 = Point[1];
        
        int Age2 = Age[0];
        String Name2 = Name[1];
        int Point2 = Point[1];
        
        for (int i = 0; i < Age.length; i++) {
            if(Age[i]>Age1){
                Age1 = Age[i];
                Name1 = Name[i];
                Point1 = Point[i];
            }
        }
        
        for (int i = 0; i < Age.length; i++) {
            if(Age[i]<Age2){
                Age2 = Age[i];
                Name2 = Name[i];
                Point2 = Point[i];
            }
        }
        
        System.out.println("1. oldest " + Name1 + ". " + Age1 +"years old. " + "point is " + Point1);
        System.out.println("");
        System.out.println("2. youngest " + Name2 + ". " + Age2 +"years old. " + "point is " + Point2);
        System.out.println("");
        System.out.println("3. point between youngest and olest " + (Point1 - Point2));
        System.out.println("");
        
        System.out.println("4. ");
        for (int i = 0; i < Age.length - 1; i++) {
            for (int j = i + 1; j < Age.length; j++) {
                if (Age[i] < Age[j]) {
                    int tempAge = Age[i];
                    Age[i] = Age[j];
                    Age[j] = tempAge;

                    String tempName = Name[i];
                    Name[i] = Name[j];
                    Name[j] = tempName;

                    int tempPoints = Point[i];
                    Point[i] = Point[j];
                    Point[j] = tempPoints;
                }
            }
        }
        for (String name : Name) {
            System.out.print(name + " ");
        }
        System.out.println();
        for (int age : Age) {
            System.out.print(age + " ");
        }
        System.out.println();
        for (int point : Point) {
            System.out.print(point + " ");
        }
        System.out.println("");
        System.out.println("");
        
        
        int total = 0;
        for (int i = 0; i < Point.length; i++) {
            total +=Age[i];
            
        }
        System.out.println("5. average age is " + total/Age.length);
        
        
        System.out.println(" ");
        int total1 = 0;
        for (int i = 0; i < Point.length; i++) {
            total1 +=Point[i];
            
        }
        System.out.println("6. average point is " + total1/Age.length);
        
        
        
        
        
        System.out.println("");
        
        
        
        
        
        String name1[] = {"HEBBIRT","HEURTAS","KYLLE","NENCA","RENDLA"};
        int age1[] = {29,32,25,23,21};
        int point1[] = {481,237,152,349,919};
        
        String name11[] = {"HEBBIRT","HEURTAS","KYLLE","NENCA","RENDLA"};
        int age11[] = {29,32,25,23,21};
        int point11[] = {481,237,152,349,919};
        
        int point3[] = new int[point1.length];
        
        
        System.arraycopy(point1, 0, point3, 0, point3.length);
        
        int smallPoint = point1[0];
        int x = 0;
        for (int i = 0; i < point1.length; i++) {
            if (point1[i]<smallPoint){
                smallPoint = point1[i];
                x = i;
            }
            
        }
        int bigPoint = point1[0];
        int y = 0;
        for (int i = 0; i < point1.length; i++) {
            if (point1[i]>bigPoint){
                bigPoint = point1[i];
                y = i;
            }
            
        }
        
        point2[y] = smallPoint;
        point2[x] = bigPoint;
        System.out.println("7. "+Arrays.toString(point2));
        System.out.println(" ");
        
        int totalPoint = 0;
        int totalAge = 0;
        for (int i = 0; i < point1.length; i++) {
            totalPoint+=point1[i];
            totalAge+= age1[i];
        }
        int averagePoint2 = totalPoint/point1.length;
        int averageAge = totalAge/age1.length;
        System.out.println("8. " + averagePoint2);
        
        
        for (int i = 0; i < point3.length; i++) {
            if(age2[i]<averageAge){
               int Temp1 = age2[i];
               age2[i] = age1[i];
               age1[i] = Temp1;
            }
            
        }
        
        System.out.println("");
        System.out.println("9. "+Arrays.toString(age1)); 
        System.out.println("");
        
        int Point_United[] = new int[point11.length+point2.length];
        
        System.arraycopy(point2,0,Point_United,0,point2.length);
        System.arraycopy(point11, 0, Point_United, point2.length, point11.length);
        System.out.println("10. "+Arrays.toString(Point_United));
        
        System.out.println("");
        
        for (int j = 0; j < Point_United.length; j++) {
            for (int i = 1; i < Point_United.length; i++) {
            if(Point_United[i]>Point_United[i-1]){
                int TEMP = Point_United[i];
                Point_United[i]=Point_United[i-1];
                Point_United[i-1]=TEMP;
            }
        }
        }
        System.out.println("11. "+Arrays.toString(Point_United));
        
        System.out.println("");
        
        for (int i = 0; i < point2.length; i++) {
            if (point2[i]==1161){
                name2[i] = "BRAYNT_JR";
                point2[i] = 0;
                age2[i] = 18;
                }
            }
        
        for (int i = 0; i < point2.length; i++) {
            if((point2[i]==0)&&(i!=point2.length-1)){
                int t = point2[i];
                point2[i]=point2[i+1];
                point2[i+1]=t;
            }
            
        }
        System.out.println("12. "+Arrays.toString(point2));
    }
        
    }