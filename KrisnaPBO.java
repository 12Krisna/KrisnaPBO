class Pekerja{
    public String id;
    public String nama;
    public String email;

    // Method to set data
    public void data(){
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("-----------------------");
    }
}

public class KrisnaPBO{
    public static void main(String[] args){
        // Objek 1
            Pekerja pekerja1 = new Pekerja();
            pekerja1.id = "1";
            pekerja1.nama = "Krisna";
            pekerja1.email = "Krisna@mail.com";

        // Objek 2
            Pekerja pekerja2 = new Pekerja();
            pekerja2.id = "2";
            pekerja2.nama = "Dodo";
            pekerja2.email = "Dodo@mail.com";

            System.out.println("Berikut Data Pekerja:");
            pekerja1.data();
            pekerja2.data();
    }
}