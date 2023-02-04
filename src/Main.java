public class Main {
    public static void main(String[] args) {

        Series serie=new Series();
        serie.CrearListaSeries ();

        System.out.println("Las series Ingresadas son: ");
        serie.VerListaSeries ();
        System.out.println("");

        System.out.println("Las series menores de 15 minutos son: ");
        serie.Serie15();
        System.out.println("");

        System.out.println("Las series Mayores a 40 Minutos son: ");
        serie.Serie40();
        System.out.println("");

        System.out.println("Las series de categoria Romance son: ");
        serie.Romance();
        System.out.println("");

        System.out.println("Las series de categoria Comedia son: ");
        serie.Comedia();
        System.out.println("");

        System.out.println("Las series de categoria Drama son: ");
        serie.Drama();
        System.out.println("");


    }

}