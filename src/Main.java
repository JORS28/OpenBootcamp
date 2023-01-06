public class Main {

    public static void main(String[] args) {
        System.out.println("Primera parte:");
        System.out.println("Las entradas son: 10, 20, 30");
        int paramet1 = 10;
        int paramet2 = 20;
        int paramet3 = 30;
        System.out.println("Salida de la funcion:");
        suma(paramet1, paramet2, paramet3);
        System.out.println(" ");
        System.out.println("Segunda parte:");
        coche miCoche = new coche();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        miCoche.agregarPuerta();
        System.out.println("Numero de puertas:");
        System.out.println(miCoche.nPuertas);

    }


    public static void suma(int a,int b, int c){
        int resultado;
        resultado=a+b+c;
        System.out.println(resultado); }

    static class coche{
        public int nPuertas=0;

        public void agregarPuerta(){
            this.nPuertas++;
        }
    }
}