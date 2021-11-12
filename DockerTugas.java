
//bagian atau elemen untuk inputan
import java.util.Scanner;

public class DockerTugas {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // deklarasi variabel
        // deklarasi variabel menggunakan tipe data integer
        int neptuharipria = 0, neptuhariwanita = 0, neptupasaranpria = 0, neptupasaranwanita = 0, totalneptupria,
                totalneptuwanita, totalneptupriawanita, sisa, sisa2;
        // deklarasi variabel menggunakan tipe data String
        String haripria, hariwanita, pasaranpria, pasaranwanita;

        // bagian atau elemen untuk inputan
        Scanner input = new Scanner(System.in);
        // menampilkan teks
        System.out.println("Daftar Hari\t\t: [SENIN/SELASA/RABU/KAMIS/JUMAT/SABTU]");
        System.out.println("Daftar Pasaran\t\t: [LEGI/PAHING/PON/WAGE/KLIWON]\n");

        // eksekusi atau perulangan yang dikerjakan ketika perintah perulangan dengan
        // kondisi while tidak terpenuhi yaitu untuk menginputkan variabel haripria
        do {
            System.out.print("Masukkan Hari Pria\t= ");
            // perintah untuk menginputkan
            haripria = input.next();
        }
        // ketika variabel haripria diinputkan tidak sama dengan atau tidak diisi dengan
        // MINGGU dan SENIN dan SELASA dan RABU dan KAMIS dan JUMAT dan SABTU maka akan
        // melakukan perulangan untuk menginputkan variabel haripria kembali
        // eksekusi perulangan variabel haripria berada didalam perintah do
        while (!(haripria.toUpperCase().equals("MINGGU")) && !(haripria.toUpperCase().equals("SENIN"))
                && !(haripria.toUpperCase().equals("SELASA")) && !(haripria.toUpperCase().equals("RABU"))
                && !(haripria.toUpperCase().equals("KAMIS")) && !(haripria.toUpperCase().equals("JUMAT"))
                && !(haripria.toUpperCase().equals("SABTU")));
        // jika variabel haripria sama dengan MINGGU maka
        if (haripria.toUpperCase().equals("MINGGU")) {
            // variabel neptuharipria sama dengan 5
            neptuharipria = 5;
            // selain itu jika variabel haripria sama dengan SENIN maka
        } else if (haripria.toUpperCase().equals("SENIN")) {
            // variabel neptuharipria sama dengan 4
            neptuharipria = 4;
        } else if (haripria.toUpperCase().equals("SELASA")) {
            neptuharipria = 3;
        } else if (haripria.toUpperCase().equals("RABU")) {
            neptuharipria = 7;
        } else if (haripria.toUpperCase().equals("KAMIS")) {
            neptuharipria = 8;
        } else if (haripria.toUpperCase().equals("JUMAT")) {
            neptuharipria = 6;
        } else if (haripria.toUpperCase().equals("SABTU")) {
            neptuharipria = 9;
        }

        // eksekusi atau perulangan yang dikerjakan ketika perintah perulangan dengan
        // kondisi while tidak terpenuhi yaitu untuk menginputkan variabel hariwanita
        do {
            System.out.print("Masukkan Hari Wanita\t= ");
            hariwanita = input.next();
        }
        // ketika variabel hariwanita diinputkan tidak sama dengan atau tidak diisi
        // dengan MINGGU dan SENIN dan SELASA dan RABU dan KAMIS dan JUMAT dan SABTU
        // maka akan melakukan perulangan untuk menginputkan variabel hariwanita kembali
        // eksekusi perulangan variabel hariwanita berada didalam perintah do
        while (!(hariwanita.toUpperCase().equals("MINGGU")) && !(hariwanita.toUpperCase().equals("SENIN"))
                && !(hariwanita.toUpperCase().equals("SELASA")) && !(hariwanita.toUpperCase().equals("RABU"))
                && !(hariwanita.toUpperCase().equals("KAMIS")) && !(hariwanita.toUpperCase().equals("JUMAT"))
                && !(hariwanita.toUpperCase().equals("SABTU")));
        // jika variabel hariwanita sama dengan MINGGU maka
        if (hariwanita.toUpperCase().equals("MINGGU")) {
            // variabel neptuhariwanita sama dengan 5
            neptuhariwanita = 5;
            // selain itu jika variabel hariwanita sama dengan SENIN maka
        } else if (hariwanita.toUpperCase().equals("SENIN")) {
            // variabel neptuhariwanita sama dengan 4
            neptuhariwanita = 4;
        } else if (hariwanita.toUpperCase().equals("SELASA")) {
            neptuhariwanita = 3;
        } else if (hariwanita.toUpperCase().equals("RABU")) {
            neptuhariwanita = 7;
        } else if (hariwanita.toUpperCase().equals("KAMIS")) {
            neptuhariwanita = 8;
        } else if (hariwanita.toUpperCase().equals("JUMAT")) {
            neptuhariwanita = 6;
        } else if (hariwanita.toUpperCase().equals("SABTU")) {
            neptuhariwanita = 9;
        }

