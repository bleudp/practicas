public class Strings_video10 {
    public static void main(String[] args){
        int letras;
        String nombre = "Eduardo";
        System.out.println(nombre + " tiene " + nombre.length() + " caracteres.");
        letras = nombre.length();
        System.out.println("La ultima letra es " + nombre.charAt(letras - 1) + ", la primera es " + nombre.charAt(0)); // letras - 1 ya que charAt empieza a contar en 0  
    }
}
