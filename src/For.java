public class For {
    public static void main(String[] args) {
        /*int z = 7;
        for(int i = 0; i < 10; i++) {
            System.out.println("I: " + i);
            int x = 5;
        }*/

        int[] tab = new int[100];
        for(int index = 0; index < 100; index++) {
            tab[index] = index * 2;
        }

        for(int liczbaZTablicy : tab) {
            //System.out.println(liczbaZTablicy);
            liczbaZTablicy = 15;
        }

        for(int liczbaZTablicy : tab) {
            System.out.println(liczbaZTablicy);
        }
    }
}
