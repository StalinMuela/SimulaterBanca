import java.util.Scanner;

public class usuario {
    public String usuario;
    int password;
    double saldo = 3000;

    public usuario() {
    }

    public usuario(int password, String usuario, double saldo) {
        this.password = password;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void login(){
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Ingrese su usuario: ");
            String usuarioo = sc.nextLine();
            System.out.print("Ingrese su clave: ");
            int clavee = sc.nextInt();
            sc.nextLine();
            if (usuarioo.equals(usuario) && clavee == password) {
                System.out.println("Ingreso correctamente al sistema");
                break;
            }else{
                System.out.println("Vuelva a intentarlo");
            }
        }
    }

}
