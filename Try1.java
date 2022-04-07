public class Try1 {
    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello1");
        public static void main (String[]args){


            Random random = new Random();

            Scanner scan = new Scanner(System.in);
            System.out.println("lutfen urun sayisi giriniz :");
            int urunSayisi = scan.nextInt();
            System.out.println("lutfen zarar gormus urunleri giriniz");
            int limit = scan.nextInt();

            int[] products = new int[urunSayisi];
            for (int i = 0; i < products.length; i++) {

                products[i] = random.nextInt(2);

            }
            for (int j = 0; j < products.length; j++) {

                if (j < products.length - 1) {
                    System.out.print(products[j] + ",");
                } else {
                    System.out.print(products[j]);
                }
            }
            System.out.println();
            System.out.println("Sonuc:" + badP(products, limit));

        }


        public static boolean badP ( int pro[], int lim ){
            int counter = 0;
            for (int i = 0; i < pro.length; i++) {
                if (pro[i] == 0) {
                    counter++;
                }
            }
            if (counter < lim) {
                return true;
            } else {
                return false;
            }


        }
    }
}

}
