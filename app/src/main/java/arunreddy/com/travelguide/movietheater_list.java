package arunreddy.com.travelguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class movietheater_list extends AppCompatActivity {
    ListView list;
    public static String[] theaters={
            "Sathyam Cinemas",
            "Raj Mandir Cinema",
            "Luxe Cinemas",
            "Palazzo",
            "Urvashi Cinema",
            "Prasads",
            "PVR Logix IMAX",
            "Aries Plex",
            "New Empire Cinema",
            "Chronicles India"
    };
    public static String[] address={
            "PVR Kripa Cinemas, Overbridge, Pavithra Nagar, Santhi Nagar, Thampanoor, Thiruvananthapuram, Kerala 695036",
            "Raj Mandir Cinema, C-16, Bhagwan Das Rd, Panch Batti, C Scheme, Ashok Nagar, Jaipur, Rajasthan 302001",
            "Jazz Cinemas LUXE, Phoenix Market City, No. 142, 2nd Floor, Velachery Rd, Indira Gandhi Nagar, Velachery, Chennai, Tamil Nadu 600042",
            "SPI Palazzo Chennai, Forum Vijaya Mall, 3rd, Chennai, Tamil Nadu 600026",
            "Urvashi Theater, No.40, Siddaiah Road Near M T R Hotel, Doddamavalli, Sudhama Nagar, Bengaluru, Karnataka 560002",
            "Prasads Multiplex, IMAX Road Khairtabad Behind of, NTR Marg, Hyderabad, Telangana 500063",
            "PVR Logix Noida, Logix City Centre BW-58, near Wave City Center, Sector 32, Noida, Uttar Pradesh 201301",
            "Aries Plex SL Cinemas, Thampanoor, Sahodara Samajam Road, Overbridge, Near, Thiruvananthapuram, Kerala 695001",
            "New Empire Cinema, Murzban Road, Azad Maidan Fort, Mumbai, Maharashtra 400001",
            "Chronicles India - 7DX Theatre, 36, East Raja St, Mahabalipuram, Tamil Nadu 603104"
    };
    public static Integer[] images={
            R.drawable.sathyamcinemas,
            R.drawable.rajmandircinema,
            R.drawable.luxecinemas,
            R.drawable.palazzo,
            R.drawable.urvashicinema,
            R.drawable.prasads,
            R.drawable.pvrlogiximax,
            R.drawable.ariesplex,
            R.drawable.newempirecinema,
            R.drawable.chroniclesindia
    };
    public static String[] description={
            "Sathyam Cinemas was originally named the \"Royal Theatre Complex\" and was built by Raja from Venkatagiri in April 1974.[7][8] With a capacity of 1,255 seats, it was the largest multiplex built in Chennai at the time.[9]\n" +
                    "\n" +
                    "Kiran Reddy, the current CEO of SPI Group, revealed in a 2012 interview with The Hindu that Sathyam Cinemas was acquired by his family \"from someone\" in the 1980s. It was acquired for real estate purposes with no intention of continuing the theatre business. He claimed, \"The intent was to demolish the Sathyam building. The theatre wasn't a viable business if you looked at the value of the land.\" However, when he got involved in the business, the family had made several improvements to the theatre.[10] Reddy had taken over the business in 1999 and continued developing the theatre, adding three more screens and refurbishing the existing three.[11]\n" +
                    "\n" +
                    "In 2009, SPI Cinemas established itself as a film production company, producing its first film, Thiru Thiru Thuru Thuru.[12] SPI Cinemas is one of the key movie distributors in Tamil Nadu and has forayed into the music business with Think Music to distribute Tamil, Telugu and Malayalam movie soundtracks via digital media and Purplenote to distribute non-movie contemporary music.\nIn August 2018, PVR Cinemas had completed the acquisition of SPI Cinemas.[14] In August 2019, the National Company Law Tribunal (NCLT) New Delhi-branch approved the amalgamation of SPI Cinemas into PVR with effect from the appointed date of 17 August 2018, PVR said in the exchange filing.[15][16] At the time of acquisition, PVR Cinemas mentioned that they will start re-branding SPI Cinemas' properties outside of Tamil Nadu as PVR in a phased manner. Also all future projects will be branded as PVR. This includes the state of Tamil Nadu as well. As of January 2021, PVR has integrated all of SPI properties with itself and started rebranding the cinemas as PVR. The SPI cinemas website and mobile app is now a cloned version of PVR website/app and the customers will be able to book movie tickets for SPI screens in both SPI and PVR Cinemas Website.[17][18] All the S2 and thecinema properties will be completely rebranded as PVR in the near future and only Sathyam, Escape and Palazzo names will be retained. PVR has already replaced all the signboards and beverage containers within the SPI properties with PVR name",
            "Raj Mandir Cinema is a movie theatre in Jaipur in Rajasthan state in India.[2] Situated on the Bhagwan Das Road, near M.I. Road, the meringue-shaped auditorium opened in 1976, and over the years has seen many movie premieres of Hindi films, and has become a popular symbol of Jaipur.\nopened on 1 June 1976 with the film \"Charas\". It was designed by architect W.M. Namjoshi in Art Moderne style (Streamline Moderne or late Art Deco). Known for its large size as well as opulent and meringue interiors, Raj Mandir remains an important part of the tourist circuit, and thus usually remains full despite its size. Bhuramal Rajmal Surana Owner Of Rajmandir Cinema Basically Surana Family is Top Jeweller In Jaipur.[3][4][5] 9 stars on the exterior signify 9 gem stones which is the prime occupation of current owners of Rajmandir.",
            "The cinema is located in Alexandra Road, this also is the location of the Angles Theatre, and the former Selwyn Theatre. Along with the Wisbech & Fenland Museum, Wisbech Library, Wisbech Castle, St.Peters church, hall & gardens and The Crescent this area of the town constitutes the 'Cultural Quarter'.[2]\n" +
                    "\n" +
                    "The Luxe cinema was converted from a redundant Women's Institute Hall and opened in March, 2009 styled as a luxury cinema with leather armchairs and two-seater sofas, and ‘premier’ sofa’s with waitress service. It has a licensed bar.[3] The Women's Institute branch now (2019) meets in the Rosmini Centre, Queens Road.[4]\n" +
                    "\n" +
                    "The town's last operating cinema the 'Unit One' (previously The Hippodrome) had been demolished in the 1980s to make way for the Horsefair shopping centre development that opened in 1988.[5]\n" +
                    "\n" +
                    "On 23 May, 2014 an eight-screen cinema was opened near the Tesco store, Cromwell Road by the Light Cinemas.[6]\n" +
                    "\n" +
                    "The cinema was part of 'The Brinks Festival 2015' hosting 'The Secret World of Charles Darwin' by Magic Circle Comedy Award winner Ian Keebler on Monday 18th May.[7]\n" +
                    "\n" +
                    "In 2015 The Goob an award winning Independent film shot across the Fens, was shown followed by an audience question and answer session with film director Guy Myhill and Martin Ferguson.[8]\n" +
                    "\n" +
                    "In 2016 Leverington Primary Academy pupils created animated films as part of the children's arts award with Trinity House to achieve the Gold Standard and attended the official screening in June 2016.[9]\n" +
                    "\n" +
                    "Currently a single screen cinema, ownership changed in August 2017.[10]\n" +
                    "\n" +
                    "In October 2018 the digitally remastered vintage war footage film They Shall Not Grow Old was shown in the run up to the 100th anniversary of WW1.",
            "SPI Cinemas is an Indian multiplex chain and film production company originally owned by the SPI Group, headquartered in Chennai, Tamil Nadu. The company began operating multiplexes in Chennai, and eventually expanded to several states in India. SPI is often lauded for its premium quality and inexpensive pricing.[1][2] Its theatres, primarily PVR Sathyam, are often used by filmmakers for film premieres and audio launch events.[3] Popcorn served at SPI Cinemas has received considerable praise from film goers and the media.[4] In August 2018, PVR Cinemas had completed the acquisition of SPI Cinemas.\n" +
                    "\n" +
                    "SPI is notable for being the first multiplex operator in India to equip its screens with the Dolby Atmos and Auro 11.1 sound systems.\nSathyam Cinemas was originally named the \"Royal Theatre Complex\" and was built by Raja from Venkatagiri in April 1974.[7][8] With a capacity of 1,255 seats, it was the largest multiplex built in Chennai at the time.[9]\n" +
                    "\n" +
                    "Kiran Reddy, the current CEO of SPI Group, revealed in a 2012 interview with The Hindu that Sathyam Cinemas was acquired by his family \"from someone\" in the 1980s. It was acquired for real estate purposes with no intention of continuing the theatre business. He claimed, \"The intent was to demolish the Sathyam building. The theatre wasn't a viable business if you looked at the value of the land.\" However, when he got involved in the business, the family had made several improvements to the theatre.[10] Reddy had taken over the business in 1999 and continued developing the theatre, adding three more screens and refurbishing the existing three.[11]\n" +
                    "\n" +
                    "In 2009, SPI Cinemas established itself as a film production company, producing its first film, Thiru Thiru Thuru Thuru.[12] SPI Cinemas is one of the key movie distributors in Tamil Nadu and has forayed into the music business with Think Music to distribute Tamil, Telugu and Malayalam movie soundtracks via digital media and Purplenote to distribute non-movie contemporary music.",
            "It was the finest(specially sound system) Movie Theater in Bangalore before multiplex starting.\nK. C. Nanjunde Gowda (c. 1928 – 4 October 2012) was a businessman and one of the top Kannada film producers, exhibitors, financiers and distributors. He is credited with producing some of the classic films in the annals of Kannada film industry, namely, Sharapanjara, Huliya Halina Mevu, Babruvahana, Bangarada Panjara, Daari Thappida Maga and many more.[1][2]\n" +
                    "\n" +
                    "He distributed more than 300 films and won several awards, notably – the Dr. Rajkumar award from Karnataka state government and the Phalke Academy award from the Dada Saheb Phalke committee for the year 2005.",
            "Say hello to the most expensive and posh neighbourhood of Hyderabad where the rich and famous live. From film stars, politicians, corporate juggernauts to affluent business families, the stretch of Banjara Hills and Jubilee Hills has a beautiful rustic charm all covered by lush green surroundings and a hilly terrain. While Film Nagar is where all major film studios of Tollywood are based, KBR National Park along with other big nature parks in the vicinity offer the much need refreshing break to all joggers and walkers, with some great views of the city. Enjoy your mornings here hopping across large shopping malls, a vast range of gorgeous designer boutiques, upscale multi-cuisine restaurants but by night, get ready to party in the choicest collection of nightclubs, bars with live gigs. This is where Hyderabad parties and chills.",
            "Constructed by the Logix Group, the City Center Mall is a mixed use development spread in an area of 25,000 sq. meters with a 6 lac sq. feet space of mall with an exclusive shopping and entertainment area, 5 star deluxe hotel, corporate offices and serviced apartments.\n" +
                    "\n" +
                    "Situated in the heart of Noida at Sector 32, it is one of the most prominently located commercial developments in the NCR owing to its easy accessibility via road and as well as the metro. It is a one-stop destination for customers who need to be catered for everyday aswell as lifestyle needs.\n" +
                    "\n" +
                    "Logix brings the largest PVR Entertainment City, India’s Biggest Superplex with 15 screens including PVR IMAX, 4 DX, Play House & Gold attached to a lavish awe-inspiring Food Court with the best of culinary delights from across the world. Covering an annual footfall of 1.4 million.\n" +
                    "\n" +
                    "North India's largest Gold – 3 screens\n" +
                    "India’s FIRST Playhouse\n" +
                    "North India’s FIRST Imax\n" +
                    "PVR’s FIRST 4DX\n" +
                    "9 screen Premiere auditorium with recliners, making it the BIGGEST in the region\n" +
                    "Besides being the host to one of the most captivating movie experiences in India, it also has one of the largest HyperCity in North India with premium department stores by Shoppers Stop, Iconic and many other reputed national and international brands. With its energy efficient design and professionally managed services Logix City Center is all set to create new benchmarks in shopping and entertainment experiences.",
            "Sohan Roy is an Indian entrepreneur based at Sharjah. He is the Founder chairman and CEO of Aries Group of Companies, and a Naval Architect.[1]\n" +
                    "\n" +
                    "Roy is also the director of the film DAM999 whose screenplay was added to the permanent core collection in the library of the Academy of Motion Picture Arts and Sciences.[2][3] His Aries group has taken over actor Mohanlal's Vismayas Max[4] studio complex, Kerala's first DTS studio, situated at Thiruvananthapuram. He has decades of experience in executing naval architectural engineering & design projects all over the world with a Guinness Book Entry for the longest Snake boat design and several other creative designs like BOTEL, Topless Ships etc. He also holds a global reputation as Director, Creative Head of award winning films & documentaries and Project Designer of World’s second CSR movie – Aickarakkonathe Bhishaguaranmaar.[5]\n" +
                    "\n" +
                    "Forbes listed Roy among top Indian leaders of the Arab world 4 times in a row since 2015 to 2019.[6][7][8]\n" +
                    "\n" +
                    "He is the Director of Hollywood venture DAM999, founder-director of Concept Indywood, the USD 10 billion project, Founder President of Indywood Billionaires Club,[9][10] author of 'Anukavyam' and concept creator of the revolutionary efficiency improvement system called EFFISM (Efficiency Improvement System Management).\n" +
                    "\n" +
                    "Roy is also a poet and author of thought provoking and realistic poems in Malayalam that celebrate social diversity of human intellect, mind and belief. Expressing his take on significant developments that affect our communities conscience, he has been writing 4 line short poetry, popularly known as 'Anukavyam' every day for the past 2 years.[11][12][13]\n" +
                    "\n" +
                    "Recently, Roy was honored with the Honorary Professional Doctorate Certificate in Global Leadership and Management by European International University (EIU), Paris.[14] He has 6 International technical paper presentations and 25 fully developed creative research products to his credit. Aries International Maritime Research Institute (AIMRI) is the latest in the row of his creative Concepts.",
            "New Empire was a cinema hall in South Mumbai located in close proximity to the Chhatrapati Shivaji Terminus.[1] It closed down on 21 March 2014 after being in existence for over a century due to persistent losses suffered by the owners.\nNew Empire originally opened in 1908 as a live theatre and hosted plays. It was then known as the Empire Theatre.[3] In 1948, it was completely overhauled by British architect M.A. Riddley Abbott and reopened as New Empire with a seating capacity of nearly a thousand.[4] The New Empire Cinema was taken over by 20th Century Fox Corp. in 1955 and was the Bombay showcase cinema for their films.[5]\n" +
                    "\n" +
                    "New Empire was one of the oldest single-screen cinema halls in Mumbai and the first in Asia to have a cantilevered balcony. Similar cinema halls that were built in the Art Deco style and opened subsequently in the south Mumbai area were Regal (opened in 1933), Metro (opened in 1938) and Liberty (opened in 1949).[1] The first film it screened was in 1930 – the talkie Vagabond King.\nIt was originally owned by the Bombay Improvement Trust, which used to carry out civic works in the city. The theatre was bought by Mr. Keki Mody in 1935 who is the father-in-law of the current owner Mr. Burge Cooper.",
            "The rich history, heritage and millions of mythological tales of India has made the world look back us with lot of jealous. Being the pride of our country it had interested us in Chronicles India to look at ways and means to get this across to as many people as possible. Chronicles India being a tech savvy organization developed the vision of using technology to convey the hidden messages that our history has to offer. Thus born was “Pallava Dynasty – A Time Travel” where the Pallava Kingdom meets the present age people through 7DX technology.\n" +
                    "\n" +
                    "The journey of Chronicles India has started the journey with the Pallavas and looking to reach each and every historically significant corner of India.\nWe screen,20 mins Indias 1st 7DX Archaeological documentary movie, an initiative from Chronicles India,Mahabalipuram. This is about history,heritage and culture of Pallava Dynasty who ruled the land from 600 t0 750 AD. The movie script is approved by Archaeological survey of India.The viewers can enjoy the history with 7D effects like rain,wind, thunder, lightning, Aroma and Seat movement effects."

    };
    List<detailview> hotelDetailList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movietheater_list);
        list=findViewById(R.id.movieTheaterList);
        hotelDetailList=new ArrayList<>();
        for(int i=0;i<10;i++){
            hotelDetailList.add(new detailview(images[i],theaters[i],"10:00AM-10:00PM",description[i],address[i]));
        }
        custom_list adapter=new custom_list(this,theaters,images,hotelDetailList);
        list.setAdapter(adapter);
    }
}