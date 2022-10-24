public class penggajian {
    String gajiPokok;
    String gajiTunjangan;
    String gajiLembur;

    penggajian(String parangajiPokok, String parangajiTunjangan, String parangajiLembur) {
        this.gajiPokok = parangajiPokok;
        this.gajiTunjangan = parangajiTunjangan;
        this.gajiLembur = parangajiLembur;

    }

    void cetakpenggajian(String gajiPokok){
        System.out.println("Gaji Pokok = "+gajiPokok + "\t\tGaji Tunjangan = "+ gajiTunjangan+"\t\tGaji Lembur= "+ gajiLembur);
    }

}