        // eksekusi atau perulangan yang dikerjakan ketika perintah perulangan dengan
        // kondisi while tidak terpenuhi yaitu untuk menginputkan variabel pasaranpria
        do {
            System.out.print("Masukkan Pasaran Pria\t= ");
            pasaranpria = input.next();
        }
        // ketika variabel pasaranpria diinputkan tidak sama dengan atau tidak diisi
        // dengan LEGI dan PAHING dan PON dan WAGE dan KLIWON maka akan melakukan
        // perulangan untuk menginputkan variabel pasaranpria kembali
        // eksekusi perulangan variabel pasaranpria berada didalam perintah do
        while (!(pasaranpria.toUpperCase().equals("LEGI")) && !(pasaranpria.toUpperCase().equals("PAHING"))
                && !(pasaranpria.toUpperCase().equals("PON")) && !(pasaranpria.toUpperCase().equals("WAGE"))
                && !(pasaranpria.toUpperCase().equals("KLIWON")));
        // jika variabel pasaranpria sama dengan LEGI maka
        if (pasaranpria.toUpperCase().equals("LEGI")) {
            // variabel neptupasaranpria sama dengan 5
            neptupasaranpria = 5;
            // selain itu jika variabel pasaranpria sama dengan PAHING maka
        } else if (pasaranpria.toUpperCase().equals("PAHING")) {
            // variabel neptupasaranpria sama dengan 9
            neptupasaranpria = 9;
        } else if (pasaranpria.toUpperCase().equals("PON")) {
            neptupasaranpria = 7;
        } else if (pasaranpria.toUpperCase().equals("WAGE")) {
            neptupasaranpria = 4;
        } else if (pasaranpria.toUpperCase().equals("KLIWON")) {
            neptupasaranpria = 8;
        }

