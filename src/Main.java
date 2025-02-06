import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*Creación de Lista de paises*/
        List<Pais> paises = new ArrayList<>();
        Pais Suecia = new Pais("Suecia","Marcus & Martinus", "Unforgettable");
        paises.add(Suecia);
        Pais Ucrania = new Pais("Ucrania","Alyona Alyona & Jerry Heil", "Teresa & Maria");
        paises.add(Ucrania);
        Pais Espanya = new Pais("España","Nebulossa", "Zorra");
        paises.add(Espanya);

        /*Creación de Eurovisión*/
        Eurovision eurovision2024 = new Eurovision(paises);

        /*Pruebas por pantalla*/
        eurovision2024.votar();
        System.out.println(eurovision2024);
        System.out.println(Espanya);

    }
}
