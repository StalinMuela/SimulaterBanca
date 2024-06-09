import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        usuario user = new usuario();
        deposito deposit = new deposito();
        servicios service = new servicios();

        user.setUsuario("Lia");
        user.setPassword(135);
        deposito usuario = new deposito();
        System.out.println("----------------------------------------");
        System.out.println("---------- BANCOO MOVIL ----------------");
        System.out.println("----------------------------------------");
        System.out.println("Ingrese sus crendenciales: ");
        user.login();
        System.out.println("----------------------------------------");
        System.out.println("Bienvenido al banco movil " + "--- " + user.getUsuario() + " ---" );
        System.out.println("Su saldo es: $" + user.getSaldo());
        System.out.println("----------------------------------------");
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("Que deseas hacer: ");
            System.out.println("1. Retiros ");
            System.out.println("2. Depositos");
            System.out.println("3. Transferencias");
            System.out.println("4. Pagos de Servicios");
            System.out.println("5. Cerrar Sesion");
            System.out.print("Seleccione una opcion: ");
            op = sc.nextInt();
            if (op == 1){
                deposit.retirar();
            }else if (op == 2){
                deposit.depositar();
            } else if (op == 3) {
                deposit.transferencia();
            } else if (op == 4) {
                service.pagarServicios(deposit.saldo);
            }


        }while(op != 5);


        System.out.println();



    }
}