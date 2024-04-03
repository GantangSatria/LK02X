package LK02X;

class bus extends kendaraan{
    int isToilet;

    public bus(String pn, String m, int max, int isToilet){
        super(pn, m, max);
        this.isToilet = isToilet;
    }

    public void cekToilet() {
        if (isToilet == 1) {
            System.out.println("Bus ini memiliki toilet.");
        } else {
            System.out.println("Bus ini tidak memiliki toilet.");
        }
    }

    public void penumpangNaik(int naik, String namaPenumpang) {
        super.penumpangNaik(naik, namaPenumpang);
    }

    public void cekDaftarPenumpang() {
        System.out.println("Daftar Nama Penumpang di Bus " + merk + " " + platNomor + ":");
        for (int i = 0; i <= indexPenumpang; i++) {
            System.out.println((i+1) + ". " + daftarPenumpang[i].nama);
        }
    }
}
