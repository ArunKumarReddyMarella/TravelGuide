package arunreddy.com.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.*;

public class hotel_list extends AppCompatActivity {
    ListView list;
    public static  Integer[] images={
            R.drawable.tajpalace,
            R.drawable.ajantha,
            R.drawable.lemontreepremier,
            R.drawable.hotelasian,
            R.drawable.crownplaza,
            R.drawable.palmsprings,
            R.drawable.hotelgoldregency,
            R.drawable.comfortinthepresent,
            R.drawable.hotelnityamaharani,
            R.drawable.radisonbluplaza,
            R.drawable.hoteldreampalace,
            R.drawable.hotellilawathigrand
    };
    public static String[] hotels ={
            "Taj Palace",
            "Ajanta Hotel",
            "Lemon Tree Premier",
            "Hotel Asian",
            "Crowne Plaza",
            "Palm Springs",
            "Hotel Gold Regency",
            "Comfort inn The Present",
            "Hotel Nitya Maharani",
            "Radisson Blu Plaza",
            "Hotel Dream Palace",
            "Hotel Lilawati Grand",
    };
    public static String[] address={
            "Taj Palace, New Delhi, Taj Palace, 2, Sardar Patel Marg, Diplomatic Enclave, Chanakyapuri, New Delhi, Delhi 110021",
            "Hotel Ajantha,22-A, Mahatma Gandhi Road, Bangalore - 560001",
            "Plot No. 2, Survey No. 64, Hitech City Rd, Hyderabad, Telangana 500081",
            "387/1 A BLOCK, Hotel Asian Plaza, KH NO, Rd Number 4, no 6, Mahipalpur, New Delhi, Delhi 110037",
            "Crowne Plaza New Delhi Okhla, an IHG Hotel, Plot No. 1 Community Centre, Okhla I, New Delhi, Delhi 110020",
            "Palm Springs, Phase 1 Community Center 60 Near PVR, Industrial Area Phase I, Block B, Naraina Industrial Area Phase 1, New Delhi 110028",
            "Hotel Gold Regency, 4350, Main Bazar Rd, Bagichi Ramchander, Kaseru Walan, Paharganj, New Delhi, Delhi 110055",
            "Comfort INN Insys, 46,1st Main Road, Gokula 1st Stage Mathikere, Yeswanthpur, Bengaluru, Karnataka 560054",
            "7884/1 Plot No, XV, 27, Arakashan Rd, Nai Basti, Paharganj, New Delhi, Delhi 110055",
            "Radisson Blu Plaza Hotel Hyderabad Banjara Hills, 8-2-409, Rd Number 6, Green Valley, Banjara Hills, Hyderabad, Telangana 500034",
            "Hotel Dream Palace, Hotel Dream Palace Near Allahabad Bank , Sahelion Ki Bari Link Road, Sukhadia Cir, Udaipur, Rajasthan 313001",
            "Hotel Lilawati Grand, Motilal Nehru Road Near Fancy Bazaar, Pan Bazaar, Guwahati, Assam 781001"
    };
    public static String[] description={
      "The Capital’s Palace Since 1983. Nestled amidst the heart of the historic Indian capital city, the iconic Taj Palace, New Delhi has held a distinguished position amongst the finest hotels of the world for close to four decades. Spread over six acres of lush gardens, our 5 star hotel in Delhi is synonymous with timeless luxury and unmatched hospitality. With panoramic views of the city's verdant protected greens, our hotel in Delhi offers an inimitable confluence of epitomising elements of Indian art, warm, personalised service and unmatched luxury. Four award-winning restaurants featuring an array of cuisines from across the world, a stylish bar, nine-hole putting greens, a temperature-controlled swimming pool and an expansive Jiva Spa make Taj Palace, New Delhi, a true urban oasis. In line with our sustainability efforts, a highly specialised electronic air filtration system helps maintain the air quality in the hotel, as per international AQI standards, so that you only breathe the purest air. Indulge yourself with personalised butler service, exclusive access to the Taj Club Lounge and other special privileges when you stay in our Taj Club Rooms and Suites.",
            "Hotel Ajanta, one of the most well-established boutique hotels in the capital, is located in the downtown Central Delhi. The Hotel is approved by the Ministry of Tourism, Government of India. Safety, honesty and reliability make Hotel Ajanta the best choice for a comfortable and memorable vacation in India. The Hotel is conveniently located near the railway station, airport and the city’s center - Connaught Place. Established in 1971, it is one of the oldest hotels in Delhi and has hosted guests from almost all over the world. It is praised by the guests for its supportive staff and quality services.",
            "The hotel features 24 hour front desk, a concierge, and room service. Plus, Lemon Tree Premier, Hitec City, Hyderabad Hotel offers a rooftop pool and free breakfast, providing a pleasant respite from your busy day. For guests with a vehicle, free parking is available.\n" +
                    "\n" +
                    "While in Hyderabad, you may want to check out some of the restaurants that are a short walk away from Lemon Tree Premier, HITEC City, including Dialogue in The Dark (0.9 mi), Flechazo (0.6 mi), and Ottimo Cucina Italiana (0.9 mi).\n" +
                    "\n" +
                    "If you’re looking for things to do, you can check out NTR Garden, Hyderabad Botanical Gardens, or Jalagam Vengal Rao Park, which are popular gardens amongst tourists.",
            "The small hotel features room service. Plus, Hotel Asian Residency offers an on-site restaurant, providing a pleasant respite from your busy day.\n" +
                    "\n" +
                    "While in Hyderabad, you may want to check out some of the restaurants that are a short walk away from Hotel Asian Residency, including Flavours Of Tmh (1.0 mi), Utsav The Veg Restaurant (1.0 mi), and Fiesta Green Bawarchi (1.1 mi).\n" +
                    "\n" +
                    "Best of all, Hotel Asian Residency makes it easy to experience many great Hyderabad attractions like NTR Garden, D.G.S Melkote Park, and Hyderabad Botanical Gardens, which are some popular gardens.",
            "A promising landmark of North West Delhi, Crowne Plaza New Delhi Rohini offers facilities and amenities ensuring seamless conduct of business requirements, by extending warm service to business and leisure travellers. The hotel has 50,750 sq. ft. meeting space, one of the largest in Delhi/NCR, with an attractive choice of indoor / outdoor venues. These venues are ideal for conferences, events, weddings and other social functions accommodating up to 2000 people. The 183-room hotel offers modern in-room facilities along with a wide range of dining and relaxation options. The hotel has an award winning Indian specialty restaurant, Spice Art, an all-day dining restaurant, Mosaic, a bar ConneXions with an exclusive wine cellar and a pastry shop, Deli. It also has a relaxation spa, Adya (specializing in Asian and European therapies) comprising of therapy rooms, a unisex salon, a well-equipped gym and an outdoor swimming pool. The hotel's close proximity to shopping complexes, local entertainment attractions and educational institutions makes it the North West Delhi’s preferred destination to meet and celebrate.",
            "Greater Palm Springs is an oasis for art, adventure, and relaxation. Start by taking in the views from the Palm Springs Aerial Tramway, the world’s largest rotating tram car, before exploring exhibits at the Palm Springs Art Museum and its Architecture & Design Centre. Visit the Empire Polo Club, home of the Coachella Music & Arts Festival and Stagecoach Country Music Festival. Then go soak in one of the dozens of spas in Desert Hot Springs where you can submerge yourself in the healing mineral waters that flow beneath the city.",
            "Hotel Gold Regency is centrally located in Paharganj, New Delhi. Hotel Is located just 100 metres from New Delhi Railway Station and just 400 metres from the popular Connaught Place. Our Hotel is 20 Kms away from Indira Gandhi International Airport and close to many famous tourist spots and heritage sites, Red Fort Complex and Qutub Minar and India Gate. Our air-conditioned rooms features wardrobe, flat-screen satellite TV, telephone and seating area. Each room comes with an en suite bathroom offering shower facility. We have an in-house bar to serve wide array of international liquor an multi-restaurant which serves mouth-watering Indian dishes. Also, we have room service available. Free Wi-Fi access is available in the entire property and parking is provided on site. Staff at our Tour/Travel Desk can assist you for your tour arrangements. Additional facilities at our hotel includes luggage storage, currency exchange and laundry and dry cleaning services.",
            "The hotel features 24 hour front desk, room service, and a concierge. Plus, guests can enjoy free breakfast, which has made this a popular choice among travellers visiting New Delhi. For guests with a vehicle, free parking is available.\n" +
                    "\n" +
                    "Given the close proximity of popular landmarks, such as Jhandewalan Temple (0.3 mi) and Birla Mandir Temple (Lakshmi Narayan) (1.2 mi), guests of Crest Inn Hotel New Delhi can easily experience some of New Delhi's most well known attractions.\n" +
                    "\n" +
                    "If you like sushi restaurants, Crest New Delhi is conveniently located near Tamra, Sakura, and Town Hall.\n" +
                    "\n" +
                    "Should time allow, Karol Bagh is a popular attraction that is within walking distance.\n" +
                    "\n" +
                    "Crest Inn Hotel New Delhi puts the best of New Delhi at your fingertips, making your stay both relaxing and enjoyable.",
            
            "A five-star property that has been serving smiles and hospitality par excellence for the past two decades, Radisson Blu Plaza Delhi Airport stands tall and proud on the National Highway -8, at a driving distance of 5 minutes from Indira Gandhi International Airport. The Hotel is conveniently connected to New Delhi’s South and Central part on one side and the commercial hub of Gurgaon on the other side.  Health and proper hygiene are of extreme importance for the staff members and a proper protocol is followed at all times even at the time of room service. Sanitizers are available for both the staff members and the guests at the restaurant entrance. All the utensil and kitchen equipment, crockery, cutlery and glassware are thoroughly (sanitized) and washed post all meal periods. The back area of the Hotel is sanitized post every meal period including phones at an interval of every 60 minutes. Radisson Blu Plaza Delhi Airport also houses an outdoor swimming pool, a fitness centre, yoga room and an award-winning day spa - R –The Spa with three levels dedicated to beauty and wellness.",
            "A five-star property that has been serving smiles and hospitality par excellence for the past two decades, Radisson Blu Plaza Delhi Airport stands tall and proud on the National Highway -8, at a driving distance of 5 minutes from Indira Gandhi International Airport. The Hotel is conveniently connected to New Delhi’s South and Central part on one side and the commercial hub of Gurgaon on the other side. The nearest Airport Express Metro Station and world-class shopping malls are closely connected. An ISO 22000:2005 certified hotel, Radisson Blu Plaza Delhi Airport leaves no stone unturned in ensuring the safety and hygiene of both its guests and staff. The Hotel is equipped with amenities to combat any virus or disease in times of crisis. Despite the outbreak of COVID-19, the Hotel works round the clock to ensure the deep cleaning and sanitization of the Hotel by taking steps as a mandatory precaution. Hand Sanitizers are installed in every nook and corner of the hotel and also used in kitchens, rooms, gym, spa and the other guest areas.",
            "Hotel Dream Palace is a heritage style 3-star boutique hotel situated in prime location of Sukhadia Circle Sahelion Ki Bari Road in globally most searched Lake City of India i.e. Udaipur which is also famous as Venice of the East. Ornate frescoes and traditional architecture greet guests at Hotel Dream Palace, that features 32 well decorated rooms, multicuisine restaurant “Khana Khazana” that has a team of expert culinary chefs, 24 hours front office, 24 hours security, Elevator, Public Restrooms, Wide Lobby Area, In-room dinning option, Complimentary Wi-Fi, Secured Parking Space, Laundry, Doctor On Call, Well Decorated Lawn and Banquet Hall, Transfers (Chargeable), well equipped conference room and banquet hall but not limited to which combinedly make Hotel Dream Palace a perfect hideout and getaway for all types of travellers be it solo, group, family, couple and business travellers. Detailed information about the city and all the travel arrangement facilities is provided at travel desk. Well-designed rooms with perfect blend of Royal Heritage style and modern decor and gracious hospitality define its friendly abode.",
            "Avail 5 star facilities at throwaway prices at the heart of the central business district of Guwahati, the gateway to North East India. We serve you with Indian, South Indian, Tandoor, Chinese, Continental and American dishes at our multi-cuisine restaurant. Chilled Beer and Wine is our specialty. Imported whiskey and Indian varieties adorn our bar."
    };
    List<detailview> hotelDetailList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_list);
        list=findViewById(R.id.hotelList);
        hotelDetailList=new ArrayList<>();
        for(int i=0;i<12;i++){
            hotelDetailList.add(new detailview(images[i],hotels[i],"9:00AM-10:00PM",description[i],address[i]));
        }
        custom_list adapter=new custom_list(this,hotels,images,hotelDetailList);
        list.setAdapter(adapter);
    }
}