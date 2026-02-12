class Pekerja{
    public String id_pekerja;
    public String nama;
    public String email;
    public String no_telepon;
    public String lokasi;
    public String foto_profil;
    public String status_validasi;
    public String tanggal_daftar;
    public String password;
    public String role;

    // Method to set kehadiran
    public void hadir(){
        System.out.println("Pekerja dengan nama: " + nama + " Masuk Kerja");
        System.out.println("-----------------------");
    }
    public void tidakHadir(){
        System.out.println("Pekerja dengan nama: " + nama + " Tidak Masuk Kerja");
        System.out.println("-----------------------");
    }
    public void izin(){
        System.out.println("Pekerja dengan nama: " + nama + " Izin");
        System.out.println("-----------------------");
    }

    // Method to set data
    public void data(){
        System.out.println("ID_Pekerja: " + id_pekerja);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("No Telepon: " + no_telepon);
        System.out.println("Lokasi: " + lokasi);
        System.out.println("Foto Profil: " + foto_profil);
        System.out.println("Status Validasi: " + status_validasi);
        System.out.println("Tanggal Daftar: " + tanggal_daftar);
        System.out.println("Password: " + password);
        System.out.println("Role: " + role);
        System.out.println("-----------------------");
    }
}

public class KrisnaPBO{
    public static void main(String[] args){
        // Objek 1
            Pekerja pekerja1 = new Pekerja();
            pekerja1.id_pekerja = "254311029";
            pekerja1.nama = "Krisna";
            pekerja1.email = "Krisna@mail.com";
            pekerja1.no_telepon = "08912345";
            pekerja1.lokasi = "Madiun";
            pekerja1.foto_profil = "krisna.png";
            pekerja1.status_validasi = "aktif";
            pekerja1.tanggal_daftar = "12-02-2026";
            pekerja1.password = "123krisna";
            pekerja1.role = "Mekanik";

        // Objek 2
            Pekerja pekerja2 = new Pekerja();
            pekerja2.id_pekerja = "254311023";
            pekerja2.nama = "Dodo";
            pekerja2.email = "Dodo@mail.com";
            pekerja2.no_telepon = "08999999";
            pekerja2.lokasi = "Madiun";
            pekerja2.foto_profil = "dodo.png";
            pekerja2.status_validasi = "aktif";
            pekerja2.tanggal_daftar = "13-02-2026";
            pekerja2.password = "123dodo";
            pekerja2.role = "Teknisi";

        // Objek 3
            Pekerja pekerja3 = new Pekerja();
            pekerja3.id_pekerja = "254311014";
            pekerja3.nama = "Septian";
            pekerja3.email = "Septian@mail.com";
            pekerja3.no_telepon = "08911111";
            pekerja3.lokasi = "Madiun";
            pekerja3.foto_profil = "septian.png";
            pekerja3.status_validasi = "aktif";
            pekerja3.tanggal_daftar = "14-02-2026";
            pekerja3.password = "123septian";
            pekerja3.role = "Operator";

            System.out.println("Berikut Data Pekerja:");
            pekerja1.data();
            pekerja2.data();
            pekerja3.data();

            System.out.println("Data Kehadiran Pekerja:");
            pekerja1.hadir();
            pekerja2.tidakHadir();
            pekerja3.izin();
    }
}