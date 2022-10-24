public class mainApp {
    public static void main(String[] args){
        karyawan karyawan=new karyawan("Dian Nitami", "Steling", "085237254545");

        penggajian penggajian=new penggajian("Rp.3.700.000", "Rp.2.400.000", "Rp.4.400.000");

        status_pendidikan status_pendidikan=new status_pendidikan("Aktif");

        jabatan jabatan=new jabatan("Teacher");

        karyawan.cetakkaryawan(karyawan.no_hp);
        penggajian.cetakpenggajian(penggajian.gajiPokok);
        jabatan.cetakjabatan(jabatan.jabatan);
        status_pendidikan.cetakstatus_pendidikan(status_pendidikan.status);
    }

}
