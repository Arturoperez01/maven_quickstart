package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public void greet () {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hello");

        for (String greeting : greetings){
            System.out.println("Greeting: "+ greeting);
        }
    }

    public Application (){
        System.out.println ("Dentro de la Application");
    }

    // El metodo main() siempre correra la entrada de la Aplicacion
    public static void main (String[] args) {
        System.out.println("Iniciando la aplicacion");
        Application app = new Application();
        app.greet();
    }
}