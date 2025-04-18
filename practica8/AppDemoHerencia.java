import java.util.ArrayList;

public class AppDemoHerencia {
    public static void main(String[] args) {
        ArrayList<Smartphone> listaDeSmartphones = new ArrayList<>();
        ArrayList<Television> listaDeTVs = new ArrayList<>();

        Smartphone s1 = new Smartphone("Apple", "SN123", "iPhone", "iPhone 14", 999.99f,
                new Microprocesador(8, 3000000000L),
                8192,
                new Sensor("Huella", "Digital", 1),
                new Pantalla(1170, 2532));

        Smartphone s2 = new Smartphone("Samsung", "SN456", "Galaxy", "Galaxy S22", 899.99f,
                new Microprocesador(6, 2800000000L),
                8192,
                new Sensor("Huella", "Digital", 1),
                new Pantalla(1080, 2400));

        Television t1 = new Television("LG", "TV001", "OLED", "LG Smart TV", 1500.0f,
                new Pantalla(3840, 2160));

        Television t2 = new Television("Sony", "TV002", "Bravia", "Sony 4K", 1800.0f,
                new Pantalla(3840, 2160));

        listaDeSmartphones.add(s1);
        listaDeSmartphones.add(s2);

        listaDeTVs.add(t1);
        listaDeTVs.add(t2);

        System.out.println("=== Smartphones ===");
        for (Smartphone s : listaDeSmartphones) {
            System.out.println(s);
        }

        System.out.println("\n=== Televisores ===");
        for (Television t : listaDeTVs) {
            System.out.println(t);
        }
    }
}
