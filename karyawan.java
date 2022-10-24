public class karyawan {
    String nama;
    String alamat;
    String no_hp ="085237154545";
    karyawan (String parannama, String paranalamat, String paranno_hp){
        this.nama = parannama;
        this.alamat = paranalamat;
        this.no_hp = paranno_hp;
    }

    void cetakkaryawan(String no_hp){
        System.out.println("Nama Karyawan = "+ nama + "\t\tAlamat = " + alamat +"\t\tNo_tlp = "+ no_hp);
    }

}
