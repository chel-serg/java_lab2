package com.company;

import java.util.Scanner;

public class Journal
{
    private String Surname;
    private String Name;
    private String Date;
    private String Phone;
    private String Adress;

    public void setName()
    {
        System.out.println("Enter student name:");
        Scanner in = new Scanner(System.in);
        boolean check = false;
        String outputStr;
        do
        {
            outputStr = in.nextLine();
            if (outputStr.matches("[^0-9]*"))
            {
                check = true;
            }
            else
            {
                System.out.println("You entered wrong symbols!");
            }
        } while (!check);
        this.Name=outputStr;
    }

    public void setSurname()
    {
        System.out.println("Enter student surname:");
        Scanner in = new Scanner(System.in);
        boolean check = false;
        String outputStr;
        do
        {
            outputStr = in.nextLine();
            if (outputStr.matches("[^0-9]*"))
            {
                check = true;
            }
            else
            {
                System.out.println("You entered wrong symbols!");
            }
        } while (!check);
        this.Name=outputStr;
    }

    public void setDate()
    {
        System.out.println("Enter date of birth in format DDMMYYYY:");
        Scanner in = new Scanner(System.in);
        boolean check = false;
        String outputStr;
        do
        {
            outputStr = in.nextLine();
            if (outputStr.matches("\\d{8}") & outputStr.length()==8)
            {
                if (Integer.parseInt(outputStr.substring(0,2))<=31 & Integer.parseInt(outputStr.substring(0,2))>=1 & Integer.parseInt(outputStr.substring(2,4))<=12 & Integer.parseInt(outputStr.substring(2,4))>=1)
                    check = true;
                else
                    System.out.println("You entered wrong day or month!");
            }
            else
            {
                System.out.println("You entered wrong format!");
            }
        } while (!check);
        this.Date=outputStr;
    }

    public void setPhone()
    {
        System.out.println("Enter your phone number");
        Scanner in = new Scanner(System.in);
        boolean check = false;
        String outputStr;
        do
        {
            outputStr = in.nextLine();
            if (outputStr.matches("\\d{9}") & outputStr.length()==9)
            {
                check = true;
            }
            else
            {
                System.out.println("You entered wrong format!");
            }
        } while (!check);
        this.Phone=outputStr;
    }

    public void setAdress()
    {
        System.out.println("Enter home adress in format Street house# ap#");
        Scanner in = new Scanner(System.in);
        boolean check = false;
        String outputStr;
        do
        {
            outputStr = in.nextLine();
            if (!outputStr.matches("[a-zA-Z]+\\s{1}[0-9]+\\s{1}[0-9]+"))
            {
                System.out.println("You entered wrong format!");
            }
            else
            {
                check = true;
            }
        } while (!check);
        this.Adress = outputStr;
    }

    public void getAll()
    {
        System.out.println("Student name:" + this.Name);
        System.out.println("Student surname:" + this.Surname);
        System.out.println("Student date of birth:" + this.Date);
        System.out.println("Student phone number:" + this.Phone);
        System.out.println("Student adress:" + this.Adress);
    }

}
