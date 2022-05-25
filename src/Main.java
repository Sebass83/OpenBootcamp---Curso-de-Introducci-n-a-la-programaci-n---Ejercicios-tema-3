public class Main {

    public static void main(String[] args){
        //Llamar a la función en el main y darle valores.
        suma(10,11,25);
        //Crear un objeto miCoche en el main y añadirle una puerta
        Coche miCoche = new Coche();
        System.out.println(miCoche.puertas);
        miCoche.incrementarPuertas();
        System.out.println(miCoche.puertas);
    }
    //Primera parte:
    //Crear una función con tres parámetros que sean números que se suman entre sí.

    public static int suma(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        //Opcional si se quiere mostrar por consola, ya que en el enunciado no se pide.
        System.out.println(resultado);

        return resultado;


    }

    //Segunda parte:
    //Crear una clase coche.
    //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    //Una función que incremente el número de puertas que tiene el coche.
    //Crear un objeto miCoche en el main y añadirle una puerta



}
//Segunda parte:
//Crear una clase coche.
class Coche {
    //Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
    public int puertas = 0;
    //Una función que incremente el número de puertas que tiene el coche.
    public void incrementarPuertas(){
        this.puertas++;
    }
}