        // eksekusi atau perulangan yang dikerjakan ketika perintah perulangan dengan
        // kondisi while tidak terpenuhi yaitu untuk menginputkan variabel pasaranwanita
        do {
            System.out.print("Masukkan Pasaran Wanita\t= ");
            pasaranwanita = input.next();
        }
        // ketika variabel pasaranwanita diinputkan tidak sama dengan atau tidak diisi
        // dengan LEGI dan PAHING dan PON dan WAGE dan KLIWON maka akan melakukan
        // perulangan untuk menginputkan variabel pasaranwanita kembali
        // eksekusi perulangan variabel pasaranwanita berada didalam perintah do
        while (!(pasaranwanita.toUpperCase().equals("LEGI")) && !(pasaranwanita.toUpperCase().equals("PAHING"))
                && !(pasaranwanita.toUpperCase().equals("PON")) && !(pasaranwanita.toUpperCase().equals("WAGE"))
                && !(pasaranwanita.toUpperCase().equals("KLIWON")));
        // jika variabel pasaranwanita sama dengan LEGI maka
        if (pasaranwanita.toUpperCase().equals("LEGI")) {
            // variabel neptupasaranwanita sama dengan 5
            neptupasaranwanita = 5;
            // selain itu jika variabel pasaranwanita sama dengan PAHING maka
        } else if (pasaranwanita.toUpperCase().equals("PAHING")) {
            // variabel neptupasaranwanita sama dengan 9
            neptupasaranwanita = 9;
        } else if (pasaranwanita.toUpperCase().equals("PON")) {
            neptupasaranwanita = 7;
        } else if (pasaranwanita.toUpperCase().equals("WAGE")) {
            neptupasaranwanita = 4;
        } else if (pasaranwanita.toUpperCase().equals("KLIWON")) {
            neptupasaranwanita = 8;
        }
        // untuk membuat baris baru
        System.out.print("\n");
        System.out.println("Neptu Hari Pria\t\t= " + neptuharipria + " [" + haripria + "]");
        System.out.println("Neptu Hari Wanita\t= " + neptuhariwanita + " [" + hariwanita + "]");
        System.out.println("Neptu Pasaran Pria\t= " + neptupasaranpria + " [" + pasaranpria + "]");
        System.out.println("Neptu Pasaran Wanita\t= " + neptupasaranwanita + " [" + pasaranwanita + "]");
        System.out.println("\n====================\nWeton Kedua Pasangan\t\n====================");
        // eksekusi untuk variabel totalneptupria sama dengan neptuharipria ditambah
        // neptupasaranpria
        totalneptupria = neptuharipria + neptupasaranpria;
        System.out.println("Total Neptu Pria\t\t= " + totalneptupria);
        totalneptuwanita = neptuhariwanita + neptupasaranwanita;
        System.out.println("Total Neptu Wanita\t\t= " + totalneptuwanita);
        totalneptupriawanita = totalneptupria + totalneptuwanita;
        System.out.println("Total Weton Kedua Pasangan\t= " + totalneptupriawanita);
        // eksekusi untuk variabel sisa sama dengan totalneptupriawanita mod 10
        sisa = totalneptupriawanita % 10;
        // jika sisa sama dengan 0 maka
        if (sisa == 0) {
            // variabel sisa sama dengan totalneptupriawanita mod 7
            sisa = totalneptupriawanita % 7;
            // menampilkan teks dan variabel sisa
            System.out.println("Sisa\t\t\t\t= " + sisa);
            // selain itu maka menampilkan teks dan variabel sisa
        } else {
            System.out.println("Sisa\t\t\t\t= " + sisa);
        }
        // jika sisa sama dengan 1 maka
        if (sisa == 1) {
            // menampilkan teks mengenai wasesasegara
            System.out.print("Wasesasegara yang artinya besar budinya, kaya dan besar wibawanya.");
            // selain itu jika sisa sama dengan 2 maka
        } else if (sisa == 2) {
            // menampilkan teks mengenai tunggaksemi
            System.out.print("Tunggaksemi yang artinya sedikit rezekinya.");
        } else if (sisa == 3) {
            System.out.print("Satriyawibawa yang artinya dapat kemulyaan dan keluhuran tinggi.");
        } else if (sisa == 4) {
            System.out.print("Sumursinaba yang artinya banyak orang datang untuk berguru.");
        } else if (sisa == 5) {
            System.out.print(
                    "Satriyawirang yang artinya sering susah, sering malu akibat tindakannya sendiri dan suka difitnah orang dalam kita primbon. Untuk menolak hal tersebut bisa memotong ayam saat akan ijab kabul.");
        } else if (sisa == 6) {
            System.out.print(
                    "Bumikepetak yang artinya hatinya gelap, kuat dalam bekerja, tahan menghadapi ujian dan rintangan.\nUntuk menolak hal tersebut bisa mendem lemah/mengubur tanah saat akan ijab kabul pengantin.");
        } else if (sisa == 7) {
            System.out.print(
                    "Lebuketiupangin yang artinya sering mendapatkan kesusahan, apapun cita-cita tidak akan jadi, sering pindah rumah, penolak bala yang bisa dilakukan dengan cara abul lemah/menabur debu saat akan ijab kabul pengantin.");
            // selain itu jika sisa lebih dari 7 maka
        } else if (sisa > 7) {
            // variabel sisa sama dengan sisa mod 7
            sisa2 = sisa % 7;
            // jika sisa2 sama dengan 1 maka
            if (sisa2 == 1) {
                // menampilkan teks mengenai wasesasegara
                System.out.print("Wasesasegara yang artinya besar budinya, kaya dan besar wibawanya.");
                // selain itu jika sisa sama dengan 2 maka
            } else if (sisa2 == 2) {
                // menampilkan teks mengenai tunggaksemi
                System.out.print("Tunggaksemi yang artinya sedikit rezekinya.");
            }
        }
        // bagian atau elemen untuk menutup inputan
        input.close();
    }
}