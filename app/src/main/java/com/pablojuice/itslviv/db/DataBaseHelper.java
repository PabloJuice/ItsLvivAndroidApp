package com.pablojuice.itslviv.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.pablojuice.itslviv.recyclerNewsList.NewsPack;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {

    private static final String NEWS = "news";
    private static final String MUSEUMS = "museums";
    private static final String BANKS = "banks";
    private static final String HOTELS = "hotels";
    private static final String PARKS = "parks";
    private static final String SHOPPING = "shopping";

    private static final String ID = "id";
    private static final String IMGSOURCE = "imgSource";
    private static final String HEADER = "header";
    private static final String ADDRESS = "address";
    private static final String MARK = "mark";
    private static final String INFO = "info";
    private static final String MAPX = "mapX";
    private static final String MAPY = "mapY";

    private static final String DB_NAME = NEWS + ".db";
    private static final int DB_VERSION = 6;

    public DataBaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(
                "CREATE TABLE " + NEWS + " (" +
                        ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        IMGSOURCE + " TEXT NOT NULL, " +
                        HEADER + " TEXT NOT NULL, " +
                        INFO + " TEXT NOT NULL" +
                        ")"
        );
        db.execSQL(
                "CREATE TABLE " + MUSEUMS + " (" +
                        ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        IMGSOURCE + " TEXT NOT NULL, " +
                        HEADER + " TEXT NOT NULL, " +
                        ADDRESS + " TEXT NOT NULL," +
                        MARK + " TEXT NOT NULL," +
                        INFO + " TEXT NOT NULL," +
                        MAPX + " DOUBLE NOT NULL," +
                        MAPY + " DOUBLE NOT NULL" +
                        ")"
        );

        db.execSQL(
                "CREATE TABLE " + BANKS + " (" +
                        ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        IMGSOURCE + " TEXT NOT NULL, " +
                        HEADER + " TEXT NOT NULL, " +
                        ADDRESS + " TEXT NOT NULL," +
                        MARK + " TEXT NOT NULL," +
                        INFO + " TEXT NOT NULL," +
                        MAPX + " DOUBLE NOT NULL," +
                        MAPY + " DOUBLE NOT NULL" +
                        ")"
        );

        db.execSQL(
                "CREATE TABLE " + HOTELS + " (" +
                        ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        IMGSOURCE + " TEXT NOT NULL, " +
                        HEADER + " TEXT NOT NULL, " +
                        ADDRESS + " TEXT NOT NULL," +
                        MARK + " TEXT NOT NULL," +
                        INFO + " TEXT NOT NULL," +
                        MAPX + " DOUBLE NOT NULL," +
                        MAPY + " DOUBLE NOT NULL" +
                        ")"
        );

        db.execSQL(
                "CREATE TABLE " + PARKS + " (" +
                        ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        IMGSOURCE + " TEXT NOT NULL, " +
                        HEADER + " TEXT NOT NULL, " +
                        ADDRESS + " TEXT NOT NULL," +
                        MARK + " TEXT NOT NULL," +
                        INFO + " TEXT NOT NULL," +
                        MAPX + " DOUBLE NOT NULL," +
                        MAPY + " DOUBLE NOT NULL" +
                        ")"
        );

        db.execSQL(
                "CREATE TABLE " + SHOPPING + " (" +
                        ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        IMGSOURCE + " TEXT NOT NULL, " +
                        HEADER + " TEXT NOT NULL, " +
                        ADDRESS + " TEXT NOT NULL," +
                        MARK + " TEXT NOT NULL," +
                        INFO + " TEXT NOT NULL," +
                        MAPX + " DOUBLE NOT NULL," +
                        MAPY + " DOUBLE NOT NULL" +
                        ")"
        );


        db.execSQL(
                "INSERT INTO " + NEWS + " (" + IMGSOURCE + ", " + HEADER + "," + INFO + ") VALUES " +
                        "('news_1', 'In the former store Ocean on Vladimir the Great supported a mosaic', 'On August 6, on Volodymyr Velyky Street in the former Okean store, the main works to restore the Sea and Fish mosaic, which the developer destroyed almost a year ago, were completed. \n According to the press service of the LMR, tomorrow, August 7, the developer must remove the fence, and all citizens will be able to see the restored mosaic. According to Andriy Moskalenko, the citys deputy mayor for development, minor mosaic work will continue for some time - for example, waterproofing the building and laying some stones at the bottom of the mosaic.In the beginning, there were disputes over whether to do it - to restore the mosaic. But I think that now such questions will not arise. The sketch of the mosaic is 100% preserved, because there was an exact photo fixation, so the mosaic was reconstructed by 99%. The difficulty was in finding the material - pebbles were searched all over Ukraine, said Ostap Patyk, an art critic and son of Volodymyr Patyk, the author of the mosaic Sea and Fish. \n According to ZAXID.NET, in February last year, Real Estate Group LLC received from LMR approved approved urban conditions and restrictions for the reconstruction of the former store Ocean on the street. Vladimir the Great, 26a.The developer promised to keep the Sea and Fish mosaic on the facade of the building, but in July 2019 he destroyed it - only 12% of the whole image remains. \n As a result, the executive committee of LMR lifted the town-planning conditions and restrictions of Real Estate Group LLC on reconstruction. DABI inspected the object and fined the developer UAH 90,000. After public discussions, he pledged to restore the mosaic at his own expense and began work in early September.According to the analytical system YouControl, the owners of the company Real Estate Group are Natalia and Vladimir Shved. Despite its consonant name, it has nothing to do with another well-known Lviv developer - Real Group Corporation. As compensation for the destroyed mosaic, the developer promised the city council a thousand square meters in new buildings to be erected.'), " +

                    "('news_2', 'The roof of a nine-storey residential building is burning on Lyubinska Street', 'On Thursday, August 6, at about 1:55 p.m., on Lyubinskaya Street in the Frankivsk district of the city, the roof of a nine-story residential building caught fire. According to preliminary information of rescuers, the roof of roofing felt caught fire. Firefighters are working on the spot. \n The fire engulfed the roof of the house №164. Black smoke is visible in different parts of the city. As ZAXID.NET was told in the press service of the State Emergency Service, the area of ​​the fire is about 15 m2.According to the City Hotline, the house at 164 Lubinska Street is serviced by condominiums. At the request of this condominium, insulation work was carried out on the roof of the building today, during which, for unknown reasons, the roof suddenly caught fire. \n Six fire engines went to the scene of the fire. 20 people were evacuated from the upper floor. \n At around 2:30 p.m., the press service of the State Emergency Service reported that the fire had been extinguished.'), " +

                    "('news_3', 'Intertelecom ceases operations in the Lviv region and in eight other regions', 'The national mobile operator Intertelecom, which provides voice and high-speed Internet services throughout Ukraine in the CDMA standard, has announced the termination of its services in nine regions of Ukraine. \nAccording to Intertelecom, its operation will be suspended from September 1 in Lviv, Volyn, Ivano-Frankivsk, Zakarpattia, Rivne, Ternopil, Chernivtsi, as well as in Donetsk and Luhansk regions.The company said that the termination of their work in these regions is due to the rejection of the radio frequency resource, which will be used by the big three of mobile operators to launch LTE-900 - fourth generation (4G) on low frequencies. Initially, Intertelecom also planned to launch LTE-900 on its own frequencies, but it did not have the funds to do so.For a long time, Intertelecom has been in the process of finding and attracting investment financial support, which would allow organizing the deployment of national LTE networks and the introduction of innovative services that meet modern requirements for service quality and consumer expectations. However, the prolonged situation with quarantine restrictions and further spread of the Covid-19 pandemic, as well as the general economic instability in our country and the world did not allow our company to implement financial agreements with interested investors and pay the license for LTE technology on time.  stated in Intertelecom.The company stressed that it would reconsider its development strategy. Its main elements will be the abandonment of part of the radio frequency spectrum, the optimization of its radio and transport network in a number of regions, as well as the introduction and active development of additional innovative IT services. \nThe Intertelecom operator started its work in 1998, and in 2001 it launched the network. At first, the company focused on the Odessa region, but later expanded its activities to the whole of Ukraine. The operator works in the CDMA standard, which makes it incompatible with popular models of phones and modems.Intertelecom provided wireless fixed telephone services in places where it was impossible to connect wired telephony, voice mobile communication services and high-speed Internet. At the same time, the Internet speed from Intertelecom was lower than that provided by large mobile operators in the 3G and 4G standards. However, due to the fact that the company operated at low frequencies, high-speed Internet was available to residents of even remote villages, where neither 3G nor 4G is still available. At the same time, Intertelecom began to provide high-speed Internet long before the launch of large 3G operators. The companys subscriber base has fluctuated within a million in recent years.Intertelecom was founded by the Sheriff business group from Transnistria, a separatist region of Moldova.'), " +

                    "('news_4', 'Italian lanterns and automatic lawn \n watering will be installed on Svobody Avenue', 'On July 30, the Halytskyi District Administration signed a contract for the overhaul of the central pedestrian alley on Svobody Avenue in Lviv with PE Termobud-Kyiv. Reconstruction should be completed by the end of the year. \n As reported on August 6, Our money. Lviv ”, initially the amount of the deal was UAH 13.65 million, but it was reduced to UAH 9.5 million. The Halytska RA explained this by the lack of funds and assured that by the end of the year they will sign a contract for the works that had to be abandoned in the first place.According to the terms of reference, for almost UAH 14 million dismantling and installation works, water supply and drainage, automatic lawn watering, repair of the adjacent sidewalk, paving the alley of black and gray granite will be carried out on the alley.In addition, along the alley on Svobody Avenue from Hnatyuka Street to the Opera House, lighting will be replaced and new Italian decorative supports with Nova by Neri lamps will be installed: two supports for two lamps - UAH 96.7 thousand each, and 12 supports for one lamp - 68.9 thousand UAH each. The Galician RA has so far abandoned them due to lack of funds, but they must be established by the end of the year.\n We will add that in 2018 more than UAH 8 million has already been spent on the repair of sidewalks on Svobody Avenue, alleys and sidewalks in Mariyska Square.According to the analytical system YouControl, PE Termobud-Kyiv is registered in Kyiv and belongs to Yuri Parfenyuk. This year the company received orders for over UAH 19 million, all in the Lviv region.'), " +

                        "('news_5', 'A 19th-century medical center will be restored in Lviv', 'On the territory of the former telegraph plant on the street. Smal-Stotsky will soon begin large-scale reconstruction. The historic buildings of the 19th century, which have been in a state of disrepair for years, have been completely restored and given back their historical function - a medical facility will be set up here.\n\n Profile brick buildings on the street. Smal-Stotsky was built in the late XIX-early XX century. Then the famous patron Anthony Bilinsky bought the territory of the quarter in the area of ​​the current streets. Smal-Stotsky,street Fedkovycha and street Heroes of the Ukrainian Insurgent Army to set up an institution for hard-to-reach people - a hospice. The hospice buildings were designed by the city governments design bureau, headed by Julian Gochberger, as well as the firm of architect Ivan Levynsky. The medical institution, which consisted of administrative and medical buildings, could accommodate 60 patients at a time. \n\n After the Second World War, the buildings of the institution ceased to be used for medical purposesneeds. In 1946, the Telegraph Equipment Plant (LZTA) was moved here from Saratov, Russia. And after the collapse of the Soviet Union, the factory buildings were not used. \n\n The current owners of the historic buildings of the telegraph plant plan to completely restore them and equip a medical facility here, thus returning the buildings to their historical function. \n\n The buildings have a history dating back to 1898, so they will all be restored. Surgical departments cannot be located in historic buildings due to infectious causessafety, because in the old walls can accumulate various microorganisms. In addition, in the history of these buildings there were periods when the walls could be treated with something harmful. Therefore, it is planned to complete a new surgical building in this area, said Tatiana Mikhnova, head of the Medical Center of St. Paraskeva. \n\n The surgical department will provide scheduled and emergency medical care in the following areas: general surgery, gynecology, urology, otolaryngology, therapy, orthopedics and more. \n\n Three old buildings that are now located onin this area, occupy an area of ​​about 5,000 m2. And the area of ​​the new building will be about 8000 m2. Specialists of the architectural bureau AVR Development design the building of the new building in such a way that it organically fits into the historical environment and has an attractive appearance. \n\n The architecture of the existing historic buildings will be completely restored. At the same time, areas of damaged facades will be restored similarly to the preserved ones. \n\n Construction work on the territory of the future medical center will start in the near future. To implement the object will be involvedTVD construction company, which was engaged in the construction of the Heavenly Hundred memorial in the center of Lviv, UCU buildings, the Leleka maternity hospital in Kyiv, as well as the complex reconstruction of the Polaron plant. \n\n It is important that none of the historic buildings, although they are not architectural monuments, will be demolished.'), " +



                        "('news_6', 'Lviv hospitals are inspected by Health Minister Maksym Stepanov', 'On Thursday, August 6, Minister of Health Maksym Stepanov paid a working visit to Lviv. The Minister visited the city clinical ambulance hospital, in particular the transplant department, the press service of the LMR reported. He will also check the work of the regional infectious diseases hospital and oncology center. \n The transplant department, which Maksym Stepanov was the first to visit, has been operating in Lviv for four months now. Since April, doctors have performed 5 surgeries: four kidney transplants and one heart transplant.\n Our goal is for our country to have transplant independence in 2-3 years. Wewe want our citizens not to travel around the world, not to go abroad for treatment, for transplantation. We can do all this in Ukraine, we just need to create the appropriate conditions for this. And this is exactly what we are actively doing this year. We have a clear plan, and in 2-3 years we will be able to achieve this independence and our residents who need such help will be treated at home in Ukraine, said Maxim Stepanov. \n Today the Minister will also visit the Regional Clinical Infectious Diseases Hospital and Lvivoncological regional medical diagnostic center. And during the meeting in LODA will consider the issue of vaccination of Lviv residents and residents of the region, because today Lviv region is among the leaders among the regions where the level of vaccination coverage has decreased significantly.'), " +

                    "('news_7', 'An abandoned building in the center of Lviv was sold a thousand times more expensive than the starting price', 'The State Property Fund of Ukraine (SPFU) sold at auction an abandoned building on the street. Lemkivska, 9, which belonged to the Main Department of the State Food and Consumer Service in Lviv region. The premises of the former office, which is now in a dilapidated condition, were originally planned to be sold for UAH 17,000, but during the auction its value increased to UAH 15 million. \n Earlier on the street. Lemkivska, 9the office of the State Inspectorate for Agriculture was located, after its liquidation the office with an area of ​​180 m2 passed into the use of the Lviv regional department of the State Food and Consumer Service. At the end of 2019, the State Property Fund added this object to the list of those that the state plans to sell within the so-called small-scale privatization. \n The auction took place on July 23 on the electronic platform ProZorro, it was attended by 17 participants. The initial cost of the building, which is currently in poor condition, in particular has a badly damaged roof and broken windowsand doors, was 17.8 thousand UAH, but during the auction its value increased to 15 million UAH. This price was offered by two participants - Lviv PE Technohab and LLC Office Assets. \n Initially, the winner of the auction was the office Office Assets, but later the SPFU revoked this decision because the company did not provide all the necessary documents. As a result, the buyer of the building was a private company Technohab, with which they will soon enter into a purchase agreement. In total, the company has to pay UAH 18 million - UAH 15 million offered at the auction and 20% VAT - this is more than 1,000 times higher than the initial cost.According to YouControl, PE Technohab is registered in Lviv on the street. Yarema and has a registered capital of UAH 100,000. Yuriy Budulych is the director and founder of the company, which was founded in September 2019. \n Office Assets LLC was registered in Lviv at vul. Gogol in mid-July 2020 with a share capital of 1 thousand UAH. The director and owner of the company is Taras Pukalyak. \n By the way, most of the buildings on Lemkivska Street 9 used to belong to the Lviv Bakery Plant, the founder of which was the state joint-stock company Khlib Ukrainy.As reported by Our Money. Lviv , later the property of the plant was sold to TD Geosystems . Khlib Ukrainy tried to appeal the sale, but lost in court. In 2014, according to the register of property rights, the facilities at 9 Lemkivska Street were transferred to Reserve PLUS LLC. \n In 2016, the Lviv City Council approved a land management project for this area, and a year later the project provided land for 10 years. In October 2018, the executive committee agreed on a detailed plan of the territory bounded by Khimichna and Lemkivska streets.Zamarstynivska and Chornovil Avenue, which provided for the construction of a former bakery. \n An emergency house is located near this area. Residents staged a picket against the new building near their house, and the developer promised to take into account all the risks during the construction of housing. \n Reserve PLUS LLC, according to YouControl, belongs to the orbit of Intergal-Bud companies of the Peoples Deputy of 5-8 convocations Volodymyr Zubyk. Reserve PLUS also participated in the auction of the State Property Fund for the purchase of a building on Lemkivska, but offered a lower price than the winner.'), " +

                    "('news_8', 'A traveling science laboratory will operate in the parks of Lviv', 'The project Science is coming to you has started in Lviv. Then a traveling scientific laboratory will visit the square or park of each district of Lviv. As of today, she works in Lewand Park and will stay there for three days. \n The organizers say that they initiated this project to distract students from gadgets, but instead to interest children in science and leisure in the fresh air. So far, the laboratory has traveled to Lviv schools and has a total of 20 exhibits. However, not everyone presents in the parks, but only those that do not need electricity and are absolutelysafe for outdoor use. \n It has two parts: one of them is physical and mechanical, and the other explains the place of science in art and culture, for example in voice, sound, color. This year we will buy the third part of this exhibition, it will be mathematical, said the director of the Institute of Culture Strategy of the Lviv City Council Yulia Khomchyn. \n The exhibits will be of interest to all age groups of children, the organizers say. And teachers note that thanks to such laboratories, students better master the theoretical material.You cant learn this way alone, because you cant solve problems here. But tasks, theory plus this practice is great for children, said Halyna Koval, a physics teacher at Prestige Gymnasium. \n A traveling laboratory, I think, is a dream of every educator and every city would like to have such a laboratory. In fact, there are several cities in Ukraine and abroad where there is something similar, but their laboratories are stationary. We thought it would be right when science came to the child. In fact, not all parents have the opportunity to take the child away, to allocate a certain amount of time for the child to visit such an exhibition. And thats why our ideawas such that the laboratory was mobile, said the head of the city education department Zoryana Dovhanyk. \n In Lewand Park, the traveling science laboratory will work for a total of three days, from 11:00 to 17:00. \n The route of the project Science is coming to you: \n 5 - 7.08 - Lewand Park \n 10 - 11.08 - Hasek Alley12 - 13.08 - Nut Guy Park \n 14 - 17.08 - square near the Cathedral of St. George \n 18 - 20.08 - near the lake on Pancha Street \n 21.08 - near the clinic on the street. Honey Cave \n 25.08 - in Bryukhovychi near TsNAP \n 26.08 - in Rudny, the area in front of the school №74 \n 27.08 - in Vynnyky, the area in front of the school №29')"
        );

        db.execSQL(
                "INSERT INTO " + MUSEUMS + " (" + IMGSOURCE + ", " + HEADER + ", " + ADDRESS + "," + MARK + "," + INFO + "," + MAPX + "," + MAPY + ") VALUES " +
                        "('museum_1', 'Andrei Sheptytsky National Museum in Lviv', 'Svobody Avenue, 20', '4.6', 'Andrei Sheptytsky National Museum in Lviv. The Scientific and Artistic Fund of Metropolitan Andrei Sheptytsky is a national art museum, one of the mostsignificant treasures of national culture and art in Ukraine. Located in Lviv: the main building - at 20 Svobody Avenue, the second building - at 42 Drahomanova Street (Dunikovsky Palace). Founded in 1905 by the Greek Catholic Metropolitan Andrei Sheptytsky as a private foundation, in 1913 it was donated to the Ukrainian people.', '49.8431265', '24.02794268751021'), " +

                        "('museum_2', 'Museum of Ethnography and Craft', 'Svobody Avenue, 15', '4.6', 'The Museum of Ethnography and Arts and Crafts is one of the largest and oldest specialized museums not only Ukraine, but also in the countries of Central and Eastern Europe. Him collections began to form in the late nineteenth century. in two, then still separate, Lviv museums - City Industrial (founded in 1874) and the Museum of Antiquities of the Scientific society. T. Shevchenko (year of foundation - 1895). In 1951 the State Museum of Ethnography and Arts and Crafts was established. Its exposition is located in the premises of the former Galician Savings Bank. This house is an architectural monument of the administrative building of the XIX century, designed by Julian Zakharevich in 1890-1891.', '49.8410203', '24.027205604206245'), " +

                        "('museum_3', 'Lviv historical museum', 'Rynok square, 6', '4,6', 'Lviv Historical Museum is one of the oldest Museums of Ukraine, founded in 1893. Stock collectionthe museum has more than 370 thousand museum objects. The exposition acquaints with the history of the city of Lviv and Galicia lands from ancient times to the present day. Museum exhibits are located in the architectural monuments of the XVI-XVIII centuries. - houses № 2,4,6,24 on Rynok Square, in the former city Arsenal on the street. Basement, 5, and in the building of the Riflemans Brotherhood on the street. Lysenka, 23a.', '49.842262500000004', '24.032728550564123'), " +

                        "('museum_4', 'Lviv musuem of the history of religion', 'Muzeyna street,1', '4.5', 'Lviv Museum of the History of Religion is cultural institution, which with the help of collected unique materials covers the history of world and national religions, the activities of church organizations. The exposition of the museum is located in the cells of the former Dominican monastery, built in the XIV - XVIII centuries.Concerts of organ music, organized by the music and education department, take place in a large exhibition hall - the former refectory of the monastery. The church was designed by Austrian engineer Jan Witt and is one of the best examples of Baroque architecture in the city.  \n\n The filmmakers love shooting the construction of the church and the monastery. Nowadays in the museum are demonstrated in interesting way the peculiarities of the appearance and development of the main religions of the world. The museum actively conducts scientific, educational work as well as excursions. \n\n  An exposition has following thematic divisions: “Religions of the ancient world”, “Judaism”, “Early Christianity”, “Armenian church”, “The history of Roman Catholic church”, “Ukrainian Greek Catholic church”, “Orthodoxy in Ukraine”, “Protestantism”, “Islam”, “Buddhism”. Lviv, 1 Muzeina Sq.\n Tue-Sun\n 10 AM - 6 PM\n 5 UAH - for adults, 2 UAH - for students, children.', '49.8432485', '24.033764571735688') ," +

                        "('museum_5', 'Pharmacy-museum', 'Stavropihiyska street,3', '4.6', 'Pharmacy-Museum Under the Black Eagle is a functioning pharmacy-museum, the oldestfrom the existing pharmacies in Lviv, located on Rynok Square in the corner the house where Drukarska and Stavropigiyska streets begin. IN unique pharmacy museum complex are displayed more than three thousand rare exhibits collected by scientists and pharmacists and enthusiastic collectors. On October 10, 1774, Franz Wilhelm Natorp, a military pharmacist, bought a house from Anna Humenetska for PLN 22,000. Its co-owner was Carl Scherf. In the same year, Karl Schaeffer commissioned a project to build a new townhouse from architect Peter Poleiowski. ', '49.842872150000005', '24.032575392706377'), " +

                        "('museum_6', 'Arsenal-muaeum', 'Pidvalna street, 5', '4.7', 'The City Arsenal is a fortification in Lviv, built in 1554-1556. Monument of Renaissance defensive architecture. Today, the building houses the Arsenal Weapons Museum, a department of the Lviv Historical Museum. The oldest city arsenal was built up to the Low Wall by 1430. After the fire of 1527, the arsenal was dismantled and by 1556 a new single-storey arsenal building was added to the High Wall of Lviv, the remains of which can be seen from Arsenalna Street. It was dedicated to St. Michael. After a new fire, the arsenal was rebuilt as a two-story one (1574-1575), and from 1582 a mansion for casting guns was set up next to it.', '49.8411656', '24.03535200075578'), " +

                        "('museum_7', 'Olena Kulchycka museum', 'Lystopadovogo Chynu street, 7', '4.6', 'The department of the Andrei Sheptytsky National Museum in Lviv, opened in 1971, is located in the former apartment and creative studio of the artist, which, like all works of art, was donated to the Ukrainian people in the person of the National Museum in Lviv. In the four spacious rooms of the museum there is an exposition that fully reveals the artists work: painting, graphics, decorative and applied arts, journalistic heritage, memorial items and archival materials.', '49.8380505', '24.0158555') ," +

                        "('museum_8', 'Lviv National Gallery of Arts named after BG Voznytsky', 'Stefanyka streer, 3', '4.6', 'Lviv National Gallery of Arts named after BG Voznytsky (until February 4, 1998 - Lviv Art Gallery) - the largest art museum in Ukraine. It is located at 3 Stefanyka Street, almost opposite the Stefanyk Lviv National Scientific Library. The total number of exhibits is over 62 thousand. The decision to establish a gallery of European art in Lviv was made by the city magistrate in 1897. In 1902, the first exhibits were the works of artists: V. Leopolsky (Death of the poet Acerna, Stingy),J. Styky, F. Vygzhivalsky, J. Matejko, E. Okun.', '49.8370473', '24.025374'), " +

                        "('museum_9', 'Museum of glass', 'Rynok square, 2', '4,4', 'The first Museum of Glass in Lviv was founded in 1992 by the famous Ukrainian glazier, rector of the Lviv National Academy of Arts, Professor Andriy Bokotei, in order to exhibit the results of international symposia of tempered glass. Museum of Glass in the premises of the Bandinelli Palace on Sq. Market 2 started operating in 2006, and the exposition, which is now operational, was renovated and opened on April 19, 2013. The first hall of the museum is dedicated to historical glass. Most of the exhibits come from the collection of the Lviv Historical Museum and represent glass that was either made in Western Ukraine or lived here.', '49.8425933', '24.0323956'), " +

                        "('museum_10', 'Lviv Literary Memorial Museum of Ivan Franko', 'Ivana Franka street, 150-15', '4.8', 'Lviv National Literary Memorial Museum of Ivan Franko is a museum in Lviv, at 150/152 Ivana Franka Street. Located in the house of Ivan Franko, where he lived in 1902 - 1916. The museum was opened on October 10, 1940. On January 26, 1940, at the initiative of the Union of Soviet Writers, the Peoples Commissariat of Education of the Ukrainian SSR (then the Ministry of Education) decided to open the Ivan Franko Literary Memorial Museum in Lviv at the writers house.', '49.366670', '23.362742') "

        );
        db.execSQL(
                "INSERT INTO " + BANKS + " (" + IMGSOURCE + ", " + HEADER + ", " + ADDRESS + "," + MARK + "," + INFO + "," + MAPX + "," + MAPY + ") VALUES " +
                        "('privat_atm1', 'ATM PrivatBank', 'Horodotska Street, 137', '3.7', 'PrivatBank  is the largest commercial bank in Ukraine, in terms of the number of clients, assets value, loan portfolio and taxes paid to the national budget. PrivatBank has its headquarters in Dnipro, in central Ukraine.\\n\\nOn 18 December 2016, the bank was nationalized by the government of Ukraine to protect its 20 million customers and to preserve financial stability in the country.A forensic audit performed by Kroll showed that the bank had been subject to large scale coordinated fraud before nationalisation resulting in losses of at least US$5.5 billion.', '49.8208086', '23.9139836'), " +

                        "('ukrsib_at', 'ATM UkrSibBank', 'Heroiv UPA Street, 18', '3.7', '', '49.8332697', '24.0012486'), " +

                        "('kredo_bank', 'Kredobank', 'Green Street, 131', '4.0', '', '49.840216749999996', '24.02228812406451'), " +

                        "('oshad_atm', 'ATM Oschabadk', 'Volodymyr Velyky Street, 51', '3.4', '', '49.841226749980936', '24.02224816067401'), " +

                        "('privat_atm2', 'ATM PrivatBank', 'Stryjska Street, 85A', '3.8', '', '49.80678695', '24.02511384694275'), " +

                        "('oshad_bank', 'Oschadbank', 'Valova Street, 9', '2.7', '', '49.841952', '24.0315921'), " +

                        "('otp_bank', 'OTP Bank', 'Vyacheslav Chornovil Avenue, 59', '3.5', '', '49.8208086', '23.9139836'), " +

                        "('oksi_bank', 'Oxy Bank', 'street 50th anniversary of the Ukrainian Insurgent Army', '3.0', '', '49.87505639890995', '24.03706103734478'), " +

                        "('lviv_bank', 'Bank of Lviv', 'Gazova Street, 17', '3.7', '', '49.8208086', '23.9139836'), " +

                        "('vs_bank', 'VS Bank', 'Vyacheslav Chornovil Avenue, 13', '3.2', '', '49.8208086', '23.9139836')"


        );

        db.execSQL(
                "INSERT INTO " + HOTELS + " (" + IMGSOURCE + ", " + HEADER + ", " + ADDRESS + "," + MARK + "," + INFO + "," + MAPX + "," + MAPY + ") VALUES " +
                        "('test_img', 'header1', 'address1 ', '2.1', 'info1', '12', '12'), " +
                        "('test_img', 'header2', 'address2', '3.1', 'info2', '12', '14'), " +
                        "('test_img', 'header3', 'address3', '4.1', 'info3', '12', '12'), " +
                        "('test_img', 'header4', 'address4', '5.1', 'info4', '14', '12'), " +
                        "('test_img', 'header5', 'address5', '6.1', 'info5', '12', '12'), " +
                        "('test_img', 'header6', 'address6', '7.1', 'info6', '12', '16')"

        );

        db.execSQL(
                "INSERT INTO " + PARKS + " (" + IMGSOURCE + ", " + HEADER + ", " + ADDRESS + "," + MARK + "," + INFO + "," + MAPX + "," + MAPY + ") VALUES " +
                        "('test_img', 'header1', 'address1', '2.1', 'info1', '12', '12'), " +
                        "('test_img', 'header2', 'address2', '3.1', 'info2', '12', '14'), " +
                        "('test_img', 'header3', 'address3', '4.1', 'info3', '12', '12'), " +
                        "('test_img', 'header4', 'address4', '5.1', 'info4', '14', '12'), " +
                        "('test_img', 'header5', 'address5', '6.1', 'info5', '12', '12'), " +
                        "('test_img', 'header6', 'address6', '7.1', 'info6', '12', '16')"

        );

        db.execSQL(
                "INSERT INTO " + SHOPPING + " (" + IMGSOURCE + ", " + HEADER + ", " + ADDRESS + "," + MARK + "," + INFO + "," + MAPX + "," + MAPY + ") VALUES " +
                        "('test_img', 'header1', 'address1', '2.1', 'info1', '12', '12'), " +
                        "('test_img', 'header2', 'address2', '3.1', 'info2', '12', '14'), " +
                        "('test_img', 'header3', 'address3', '4.1', 'info3', '12', '12'), " +
                        "('test_img', 'header4', 'address4', '5.1', 'info4', '14', '12'), " +
                        "('test_img', 'header5', 'address5', '6.1', 'info5', '12', '12'), " +
                        "('test_img', 'header6', 'address6', '7.1', 'info6', '12', '16')"

        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + NEWS);
        db.execSQL("DROP TABLE IF EXISTS " + MUSEUMS);
        db.execSQL("DROP TABLE IF EXISTS " + BANKS);
        db.execSQL("DROP TABLE IF EXISTS " + HOTELS);
        db.execSQL("DROP TABLE IF EXISTS " + PARKS);
        db.execSQL("DROP TABLE IF EXISTS " + SHOPPING);
        onCreate(db);
    }

    public List<NewsPack> getAllNews() {
        SQLiteDatabase database = getReadableDatabase();
        List<NewsPack> newsList = new ArrayList<>();
        try (Cursor cursor = database.rawQuery("SELECT * FROM " + NEWS, null)) {
            if (cursor.moveToFirst()) {
                do {
                    NewsPack newsPack = new NewsPack();
                    newsPack.setId(cursor.getLong(cursor.getColumnIndex(ID)));
                    newsPack.setHeader(cursor.getString(cursor.getColumnIndex(HEADER)));
                    newsPack.setImgSource(cursor.getString(cursor.getColumnIndex(IMGSOURCE)));
                    newsPack.setAddress(null);
                    newsPack.setMark(null);
                    newsPack.setInfo(cursor.getString(cursor.getColumnIndex(INFO)));
                    newsPack.setMapX(1);
                    newsPack.setMapY(1);
                    newsList.add(newsPack);
                } while (cursor.moveToNext());
            }
        }
        return newsList;
    }
    public List<NewsPack> getAllMuseums() {
        SQLiteDatabase database = getReadableDatabase();
        List<NewsPack> newsList = new ArrayList<>();
        try (Cursor cursor = database.rawQuery("SELECT * FROM " + MUSEUMS, null)) {
            if (cursor.moveToFirst()) {
                do {
                    NewsPack newsPack = new NewsPack();
                    newsPack.setId(cursor.getLong(cursor.getColumnIndex(ID)));
                    newsPack.setHeader(cursor.getString(cursor.getColumnIndex(HEADER)));
                    newsPack.setImgSource(cursor.getString(cursor.getColumnIndex(IMGSOURCE)));
                    newsPack.setAddress(cursor.getString(cursor.getColumnIndex(ADDRESS)));
                    newsPack.setMark(cursor.getString(cursor.getColumnIndex(MARK)));
                    newsPack.setInfo(cursor.getString(cursor.getColumnIndex(INFO)));
                    newsPack.setMapX(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPX))));
                    newsPack.setMapY(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPY))));
                    newsList.add(newsPack);
                } while (cursor.moveToNext());
            }
        }
        return newsList;
    }

    public List<NewsPack> getAllHotels() {
        SQLiteDatabase database = getReadableDatabase();
        List<NewsPack> newsList = new ArrayList<>();
        try (Cursor cursor = database.rawQuery("SELECT * FROM " + HOTELS, null)) {
            if (cursor.moveToFirst()) {
                do {
                    NewsPack newsPack = new NewsPack();
                    newsPack.setId(cursor.getLong(cursor.getColumnIndex(ID)));
                    newsPack.setHeader(cursor.getString(cursor.getColumnIndex(HEADER)));
                    newsPack.setImgSource(cursor.getString(cursor.getColumnIndex(IMGSOURCE)));
                    newsPack.setAddress(cursor.getString(cursor.getColumnIndex(ADDRESS)));
                    newsPack.setMark(cursor.getString(cursor.getColumnIndex(MARK)));
                    newsPack.setInfo(cursor.getString(cursor.getColumnIndex(INFO)));
                    newsPack.setMapX(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPX))));
                    newsPack.setMapY(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPY))));
                    newsList.add(newsPack);
                } while (cursor.moveToNext());
            }
        }
        return newsList;
    }

    public List<NewsPack> getAllParks() {
        SQLiteDatabase database = getReadableDatabase();
        List<NewsPack> newsList = new ArrayList<>();
        try (Cursor cursor = database.rawQuery("SELECT * FROM " + PARKS, null)) {
            if (cursor.moveToFirst()) {
                do {
                    NewsPack newsPack = new NewsPack();
                    newsPack.setId(cursor.getLong(cursor.getColumnIndex(ID)));
                    newsPack.setHeader(cursor.getString(cursor.getColumnIndex(HEADER)));
                    newsPack.setImgSource(cursor.getString(cursor.getColumnIndex(IMGSOURCE)));
                    newsPack.setAddress(cursor.getString(cursor.getColumnIndex(ADDRESS)));
                    newsPack.setMark(cursor.getString(cursor.getColumnIndex(MARK)));
                    newsPack.setInfo(cursor.getString(cursor.getColumnIndex(INFO)));
                    newsPack.setMapX(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPX))));
                    newsPack.setMapY(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPY))));
                    newsList.add(newsPack);
                } while (cursor.moveToNext());
            }
        }
        return newsList;
    }

    public List<NewsPack> getAllShopping() {
        SQLiteDatabase database = getReadableDatabase();
        List<NewsPack> newsList = new ArrayList<>();
        try (Cursor cursor = database.rawQuery("SELECT * FROM " + SHOPPING, null)) {
            if (cursor.moveToFirst()) {
                do {
                    NewsPack newsPack = new NewsPack();
                    newsPack.setId(cursor.getLong(cursor.getColumnIndex(ID)));
                    newsPack.setHeader(cursor.getString(cursor.getColumnIndex(HEADER)));
                    newsPack.setImgSource(cursor.getString(cursor.getColumnIndex(IMGSOURCE)));
                    newsPack.setAddress(cursor.getString(cursor.getColumnIndex(ADDRESS)));
                    newsPack.setMark(cursor.getString(cursor.getColumnIndex(MARK)));
                    newsPack.setInfo(cursor.getString(cursor.getColumnIndex(INFO)));
                    newsPack.setMapX(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPX))));
                    newsPack.setMapY(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPY))));
                    newsList.add(newsPack);
                } while (cursor.moveToNext());
            }
        }
        return newsList;
    }

    public List<NewsPack> getAllBanks() {
        SQLiteDatabase database = getReadableDatabase();
        List<NewsPack> newsList = new ArrayList<>();
        try (Cursor cursor = database.rawQuery("SELECT * FROM " + BANKS, null)) {
            if (cursor.moveToFirst()) {
                do {
                    NewsPack newsPack = new NewsPack();
                    newsPack.setId(cursor.getLong(cursor.getColumnIndex(ID)));
                    newsPack.setHeader(cursor.getString(cursor.getColumnIndex(HEADER)));
                    newsPack.setImgSource(cursor.getString(cursor.getColumnIndex(IMGSOURCE)));
                    newsPack.setAddress(cursor.getString(cursor.getColumnIndex(ADDRESS)));
                    newsPack.setMark(cursor.getString(cursor.getColumnIndex(MARK)));
                    newsPack.setInfo(null);
                    newsPack.setMapX(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPX))));
                    newsPack.setMapY(Double.parseDouble(cursor.getString(cursor.getColumnIndex(MAPY))));
                    newsList.add(newsPack);
                } while (cursor.moveToNext());
            }
        }
        return newsList;
    }




}

