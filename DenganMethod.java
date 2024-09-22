public class DenganMethod {
   public static int hitungTotalPenghasilan( int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus){
       return gajiPokok + tunjanganTransport + tunjanganMakan + bonus;
   }

   public static int hitungPajak(int totalPenghasilan) {
       return totalPenghasilan * 18 / 100;
   }

   public static int hitungGajiBersih(int totalPenghasilan, int pajak) {
       return totalPenghasilan - pajak;
   }

   public static void hitungTotalPenghasilan(int gajiPokok, int tunjanganTransport, int tunjanganMakan, int bonus, int pajak, int gajiBersih) {
       System.out.println("Gaji Pokok : " + gajiPokok);
       System.out.println("Tunjangan Transport : " + tunjanganTransport);
       System.out.println("tunjangan Makan : " + tunjanganMakan);
       System.out.println("bonus : " + bonus);
       System.out.println("Pajak : " + pajak);
       System.out.println("Gaji Bersih : " + gajiBersih);
   }



    public static void main(String[] args) {
        int gajiPokok = 5000000;
        int tunjanganTransport = 500000;
        int tunjanganMakan = 300000;
        int bonus = 10000000;

        int totalPenghasilan = hitungTotalPenghasilan(gajiPokok, tunjanganTransport, tunjanganMakan, bonus);
        int pajak = hitungPajak(totalPenghasilan);
        int gajiBersih = hitungGajiBersih(totalPenghasilan, pajak);

        hitungTotalPenghasilan(gajiPokok,tunjanganTransport, tunjanganMakan, bonus, pajak, gajiBersih);
    }
}
