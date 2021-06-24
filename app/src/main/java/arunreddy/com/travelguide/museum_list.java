package arunreddy.com.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaParser;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class museum_list extends AppCompatActivity {
    ListView list;
    public static String[] museums={
            "National Museum",
            "Indian Museum",
            "Government Museum",
            "Chhatrapati Shivaji Vastu Museum",
            "Shankar’s International Dolls Museum",
            "Salar Jung Museum",
            "National Rail Museum",
            "Calico Museum",
            "Dr. Bhau Daji Lad Museum",
            "Napier Museum"
    };
    public static String[] address={
            "National Museum, Janpath Rd, Rajpath Area, Central Secretariat, New Delhi, Delhi 110011",
            "Indian Museum, 27, Jawaharlal Nehru Rd, Fire Brigade Head Quarter, New Market Area, Dharmatala, Taltala, Kolkata, West Bengal 700016",
            "Government Museum, Government Maternity Hospital, Pantheon Rd, Egmore, Chennai, Tamil Nadu 600008",
            "Chhatrapati Shivaji Maharaj Vastu Sangrahalaya, 159-161, Mahatma Gandhi Road, Kala Ghoda, Fort, Mumbai, Maharashtra 400023",
            "Shankar's International Dolls Museum, 4, Bahadur Shah Zafar Marg, near Central Bank, Bahadur Shah Zafar Marg, Nehru House, New Delhi, Delhi 110002",
            "Salar Jung Museum, Salar Jung Rd, near Minar Function Hall, Darulshifa, Hyderabad, Telangana 500002",
            "National Rail Museum, Service Rd, Chanakyapuri, New Delhi, Delhi 110021",
            "The Calico Museum of Textiles, The Retreat, Airport Rd, Opp. Rani Sati Mandir, Jain Colony, Shahibag, Ahmedabad, Gujarat 380004",
            "Dr. Bhau Daji Lad Museum, 91 A, Rani Baug, Veer Mata Jijbai Bhonsle Udyan, 91 A, Dr Baba Saheb Ambedkar Rd, Byculla East, Mumbai, Maharashtra 400027",
            "Napier Museum, LMS Vellayambalam Rd, near Museum Junction, Kanaka Nagar, Nanthancodu, Thiruvananthapuram, Kerala 695033"

    };
    public static Integer[] images={
      R.drawable.nationalmuseum,
            R.drawable.indianmuseum,
            R.drawable.governmentmuseum,
            R.drawable.chhatrapatishivajivastumuseum,
            R.drawable.shankarsinternationaldollsmuseum,
            R.drawable.salarjungmuseum,
            R.drawable.nationalrailmuseum,
            R.drawable.calicomuseum,
            R.drawable.drbhaudajiladmuseum,
            R.drawable.napier_museum
    };
    public  static String[] description={
      "The National Museum, New Delhi, as we see it today, has an interesting beginning. The blueprint for establishing the National Museum in Delhi was prepared by the Maurice Gwyer Committee in May 1946. An Exhibition of Indian Art, consisting of selected artefacts from various museums of India was organized by the Royal Academy, London with the cooperation of Government of India and Britain. The Exhibition went on display in the galleries of Burlington House, London during the winter months of 1947-48. It was decided to display the same collection in Delhi, before the return of exhibits to their respective museums. An exhibition was organized in the the RashtrapatiBhawan (President's residence), New Delhi in 1949, which turned out to be a great success. This event proved responsible for the creation of the National Museum.\n" +
              "\n" +
              "The success of this Exhibition led to the idea that advantage should be taken of this magnificent collection to build up the nucleus collection of the National Museum. State Governments, Museum authorities and private donors, who had participated in the exhibition, were approached for the gift or loan of artefacts, and most of them responded generously. ",
            "The history of the origin and the growth of the Indian Museum is one of the remarkable events towards the development of heritage and culture of India.Founded in 1814 at the cradle of the Asiatic Society of Bengal (at the present building of the Asiatic Society, 1 Park Street, Kolkata), Indian Museum is the earliest and the largest multipurpose Museum not only in the Indian subcontinent but also in the Asia-Pacific region of the world.\n" +
                    "\n" +
                    "The movement, which was started in 1814, in fact was the beginning of a significant epoch initiating the socio-cultural and scientific achievements of the country. It is otherwise considered as the beginning of the modernity and the end of mediaeval era.\n" +
                    "\n" +
                    "With the foundation of Indian Museum in 1814, the Museum movement started rolling in India and through the years from then, got a new fillip and great momentum. Since then, it has so magnificently developed and culminated into the fruitful existence of more than 400 museums in the country.\n" +
                    "\n" +
                    "To appreciate the history of the origin and growth of the Indian Museum we are to travel back to the last quarter of the 18th century when Sir William Jones a profound scholar devoted his life to the service of India, founded the Asiatic Society in 1784 in Kolkata.\n" +
                    "\n" +
                    "The role of the Asiatic Society was to form a learning centre for the development of art and culture pertaining to the socio-cultural activities, entertaining people, disseminating knowledge and preserving the cultural as well as natural heritage of mankind for posterity within the geographical limits of Asia.\n" +
                    "\n" +
                    "Sir William Jones, the founder of the Asiatic Society, however, in his inaugural address did not refer to the foundation of a museum as part of the activities of the society.\n" +
                    "\n" +
                    "In 1796 the members of the Asiatic Society conceived an idea of establishing a Museum at a suitable place for the reception and preservation of the objects whatever it is performed by man or produced by nature.\n" +
                    "\n" +
                    "The idea got shape in the beginning of 1808 when society found itself in a position to occupy its premises erected at the corner of Park Street on a land granted by the Government.",
            "The Government Museum, Chennai, or the Madras Museum, is a museum of human history and culture located in the Government Museum Complex in the neighbourhood of Egmore in Chennai, India. Started in 1851, it is the second oldest museum in India after the Indian Museum in Kolkata and is the tenth oldest Museum in the World. It is particularly rich in archaeological and numismatic collections. It has the largest collection of Roman antiquities outside Europe. Among them, the colossal Museum Theatre is one of the most impressive.[1] The National Art Gallery is also present in the museum premises. Built in Indo-Saracenic style, it houses rare European and Asian painting of renowned artists, including that of Raja Ravi Varma.[2][3] It is the third largest museum in the world, and with 0.6 million visitors in 2018. It has the richest collections of bronze idols, 500 of them dating to 1000 BCE, in Asia.\nIn August 1778, the governor of Madras granted 43 acres for an estate to a civil servant, who, subsequently in 1793, assigned the grounds to a committee of 24 which then regulated the public amusements in the city. In 1821, the committee sold the main house and central garden space to E. S. Moorat, an Armenian merchant who, in turn, sold it back to the government in 1830. The government first used the buildings and the grounds as the collector's \"Cutcherry\" and later for the \"Central Museum.\"[5] The museum was originally established in a building on College Road in Nungambakkam in the year 1851 and was shifted to the present site in 1854",
            "Founded in the early 1900s, Chhatrapati Shivaji Maharaj Vastu Sangrahalaya is one of the premier cultural institutions in the country. On 14th August 1905, a number of prominent people of Bombay gathered at the Town Hall and resolved to erect a Memorial to the visit of the Prince of Wales (later King George V) in the form of a public Museum which, would be named after him. The meeting was attended by Sir Pherozeshah Mehta, Justice Badrudin Tyabji, Narotamdas Gokuldas, Justice Chandavarkar, Sassoon J. David and many other dignitaries known for their outstanding contribution in their respective fields and also in the development of the island of Bombay. The Foundation Stone of the Museum was laid by the Prince of Wales on 11th November 1905 and the Museum was named Prince of Wales Museum of Western India. For a long time people had also felt the need for a good museum in the city and finally the museum was established by the public contribution aided by the then Government of the Bombay Presidency.\n" +
                    "\n" +
                    "This memorial in the form of a museum was to be erected on the plot of land known as the Crescent Site on the southern tip of the island. The building was completed in 1914 but it opened to the public much later on 10th January, 1922. Until then it was used by the military as a hospital and for Children’s Welfare Exhibitions.\n" +
                    "\n" +
                    "Many things have changed since then. Bombay is now known as Mumbai and the name of the Prince of Wales Museum of Western India is changed to the Chhatrapati Shivaji Maharaj Vastu Sangrahalaya. Set against a well laid out garden which retains its original plan even today, the museum is an important Heritage building of the city.",
            "K. Shankar Pillai (1902–1989), noted cartoonist, set up Children's Book Trust, a pioneering work in the field of children's literature in India, in 1957. Later, a gift of a doll from a Hungarian diplomat gave Shankar the idea of collecting dolls from countries he visited. He often held exhibitions for poor children, and at one exhibition in Delhi, among the hundreds of visitors were the then Prime Minister Jawaharlal Nehru accompanied by his daughter Indira Gandhi. Indira was inspired and together with Shankar set up an international museum for dolls, eventually materializing on 30 November 1965.[1]\n" +
                    "\n" +
                    "The principal collection consists of gifts from Prime Minister, Jawaharlal Nehru, and many subsequent Prime Ministers, including Indira Gandhi and Rajiv Gandhi. Also several embassies and diplomatic missions in Delhi gifted dolls to the museum. Visiting dignitaries like Madame Tito, Queen Frederika of Greece, the Queen of Thailand, the sister of Shah of Iran, the wives of Presidents of Mexico and Indonesia and many others gifted dolls representing their respective nations[1][2][3]\n" +
                    "\n" +
                    "Dolls Museum is one of the most renowned museums in New Delhi which has a huge collections of dolls from across the globe. The renowned political cartoonist, K. Shankar Pillai (1902–1989) founded this museum in 1965 with thousand dolls. The museum covers an area of 5,184.5 square feet (481.66 m2). The former President of India, Dr. S. Radhakrishnan inaugurated the Dolls Museum and at the inauguration time the number of dolls was only 500. In between 1965 and in 1987, the number of dolls has risen to 5,000, a vast majority coming as gifts. Shankar Pillai was honoured with the Padma Vibhushan, India's second highest civilian award by Government of India in 1976.\n" +
                    "\n" +
                    "Today the volume has increased to 6,500 exhibits from almost 85 countries, adding to its international character.",
            "There are 39 galleries in the Museum spread over in three buildings viz., Central Block, Eastern Block (Mir Laiq Ali Khan Bhavan) and Western Block (Mir Turab Ali Khan Bhavan) on two floors. The Central Block with 26 galleries (ground floor 13 galleries, first floor 13 galleries), the Western Block with 7 galleries and the Eastern Block with 6 galleries.\n" +
                    "\n" +
                    "The museum has many coordinating sections such as the Education Wing, Chemical Conservation Laboratory, Photo section, Display section, Reception and a Sales counter. The museum security is being looked after by the Central Industrial Security Force.",
            "A Transport Museum was first proposed in 1962, under the advise of rail enthusiast Michael Graham Satow. The proposal took a concrete shape in 1970 and on 7 October 1971 the foundation stone was laid at the museum's present site in Chanakyapuri, New Delhi, by the then-President of India V. V. Giri.[3] The museum was inaugurated as the Rail Transport Museum in 1977 by Kamalapati Tripathi, the minister for public transportation.\n" +
                    "\n" +
                    "The museum was originally intended to be a part of a larger museum that covered the history of railways, roadways, airways, and waterways in India; however, this never happened and it was officially renamed the National Rail Museum in 1995.",
            "The Sarabhai Foundation galleries comprise the renowned Calico Museum of Textiles alongwith collections of sacred bronzes from south India, Jaina manuscripts, sculpture and objects; Indian miniature paintings; as well as other arts.\n" +
                    "The Calico Museum of Textiles was inspired by the pioneering art historian and philosopher Dr. Ananda Coomaraswamy. It was his suggestion to Gautam Sarabhai, chairman of the Calico Mills of Ahmedabad, that a textile museum and an institute be founded in the city, as it had been one of India’s leading textile production and trade centers since the 15th century. In 1949, the textile museum was founded by Gautam Sarabhai with the assistance of his sister Gira Sarabhai, and was inaugurated by Jawaharlal Nehru, India’s first prime minister.\n" +
                    "Initially a part of the Calico Mills complex in Ahmedabad, the Calico Museum of Textiles was shifted in 1982 to the Shahibaug premises of the Sarabhai Foundation. These premises, known to the Sarabhai family as The Retreat, included the palatial Sarabhai-ni-Haveli with its formal garden and water features, designed in the 1930s by Surendranath Kar of Shantiniketan for Ambalal and Sarladevi Sarabhai, the parents of Gautam and Gira Sarabhai. The Retreat also included a complex of buildings around an old swimming pool, which were enlarged and enhanced with carved wooden facades sourced from traditional Gujarati mansions of the region, all set around a courtyard or ‘chauk’. At the Retreat, therefore, the Calico Museum of Textiles and the Sarabhai Foundation collections came to comprise of two wings: the ‘Haveli’ in which were housed religious textiles, as well as south Indian bronzes, Jaina art, and Mughal and other miniature paintings; and the ‘Chauk’, which housed royal tents, carpets, furnishings and costumes of the Mughal and regional courts; textiles for India’s export trade; as well as a wide range of ethnographic textiles.",
            "Lord Elphinstone established the Central Museum of Natural History, Economy, Geology, Industry and Arts, the first museum in Bombay in 1855; George Buist took the major initiative for its inception. In 1857, it was closed to the public and its collection was shifted to the Town Hall. In 1858, George Birdwood was appointed curator of the museum. Soon, a committee was formed, comprising him, Bhau Daji Lad and Jaganath Shunkerseth to raise money for construction of a new building for the museum. The foundation of the new building was laid in 1862. It was built with the patronage of many wealthy Indian businessmen and philanthropists like David Sassoon, Sir Jamsetjee Jejeebhoy and Jaganath Shunkerseth.\nThe construction of the present building in Jijamata Udyan in Byculla started in 1862 and was completed in 1871.[2] The museum was opened on 2 May 1872 as The Victoria and Albert Museum, Bombay. In 1975, this museum was renamed as The Dr. Bhau Daji Lad Mumbai City Museum.\n" +
                    "\n" +
                    "In 2003, the Indian National Trust for Art and Cultural Heritage (INTACH) in collaboration with the Jamnalal Bajaj Foundation and the Municipal Corporation of Greater Mumbai undertook extensive refurbishment of the building.[3][4]\n" +
                    "\n" +
                    "After five years of painstaking and intensive work, the Museum reopened to the Public on 4 January 2008.",
            "The Napier Museum (also known as Government Art Museum) is an art and natural history museum situated in Thiruvananthapuram, India.[1] The architecture of the museum is a mix of Indian, Chinese, Kerala, and Mughal styles.[2] The Museum grounds also hold the famous Trivandrum Zoo, which is one of the oldest zoological gardens in India. The zoo was established in 1857 and is spread over 55 acres (220,000 m2) of land.\nThe museum was first established in 1855,[4] but demolished in 1874 to lay foundation for a new building, during the reign of Ayilyam Thirunal.[5] The new building was named after Lord Napier, the Governor of Madras from 1866–1872. The museum was designed by Robert Chisholm, the consulting Architect of the Madras Government, and the construction was completed in 1880. Napier Museum is a landmark in the city with its unique ornamentation and architectural style with gothic roof and minarets.[citation needed] The Indo-Saracenic structure also boasts a natural air conditioning system.[citation needed]\n" +
                    "\n" +
                    "Kerala's rich cultural heritage is in full display here. The museum was named after the former Madras Governor General, John Napier. Also known as Government Art Museum, the architectural style of museum is a mix of Indian, Chinese, Kerala and Mughal Schools of Architecture. The museum is situated in an expansive area which also houses the Sree Chitra Art Gallery and the Trivandrum Zoo."
    };
    List<detailview> hotelDetailList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum_list);
        list=findViewById(R.id.museumList);
        hotelDetailList=new ArrayList<>();
        for(int i=0;i<10;i++){
            hotelDetailList.add(new detailview(images[i],museums[i],"10:00AM-5:00PM",description[i],address[i]));
        }
        custom_list adapter=new custom_list(this,museums,images,hotelDetailList);
        list.setAdapter(adapter);
    }
}