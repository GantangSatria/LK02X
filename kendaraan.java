package LK02X;
class kendaraan{
    public String merk;
    public String warna;
    public String platNomor;
    public int jumlahPenumpang;
    public int maxPenumpang;

    public driver supir;

    public penumpang[] daftarPenumpang;
    public int indexPenumpang;

    public kendaraan(String pn, String m, int max){
        this.merk = m;
        this.platNomor = pn;
        this.jumlahPenumpang = 0;
        this.maxPenumpang = max;
        this.daftarPenumpang = new penumpang[max];
        this.indexPenumpang = -1;

        System.out.println("Objek dari kelas Kendaraan dengan plat nomor " + this.platNomor + " bermerk " + this.merk + " dengan kapasitas penumpang maksimum " + maxPenumpang + " orang");
        cekPenumpang();
    }

    public void cekPenumpang(){
        System.out.println("Penumpang saat ini: "+this.jumlahPenumpang);
    }

    public void penumpangNaik(int naik) {
        System.out.println("Ada penumpang yang ingin naik: " + naik);
        int current = this.jumlahPenumpang;
        if (current + naik > this.maxPenumpang) {
            System.out.println("Maaf, penumpang melebihi kapasitas");
        } else {
            for (int i = 1; i <= naik; i++) {
                this.indexPenumpang++;
                daftarPenumpang[indexPenumpang] = new penumpang("Penumpang " + (current + i));
            }
            this.jumlahPenumpang += naik;
            System.out.println("Penumpang berhasil naik");
        }
        cekPenumpang();
    }

    public void penumpangNaik(int naik, String namaPenumpang) {
        System.out.println("Ada penumpang " + namaPenumpang + " yang ingin naik: " + naik);
        int current = this.jumlahPenumpang;
        if (current + naik > this.maxPenumpang) {
            System.out.println("Maaf, penumpang melebihi kapasitas");
        } else {
            for (int i = 1; i <= naik; i++) {
                this.indexPenumpang++;
                daftarPenumpang[indexPenumpang] = new penumpang(namaPenumpang);
            }
            this.jumlahPenumpang += naik;
            System.out.println("Penumpang " + namaPenumpang + " berhasil naik");
        }
        cekPenumpang();
    }

    public void penumpangTurun(int turun) {
        System.out.println("Ada penumpang yang ingin turun: " + turun);
        int current = this.jumlahPenumpang;
        if (current - turun < 0) {
            System.out.println("Maaf, penumpang ghoib yang turun");
        } else {
            for (int i = 0; i < turun; i++) {
                this.indexPenumpang--;
            }
            this.jumlahPenumpang -= turun;
            System.out.println("Penumpang berhasil turun");
        }
        cekPenumpang();
    }

    public void maju(){
        System.out.println(this.merk + " " + this.platNomor +" Maju");
    }

    public void mundur(){
        System.out.println(this.merk + " " + this.platNomor+ " Mundur");
    }

    public void belok(){
        System.out.println(this.merk + " " + this.platNomor+ " Belok");
    }

    public void berhenti(){
        System.out.println(this.merk + " " + this.platNomor+ " Berhenti");
    }

    public void ceksupir(){
        System.out.println("Supir di kendaraan ini bernama " + this.supir.nama + " dengan no sim: " + this.supir.no_sim);
        // System.out.println(this.supir.no_sim);
    }
    
}