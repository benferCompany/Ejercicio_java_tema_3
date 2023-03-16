public class Main {
    public static void main(String[] args) {

        String[] nombre = {"h","o","l","a"};

        String nombre_concatenado="";
        for(int i =0;i<nombre.length;i++){
            nombre_concatenado= nombre_concatenado+nombre[i];
        }
        System.out.println(nombre_concatenado);
    }
}