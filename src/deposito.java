import java.util.Scanner;

public class deposito extends usuario {
    double depositos;
    double retiros;
    double transferencia;


    public deposito() {
    }

    public deposito(int password, String usuario, double saldo, double depositos, double retiros, double transferencia) {
        super(password, usuario, saldo);
        this.depositos = depositos;
        this.retiros = retiros;
        this.transferencia = transferencia;
    }

    public double getDepositos() {
        return depositos;
    }

    public void setDepositos(double depositos) {
        this.depositos = depositos;
    }

    public double getRetiros() {
        return retiros;
    }

    public void setRetiros(double retiros) {
        this.retiros = retiros;
    }

    public double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(double transferencia) {
        this.transferencia = transferencia;
    }

    public double depositar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a depositar: ");
        depositos = sc.nextDouble();
        saldo += depositos;
        System.out.println("Nuevo saldo: " + saldo);
        return saldo;
    }

    public double retirar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a retirar: ");
        retiros = sc.nextDouble();
        saldo -= retiros;
        System.out.println("Nuevo saldo: " + saldo);
        return saldo;
    }

    public double transferencia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a transferir: ");
        transferencia = sc.nextDouble();
        System.out.println("Ingrese el nombre del usuario a retirar: ");
        String usuario = sc.next();
        if (saldo == 0 && saldo < transferencia){
            System.out.println("No existe fondo insuficiente");
        }else{
            saldo -= transferencia;
        }
        return saldo;
    }
    /*
    public void mostrar() {
        depositar();
        retirar();
        transferencia();
        servicios servicio = new servicios();
        servicio.pagarServicios(saldo);
    }
    */



}
