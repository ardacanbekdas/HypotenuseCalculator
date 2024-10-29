package PatikaOdevlerVePratikler;

import java.util.Scanner;

public class HypotenuseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dikKenar1, dikKenar2;

        System.out.print("Lütfen üçgenin 1. dik kenarını giriniz:");
        dikKenar1 = input.nextInt();

        System.out.print("Lütfen üçgenin 2. dik kenarını giriniz:");
        dikKenar2 = input.nextInt();

        double hipotenus;

        hipotenus = Math.sqrt((dikKenar1 * dikKenar1) + (dikKenar2 * dikKenar2));
        System.out.println("Hipotenüs = " + hipotenus);

    }
}

//Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

/*
Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

𝑢 = (a+b+c) / 2

Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/
