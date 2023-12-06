package com.example.harslundhorsemandshipback.config;

import com.example.harslundhorsemandshipback.about_me.models.AboutMe;
import com.example.harslundhorsemandshipback.practice.models.Practice;
import com.example.harslundhorsemandshipback.practice.repositories.PracticeRepository;
import com.example.harslundhorsemandshipback.price.models.Price;
import com.example.harslundhorsemandshipback.service.models.Service;
import com.example.harslundhorsemandshipback.service.repositories.ServiceRepository;
import org.hibernate.annotations.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Startdata implements CommandLineRunner {

    @Autowired
    PracticeRepository practiceRepository;

    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public void run(String... args) throws Exception {

        /*------------------------------------- SERVICES EXAMPLES--------------------------------- */
        // Example 1
        Service service1 = new Service();
        service1.setText("Heste message");
        service1.setPriority(1);
        service1.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t39.30808-6/372987982_810383260882829_7639805078016950801_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=dd5e9f&_nc_ohc=NLpMTYYh2lYAX-TPHBP&_nc_ht=scontent-cph2-1.xx&oh=00_AfBKZyYycwMtcNPpkUqYoe-IBpg1Y0OLA_AeWaGjgUrtpw&oe=65726623");
        serviceRepository.save(service1);


        // Example 2
        Service service2 = new Service();
        service2.setText("Equine Nutrition Consultation");
        service2.setPriority(2);
        service2.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t1.6435-9/62308307_469352250537159_6245548258509193216_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=7f8c78&_nc_ohc=t7STiOLGxqQAX-JrvSE&_nc_ht=scontent-cph2-1.xx&oh=00_AfAW79PzIR91_EI2tLg9CkSDQVAED4E-u8OkeqTyD_Mozg&oe=65951E81");
        serviceRepository.save(service2);

        // Example 3
        Service service3 = new Service();
        service3.setText("Show Jumping Training");
        service3.setPriority(3);
        service3.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t39.30808-6/379444330_821951039726051_6146252093241825330_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=dd5e9f&_nc_ohc=a1PBMLJcQZ4AX_phOkz&_nc_ht=scontent-cph2-1.xx&oh=00_AfB4vDgX4nB1NWwAgc8fjtZawP9bUPnGlBGAtF87SA0C5g&oe=6572F438");
        serviceRepository.save(service3);

        // Example 4
        Service service4 = new Service();
        service4.setText("Equine Dental Care");
        service4.setPriority(4);
        service4.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t39.30808-6/372987982_810383260882829_7639805078016950801_n.jpg?_nc_cat=111&ccb=1-7&_nc_sid=dd5e9f&_nc_ohc=NLpMTYYh2lYAX-TPHBP&_nc_ht=scontent-cph2-1.xx&oh=00_AfBKZyYycwMtcNPpkUqYoe-IBpg1Y0OLA_AeWaGjgUrtpw&oe=65726623");
        serviceRepository.save(service4);

        // Example 5
        Service service5 = new Service();
        service5.setText("Therapeutic Riding Sessions");
        service5.setPriority(5);
        service5.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t39.30808-6/379444330_821951039726051_6146252093241825330_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=dd5e9f&_nc_ohc=a1PBMLJcQZ4AX_phOkz&_nc_ht=scontent-cph2-1.xx&oh=00_AfB4vDgX4nB1NWwAgc8fjtZawP9bUPnGlBGAtF87SA0C5g&oe=6572F438");
        serviceRepository.save(service5);

        /*------------------------------------- PRACTICES EXAMPLES--------------------------------- */

        // Practice for Horse Massage
        Practice practice1 = new Practice();
        practice1.setText("Our certified massage therapists use a combination of Swedish and deep tissue massage techniques, focusing on key muscle groups to improve circulation and reduce tension.");
        practice1.setPriority(1);
        practice1.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t1.6435-9/60169117_451191535686564_2352598345320497152_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=7f8c78&_nc_ohc=954MLYf4hrwAX-MJ3A_&_nc_ht=scontent-cph2-1.xx&oh=00_AfDCE7Th5uMCyNnH_wSil31EMOT386BiHS7QphcVL4EltA&oe=6595143B");
        practiceRepository.save(practice1);

        // Practice for Equine Nutrition Consultation
        Practice practice2 = new Practice();
        practice2.setText("Our certified massage therapists use a combination of Swedish and deep tissue massage techniques, focusing on key muscle groups to improve circulation and reduce tension.");
        practice2.setPriority(2);
        practice2.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t1.6435-9/62308307_469352250537159_6245548258509193216_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=7f8c78&_nc_ohc=t7STiOLGxqQAX-JrvSE&_nc_ht=scontent-cph2-1.xx&oh=00_AfAW79PzIR91_EI2tLg9CkSDQVAED4E-u8OkeqTyD_Mozg&oe=65951E81");
        practiceRepository.save(practice2);

        // Practice for Show Jumping Training
        Practice practice3 = new Practice();
        practice3.setText("Show jumping training emphasizes a progressive approach to jumping techniques. Our trainers focus on building a strong foundation of basic skills, including approach, takeoff, and landing, to ensure a successful and safe jumping experience.");
        practice3.setPriority(3);
        practice3.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t39.30808-6/379444330_821951039726051_6146252093241825330_n.jpg?_nc_cat=105&ccb=1-7&_nc_sid=dd5e9f&_nc_ohc=a1PBMLJcQZ4AX_phOkz&_nc_ht=scontent-cph2-1.xx&oh=00_AfB4vDgX4nB1NWwAgc8fjtZawP9bUPnGlBGAtF87SA0C5g&oe=6572F438");
        practiceRepository.save(practice3);

        // Practice for Equine Dental Care
        Practice practice4 = new Practice();
        practice4.setText("Equine dental care involves routine check-ups and specialized treatments. Our practitioners perform dental examinations, floating, and corrective procedures to maintain your horse's oral health.");
        practice4.setPriority(4);
        practice4.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t1.6435-9/60169117_451191535686564_2352598345320497152_n.jpg?_nc_cat=104&ccb=1-7&_nc_sid=7f8c78&_nc_ohc=954MLYf4hrwAX-MJ3A_&_nc_ht=scontent-cph2-1.xx&oh=00_AfDCE7Th5uMCyNnH_wSil31EMOT386BiHS7QphcVL4EltA&oe=6595143B");
        practiceRepository.save(practice4);

        // Practice for Therapeutic Riding Sessions
        Practice practice5 = new Practice();
        practice5.setText("Therapeutic riding sessions are tailored to address specific emotional and mental well-being goals. Our certified therapists use a combination of riding exercises and horse interactions to promote healing and personal growth.");
        practice5.setPriority(5);
        practice5.setImage("https://scontent-cph2-1.xx.fbcdn.net/v/t1.6435-9/62308307_469352250537159_6245548258509193216_n.jpg?_nc_cat=110&ccb=1-7&_nc_sid=7f8c78&_nc_ohc=t7STiOLGxqQAX-JrvSE&_nc_ht=scontent-cph2-1.xx&oh=00_AfAW79PzIR91_EI2tLg9CkSDQVAED4E-u8OkeqTyD_Mozg&oe=65951E81");
        practiceRepository.save(practice5);

        /*------------------------------------- PRICES EXAMPLES--------------------------------- */
        Price price = new Price();
        price.setText("<h1>Min Priser</h1>\n" +
                "            <p>Jeg tilbyder mange former for træning, kurser og undervisning,\n" +
                "                hvis du har forespørgsler eller ideer er du altid velkommen til at kontakte mig.</p>\n" +
                "\n" +
                "            <div class=\"prices-blocks\">\n" +
                "                <div class=\"price-line\"><hr></div>\n" +
                "                <div>\n" +
                "                    <h2>Træning:</h2>\n" +
                "                    <p>Pris pr måned 8000 kr. inklusiv moms. (6400 + moms)</p>\n" +
                "                    <p>Prisen er inklusiv, træning 4-6 gange om ugen. opstaldning på boks eller løsdrift, fuld fodring og pasning. OBS. jeg giver 10% rabat hvis du har 2 heste i træning samtidig.</p>\n" +
                "                </div>\n" +
                "\n" +
                "                <div>\n" +
                "                    <h2>Kurser:</h2>\n" +
                "                    <p>En-dags kurser: 4000 kr. + moms + kørsel (2,75 pr km). (max 10 kursus deltagere)</p>\n" +
                "                    <p>To-dages kurser: 8000 kr. + moms + kørsel + overnatning osv. (max 10 kursusdeltagere). Her er inkluderet 2 timers teori en af dagene.</p>\n" +
                "                </div>\n" +
                "            </div>");
        practiceRepository.save(practice5);

        /*------------------------------------- ABOUT EXAMPLES--------------------------------- */

        AboutMe aboutMe = new AboutMe();
        aboutMe.setText("\n" +
                "            <h1>En kort fortælling om mig:</h1>\n" +
                "            <p>\n" +
                "                Mit navn er Pernille Harslund, og jeg er uddannet C-træner og Fysiurgisk Hesteterapeut.\n" +
                "                Jeg har mere end 15 års erfaring med at arbejde og håndtere heste til dagligt. De sidste 8 år har jeg haft min egen trænings-/undervisnings stald i Nordsjælland kørende ved Hårkildegård Isheste, men jeg bruger fortsat rigtig meget tid på at videre udvikle mig, lære mere og deltager i en masse kurser og foredrag år efter år. Lige nu er jeg rejst til Island for at studere på Hólar, hvor jeg samtidig har haft muligheden for at arbejde og være under vingen hos én af de dygtigste trænere Mette Mannseth.\n" +
                "            </p>\n" +
                "            <p>Ved hjælp af al min viden og en meget bred redskabskasse inden for emner som fx:</p>\n" +
                "            <ul>\n" +
                "                <li>Træning (grunddressur/gangartstræning/spring)</li>\n" +
                "                <li>Problemløsning</li>\n" +
                "                <li>Longearbejde</li>\n" +
                "                <li>Tilridning</li>\n" +
                "                <li>Anatomi/fysiologi af både hest & rytter</li>\n" +
                "                <li>Massage</li>\n" +
                "                <li>Kranio-Sakral terapi</li>\n" +
                "                <li>Ledmobilisering</li>\n" +
                "                <li>Laserterapi</li>\n" +
                "                <li>Akupressur</li>\n" +
                "                <li>Udstrækning</li>\n" +
                "                <li>Sadler/udstyr</li>\n" +
                "                <li>Ernæring/foder</li>\n" +
                "                <li>Hove</li>\n" +
                "                <li>Sygdom & sundhed</li>\n" +
                "                <li>Ryttertræning & yoga</li>\n" +
                "                <li>Motivation og meget mere</li>\n" +
                "            </ul>\n" +
                "\n" +
                "            <p>Kan jeg hjælpe dig og din hest på bedste vis, ved at jeg altid har en anden 'kasket' at tage på. Og det bedste af det hele er, at det foregår på hestens præmisser med hjertet på det rette sted! Jeg ønsker at skabe nærvær med hestene, så vi får en glad og samarbejdsvillig hest, som er tilstede med os.</p>\n" +
                "            <p>Her på siden vil jeg dele ud af min motivation, viden, inspiration eller bare opdatere jer på, hvad der sker på min rejse :-)</p>\n" +
                "\n" +
                "        </div>\n");

    }
}
