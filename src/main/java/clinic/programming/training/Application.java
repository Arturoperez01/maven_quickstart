package clinic.programming.training;

public class Application {

    public Application (){
        System.out.println ("Dentro de la Application");
    }

    // El metodo main() siempre correra la entrada de la Aplicacion
    public static void main (String[] args) {
        System.out.println("Iniciando la aplicacion");
        Application app = new Application();
    }
}