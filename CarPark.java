public class CarPark {
    private static int MaxCARS = 15;
    private ЛегковыеАвтомобили[] легковыеАвтомобилиs = new ЛегковыеАвтомобили[MaxCARS];
    private int counter;

    public void add(ЛегковыеАвтомобили легковыеАвтомобили) {
        легковыеАвтомобилиs[counter++] = легковыеАвтомобили;
    }

    @Override
    public String toString() {
        String result = "********ТАКСОПАРК********" + "\n";

        for (int i = 0; i < counter; i++) {
            result += i + 1 + ". " + легковыеАвтомобилиs[i].toString() + "\n";
        }
        return result + "*************************";
    }

    public int getPrice() {
        int result = 0;
        for (ЛегковыеАвтомобили легковыеАвтомобили : легковыеАвтомобилиs) {
            if (легковыеАвтомобили != null) {
                result += легковыеАвтомобили.getPrice();

            }
        }
        return result;
    }

   public  ЛегковыеАвтомобили[] getЛегковыеАвтомобили(){
        return легковыеАвтомобилиs;

}


}

