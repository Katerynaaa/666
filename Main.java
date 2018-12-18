import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        CarPark carPark = new CarPark();

        carPark.add(new Фаэтоны("Packard", 10000, 4895));
        carPark.add(new Седаны("Mercury Monterey", 48154, 452));
        carPark.add(new Универсалы("Buick Roadmaster Limited", 47843,152));
        System.out.println(carPark);
        System.out.println("Цена автопарка: " + carPark.getPrice()+ " $");
        Arrays.sort(легковыеАвтомобили, new Comparator<ЛегковыеАвтомобили>() {

            @Override
        public int compare(ЛегковыеАвтомобили o1, ЛегковыеАвтомобили o2) {
            if (o1.getCosts().equals("High") && (o2.getCosts().equals("Average") || o2.getCosts().equals("Not Available"))) {
                return 1;
            } else if (o1.getCosts().equals("Average") && o2.getCosts().equals("Not Available")) {
                return 1;
            } else if (o1.getCosts().equals("Not Available") && (o2.getCosts().equals("Average") || o2.getCosts().equals("High"))) {
                return -1;
            } else if (o1.getCosts().equals("Average") && (o2.getCosts().equals("High"))) {
                return -1;
            }
            return 0;
        }
    }

}