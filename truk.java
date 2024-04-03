package LK02X;

class truk extends kendaraan{
    int kapasitasMuatan;

    public truk(String pn, String m, int max){
        super(pn, m, max);
    }

    public void setKapasitas(int kapasitas){
        this.kapasitasMuatan = kapasitas;
    }

    public void cekMuatan() {
        System.out.println("Kapasitas muatan truk ini adalah: " + kapasitasMuatan + " ton.");
    }

    public void penumpangNaik(int naik, String namaPenumpang) {
        super.penumpangNaik(naik, namaPenumpang);
    }

    public void cekDaftarPenumpang() {
        System.out.println("Daftar Nama Penumpang di Truk " + merk + " " + platNomor + ":");
        for (int i = 0; i <= indexPenumpang; i++) {
            System.out.println((i+1) + ". " + daftarPenumpang[i].nama);
        }
    }
}
