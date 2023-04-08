//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).

import java.util.Scanner;


class exercicio9 {
  public static void main(String[] args) {

  //variaveis
    double celsius;
    double fahrenheit;


    
//temperatura em fahrenheit
    Scanner teclado = new Scanner(System.in);

    System.out.println("Temperatura em fahrenheit");
    fahrenheit = teclado.nextDouble();
    teclado.close();

      //transformando fahrenheit em celsius
        celsius = 5 * ((fahrenheit - 32) / 9) ;
      

      //temperatura em celsius
      System.out.println("Temperatura em celsius");
       System.out.println(celsius);
      

      












    
  }
}