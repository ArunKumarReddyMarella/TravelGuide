package arunreddy.com.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class  amusementparks_list extends AppCompatActivity {
    ListView list;
    public static String[] amusementparks={
      "Imagica Adlabs",
      "Kindom Of Dreams",
      "Wonder La Water Park",
      "Ramoji Film City",
      "Essel World",
      "Della Adventure Park",
      "Nicco Park",
      "Appu Ghar",
      "Queens Land",
       "Aquatica"
    };
    public static String[] address={
            "Imagicaa, No. 30 31, State Highway 92 near Lonavla, Sangdewadi, Khopoli, Maharashtra 410203",
            "Kingdom of Dreams, Auditorium Complex, Sridevi Road, near IFFCO Metro Station, Sector 29, Gurugram, Haryana 122001",
            "Wonderla Amusement Park, Hyderabad, Nehru Outer Ring Road Exit No. 13, Raviryal, Telangana 501510",
            "Ramoji Film City, Ramoji Film City Main Rd, Hyderabad, Telangana 501512",
            "Essel world Amusement Park, Gorai, Mumbai, Maharashtra",
            "Della Adventure Park, Plot No. 130-1, Lonavala, Kunegaon, Maharashtra 410401",
            "Nicco Park, Jheel Meel, Salt Lake Bypass, HM Block, Sector IV, Bidhannagar, Kolkata, West Bengal 700106",
            "Appu Ghar, Appu Ghar Marg, Behind Huda City Metro Station, Sector 29, Gurugram, Haryana 122009",
            "Queensland Amusement Park, Chennai-Bengaluru Highway Palanjur Sembarambakkam, Chennai, Tamil Nadu 600123",
            "Aquatica, Kouchpukur,P.O Hathgachia,P.S. :K.L.C, Near Rajarhat Township, Kolkata, West Bengal 700156"
    };
    public static Integer[] images={
            R.drawable.imagicaadlabs,
            R.drawable.kingdomofdreams,
            R.drawable.wonderlawaterpark,
            R.drawable.ramojifilmcity,
            R.drawable.esselworld,
            R.drawable.dellaadventurepark,
            R.drawable.niccopark,
            R.drawable.appughar,
            R.drawable.queensland,
            R.drawable.aquatica
    };
    public static String[] description={
            "Endearingly known as \"India's Disneyland\", Adlabs Imagica is the largest theme park of the country situated in Mumbai. Inaugurated in 2013 and sprawling over a humongous area of 300 acres, the Adlabs Imagica is a one stop destination for all water cum adventure activities. Besides, it also boasts of a plethora of restaurants and club both for luxury dining and binge eating.",
            "The Kingdom of Dreams, also known as KOD sits majestically in Gurugram (Previously Gurgaon) and is India's first live entertainment, leisure and theatre destination. It is a magnificent structure and glitters merrily in sector 29. It offers visitors a taste of contemporary and modern India through the means of interactive tableaus, galleys, and arts.\n" +
                    "\n" +
                    "Inside the Kingdom of Dreams, Culture Gully, India's first-ever skydome has stalls capturing the culture of fourteen different states with local fine arts, cuisines and street arts. With two international standard theatres and advanced state-of-art technology, it promises to take you on a mystical and unforgettable journey of diverse culture, lifestyle, and traditions of different parts of India.  \n" +
                    "\n" +
                    "Sprawling over a massive area of six acres, the leisure and entertainment destination was inaugurated in September 2010. With a construction cost of INR 2 billion, this grand centre is run and organised by the Great Indian Nautanki Company(GINC). Many superstars are associated with the Kingdom of Dreams, with Shahrukh Khan being the brand ambassador. It hosts acclaimed musicals and theatre productions like 'Jhumroo' and Zangura which is the biggest Bollywood musical ever.",
            "Oysters Beach Water Park is a water themed park with a number of rides, slides and pools including thunderstorm, pirate station, torpedo, rapid racer, cruiser, lazy river and rain dancing, etc. to suit every age group and everyone's preference. It is a perfect recreational centre to visit on a hot sunny day for family outings. The park has enough facilities to make their guests feel comfortable and offer a memorable experience.",
            "A place that is perfect for all the lovers of cinema and Bollywood! Set up by Ramoji Rao, the head of Ramoji group in 1991, Ramoji Film City is a spectacular getaway a little outside the city of Hyderabad. It is spread over 2500 acres and has been certified as the World's largest Film Studio Complex by the Guinness Book of World Records. Ramoji Film City can accommodate 20 film units at one go and has various shooting locations including London Street, Hollywood signage, Japanese gardens, airport, hospital, landscapes and buildings as well as laboratories. Being one of the most popular places to visit in Hyderabad, one can reach Ramoji Film City through a number of packaged tours and buses that leave regularly from the city.\n" +
                    "\n" +
                    "Ramoji Film City is a fun and diverse venue where you can indulge in a number of activities ranging from film city tours to adventure sports and toy train rides to a number of gardens. Smaller renditions of famous monuments in the country such as the Amer Palace are also present here. What's more, you can also stroll through a number of other sets and settings such as royal courts and other locations that have drawn inspiration from different architectures throughout the world. If you decide to visit this destination, after all, be sure to keep aside an entire day for this fun-filled location!",
            "One of the most famous and popular amusement parks in the country, Essel World is located in Gorai, close to the capital of Maharashtra, Mumbai. EsselWorld and Water Kingdom together make one of Asia's largest amusement parks. They expand over an area of 64 acres and are frequented by locals and non-locals from all age groups, especially kids. With some exciting rides and entertainment, Essel World and Water Kingdom are a favourite summer destination for many families. One can plan a day-long picnic or stay overnight at one of the hotels nearby to explore both the amusement parks. For tourists visiting the state capital, a visit to Essel World is a must. For many of the adults going to Essel World is synonymous with childlike enthusiasm and nostalgia.\n" +
                    "\n" +
                    "The landscaped interiors of the amusement parks are what makes them popular. The amusement parks have also been featured in many TV serials and Bollywood movies. Essel World has also been awarded the National Award of Excellence, Most Innovative Promotional Activity and the Award for the Best Variety and Number of Rides by the Indian Association of Amusement Parks & Industries.",
            "Della Adventure Park is a fun amusement cum waterpark based in Lonavala. Boasting of a plethora of activities including Aqua Zorb, swoop swing, flying fox, rappelling, paintball, buggy ride, bull ride, land zorbing etc, the park also has a nightlife club and several restaurants both for fine dine and binge eating.",
            "Nicco Park is an amusement park frequently visited for entertainment and recreational purposes. It is also called the \"Disney Land of West Bengal\" and attracts visitors in large numbers throughout the year. The park functions efficiently on solar energy that causes no pollution. Every aspect of the rides here is appropriately explained at the beginning for the visitors to learn. So, one will find charts and boards displayed at the entrance of every ride illustrating the principles used to ensure a safe and fun ride. The park has numerous amusement rides and shows which are not just recreational but educational also. It is, therefore, a favourite amongst parent and youngsters who often prefer the attraction as a picnic spot.\n" +
                    "\n" +
                    "Nicco Park has been functioning as an amusement park for the past 20 years. It is the first amusement park in India that has obtained recognition from Quality Management System, Safety Management System and Environment Management System. Nicco Park is also the first amusement park in the world to have obtained a 'Social Accountability' certificate. Those looking for an entertaining, educational and a recreational escape must head to the Nicco Park.",
            "Appu Ghar was the first amusement park of the country, first opening its doors in 1984, commemorating the 1982 Asian Games. The lovable mascot of the games 'Appu' was the mascot of the park. While it was running till 2008, it shut down temporarily and was reopened in Gurgaon in 2014 behind Huda City Centre where it houses the Oyster Beach and Great India Place, Gurgaon. \n" +
                    "\n" +
                    "Their Skyfall is the tallest ride in India, and along with rides like OMG (Oh My Gurgaon), Rapid Racer, Typhoon Tunnel and Lazy and Crazy River, you are sure to experience some real thunder! You can also have a feel of an actual beach while lazying on the loungers put up next to the wave pool or even avail of privacy while enjoying the activities of the park in your personal cabana. It has a wonderful food court that serves up refreshing mocktails and has four multi-speciality restaurants - Southern Bay, Aroma Coast, Tidal Tadka and Langkawi Bay. Head out to Appu Ghar to snap out from the daily buzz and din of the city and spend a day all to yourself with your loved ones in the super-entertaining and relaxing ambience of this place!",
            "Located in Poonamallee in Chennai, Queens Land Amusement Park is spread over an area of 70 acres. Boasting of 51 magnanimous rides both water and regular, the park also has a play area, a green space and an enormous food court.",
            "Aquatica is a water theme park and resort in Kolkata having many exciting themed rides, slides, entertainment and recreational activities for all their guests. The water park occupies over 75000 square feet of area and provides for a pleasant respite from the scorching summer heat. They provide lockers for the visitors to keep their belongings securely. With many rides one can choose from, the young and the old, both are bound to find something to suit their requirement. Whether one wants to laze around in the pool or go for a thrilling water slide, there's something for everyone here. In between the ride, if one feels a need for a snack they can head to the restaurant that serves a variety of local and international cuisine.\n" +
                    "\n" +
                    "The Aquatica Resort has all facilities and amenities to make their guests' stay comfortable and memorable. They have luxurious rooms to accommodate solo travellers and families. 24x7 room service, parking services, free Wi-Fi etc. are some of the facilities they provide. Aquatica is also a favourite venue for events like birthdays, weddings, engagement parties, anniversary parties, team outings and award ceremonies. They also arrange for live shows and corporate events on a grand level to ensure the guests have a fabulous time. It is a perfect picnic attraction to spend a day having fun with the family."

    };
    List<detailview> hotelDetailList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amusementparks_list);
        list=findViewById(R.id.amusementParkList);
        hotelDetailList=new ArrayList<>();
        for(int i=0;i<10;i++){
            hotelDetailList.add(new detailview(images[i],amusementparks[i],"10:00AM-5:00PM",description[i],address[i]));
        }
        custom_list adapter=new custom_list(this,amusementparks,images,hotelDetailList);
        list.setAdapter(adapter);
    }
}