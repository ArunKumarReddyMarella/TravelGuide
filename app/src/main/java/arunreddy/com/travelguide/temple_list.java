package arunreddy.com.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class temple_list extends AppCompatActivity {
    ListView list;
    public static String[] temples={"Badrinath Temple",
            "Sun Temple",
            "Brihadeeswara Temple",
            "Somnath Temple",
            "Kedarnath Temple",
            "Sanchi Stupa",
            "Ramanathaswamy Temple",
            "Vaishno Devi Temple",
            "Gangotri Temple",
            "Golden Temple"};
    public static String[] address={
            "Shree Badrinath Temple, Badri to Mata Murti road, Badrinath, Uttarakhand 246422",
            "Konark Sun Temple, Konark, Odisha 752111",
            "Brihadeeswara Temple, Membalam Rd, Balaganapathy Nagar, Thanjavur, Tamil Nadu 613007",
            "Shree Somnath Jyotirlinga Temple, Somnath Mandir Rd, Veraval, Gujarat 362268",
            "Kedarnath Temple, Kedarnath, Uttarakhand 246445",
            "Sanchi Stupa, distt, Sanchi, Madhya Pradesh 464661",
            "Rameswaram, Tamil Nadu 623526",
            "Mata Vaishno Mandir, Sardar Bazar, Jammu Cantt, Jammu, Jammu and Kashmir",
            "Gangotri, Uttarakhand 249135",
            "Golden Temple Rd, Atta Mandi, Katra Ahluwalia, Amritsar, Punjab 143006"
    };
    public static Integer[] images={
      R.drawable.badrinathtemple,
            R.drawable.suntemple,
            R.drawable.brihadeeswaratemple,
            R.drawable.somnathtemple,
            R.drawable.kedarnathtemple,
            R.drawable.sanchistupatemple,
            R.drawable.ramanathaswamytemple,
            R.drawable.vaishnodevitemple,
            R.drawable.gangotritemple,
            R.drawable.goldentemple
    };
    public static String[] description={
            "The temple is located in Garhwal hill tracts along the banks of the Alaknanda River in Chamoli district in Uttarakhand. The hill tracts are located 3,133 m (10,279 ft) above the mean sea level. The Nar Parbat mountain is located opposite to the temple, while the Narayana Parbat is located behind the Neelkanth peak.\n" +
                    "\n" +
                    "The temple has three structures: the Garbhagriha (sanctum), the Darshan Mandap (worship hall), and Sabha Mandap (convention hall). The conical-shaped roof of the sanctum, the garbhagriha, is approximately 15 m (49 ft) tall with a small cupola on top, covered with a gold gilt roof. The facade is built of stone and has arched windows. A broad stairway leads up to the main entrance, a tall, arched gateway. Just inside is a mandap, a large, pillared hall that leads to the sanctum, or main shrine area. The walls and pillars of the hall are covered with intricate carvings.",
            "Dedicated to the Hindu Sun God Surya, what remains of the temple complex has the appearance of a 100-foot (30 m) high chariot with immense wheels and horses, all carved from stone. Once over 200 feet (61 m) high, much of the temple is now in ruins, in particular the large shikara tower over the sanctuary; at one time this rose much higher than the mandapa that remains. The structures and elements that have survived are famed for their intricate artwork, iconography, and themes, including erotic kama and mithuna scenes. Also called the Surya Devalaya, it is a classic illustration of the Odisha style of Architecture or Kalinga Architecture.\n" +
                    "\n" +
                    "The cause of the destruction of the Konark temple is unclear and still remains a source of controversy. Theories range from natural damage to deliberate destruction of the temple in the course of being sacked several times by Muslim armies between the 15th and 17th centuries. This temple was called the \"Black Pagoda\" in European sailor accounts as early as 1676 because it looked a great tiered tower which appeared black. Similarly, the Jagannath Temple in Puri was called the \"White Pagoda\".",
            "Brihadishvara temple, also called Rajarajeswaram or Peruvudaiyār Kōvil, is a Hindu temple dedicated to Shiva located in South bank of Kaveri river in Thanjavur, Tamil Nadu, India. It is one of the largest South Indian temples and an exemplary example of a fully realized Tamil architecture. It is called as Dakshina Meru (Meru of south). Built by Tamil king Raja Raja Chola I between 1003 and 1010 AD, the temple is a part of the UNESCO World Heritage Site known as the \"Great Living Chola Temples\", along with the Chola dynasty era Gangaikonda Cholapuram temple and Airavatesvara temple that are about 70 kilometres (43 mi) and 40 kilometres (25 mi) to its northeast respectively.\n" +
                    "\n" +
                    "The original monuments of this 11th-century temple were built around a moat. It included gopura, the main temple, its massive tower, inscriptions, frescoes, and sculptures predominantly related to Shaivism, but also of Vaishnavism and Shaktism traditions of Hinduism. The temple was damaged in its history and some artwork is now missing.",
            "The site of Somnath has been a pilgrimage site from ancient times on account of being a triveni sangam (the confluence of three rivers: Kapila, Hiran and the mythical Saraswati). Soma, the Moon god, is believed to have lost his lustre due to a curse, and he bathed in the Sarasvati River at this site to regain it. The result is the waxing and waning of the moon, no doubt an allusion to the waxing and waning of the tides at this seashore location. The name of the town Prabhas, meaning lustre, as well as the alternative names Someshvar and Somnath (\"the lord of the moon\" or \"the moon god\") arise from this tradition.\n" +
                    "\n" +
                    "According to popular tradition documented by J. Gordon Melton, the first Shiva temple at Somnath is believed to have been built at some unknown time in the past. The second temple is said to have been built at the same site by the \"Yadava kings\" of Vallabhi around 649 CE. In 725 CE, Al-Junayd, the Arab governor of Sindh is said to have destroyed the second temple as part of his invasions of Gujarat and Rajasthan. The Gurjara-Pratihara king Nagabhata II is said to have constructed the third temple in 815 CE, a large structure of red sandstone.",
            "A folk legend about Panch Kedar relates to the Pandavas, the heroes of the Hindu epic Mahabharata. The Pandavas defeated and slayed their cousins — the Kauravas in the epic Kurukshetra war. They wished to atone for the sins of committing fratricide (gotra hatya) and Brāhmanahatya (killing of Brahmins — the priest class) during the war. Thus, they handed over the reins of their kingdom to their kin and left in search of lord Shiva and to seek his blessings. First, they went to the holy city of Varanasi (Kashi), believed to be Shiva's favourite city and known for its Kashi Vishwanath Temple. But, Shiva wanted to avoid them as he was deeply incensed by the death and dishonesty at the Kurukshetra war and was, therefore, insensitive to Pandavas' prayers. Therefore, he assumed the form of a bull (Nandi) and hid in the Garhwal region.\n" +
                    "\n" +
                    "Not finding Shiva in Varanasi, the Pandavas went to Garhwal Himalayas. Bhima, the second of the five Pandava brothers, then standing astride two mountains started to look for Shiva. He saw a bull grazing near Guptakashi (“hidden Kashi” — the name derived from the hiding act of Shiva). Bhima immediately recognized the bull to be Shiva. Bhima caught hold of the bull by its tail and hind legs. But the bull-formed Shiva disappeared into the ground to later reappear in parts, with the hump raising in Kedarnath, the arms appearing in Tungnath, the face showing up at Rudranath, the nabhi (navel) and stomach surfacing in Madhyamaheshwar and the hair appearing in Kalpeshwar. ",
            "Sanchi is a Buddhist complex, famous for its Great Stupa, on a hilltop at Sanchi Town in Raisen District of the State of Madhya Pradesh, India. It is located in 46 kilometres (29 mi) north-east of Bhopal, capital of Madhya Pradesh.\n" +
                    "\n" +
                    "The Great Stupa at Sanchi is one of the oldest stone structures in India, and an important monument of Indian Architecture. It was originally commissioned by the Mauryan emperor Ashoka in the 3rd century BCE. Its nucleus was a simple hemispherical brick structure built over the relics of the Buddha. It was crowned by the chhatri, a parasol-like structure symbolising high rank, which was intended to honour and shelter the relics. The original construction work of this stupa was overseen by Ashoka, whose wife Devi was the daughter of a merchant of nearby Vidisha. Sanchi was also her birthplace as well as the venue of her and Ashoka's wedding. In the 1st century BCE, four elaborately carved toranas (ornamental gateways) and a balustrade encircling the entire structure were added. The Sanchi Stupa built during Mauryan period was made of bricks. The composite flourished until the 11th century.",
            "According to the Ramayana, Rama, who is the seventh avatar of the god Vishnu, prayed to the god Shiva to absolve him of the sin of killing a Brahmin committed during the war against the Rakshasa king Ravana (who was a brahmin, son of a vedic rishi) in Sri Lanka. Rama wanted to have a large lingam to worship Shiva. He directed Hanuman, the lieutenant in his army, to bring a lingam from the Himalayas. When Hanuman was delayed in bringing the lingam, rama built a small lingam out of the sand available in the seashore, which is believed to be the lingam in the sanctum. The primary deity of the temple is Ramanathaswamy (Shiva) in the form of lingam. There are two lingams inside the sanctum - one built by Rama, from sand, residing as the main deity, Ramalingam and the one brought by Hanuman from Kailash called Vishwalingam. Rama instructed that the Vishwalingam should be worshipped first since it was brought by Hanuman - the tradition continues even today.",
            "The Vaishno Devi Temple is an important Hindu temple dedicated to Vaishno Devi located in Katra at the Trikuta Mountains within the Indian Union territory of Jammu and Kashmir. The temple is one of the 108 Shakti Peethas dedicated to Durga, who is worshipped as Vaishno Devi. It is one of the most visited pilgrimage centers of India. Every year millions of visitors visit the temple. During festivals like Navaratri, the count even increases to one crore visitors. Vaishno Devi Temple is one of the richest temples in India. Authors Michael Barnett and Janice Gross Stein says, \"Mata Vaishno Devi Shrine in Jammu has an annual receipts of about $16 million, mainly from offerings by devotees\".\n" +
                    "\n" +
                    "The temple is sacred to all Hindus and Sikhs. Many prominent saints such as Guru Gobind Singh Ji and Swami Vivekananda have visited the temple.\n" +
                    "\n" +
                    "Navaratri and Diwali are the two most prominent festivals celebrated in the Vaishno Devi Temple. The temple was included in the Jammu and Kashmir state government Act No. XVI/1988, and known as Shri Mata Vaishno devi Shrine Act. The committee nominated by the state government administers the temple and has nine members on its board.",
            "According to this legend, King Sagara, after slaying the demons on earth decided to stage an Ashwamedha Yajna as a proclamation of his supremacy. The horse which was to be taken on an uninterrupted journey around the earth was to be accompanied by the King's 60,000 sons born to Queen Sumati and one son Asamanja born of the second queen Kesani. Indra, supreme ruler of the gods feared that he might be deprived of his celestial throne if the \"Yajna\" (worship with fire) succeeded and then took away the horse and tied it to the ashram of Sage Kapila, who was then in deep meditation. The sons of the King Sagara searched for the horse and finally found it tied near the meditating sage. Sixty thousand angry sons of King Sagara stormed the ashram of sage Kapila. When he opened his eyes, the 60,000 sons had all perished, by the curse of sage Kapila. Bhagiratha, the grandson of King Sagar, is believed to have meditated to please the Goddess Ganga enough to cleanse the ashes of his ancestors, and liberate their souls, granting them salvation or Moksha.",
            "The Golden Temple is spiritually the most significant shrine in Sikhism. It became a center of the Singh Sabha Movement between 1883 and 1920s, and the Punjabi Suba movement between 1947 and 1966. In the early 1980s, the Gurdwara became a center of conflict between the Indian government led by Indira Gandhi, some Radical Sikh groups and a movement led by Jarnail Singh Bhindranwale. In 1984, Prime Minister Indira Gandhi sent in the Indian Army as part of Operation Blue Star, leading to deaths of over 1,000 soldiers and civilians, as well as causing much damage to the Gurdwara and the destruction of Akal Takht. The Gurdwara complex was rebuilt again after the 1984 damage.\n" +
                    "\n" +
                    "The Golden Temple is an open house of worship for all people, from all walks of life and faith. It has a square plan with four entrances, has a circumambulation path around the pool. The complex is a collection of buildings around the sanctum and the pool.One of these is Akal Takht, the chief center of religious authority of Sikhism. Additional buildings include a clock tower, the offices of Gurdwara Committee, a Museum and a langar – a free Sikh community run kitchen that serves a simple vegetarian meal to all visitors without discrimination. Over 100,000 people visit the holy shrine daily for worship. The Gurdwara complex has been nominated as a UNESCO World Heritage Site, and its application is pending on the tentative list of UNESCO."
    };

    List<detailview> hotelDetailList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temple_list);
        list=findViewById(R.id.templeList);
        hotelDetailList=new ArrayList<>();
        for(int i=0;i<10;i++){
            hotelDetailList.add(new detailview(images[i],temples[i],"5:00AM-10:00PM",description[i],address[i]));
        }
        custom_list adapter=new custom_list(this,temples,images,hotelDetailList);
        list.setAdapter(adapter);
    }
}