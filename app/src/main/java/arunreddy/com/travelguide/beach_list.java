package arunreddy.com.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class beach_list extends AppCompatActivity {
    ListView list;
    public static String[] beaches={
            "Varkala Beach",
            "Palolem Beach",
            "Arambol Beach",
            "Baga Beach",
            "Auroville Beach",
            "Tarkarli Beach",
            "Radhanagar Beach",
            "Chandipur Beach",
            "Butterfly Beach",
            "Alappuzha Beach"
    };
    public static String[] address={
            "Varkala Beach, Kerala",
            "Palolem Beach, Goa",
            "Arambol Beach, Arambol, Goa 403519",
            "Baga Beach, Goa 403519",
            "Auroville Beach, Tamil Nadu 605101",
            "Tarkarli Beach, Maharashtra",
            "Radhanagar Beach, Andaman and Nicobar Islands",
            "Chandipur Beach, Balasore, Odisha 756025",
            "Butterfly Beach, Goa 403702",
            "Alappuzha Beach, Kerala"
    };
    public static Integer[] images={
            R.drawable.varkalabeach,
            R.drawable.palolembeach,
            R.drawable.arambolbeach,
            R.drawable.bagabeach,
            R.drawable.aurovillebeach,
            R.drawable.tarkarlibeach,
            R.drawable.radhanagarbeach,
            R.drawable.chandipurbeach,
            R.drawable.butterflybeach,
            R.drawable.alappuzhabeach
    };
    public  static String[] description={
      "Varkala Beach, also known as Papanasham Beach is a beach situated in Varkala Town of Varkala Municipality in Thiruvananthapuram District, Kerala, India. The beach skirts the Arabian Sea, part of the Indian Ocean. The word \"papanasham\" means to wash away sins.\n Varkala beach is the only place in southern Kerala where cliffs are found adjacent to the Arabian Sea. These cliffs are of tertiary sedimentary formation, and named by geologists as Varkala Formation. They are a geological monument as recorded by the Geological Survey of India. Water spouts and spas occur on the sides of these cliffs.\n The Janardana Swami Temple is situated near the Beach. It is known for a 10-day festival held twice a year, called Arattu.\n" +
              "\n" +
              "Sivagiri Mutt is another attraction, located atop the Sivagiri hill. Train service is available at Varkala Sivagiri Railway Station.\n" +
              "\n" +
              "\n" +
              "Panoramic view of Varkala beach cliff\n" +
              "Varkala beach has adventure and leisure activities such as boat riding, parasailing, jetting, and horse-riding. There are also restaurants and cafes",
            "Palolem Beach is situated in Canacona in southern Goa, India. The beach attracts many international tourists, mainly during the winter season between November and March. It is considered to be one of the region's most beautiful beaches.\n Palolem Beach is largely unspoiled and is inhabited by both local fishermen and by foreign tourists who live in shacks along the shore or in the main village itself. It is about one mile (approximately 1.61 km) long and is crescent-shaped; one can view the entire beach from either end. Both ends of the beach consist of rocks jutting out into the sea. The depth of the sea increases gradually, being shallowest at the northern end of the beach, making it safe for average swimmers, and the currents are not fast.\n The nearest airport is Dabolim Airport, around 67 km away. The nearest railway station is at Canacona, which can be reached from the major Madgoan junction railway station in just 30 mins. There are bus services every half an hour between Palolem beach and the Kadamba Transport Corporation (KTC) Bus Depot in Margao. The nearest KTC depot is at Canacona.",
            "Arambol is a traditional fisherman village, located approximately a 90 minutes drive from Dabolim Airport (GOI) within the Pernem administrative region of North Goa, India. The beach attracts many international tourists, mainly during the winter season between November and March. Arambol beach is considered to be one of the most beautiful beaches in Goa, bordering Keri Beach to the north and Mandrem Beach to the south. Located 43 km (27 mi) north of Goa's capital city of Panaji, Arambol has a population of around 5,300.\nArambol's warmest month of the year is usually April with an average high of 34°C. The sunniest months are January, February, April, May and December with around 10 hours of sunshine per day. The dry period in Arambol corresponds with its main tourist season, from December to April, which normally doesn't see any rain. The warmest sea temperature is between April and June with an average high of 29°C.\nA short walk north off the main beach is a smaller beach with a \"fresh water lake\" close to the sea. The jungle valley, enclosed between low hills, hides a banyan tree. Adjoining the banyan tree there is a stone sculpture created by an American conceptual and land art artist, Jacek Tylicki, titled Give if you can - Take if you have to (also called The Money Stone).[citation needed] It has become a pilgrimage destination.\n" +
                    "\n" +
                    "Another attraction is Arambol Drum Circle & Sunset Beach Market, one of the most unique flea markets in Goa. It starts a few hours before the sunset where travelers from all over the world sell their hand made creations. More than just a market, it is a party on the beach where people bring their drums, hand-pans, Didgeridoo (didgeridoo) and meet here everyday to make music as the sun sets. It is common to see performers at this time with their juggling balls, hula hoops, poi and many other props. With things like handmade clothes, food, jewelry, glass pipes – this market looks like it is right out of a music festival.\n" +
                    "\n" +
                    "Due to the composition of both national and international musicians, Arambol is home to a rich live music scene, dominated by Gypsie-Fusion bands.",
            "Baga a seaside town in Bardez, Goa, India. It comes under the jurisdiction of Calangute, which is 2 km south. Baga is known for its popular beach and Baga Creek. It is visited by thousands of tourists annually.\nBaga Beach is a popular beach and tourist destination in North Goa. Baga is located at the north end of the contiguous beach stretch that starts from Sinquerim, Candolim, leads to Calangute, and then to Baga.\n" +
                    "\n" +
                    "\n" +
                    "Dolphins can be located at around 1–2 km from the shoreline\n" +
                    "\n" +
                    "Parasailing in Baga Beach\n" +
                    "The beach contains rows of shacks and fishing boats, and at high tide the beach is narrow.\n" +
                    "\n" +
                    "The beach is named after the Baga Creek, which empties into the Arabian Sea at the north end of the beach.\n" +
                    "\n" +
                    "Baga Beach is also famous for water sports, such as parasailing and banana rides, and dolphin cruises. In Baga Beach, new parking has been constructed for around 800 cars or more, and there is baga creek bridge which connects northern part like Arpora, Anjuna etc..",
            "Tucked inside the neighbouring township of Auroville, this beach is the perfect spot for quiet introspection. A 30-minute-drive from Pondicherry, it has all the tranquillity in the world you can ask for. There are no restaurants, shops, changing rooms or parking space&mdash;but you will find clear blue water and breathtaking sunsets and sunrises. Located near the Auroville bus stop on the East Coast Road, it is mostly frequented by locals and fishermen. Due to the large waves, swimming on the beach can be a bit of a challenge. Auroville beach, popularly referred to as Auro beach, is close to Auroville, a popular Pondicherry sightseeing destination.\n" +
                    "\n" +
                    "It is situated at the right side of the ECR, opposite to the road leading to Auroville. Located about 12 kms from the main Pondicherry town, its shallow waters and small waves make it an ideal place for swimming. As the beach&rsquo;s slope is gentle, swimming is one of the best things to do at the Auroville beach for expert as well as novice swimmers. The shingle and shells in different colors get deposited here, making the beach all the more beautiful. It is a fairly popular destination and on weekends it can get rather crowded, whereas on weekdays it is relatively less so. Visited by locals as well as tourists in huge numbers, it is one of the most popular beaches in Pondicherry.",
            "Tarkarli is a village in Malvan taluka in Sindhudurg district in the Indian state of Maharashtra. It is a beach destination and remote place in southern Maharashtra. Few years ago, Tarkarli beach is declared as a Queen Beach of Konkan region. Monthly, Thousands of tourists are visiting this place to rejuvenate and enjoy thrill of water sports activities. All Watersports activities in Tarkarli are going on as per international safety of standards and under guidance of professional instructor(Dive Master) with modern safety equipment. Many scuba diving operators running this activities near Tsunami island, Devbagh because of shallow water and low life risk.\n" +
                    "\n" +
                    "\n" +
                    "Raapan at Tarkarli\n" +
                    "The local people in Tarkarli renovate their homes and converted in to bed and breakfast scheme. Some of these are recognized by government agency known as MTDC(Maharashtra Tourism Development Corporation). MTDC has own resort in Tarkarli which is located exactly at beach. MTDC has also scuba diving training center. in Tarkarli where various scuba diving courses are conducted. To stay in Tarkarli various options are available. One can refer a website malvancity.com on which visitors can find out contact numbers of hotel owners and more details of home stays, hotels and resorts in tarkarli.",
            "Radhanagar Beach on the western coast, also known as Number 7 Beach, is one of the most popular beaches on Havelock and was named \"Best Beach in Asia\" by Time in 2004. Radhanagar beach also bagged the prestigious blue flag certification in 2020. A Blue Flag beach is an eco-tourism model endeavouring to provide the tourists or beachgoers clean and hygienic bathing water, facilities, safe and healthy environment. Other notable beaches include Elephant Beach on the northwest coast and Vijay Nagar Beach (No. 5), Beach No. 3 and Beach No. 1 on the east coast. Kalapathar is another famous beach.\n" +
                    "\n" +
                    "To reach Elephant beach one needs to take a boat from Havelock Island jetty. Another way to reach Elephant beach is via trekking. The major 3 beaches at Havelock Island are namely Radhanagar Beach, Elephant Beach and Kalapathar beach.",
            "Chandipur, (aka Chandipur-on-sea) is a sea resort in Balasore district of Odisha. The beach is about 16 km from Balasore and has been listed by Lonely Planet (world’s renowned travel expert) as one of world’s most unusual beaches.\nThe Chandipur coast has attained global popularity for its ‘Vanishing Sea’ phenomenon. Here one can literally see the sea disappear (read recede) by almost 5 to 6 kilometres everyday during low tide and then comes back at high tide. This rare event occurs twice a day.\nThe receding waters at low tide offer an excellent opportunity to walk into the sea, ride a bike or even drive a car! The exciting prospect of venturing fearlessly into the seabed attracts a lot of curious visitors to this beach.\n" +
                    "Chandipur is famous for its seafood – specially the prawns and pomfrets. So the next time you’re there, don’t forget to try some mouthwatering Odia-style fried prawns and pomfret in one of the small beach shacks.\nSand dunes, rocky coasts and verdant Casuarina trees make Chandipur one of the most spectacular seashores, lending the beach an air of romance and idyll. Unlike the bustling and more popular Puri beach, Chandipur is a relatively unexplored coastline. Relaxing on a tranquil patch of sand and watching the sea recede and advance with the tides is a delightful experience.\nChandipur is home to a wide range of biodiversity. Apart from a variety of fish species, the rare Horseshoe crab and tiny red crabs are often spotted on the beach.\nA portion of the beach, under the Defense Research and Development Organisation (DRDO), is the ITR of the Indian Army. Akash, Shaurya, Agni and Prithvi ballistic missiles have been launched from here. A scenic beach and missile launch site make for a unique combination.",
            "You can bag the best time of your vacation at Butterfly Beach which is north of Palolem Beach in Southern Goa. Enjoy your solitude, away from the rest of the world and also experience the wonderful aquatic life out in the open front of the beach.\n" +
                    "\n" +
                    "To reach here, you can hop on a ferry from Palolem or Agonda beaches as this beautiful and semi-circled beach is not approachable by any other means. For wider and punctuated experience, you can opt for a ship ride too. And if you are feeling too thrilled, you can try out trekking around the thick forest surrounding this beach. \n" +
                    "\n" +
                    "Butterfly beach is also popularly known as Honeymoon Beach as a lot of honeymooners and couples come here for a secluded vacation. You can spend your day with your partner by enjoying a picnic with wine.  You can also wait for the low tide period to witness wandering Sea urchins, redfish, goldfish, and sea cucumbers here. This is a unique sight that you will not get to explore anywhere else in entire Goa. Moreover, on one side, million butterflies dance and harbour over this beach and on the other, you get to catch a glimpse of dolphins in the middle of the sea.",
            "Alappuzha Beach is a beach in Alappuzha town and a tourist attraction in Kerala, India. Beach has an old pier which extend to sea is over 150 years old. Alappuzha beach host many events annually like Alappuzha beach festival, Sand art festival and many more.\nAlappuzha beach is one of the major tourist spot in Alappuzha town. Alappuzha Lighthouse situated near to the beach. Beach is accessible through various town roads and an elevated highway will passing by the beach as part of Alappuzha bypass in order to preserve the beauty of the area. Camel safaris was another attraction in beach which introduced a couple of years ago but it got banned by authorities.\nAlappuzha beach festival is a famous event organised as part of new year celebration. It's organised as an annual event in every year. Thousands of people gathers in the event includes from other district. Kerala's first international sand art festival and competition held on April 26-2015 in Alappuzha beach. Many national and international sand artists participated in event. The state tourism department and the Alleppey Foundation has jointly organised the event."
    };
    List<detailview> hotelDetailList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beach_list);
        list=findViewById(R.id.beachList);
        hotelDetailList=new ArrayList<>();
        for(int i=0;i<10;i++){
            hotelDetailList.add(new detailview(images[i],beaches[i],"9:00AM-5:00PM",description[i],address[i]));
        }
        custom_list adapter=new custom_list(this,beaches,images,hotelDetailList);
        list.setAdapter(adapter);
    }
}