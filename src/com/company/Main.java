package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity of Computer: ");

        int compCount = scanner.nextInt();

        Computer[] userComp = new Computer[compCount];

        System.out.println("I am  loading..."+userComp.length+" computers");

        for(int i = 0; i<compCount; i++){
            userComp[i] = new Computer("Computer_ "+i,false);
            System.out.println(userComp[i].getName());
        }

        System.out.println("-----------------------");


        if (userComp.length==0){
            System.out.println("There are no any Computer Left: ");
        }



        Computer adminComp = new Computer("Admin comp", true);

        adminComp.setUserComps(userComp);
        userComp[0].rebootUserComps();
        adminComp.switchOnUserComps();
        adminComp.rebootUserComps();
        userComp[0].setStatus("running");
        adminComp.shutdownUserComps();
    }
}
