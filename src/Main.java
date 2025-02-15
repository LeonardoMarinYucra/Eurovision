import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Pais> paises = new ArrayList<>();
        Pais suecia = new Pais("Suecia","Marcus & Martinus", "Unforgettable");
        paises.add(suecia);
        Pais ucrania = new Pais("Ucrania","Alyona Alyona & Jerry Heil", "Teresa & Maria");
        paises.add(ucrania);
        Pais alemania = new Pais("Alemania","Isaak", "Always on the Run");
        paises.add(alemania);
        Pais luxemburgo = new Pais("Luxemburgo","Tali", "Fighter");
        paises.add(luxemburgo);
        Pais paisesBajos= new Pais("Paises Bajos","Joost Klein", "Europapa");
        paises.add(paisesBajos);
        Pais israel= new Pais("Israel","Edén Golán", "Hurricane");
        paises.add(israel);
        Pais lituania= new Pais("Lituania","Silvester Belt", "Luktelk");
        paises.add(lituania);
        Pais espanya = new Pais("España","Nebulossa", "Zorra");
        paises.add(espanya);
        Pais estonia = new Pais("Estonia","5miinust & Puuluup", "(Nendest) Narkootikumidest ei tea me (küll) midagi");
        paises.add(estonia);
        Pais irlanda = new Pais("Irlanda","Bambie Thug", "Doomsday Blue");
        paises.add(irlanda);
        Pais letonia = new Pais("Letonia","Dons", "Hollow");
        paises.add(letonia);
        Pais grecia = new Pais("Grecia","Marina Satti", "Zari");
        paises.add(grecia);
        Pais reinoUnido = new Pais("Reino Unido","Olly Alexander", "Dizzy");
        paises.add(reinoUnido);
        Pais noruega = new Pais("Noruega","Gåte", "Ulveham");
        paises.add(noruega);
        Pais italia = new Pais("Italia","Angelina Mango", "La noia");
        paises.add(italia);
        Pais serbia = new Pais("Serbia","Teya Dora", "Ramonda");
        paises.add(serbia);
        Pais finlandia = new Pais("Finlandia","Windows95man", "No Rules!");
        paises.add(finlandia);
        Pais portugal = new Pais("Portugal","Iolanda", "Grito");
        paises.add(portugal);
        Pais armenia = new Pais("Armenia","Ladaniva", "Jako");
        paises.add(armenia);
        Pais chipre = new Pais("Chipre","Sília Kapsís", "Liar");
        paises.add(chipre);
        Pais suiza = new Pais("Suiza","Nemo", "The Code");
        paises.add(suiza);
        Pais eslovenia = new Pais("Eslovenia","Raiven", "Veronika");
        paises.add(eslovenia);
        Pais croacia = new Pais("Croacia","Baby Lasagna", "Rim tim tagi dim");
        paises.add(croacia);
        Pais georgia = new Pais("Georgia","Nutsa Buzaladze", "Firefighter");
        paises.add(georgia);
        Pais francia = new Pais("Francia","Slimane", "Mon Amour");
        paises.add(francia);
        Pais austria = new Pais("Austria","Kaleen", "We Will Rave");
        paises.add(austria);

        Eurovision eurovision2024 = new Eurovision(paises);


        System.out.println(eurovision2024.mostrarPaises());
        System.out.println(eurovision2024.mostrarPaisesAlfabeticamente());
        System.out.println(eurovision2024.mostrarPaisesPuntuacion());
        System.out.println(eurovision2024.paisGanador());
        System.out.println(eurovision2024.cancionesAlfabeticamente());
        System.out.println(eurovision2024.paisPuntuacionMax());

    }
}
