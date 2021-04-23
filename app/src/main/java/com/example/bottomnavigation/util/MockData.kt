package com.example.bottomnavigation.util

import com.example.bottomnavigation.model.ChipModel
import com.example.bottomnavigation.model.FollowModel
import com.example.bottomnavigation.model.MessageModel
import com.example.bottomnavigation.model.StoryModel

object MockData {

    fun getStoryData(): ArrayList<StoryModel> {
        val story = ArrayList<StoryModel>()
        story.add(
            StoryModel(
                "https://cdn1.ntv.com.tr/gorsel/MNWHGvVUiUWZddyeS5WqcA.jpg?width=952&height=540&mode=both&scale=both",
                "Kullanıcı 1"
            )
        )
        story.add(
            StoryModel(
                "https://i.tmgrup.com.tr/vogue/original/20-03/19/kimkardashian_89801233_517300542285453_8830787717473565869_n.jpg",
                "Kullanıcı 2"
            )
        )
        story.add(
            StoryModel(
                "https://cdn1.ntv.com.tr/gorsel/a8WEjO3n8EGUawfTJKT3kw.jpg?width=371&height=470&mode=crop&scale=both&v=20210105074816283",
                "Kullanıcı 3"
            )
        )
        story.add(
            StoryModel(
                "https://i.haberglobal.com.tr/storage/haber/2021/02/03/clubhouse-uygulamasini-hangi-unluler-kullaniyor-3_1612343898.jpg",
                "Kullanıcı 4"
            )
        )
        story.add(
            StoryModel(
                "https://iaahbr.tmgrup.com.tr/0b47d6/0/0/0/0/0/0?u=https://iahbr.tmgrup.com.tr/album/2020/11/05/1604559292207.jpg&mw=730&l=1",
                "Kullanıcı 5"
            )
        )
        story.add(
            StoryModel(
                "https://images.beyazgazete.com/fotogaleri/2017/11/27643_instagram-da-unluler-13-11-2017_194516.jpg",
                "Kullanıcı 6"
            )
        )
        story.add(
            StoryModel(
                "https://www.hurriyetemlak.com/emlak-yasam/wp-content/uploads/2018/04/Emlak-zengini-%C3%BCnl%C3%BCler.jpg",
                "Kullanıcı 7"
            )
        )
        story.add(
            StoryModel(
                "https://vdz2wnf1.rocketcdn.com/upload/img/content/21-02/10/rainnwilson.jpg",
                "Kullanıcı 8"
            )
        )
        story.add(
            StoryModel(
                "https://cdntr1.img.sputniknews.com/img/102307/04/1023070448_0:0:2047:3076_665x1000_80_0_0_fe06b5648b81915ce2f8a8f74f9bf38e.jpg",
                "Kullanıcı 9"
            )
        )
        story.add(
            StoryModel(
                "https://foto.haberler.com/galeri/2020/03/17/koronavirus-olan-unluler-kimler-iste-717421_5196_33_b.jpg",
                "Kullanıcı 10"
            )
        )
        story.add(
            StoryModel(
                "https://cdn1.ntv.com.tr/gorsel/LtS0nj9tOUiv0lM3PKxG4g.jpg?width=952&height=540&mode=both&scale=both&v=1611051891227",
                "Kullanıcı 11"
            )
        )
        story.add(
            StoryModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 12"
            )
        )
        story.add(
            StoryModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 13"
            )
        )
        story.add(
            StoryModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 14"
            )
        )
        story.add(
            StoryModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 15"
            )
        )
        story.add(
            StoryModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 16"
            )
        )
        story.add(
            StoryModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 17"
            )
        )
        story.add(
            StoryModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 18"
            )
        )
        story.add(
            StoryModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 19"
            )
        )
        story.add(
            StoryModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 20"
            )
        )
        return story
    }

    fun getMessageData(): ArrayList<MessageModel> {
        val message = ArrayList<MessageModel>()
        message.add(
            MessageModel(
                "https://cdn1.ntv.com.tr/gorsel/MNWHGvVUiUWZddyeS5WqcA.jpg?width=952&height=540&mode=both&scale=both",
                "Zehra Korkan",
                "Ivjjjjlama Zamanı Go."
            )
        )
        message.add(
            MessageModel(
                "https://i2.milimaj.com/i/milliyet/75/0x0/601941df55427e17d035c747.jpg",
                "Anonim a87ssb-gtc-03",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://i2.milimaj.com/i/milliyet/75/0x0/601941df55427e17d035c747.jpg",
                "Anonim a87ssb-gtc-03",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://i.haberglobal.com.tr/storage/haber/2021/02/03/clubhouse-uygulamasini-hangi-unluler-kullaniyor-3_1612343898.jpg",
                "Burakcan",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://iaahbr.tmgrup.com.tr/0b47d6/0/0/0/0/0/0?u=https://iahbr.tmgrup.com.tr/album/2020/11/05/1604559292207.jpg&mw=730&l=1",
                "Emre Can",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://i2.milimaj.com/i/milliyet/75/0x0/601941df55427e17d035c747.jpg",
                "Anonim a87ssb-gtc-03",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://www.hurriyetemlak.com/emlak-yasam/wp-content/uploads/2018/04/Emlak-zengini-%C3%BCnl%C3%BCler.jpg",
                "Anonim 7",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://i2.milimaj.com/i/milliyet/75/0x0/601941df55427e17d035c747.jpg",
                "Anonim a87ssb-gtc-03",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://i2.milimaj.com/i/milliyet/75/0x0/601941df55427e17d035c747.jpg",
                "Anonim a87ssb-gtc-03",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://foto.haberler.com/galeri/2020/03/17/koronavirus-olan-unluler-kimler-iste-717421_5196_33_b.jpg",
                "Kıvanç Bakü",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://cdn1.ntv.com.tr/gorsel/LtS0nj9tOUiv0lM3PKxG4g.jpg?width=952&height=540&mode=both&scale=both&v=1611051891227",
                "Bele Vezyetin İçine",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Anonim a87ssb-gtc-03",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        message.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Anonim a87ssb-gtc-03",
                "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. "
            )
        )
        return message
    }

    fun shuffle(): ArrayList<MessageModel> {
        val shuffle = ArrayList<MessageModel>()
        shuffle.add(
            MessageModel(
                "https://iaahbr.tmgrup.com.tr/0b47d6/0/0/0/0/0/0?u=https://iahbr.tmgrup.com.tr/album/2020/11/05/1604559292207.jpg&mw=730&l=1",
                "Kullanıcı 5",
                "Fakirler ölsün"
            )
        )
        shuffle.add(
            MessageModel(
                "https://images.beyazgazete.com/fotogaleri/2017/11/27643_instagram-da-unluler-13-11-2017_194516.jpg",
                "Kullanıcı 6",
                "Spor yapanlar"
            )
        )
        shuffle.add(
            MessageModel(
                "https://www.hurriyetemlak.com/emlak-yasam/wp-content/uploads/2018/04/Emlak-zengini-%C3%BCnl%C3%BCler.jpg",
                "Kullanıcı 7",
                "İzmir ve Çevresi"
            )
        )
        shuffle.add(
            MessageModel(
                "https://vdz2wnf1.rocketcdn.com/upload/img/content/21-02/10/rainnwilson.jpg",
                "Kullanıcı 8",
                "Gereksiz muhabbet yok"
            )
        )
        shuffle.add(
            MessageModel(
                "https://cdntr1.img.sputniknews.com/img/102307/04/1023070448_0:0:2047:3076_665x1000_80_0_0_fe06b5648b81915ce2f8a8f74f9bf38e.jpg",
                "Kullanıcı 9",
                "Yazınnnnnn"
            )
        )
        shuffle.add(
            MessageModel(
                "https://foto.haberler.com/galeri/2020/03/17/koronavirus-olan-unluler-kimler-iste-717421_5196_33_b.jpg",
                "Kullanıcı 10",
                "Her türlü sohbet"
            )
        )
        shuffle.add(
            MessageModel(
                "https://cdn1.ntv.com.tr/gorsel/LtS0nj9tOUiv0lM3PKxG4g.jpg?width=952&height=540&mode=both&scale=both&v=1611051891227",
                "Kullanıcı 11",
                "Selam yazma"
            )
        )
        shuffle.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 12",
                "Yazacaksan yaz"
            )
        )
        shuffle.add(
            MessageModel(
                "https://cdn1.ntv.com.tr/gorsel/MNWHGvVUiUWZddyeS5WqcA.jpg?width=952&height=540&mode=both&scale=both",
                "Zehra Korkan",
                "İstanbul/İzmir"
            )
        )
        shuffle.add(
            MessageModel(
                "https://cdn1.ntv.com.tr/gorsel/MNWHGvVUiUWZddyeS5WqcA.jpg?width=952&height=540&mode=both&scale=both",
                "Kullanıcı 1",
                "Müzik önerin lüttfeeennn"
            )
        )
        shuffle.add(
            MessageModel(
                "https://i.tmgrup.com.tr/vogue/original/20-03/19/kimkardashian_89801233_517300542285453_8830787717473565869_n.jpg",
                "Kullanıcı 2",
                "Erkekler yazmasın"
            )
        )
        shuffle.add(
            MessageModel(
                "https://cdn1.ntv.com.tr/gorsel/a8WEjO3n8EGUawfTJKT3kw.jpg?width=371&height=470&mode=crop&scale=both&v=20210105074816283",
                "Kullanıcı 3",
                "Sadece Spor yapanlar"
            )
        )
        shuffle.add(
            MessageModel(
                "https://i.haberglobal.com.tr/storage/haber/2021/02/03/clubhouse-uygulamasini-hangi-unluler-kullaniyor-3_1612343898.jpg",
                "Kullanıcı 4",
                "Evi arabası olmayanda ne biliyim"
            )
        )
        shuffle.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 13",
                "Yazacaksan yaz"
            )
        )
        shuffle.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 14",
                "Oldu bu iş "
            )
        )
        shuffle.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 15",
                "Oldu bu iş "
            )
        )
        shuffle.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 16",
                "Oldu bu iş "
            )
        )
        shuffle.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 17",
                "Oldu bu iş "
            )
        )
        shuffle.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 18",
                "Oldu bu iş "
            )
        )
        shuffle.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 19",
                "Oldu bu iş "
            )
        )
        shuffle.add(
            MessageModel(
                "https://i2.cnnturk.com/i/cnnturk/75/630x0/5ac72b5cae784911cc6ebfef.jpg",
                "Kullanıcı 20",
                "Oldu bu iş "
            )
        )
        return shuffle
    }

    fun getChips(): ArrayList<ChipModel> {
        val chips = ArrayList<ChipModel>()
        chips.add(ChipModel("Spor"))
        chips.add(ChipModel("Makyaj"))
        chips.add(ChipModel("Film"))
        chips.add(ChipModel("Fitness"))
        chips.add(ChipModel("Zibab"))
        chips.add(ChipModel("Ivjj"))
        return chips
    }

    fun followingList(): ArrayList<FollowModel> {
        val follow = ArrayList<FollowModel>()
        follow.add(
            FollowModel(
                "data:image/jpeg;base64,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",
                "Sema"
            )
        )
        follow.add(
            FollowModel(
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSSuyIg5XWJQP6MpD4KxB7oFE8Rhe23UblYSszGkuyuz5YxNxcfgTbjTgP7oqlaSZYeOsQ&usqp=CAU",
                "Dilan"
            )
        )
        follow.add(
            FollowModel(
                "https://img.tozlu.com/Uploads/UrunResimleri/Thumb/tek-cepli-erkek-t-shirt-f288.jpg",
                "Emre"
            )
        )
        follow.add(
            FollowModel(
                "https://media-exp1.licdn.com/dms/image/C4E03AQEwbv0c6jelKQ/profile-displayphoto-shrink_200_200/0/1517052689818?e=1623283200&v=beta&t=f41asrY-RA2VcLXYVJdpVOSA9BlLN60v13gM2NEN4hg",
                "Kiymet"
            )
        )
        follow.add(
            FollowModel(
                "data:image/jpeg;base64,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",
                "Gamze"
            )
        )
        follow.add(
            FollowModel(
                "https://pbs.twimg.com/profile_images/1126074584632123393/z1amB79w_400x400.jpg",
                "Selma"
            )
        )

        return follow
    }
}