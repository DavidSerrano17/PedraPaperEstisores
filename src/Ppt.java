import java.util.Random;
import java.util.Scanner;

public class Ppt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        final int NUM_VICTORIES = 3;

        String nomJugadora;

        int puntsJugador = 0;
        int puntsPc = 0;

        String[] opcions = new String[]{"Pedra", "Paper", "Estisores"};

        System.out.println("Com et dius? ");
        nomJugadora = sc.nextLine();

        while (puntsJugador<NUM_VICTORIES && puntsPc<NUM_VICTORIES) {
            int opcioJugador, opcioPc;

            do {
                System.out.println("Tria la teva opció");
                System.out.println("1 - Pedra");
                System.out.println("2 - Paper");
                System.out.println("3 - Estisores");
                opcioJugador = sc.nextInt();
                sc.nextLine();

            } while (opcioJugador < 1 || opcioJugador > 3);

            opcioJugador--;

            opcioPc = ran.nextInt(3);
            System.out.println("En/Na " + nomJugadora + " ha triat: " + opcions[opcioJugador]);
            System.out.println("La màquina ha triat: " + opcions[opcioPc]);



            if (opcioJugador == opcioPc) {
                System.out.println("Empat");
            }else {
                if (opcioJugador == 0) {
                    if (opcioPc == 1) {
                        System.out.println("Guanya el PC!");
                        puntsPc++;
                    } else if (opcioPc == 2) {
                        System.out.println("Guanya " + nomJugadora);
                        puntsJugador++;

                    }
                } else if (opcioJugador == 1) {
                    if (opcioPc == 0) {
                        System.out.println("Guanya " + nomJugadora);
                        puntsJugador++;

                    } else if (opcioPc == 2) {
                        System.out.println("Guanya el Pc!");
                        puntsPc++;

                    }
                } else if (opcioJugador == 2) {
                    if (opcioPc == 0) {
                        System.out.println("Guanya el Pc!");
                        puntsPc++;
                    } else if (opcioPc == 1) {
                        System.out.println("Guanya " + nomJugadora);
                        puntsJugador++;

                    }
                }
            }

            System.out.println("Marcador: ");
            System.out.println(nomJugadora + " : "+puntsJugador);
            System.out.println("PC : "+puntsPc);

        }



        if(puntsJugador>puntsPc){
            System.out.println("Has guanyat");
        }else{
            System.out.println("Ha guayat el PC");
        }

        System.out.println("Resultat Final: ");
        System.out.println(nomJugadora + " : "+puntsJugador);
        System.out.println("PC : "+puntsPc);
    }
}
