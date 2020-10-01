package com.company;
import java.util.Scanner;

public class Main {
    private static int inputInt()
    {
        Scanner in = new Scanner(System.in);
        int outputInt;
        do
        {
            while (!in.hasNextInt())
            {
                System.out.println("You entered wrong symbols!");
                in.next();
            }
            outputInt = in.nextInt();
        } while (outputInt <= 0);
        return outputInt;
    }

    public static void main(String[] args)
    {
        System.out.println("Enter quantity of students:");
        int quantity = inputInt();
        Journal[] list = new Journal [quantity];
        int i=0;
        do
        {
            System.out.println("Choose what you want to do:");
            System.out.println("-n to add student -s to show all students -e to exit");
            Scanner in = new Scanner(System.in);
            String t=in.nextLine();
            if (t.matches("-n") & i<quantity)
            {
                list[i]=new Journal();
                list[i].setName();
                list[i].setSurname();
                list[i].setPhone();
                list[i].setAdress();
                list[i].setDate();
                i++;
                continue;
            }
            else if (t.matches("-s"))
            {
                int j;
                for (j=0;j<i;j++)
                {
                    System.out.println("Student #"+(j+1));
                    list[j].getAll();
                }
                continue;
            }
            else if (t.matches("-e"))
                break;
            else
            {System.out.println("You entered wrong key!");continue;}
        } while (true);
    }
}
