import java.util.Scanner;

public class Raffle {
    
    public static void main (String [] args) {
        
        System.out.println("Generador de rifa para Eventos de Pokémon GO Guatemala\n\n\n");
        Rifa rifa = new Rifa("participants.txt");
        String input = "";
        Scanner reader = new Scanner(System.in);
        int count = 0;
        System.out.println("Todo configurado y listo!");
        while (rifa.hasRemainingWinners() && !input.equals("EXIT")) {
            System.out.println("Presiona enter para obtener el siguiente ganador (EXIT para salir)\n\n\n");
            input = reader.nextLine();
            System.out.println("GANADOR #" + (++count) + ": " + rifa.drawWinner() + "\n\n\n");
        }
        System.out.println("\n\n RIFA FINALIZADA!");
    }


}