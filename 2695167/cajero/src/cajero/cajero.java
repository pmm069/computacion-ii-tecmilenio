/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;
import java.util.Scanner;
/**
 *
 * @author Informatica_2
 */
public class cajero {
    
    
    public static void main (String args[]){
        int NIP = 1234;
        int saldoAhorros = 5200;
        int saldoCredito = 7000;
        int saldoCheques = 5000;
        int intentosNip = 0;
        String usuario;
        int nipUsuario;
        String opcion = null;
        int opcionMenu = 0;
        int retiro = 0;
        int retiroUsuario;
        int opcionMenu2 = 0;
        String opcion2 = null;
        
        while(true){
        
            Scanner user_input = new Scanner( System.in );
//Usuario
            System.out.println("Ingrese su usuario: ");
            usuario = user_input.nextLine();
//NIP
            while(intentosNip < 4){
            System.out.println("ingrese su NIP (4 numeros): ");
            nipUsuario = user_input.nextInt();
            
            if(nipUsuario != NIP){
                System.out.println("NIP incorrecto, intente nuevamente");
                intentosNip++;
            }else{
                System.out.println("Por favor, elija una opcion:\n"
                        + "1.- Consulta de saldo\n"
                        + "2.- Retiro de efectivo\n"
                        + "3.- Transacciones\n"
                        + "4.- Salir");
                
//Menu principal
                opcionMenu = user_input.nextInt();
                switch(opcionMenu){
                   
                    case 1: opcion = "Consulta de saldo";
                        break;
                    case 2: opcion = "Retiro de efectivo";
                        break;
                    case 3: opcion = "Transacciones";
                        break;
                    case 4: opcion = "Salir";
                        break;
                }
                System.out.println(opcion);
                if(opcionMenu == 1){
                    System.out.println("Saldo de ahorros: " + saldoAhorros);
                    System.out.println("Saldo a credito: " + saldoCredito);
                    System.out.println("Saldo en Cheques: " + saldoCheques);
                }else if(opcionMenu == 2){
                    
                    opcionMenu2 = user_input.nextInt();
                switch(opcionMenu2){
//Menu de retiros
                    case 1: opcion2 = "Cuenta de ahorros";
                        break;
                    case 2: opcion2 = "Cuenta de credito";
                        break;
                    case 3: opcion2 = "Cuenta de cheques";
                        break;
                    case 4: opcion2 = "Salir";
                        break;
                }
                System.out.println(opcion2);
                if (opcionMenu2 == 1){
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    retiro = user_input.nextInt();
                    
                }
                if (opcionMenu2 == 2){
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    retiro = user_input.nextInt();
                }
                if (opcionMenu2 == 3){
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    retiro = user_input.nextInt();
                }
                    
            }
            }
        }
        
    }
    
    
}
}
