package principal;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        // Inicio
        //Declaración de variables
        int opcion, i, dado1, dado2, tirada1, tirada2, rondas, puntuacion1, puntuacion2, contador1=0, contador2=0, contador3=0;
        char lado, caracter, tirar2, respuesta;
        //Elegir opción
        System.out.println ("¿Cuáles de las opciones quiere hacer? (Elija de la 1 a la 3)");
        opcion=s.nextInt();
        while (opcion<1 | opcion>3) {
            System.out.println("Error, vuelva a elegir la opción");
            opcion = s.nextInt();
            //Hacer repetir
        }
        do{
            if (opcion == 1){
                System.out.println("Ha elegido la opción 1");
            }
            if (opcion == 2){
                System.out.println("Ha elegido la opción 2. Cálculo de número ambicioso");
                System.out.println("En construcción.....");
            }
            if (opcion == 3){
                System.out.println("Ha elegido la opción 3. Juego de dados.");
                System.out.println("Se va a enfrentar contra una máquina, ambos tiraréis 2 dados, quien saque mayor puntuación gana. Si sacas un doble, tirarás de nuevo y si sacas un tercer doble, perderás la partida.");
                System.out.println("¿Cuántas rondas quieres jugar?");
                rondas=s.nextInt();
                for ( i=1 ; i<=rondas ; i++) {
                    //Calcular tiradas de la máquina
                    contador1=0;
                    contador2=0;
                    contador3=0;
                    System.out.println("Ronda "+i);
                    System.out.println("Tiradas de la máquina:");
                    dado1 = r.nextInt(6) + 1;
                    dado2 = r.nextInt(6) + 1;
                    tirada1 = dado1 + dado2;
                    if (dado1 == dado2) {
                        dado1 = r.nextInt(6) + 1;
                        dado2 = r.nextInt(6) + 1;
                        tirada2 = dado1 + dado2;
                        if (dado1 == dado2) {
                            puntuacion1 = 0;
                        } else {
                            puntuacion1= tirada1 + tirada2;
                        }
                    } else {
                        puntuacion1 = tirada1;
                    }
                    System.out.println("La puntuación es " +puntuacion1);
                    dado1=0;
                    dado2=0;
                    //Calcular tus tiradas
                    System.out.println("Tus tiradas:");
                    System.out.println("Ronda "+i);
                    dado1 = r.nextInt(6) + 1;
                    dado2 = r.nextInt(6) + 1;
                    tirada1 = dado1 + dado2;
                    if (dado1 == dado2) {
                        dado1 = r.nextInt(6) + 1;
                        dado2 = r.nextInt(6) + 1;
                        tirada2 = dado1 + dado2;
                        if (dado1 == dado2) {
                            puntuacion2 = 0;
                        } else {
                            puntuacion2= tirada1 + tirada2;
                        }
                    } else {
                        puntuacion2 = tirada1;
                    }
                    System.out.println("La puntuación es " +puntuacion2);
                    if (puntuacion1<puntuacion2) {
                        System.out.println("¡Has ganado la ronda!:D");
                        contador1++;
                    }
                    if (puntuacion1>puntuacion2) {
                        System.out.println("Has perdido la ronda :(");
                        contador2++;
                    }
                    if (puntuacion1==puntuacion2) {
                        System.out.println("Habeis empatado la ronda");
                        contador3++;
                    }
                }
                //Comprobar resultados
                System.out.println("Has ganado " +contador1 +" rondas");
                System.out.println("Has perdido " +contador2 +" rondas");
                System.out.println("Has empatado " +contador3 +" rondas");
                if (contador1>contador2){
                    System.out.println("¡Has ganado la partida!");
                }
                if (contador1<contador2){
                    System.out.println("Has perdido la partida");
                }
                if (contador1==contador2){
                    System.out.println("Has empatado la partida");
                }
            }
            System.out.println("¿Quiere volver a elegir opción?");
            respuesta=s.next().charAt(0);
            if (respuesta=='s'){
                System.out.println("Vuelva a elegir ejercicio");
                opcion = s.nextInt();

            }
            while (opcion<1 | opcion>3) {
                System.out.println("Error, vuelva a elegir la opción");
                opcion = s.nextInt();
            }
        } while (respuesta=='s');
    }
}
