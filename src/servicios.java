import java.util.Scanner;
public class servicios extends deposito{
    Double agua;
    Double luz;
    Double cnt;
    Double sri;

    public servicios() {
    }

    public servicios(int password, String usuario, double saldo, double depositos, double retiros, double transferencia, Double agua, Double luz, Double cnt, Double sri) {
        super(password, usuario, saldo, depositos, retiros, transferencia);
        this.agua = agua;
        this.luz = luz;
        this.cnt = cnt;
        this.sri = sri;
    }

    public Double getAgua() {
        return agua;
    }

    public void setAgua(Double agua) {
        this.agua = agua;
    }

    public Double getLuz() {
        return luz;
    }

    public void setLuz(Double luz) {
        this.luz = luz;
    }

    public Double getCnt() {
        return cnt;
    }

    public void setCnt(Double cnt) {
        this.cnt = cnt;
    }

    public Double getSri() {
        return sri;
    }

    public void setSri(Double sri) {
        this.sri = sri;
    }

    public void menu(){
        System.out.println(" --- SERVICIOS A PAGAR ---");
        System.out.println("1. Carta de Agua");
        System.out.println("2. Carta de Luz");
        System.out.println("3. Cartilla de CNT");
        System.out.println("4. Deuda de SRI");
        System.out.println("Seleccione un servicio a pagar: ");
    }

    public void pagarServicios(double saldo) {
        Scanner sc = new Scanner(System.in);
        setAgua(15.12);
        setLuz(8.12);
        setCnt(32.09);
        setSri(100.12);
        menu();
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Servicio de EPMAPS (Agua) : ");
                System.out.println("Su deuda a pagar es: $" + getAgua());
                System.out.println("Desea Pagar: \n 1: Si pagar  \n 2: No pagar");
                int opcion1 = sc.nextInt();
                if (opcion1 == 1 && saldo > getAgua()){
                    saldo -= getAgua();
                }else if(opcion1 == 1 && saldo < getAgua()){
                    System.out.println("No dispones de saldo");
                    break;
                }else if(opcion1 == 2){
                    System.out.println("Saliendo");
                    break;
                }else{
                    System.out.println("Ingresa una opcion correcta");
                }
                break;
            case 2:
                System.out.println("Servicio de Luz : ");
                System.out.println("Su deuda a pagar es: $" + getLuz());
                System.out.println("Desea Pagar: \n 1: Si pagar  \n 2: No pagar");
                int opcion2 = sc.nextInt();
                if (opcion2 == 1 && saldo > getLuz()) {
                    saldo -= getLuz();
                } else if (opcion2 == 1 && saldo < getLuz()) {
                    System.out.println("No dispones de saldo");
                } else if (opcion2 == 2) {
                    System.out.println("Saliendo");
                } else {
                    System.out.println("Ingresa una opcion correcta");
                }
                break;
            case 3:
                System.out.println("Servicio de CNT : ");
                System.out.println("Su deuda a pagar es: $" + getCnt());
                System.out.println("Desea Pagar: \n 1: Si pagar  \n 2: No pagar");
                int opcion3 = sc.nextInt();
                if (opcion3 == 1 && saldo > getCnt()) {
                    saldo -= getCnt();
                } else if (opcion3 == 1 && saldo < getCnt()) {
                    System.out.println("No dispones de saldo");
                } else if (opcion3 == 2) {
                    System.out.println("Saliendo");
                } else {
                    System.out.println("Ingresa una opcion correcta");
                }
                break;

            case 4:
                System.out.println("Servicio de SRI : ");
                System.out.println("Su deuda a pagar es: $" + getSri());
                System.out.println("Desea Pagar: \n 1: Si pagar  \n 2: No pagar");
                int opcion4 = sc.nextInt();
                if (opcion4 == 1 && saldo > getSri()) {
                    saldo -= getSri();
                } else if (opcion4 == 1 && saldo < getSri()) {
                    System.out.println("No dispones de saldo");
                } else if (opcion4 == 2) {
                    System.out.println("Saliendo");
                } else {
                    System.out.println("Ingresa una opcion correcta");
                }
                break;
            default:
                System.out.println("Seleccione una opcion correcta");
                break;
        }
        System.out.println("------------------------------");
        System.out.println("Nuevo saldo: " + saldo);
        System.out.println("------------------------------");
    }

}
