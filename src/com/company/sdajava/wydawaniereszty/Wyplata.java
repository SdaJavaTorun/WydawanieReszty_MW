package com.company.sdajava.wydawaniereszty;

import java.util.Scanner;

/**
 * Created by RENT on 2017-03-14.
 */
public class Wyplata {int reszta;


     public Wyplata(int reszta) {
        this.reszta = reszta;
    }

    public void deklaracjaWyplaty (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jaką kwotę chcesz wypłacić?");
        this.reszta = scanner.nextInt();
    }

    public void wydawanieReszty (){

        int [] nominaly = {200, 100, 50, 20, 10, 5, 2, 1};
        int i = 0;

        while (this.reszta != 0){
            if (this.reszta >= nominaly [i]){
               int a =  this.reszta/nominaly[i];
               System.out.println("Sposób wypłaty:  " + this.reszta/nominaly[i] + " x " + nominaly[i] + " zł.");
               this.reszta = this.reszta - (a*nominaly[i]);

            }i++;
        }

    }

}

