import transport.Car;

public class Main {
        public static void main(String[] agrs) {
                Car LadaGranta = new Car("Lada", "Granta", 2015, "Жёлтый", "Россия", 1.7);
                Car AudiA8 = new Car("Audi", "A8 50 L quattro", 2020, "Чёрный", "Германия", 3.0);
                Car BMWZ8 = new Car("BMW", "Z8", 2021, "Чёрный", "Германия", 3.0);
                Car KiaSportage = new Car("Kia", "Sportage 4-го поколения", 2016, "Красный", "Южная Корея", 2.4);
                Car HyundaiAvante = new Car("Hyundai", "Avante", 2016, "оранжевый", "Южная Корея", 1.6);
                System.out.println(LadaGranta);
                System.out.println(AudiA8);
                System.out.println(BMWZ8);
                System.out.println(KiaSportage);
                System.out.println(HyundaiAvante);
                System.out.println();
        }
}
