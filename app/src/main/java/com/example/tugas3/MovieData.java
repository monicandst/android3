package com.example.tugas3;

import java.util.ArrayList;

public class MovieData {
    private static String[] judul = new String[]{"FROZEN", "MALEFICENT", "MILEA", "THE MEG", "ALADDIN", "HOW TO TRAIN YOUR DRAGON 3", "IP MAN 4"};
    private static int[] thumbnail = new
            int[]{R.drawable.frozen, R.drawable.maleficent, R.drawable.milea, R.drawable.themeg, R.drawable.aladdin, R.drawable.traindragon, R.drawable.ipman};
    private static String[] sinopsis = new String[]{
            "Dahulu kala hutan ajaib itu menyenangkan hingga suatu ketika tempat itu terkunci oleh sihir gelap yang membuat manusia tak lagi bisa masuk atau pun keluar dari sana.\n\n" +
                    "Adegan kemudian berpindah ketika sesuatu yang buruk menimpa Kerajaan Arendelle dan memaksa semua orang pergi untuk mencari perlindungan. Tak hanya itu, trailer juga menunjukkan Elsa yang sering mendengar suara-suara misterius dan tidak tahu dari mana datangnya.\n\n" +
                    "Elsa pun turun tangan untuk menangani segala kejadian yang terjadi. Tindakannya mengantarkan ia ke sebuah tempat jauh di utara yang diduga lokasi hutan ajaib itu berada. Dia bersama dengan Anna, Kristoff, dan Olaf berangkat menuju hutan ajaib tersebut dengan penuh rintangan badai, gelombang laut, monster dan kekuatan sihir lain yang mengancam.\n\n",
            "Di film pertama, diceritakan Maleficent akhirnya menjadi ibu peri Aurora. Kini, Maleficent 2 memperlihatkan kegusaran sang ratu kegelapan saat mengetahui anak asuhnya, Aurora, akan menikah dengan Pangeran Phillip.\n" +
                    "Dalam trailer, film ini dibuka dibuka dengan adegan Pangeran Phillip yang ketahuan Dieval saat meminang Aurora. Pembantu setia Maleficent itu kemudian pergi menemui majikannya untuk menyampaikan berita yang ia dapat.\n" +
                    "\"Jangan hancurkan pagi hariku,\" ucap Maleficent kepada Dieval, setelah mendengar kabar tersebut.\n" +
                    "Maleficent yang jengkel bergegas pergi menemui Aurora. Saat itu, Aurora memberi tahunya tentang ajakan menikah yang baru ia terima. Hanya saja, kegembiraan Aurora untuk menikah ditentang oleh Maleficent. Bagi Maleficent, 'Cinta tidak selalu berakhir baik.' Ia tak ingin sang putri terjerumus ke dalam cinta bisa membuatnya sakit hati.",
            " Film Milea merupakan seri terakhir dari Film Dilan 1990 dan Dilan 1991 yang dijadwalkan tayang pada 13 Februari 2020.          \n" +
                    "Film Dilan 1990 dan Dilan 1991 yang sukses meraih belasan juta penonton itu menceritakan kisah pasangan kekasih remaja SMA bernama Dilan dan Milea.\n" +
                    "Kisah asamara Dilan dan Milea adalah kisah nyata yang terjadi di kota Bandung, 1990.\n" +
                    "\"Meskipun jarak membentang, namum cinta Milea masih sama: hanya untuk Dilan,\" demikian adalah kisah akhir dalam film Dilan 1991.\n" +
                    "Jika film Dilan 1990 dan Dilan 1991 menceritakan sosok Dilan di mata Milea, film Milea menceritakan sudut pandang Dilan mengenai sosok Milea.\n" +
                    "Berikut ini sinopsis film Milea: Suara Dari Dilan :\n" +
                    "Film Milea dibuka dengan kisah masa kecil Dilan yang tinggal di Timor Leste.\n" +
                    "Dilan adalah sosok pria kecil yang bandel dan konyol. Ia harus meninggalkan Timor Leste karena ayahnya yang tentara, harus pindah tugas.\n" +
                    "Kala beranjak dewasa, tahun 1990 Dilan masuk dalam geng motor di Bandung.\n" +
                    "Dalam masa-masa putih abu-abu itulah Dilan mengenal sosok Milea yang kemudian menjadi pacaranya.\n",
            "Jonas Taylor (Jason Statham) merupakan seorang mantan anggota pasukan khusus Amerika yang pernah punya pengalaman mengerikan ketika berada di laut. Keahliannya sebagai Kapten Angkatan Laut terbuang sia-sia ketika dirinya bertemu dengan sosok makhluk buas dari dasar laut.\n\n Namun, kini, Jonas harus kembali ke laut. Menyelamatkan ilmuwan bernama Suyin (Bingbing Li) yang sedang melakukan penelitian bersama timnya.\n\n Sosok hiu putih dengan besar hingga 70 kaki yang disebut bernama Carcharodon Megalodon adalah makhluk laut yang harus dihadapi Jonas. Bisakah Jonas menghadapi trauma masa lalunya sembari menyelamatkan para ilmuwan",
            "Aladdin adalah film fantasi musikal Amerika Serikat produksi tahun 2019 yang disutradarai oleh Guy Ritchie, yang menulis skenario film ini bersama dengan John August. Diproduksi oleh Walt Disney Pictures, film ini merupakan adaptasi film animasi Disney tahun 1992 dengan judul sama yang ditulis berdasarkan cerita rakyat Aladdin, dari kumpulan cerita epik berjudul Seribu Satu Malam. Film ini dibintangi oleh Will Smith, Mena Massoud, Naomi Scott, Marwan Kenzari, Navid Negahban, Nasim Pedrad, dan Billy Magnussen. Film ini mengisahkan perjalanan Aladdin, pemuda yatim piatu yang jatuh cinta dengan Putri Jasmine, berteman dengan jin pengabul permintaan bernama Genie, dan harus menyelamatkan kerajaannya dari kelompok Jafar.\n" +
                    "Pada Oktober 2016, Disney mengumumkan bahwa Ritchie akan menyutradarai film ini. Smith adalah orang pertama yang bergabung dalam film ini pada Juli 2017, dengan peran sebagai Genie, masih dalam bulan yang sama Massoud dan Scott dipastikan mendapat peran utama. Pengambilan gambar utama dimulai pada bulan September di Longcross Studios di Surrey, Inggris dan Gurun Wadi Rum di Yordania, dan selesai pada Januari 2018. Film ini merupakan bentuk penghormatan bagi pengisi suara Genie dalam versi animasi, Robin Williams, yang meninggal pada tahun 2014.\n" +
                    "Aladdin dirilis secara teatrikal di Amerika Serikat pada 24 Mei 2019. Film ini mendapat $ 1 miliar di seluruh dunia, menjadi film terlaris kelima di tahun 2019, dan film terlaris ke-34 sepanjang masa. Film ini mendapat tinjauan beragam dari para kritikus, yang memuji pertunjukan Smith, Massoud dan Scott, kostum dan skor musik, tetapi mengkritik arahan Ritchie dan efek CGI. Kritik juga dibagi pada penyimpangan dari film animasi asli, seperti karakterisasi Jafar dan pengisi suara Kenzari.",
            "How To Train Your Dragon 3: The Hidden World mengisahkan tentang sebuah petualangan yang akan membawa Toothless, naga berjenis Night Furry yang langka milik Hiccup (Jay Baruchel) menemukan naga dengan jenis Light Furry, berwarna putih dan anggun. The Hidden World memperkenalkan sosok baru yaitu Grimmel the Grisly (F. Abraham Murray) sang pemburu naga yang bertekad memusnahkan night furry di seluruh dunia. Tidak berfokus pada pengenalan tokoh baru,How To Train Your Dragon 3: The Hidden World justru menyajikan plot lokasi geografis baru yaitu “Hidden World” yang selama ini dianggap mitos. Sejalan dengan bertemunya Toothless dengan Light Furry, kisah cinta Hiccup dan Astrid (America Fererra) juga ditampilkan dalam film ini. Bertemunya Toothless dengan Light Furry betina ini juga ikut mengasah kemampuannya sebagai alpha (naga penguasa) atas seluruh naga di Berk. Dalam perjalanan menuju Hidden World juga terdapat konflik antara Toothless dan Hiccup, juga konflik antarspesies naga, termasuk Light Furry si naga baru.\n",
            "Film garapan sutradara Wilson Yip itu mengisahkan lanjutan kehidupan grandmaster Wing Chun, Ip Man, yang diperankan oleh Donnie Yen. Bermula ketika Ip Man divonis mengidap kanker tenggorokan karena merokok, setelah ditinggal sang istri. Baca juga: Setelah Ip Man 4: The Finale, Donnie Yen Akan Pensiun dari Film Kung Fu Ip Chun, anak Ip Man, kemudian berulah dan membuat mereka terusir dari tempat tinggal mereka. Sampai akhirnya ayah dan anak itu bertolak ke San Fransisco, Amerika Serikat. Ip Man ingin membantu muridnya, Bruce Lee (Kwok Kwan Chan), membangun sebuah sekolah seni bela diri Wing Chun di sana. Baca juga: Film IP Man 4: The Finale Diboikot di Hong Kong, Mengapa? Sementara Bruce Lee banyak mengalami kesulitan dan mendapat diskriminasi rasial saat berjuang mempertahankan sekolah tersebut. Selain itu, film terakhir dari waralaba Ip Man ini juga menyuguhkan cerita konflik antara Ip Man dan anaknya. Film ini turut dibintangi oleh Scott Adkins, Vanness Wu, Kent Cheng, Wu Yue, Lynn Hung, dan masih banyak lagi.\n"
    };

    public static ArrayList<MovieModel> getListData() {
        MovieModel movieModel = null;
        ArrayList<MovieModel> list = new ArrayList<>();
        for (int i = 0; i < judul.length; i++) {
            movieModel = new MovieModel();
            movieModel.setGambarfilm(thumbnail[i]);
            movieModel.setJudulfilm(judul[i]);
            movieModel.setSinopsis(sinopsis[i]);
            list.add(movieModel);
        }
        return list;
    }
}


