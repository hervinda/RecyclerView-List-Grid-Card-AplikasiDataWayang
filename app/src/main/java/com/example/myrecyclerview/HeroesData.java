package com.example.myrecyclerview;

import java.util.ArrayList;

public class HeroesData {
    private static String[] heroNames = {
            "Gatotkaca",
            "Pandu",
            "Srikandi",
            "Drupada",
            "Ekalawya",
            "Subali",
            "Indrajit",
            "Wicitrawirya",
            "Jembawan",
            "Sanjaya"
    };

    private static String[] heroDetails = {
            "Gatotkaca adalah seorang tokoh dalam wiracarita Mahabharata, putra Bimasena atau Wrekodara dari keluarga Pandawa. Ibunya bernama Hidimbi, berasal dari bangsa rakshasa. Gatotkaca dikisahkan memiliki kekuatan luar biasa.",
            "Pandu adalah nama tokoh dalam wiracarita Mahabharata, ayah dari para Pandawa. Pandu merupakan anak kedua dari tiga bersaudara; kakaknya Dretarasta, sedangkan adiknya Widura.",
            "Srikandi adalah salah satu tokoh dalam wiracarita dari India, yaitu Mahabharata. Dalam kisah, ia merupakan putri Raja Drupada dengan Dewi Gandawati dari Kerajaan Panchala.",
            "Drupada, atau sering pula disebut Yadnyasena, adalah nama raja Kerajaan Pancala dalam wiracarita Mahabharata. Semasa muda ia bersahabat dengan Drona, guru para Pandawa dan Korawa.",
            "Ekalawya adalah seorang pangeran dari kaum Nishada dalam wiracarita Mahabharata. Kaum ini adalah persekutuan dari suku-suku pemburu dan manusia hutan. Ia merupakan anak angkat dari Hiranyadanus, pemimpin kaum Nishada, dan merupakan sekutu Jarasanda.",
            "Bali, atau yang di Indonesia lebih terkenal dengan sebutan Subali, adalah nama seorang raja Wanara dalam wiracarita Ramayana. Ia merupakan kakak dari Sugriwa, sekutu Sri Rama. Ketika terjadi perselisihan antara kedua Wanara bersaudara itu, Rama berada di pihak Sugriwa.",
            "Indrajit atau Megananda adalah nama seorang tokoh antagonis dalam wiracarita Ramayana yang dikenal sebagai putra sulung Rahwana sekaligus putra mahkota Kerajaan Alengka. Indrajit merupakan ksatria yang sakti mandraguna.",
            "Dalam wiracarita Mahabharata, Wicitrawirya atau Citrawirya adalah putra bungsu Santanu, Raja Kuru. Ibunya adalah Satyawati, istri kedua Santanu. Ia merupakan adik Citrānggada, dan kakak tirinya—lain ibu satu ayah—bernama Bisma. Menurut silsilah keluarga Kuru, Wicitrawirya merupakan kakek dari Pandawa dan Korawa.",
            "Dalam mitologi Hindu, Jembawan alias Jambawanta atau Jamwanta, adalah seekor beruang yang dipercaya hidup dari zaman Kertayuga sampai Dwaparayuga. Konon pada saat pengadukan \"lautan susu\", Jembawan turut serta dan pernah mengelilingi dunia selama tujuh kali.",
            "Dalam wiracarita Mahabharata, Sanjaya adalah putra Gawalgana, kusir di keraton Hastinapura. Dalam struktur pemerintahan Hastinapura, Sanjaya adalah seorang penasihat sekaligus kusir pribadi Raja Dretarastra. Ia juga merupakan narator kitab Bhagawadgita, sisipan dari kitab Bhismaparwa."
    };

    private static int[] heroesImages = {
            R.drawable.gatotkaca,
            R.drawable.pandu,
            R.drawable.srikandi,
            R.drawable.drupada,
            R.drawable.ekalawya,
            R.drawable.subali,
            R.drawable.indrajit,
            R.drawable.citra,
            R.drawable.jemba,
            R.drawable.sanja
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
