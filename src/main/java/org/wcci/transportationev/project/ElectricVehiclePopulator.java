package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.ElectricVehicle;
import org.wcci.transportationev.project.storage.ElectricVehicleStorage;

@Component
public class ElectricVehiclePopulator implements CommandLineRunner {

        private ElectricVehicleStorage electricVehicleStorage;

        public ElectricVehiclePopulator(ElectricVehicleStorage electricVehicleStorage) {
                this.electricVehicleStorage = electricVehicleStorage;
        }

        @Override
        public void run(String... args) throws Exception {

                // Audi e-tron Sportback EV to test data
                ElectricVehicle audiA6Etron = new ElectricVehicle("Audi", "A6 e-tron", "Minnie Mink", "Sedan", 80000,
                                true, 725, 400, 80, 5.1, 125, "AWD", 10, 30, 5, false, true, false, 29.5, 3, 4.5, false,
                                "./images/ev19.jpg",
                                "https://assets.newatlas.com/dims4/default/d8067d3/2147483647/strip/true/crop/974x649+37+105/resize/1200x800!/quality/90/?url=http%3A%2F%2Fnewatlas-brightspot.s3.amazonaws.com%2F82%2Fe9%2Fa4b5bf1141f29737e05d03ae7345%2Fscreen-shot-2021-04-19-at-7.39.34%20PM.png",
                                "The A6 e-tron is a sleek sedan with all of the brand's cutting-edge technology. Audi says it's targeting a driving range of more than 400 miles per charge.\n"
                                                + "\n"
                                                + "The A6 e-tron is powered by two electric motors with one driving each axle, which endows it with all-wheel drive. Also standard will be DC fast-charging capability that Audi claims will enable the car to charge its battery from five percent to 80 percent of capacity in just 25 minutes.\n"
                                                + "\n"
                                                + "Unlike the gasoline-powered A6 sedan, the A6 e-tron hides a hatchback in its sloped rear roofline, which should give buyers a large cargo area similar to that of the current A7.");
                electricVehicleStorage.saveElectricVehicle(audiA6Etron);

                ElectricVehicle audiETronSB = new ElectricVehicle("Audi", "e-tron Sportback", "Cliff Booth", "Sedan",
                                69100, true, 725, 218, 77, 5.5, 118, "AWD", 10, 30, 5, false, true, false, 27.2, 3, 4.5,
                                false,
                                "./images/ev01.jpg",
                                "https://www.cnet.com/a/img/jF9XjA7gNJLQQo9ivIG6zEno4Qo=/2019/11/19/efbb58b4-bc42-46c6-8142-16ff002fd12d/ogi-audi-e-tron-sportback-2020-ogi.jpg",
                                "2021 Audi e-tron sportback electric vehicle. The new model features standard EPA and CE certification.\n"
                                                + "\n"
                                                + "The Model S Sportback features an all electric engine, while the smaller, sportier version replaces the 3.2-liter V-6 that would replace the smaller V-6 found in the S-Class. The rear seats (or lack thereof) are identical to the S-Class models, but there's no dual-slip differential. This means it's a more comfortable ride.\n"
                                                + "\n"
                                                + "Other new features include a 3.5-liter V-6 in both passenger and cargo space, electric skid roll, heated front seats, air bags and all-new rear wheels.\n"
                                                + "\n"
                                                + "The Model S Sportback, along with the all electric engine, also comes equipped with six-piston calipers along with three-way hydraulics. All interior dimensions are as follows:\n"
                                                + "\n"
                                                + "• S-Class: 2x6L, 19-inch alloy wheels, Michelin Pilot Pilot, SAE A14-T (2mm) in all valves.\n"
                                                + "\n"
                                                + "• New front fascia, 6-inch alloy hubs, aluminum-machined, two-piece frame.",
                                "I could not agree more.  Love Audi, and love this vehicle!");
                electricVehicleStorage.saveElectricVehicle(audiETronSB);

                ElectricVehicle bmwIFour = new ElectricVehicle("BMW", "I4", "Patrick Bateman", "Sedan", 56395, true,
                                725, 300, 90, 5.7, 118, "RWD", 8.75, 30, 5, false, true, true, 16.6, 0, 4.5, true,
                                "./images/ev20.jpg",
                                "https://evglobe.com/wp-content/uploads/2020/09/bmw-i4-m-electric-1700x956.jpg",
                                "Silent acceleration, perfected engineering, and seating for five make this a sporty all-electric alternative.\n"
                                                + "\n"
                                                + "BMW’s new front-end styling, which debuted with the 4 Series coupe and convertible, is the dominant feature on the i4. Whether you think it harkens back to BMWs of yore like the 303, which was the first BMW to use the 'twin-kidney grille,' or looks more like walrus tusks, is up to you. But it makes a statement either way.\n"
                                                + "\n"
                                                + "The rest of the car carries a mix of modern and historical BMW styling cues, such as the swept-back covers over the standard LED headlights, the concave scoops along the doors, and the vent behind the front wheel that carries down and along the door sills. BMW’s traditional “Hofmeister kink” styling element, where the rear roof pillar has a forward bend as it meets the side-window glass, is present.");
                electricVehicleStorage.saveElectricVehicle(bmwIFour);

                ElectricVehicle bmwIX = new ElectricVehicle("BMW", "IX", "Timothy Bryce", "Crossover", 84194, true, 725,
                                300, 85, 4.6, 124, "AWD", 11, 35, 5, false, true, true, 27.4, 0, 4.5, true,
                                "./images/ev21.jpg",
                                "https://cdn.vox-cdn.com/thumbor/VuSodeasyFU7eraSHHxeV7tYVE0=/1400x1400/filters:format(jpeg)/cdn.vox-cdn.com/uploads/chorus_asset/file/22551750/P90422118_highRes.jpg",
                                "The BMW iX sets a new standard for sustainable luxury in electric SUVs.  The iX is a midsize luxury SUV that's about the same size as the 2021 BMW X5. It seats five in its roomy, airy, and tech-laden cabin. Special attention was used to create the interior with sustainable materials, including some that contain recycled materials.\n"
                                                + "\n"
                                                + "The iX not only debuts hardware, software, design elements, and manufacturing techniques that will influence all future BMWs—it also readies a brand once defined by its appeal to petrolhead driving enthusiasts for an autonomous, electric-powered world.");
                electricVehicleStorage.saveElectricVehicle(bmwIX);

                ElectricVehicle bollingerBTwo = new ElectricVehicle("Bollinger", "B2", "Paul Allen", "Truck", 125000,
                                true, 725, 200, 70, 4.5, 100, "AWD", 10, 75, 4, false, false, false, 86, 8.0, 4.0,
                                false, "./images/ev22.jpg",
                                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/bollinger-b2-3-4-front-1569523201.jpg",
                                "Bollinger: Reinventing trucks not just electrifying them. The most durable, practical electric trucks on the planet. No screens. No plastic. Just truck.\n"
                                                + "\n"
                                                + "The all-electric 2022 Bollinger B2 looks primitive but puts traditional pickup trucks on notice thanks to its impressive capacities and incredible versatility.  Bollinger says the B2's dual electric motors combine for 614 horsepower and 688 lb-ft of torque, which help it tow up to 7500 pounds and carry a payload up to 5001 pounds. Its battery supports fast-charging capability and is estimated to provide a driving range of 200 miles.");
                electricVehicleStorage.saveElectricVehicle(bollingerBTwo);

                ElectricVehicle caddyLyriq = new ElectricVehicle("Cadillac", "Lyriq", "Sean Bateman", "Crossover",
                                59995, true, 725, 300, 80, 4.3, 130, "RWD", 6, 35, 7, true, true, true, 12.6, 0, 4.5,
                                false, "./images/ev23.jpg",
                                "https://www.motortrend.com/uploads/sites/5/2020/08/2023-Cadillac-Lyriq-8.jpg?fit=around%7C875:492",
                                "Meet the Cadillac LYRIQ. An EV that inspires its driver to charge forward to a greater purpose—with every sublime detail.\n"
                                                + "\n"
                                                + "The Lyriq has been designed from the ground up and will ride on General Motors' new scalable battery architecture; the company claims a low center of gravity and a spacious cabin as benefits of the dedicated EV-architecture.");
                electricVehicleStorage.saveElectricVehicle(caddyLyriq);

                ElectricVehicle chevyBolt = new ElectricVehicle("Chevrolet", "Bolt", "Mia Wallace", "Crossover", 37500,
                                false, 725, 247, 120, 7.0, 93, "FWD", 7.5, 60, 5, true, true, false, 16.6, 0, 5.0,
                                false,
                                "./images/ev02.jpg",
                                "https://media.chevrolet.com/content/Pages/news/us/en/2021/feb/0214-boltev-bolteuv/_jcr_content/top_parsys/image.img.jpg/1613335646777.jpg",
                                "2022 Chevrolet Bolt – A new engine and new wheels are all the rage in the Chevrolet Bolt, bringing a new class of SUV for the next generation and the only place in the market where all that is new is the Chevrolet Bolt.\n"
                                                + "\n" + "And it comes with a new, $39,000 msrp.\n" + "\n"
                                                + "That's over $8,000 cheaper than what has been added to the Bolt for the U.S. market, but it's still just 4% more expensive than the U.S. market, which saw 16.4% more sales for the first time over last year.\n"
                                                + "\n"
                                                + "I was interested not once, not twice, but once and for all where the CTM and GM cars are coming from.\n"
                                                + "\n"
                                                + "When they came out, we thought they were not coming just for the U.S., but were going to be coming around the world.\n"
                                                + "\n"
                                                + "So we set about making sure Chevrolet got to where they were able to do that.");
                electricVehicleStorage.saveElectricVehicle(chevyBolt);

                ElectricVehicle fordLightning = new ElectricVehicle("Ford", "F-150 Lightning", "Lauren Hynde", "Truck",
                                42000, true, 725, 230, 75, 4.5, 100, "AWD", 8, 44, 5, true, true, true, 80, 14.1, 5.0,
                                true, "./images/ev24.jpg",
                                "https://thumbor.forbes.com/thumbor/fit-in/960x720/https://www.forbes.com/wheels/wp-content/uploads/2021/05/Ford_F-150_Lightning_Gallery13.jpg",
                                "The all-electric F-150 Lightning has an EPA-estimated range of 230 miles, zero emissions and available Ford Intelligent Backup Power.\n"
                                                + "\n"
                                                + "The Lightning shares much of the regular F-150's body and cabin but swaps that truck's gasoline-powered V-6 and V-8 engine options for a pair of electric motors and one of two different battery packs.");
                electricVehicleStorage.saveElectricVehicle(fordLightning);

                ElectricVehicle fordMustang = new ElectricVehicle("Ford", "Mustang Mach-E Select (eAWD)",
                                "Vincent Vega", "Crossover", 42895, true, 725, 211, 90, 5.2, 130, "e-AWD", 14, 52, 5,
                                false, true, true, 29.7, 4.7, 5.0, true,
                                "./images/ev03.jpg",
                                "https://media.ford.com/content/fordmedia/fna/us/en/products/evs/mustang-mach-e/mustang-mach-e/jcr:content/content/media-section-parsys/textimage_f597/image.img.951.535.jpg/1608221793793.jpg",
                                "2021 Ford Mustang Mach E, All electric vehicle with 9.7-inch display.\n" + "\n"
                                                + "These small and well equipped Ford Mustang Mach E are equipped with a unique design and all-new electric engine. Each Ford Mustang Mach E with the powertrain comes with the latest Ford Mustang technology including Ford-developed electric motors capable of producing a fully automatic transmission. In addition to the powerful torque at 100-to 20,000 RPM, Ford Mustang Mach E features automatic drive, electronically-configurable engine and more horsepower. Also, in addition to the powertrain, the Ford Mustang Mach E also comes equipped with automatic torque converter, which enhances smooth driving for those with different driving tastes.\n"
                                                + "\n"
                                                + "There is an optional 4x32 rear-wheel drive mode available for all four sizes. For more information, please visit Ford.com.");
                electricVehicleStorage.saveElectricVehicle(fordMustang);

                ElectricVehicle genesisGEighty = new ElectricVehicle("Genesis", "G80", "Paul Denton", "Sedan", 50000,
                                true, 725, 310, 90, 4.8, 100, "e-AWD", 9, 22, 5, false, true, false, 13.1, 0, 4.5, true,
                                "./images/ev25.jpg",
                                "https://cdn.motor1.com/images/mgl/rMMlP/s3/2022-genesis-g80-sport.jpg",
                                "Luxury upstart Genesis is dipping its toe in the EV waters with an electric version of its G80 sedan for the 2022 model year, which will be called Electrified G80. The Electrified G80 is nearly indistinguishable from the gasoline-powered model inside and out, which is fine by us as we find the car's styling handsome and its cabin lovely. Genesis has not announced many details about the car's powertrain except that all-wheel drive will be standard, and that range should come in around 265 miles per charge.");
                electricVehicleStorage.saveElectricVehicle(genesisGEighty);

                ElectricVehicle gmcHummer = new ElectricVehicle("GMC", "Hummer EV", "Jimmy McNulty", "Truck", 79995,
                                true, 725, 350, 75, 3.0, 100, "AWD", 12, 30, 5, true, true, false, 80, 11.3, 4.5, true,
                                "./images/ev26.jpg",
                                "https://media.assets.sincrod.com/websites/content/gmps-cadbuick-fl//ef684d2057a04f438dd4d02210f22a9f_1920x750.jpg",
                                "Feel the power of silence with the first of its breed HUMMER EV electric truck. With 1000 HP and 0-60 in 3 seconds, a quiet revolution is coming.\n"
                                                + "\n"
                                                + "The new pickup is shaping up to be quite the beast, with up to 1000 horsepower from its top powertrain option, which uses three electric motors, offers an estimated range of 350 miles per charge, and a leaps to 60 mph in a claimed 3.0 seconds. The Hummer also features removable roof panels, an optional adjustable air suspension, and a cool four-wheel steering feature that allows it to 'crab' sideways—drive diagonally—all of which should make it fun to take off-road.");
                electricVehicleStorage.saveElectricVehicle(gmcHummer);

                ElectricVehicle hyundaiIoniq = new ElectricVehicle("Hyundai", "Ioniq", "Joe Cabot", "Sedan", 33245,
                                true, 725, 170, 133, 10, 102, "FWD", 5.8, 60, 5, false, true, false, 23, 0, 4.0, false,
                                "./images/ev04.jpg",
                                "https://media.ed.edmunds-media.com/hyundai/ioniq-hybrid/2020/oem/2020_hyundai_ioniq-hybrid_4dr-hatchback_limited_fq_oem_1_1600.jpg",
                                "2021 Hyundai Ioniq electric vehicle\n" + "\n"
                                                + "I have been a Hyundai Ioniq owner since 2001. I work with a car of every type, including a Kia i8, i8 Premium model, and I have made one new car during the past 11 years or so. Here are some tips for your Toyota or Lowe's dealership that I know of, and would recommend to a Toyota owner:\n"
                                                + "\n" + "1. Keep your vehicle well ventilated.\n" + "\n"
                                                + "2. Use a large open window to bring one foot level below the vehicle to help protect it from moisture.\n"
                                                + "\n"
                                                + "3. Check your window to make sure the windows are sealed and keep those windows open and dry.\n"
                                                + "\n" + "4. Keep your car clean with an odor-free paint application.\n"
                                                + "\n"
                                                + "5. If possible, cover your vehicle with plastic that is a little harder to get out of the car - make sure that the plastic and paint work together to eliminate air and fog.\n"
                                                + "\n"
                                                + "6. If you are not in the Toyota or Lowe's area, take the car outside for a few hours and check outside for anything that may be contaminated with debris and dirt on the curb.\n"
                                                + "\n" + "7. The car door is secure.\n" + "\n"
                                                + "8. Use a metal plate that does not interfere with your window.\n"
                                                + "\n"
                                                + "If it is a large flat-panel TV or TV stand, make sure it is completely sealed in the clear plastic bag.\n"
                                                + "\n" + "9. Cover your car",
                                "I was planning on purchasing a 2021 Hyundai Ioniq EV, but after reading this review I am definitely going with Tesla!");
                electricVehicleStorage.saveElectricVehicle(hyundaiIoniq);

                ElectricVehicle hyundaiIoniqFive = new ElectricVehicle("Hyundai", "Ioniq 5", "William 'Bunk' Moreland",
                                "Crossover", 45000, true, 725, 225, 125, 5.2, 115, "AWD", 7.75, 18, 5, false, true,
                                false, 18.8, 0.85, 4.5, true, "./images/ev27.jpg",
                                "https://www.hyundai.com/content/dam/hyundai/ww/en/images/find-a-car/pip/eco/ioniq5/worldpremiere/ioniq5-ne-world-premiere-stg-m.jpg",
                                "Based on Hyundai's '45' EV concept, IONIQ 5 will be the first car mated with the recently revealed Electric-Global Modular Platform (E-GMP).\n"
                                                + "\n"
                                                + "More than just another EV, the Ioniq 5 brings several clever features—such as a solar roof, an augmented reality head-up display, and 800-volt electric architecture that enables relatively quick charging in places where DC fast charging is available—that will help it to stand out.");
                electricVehicleStorage.saveElectricVehicle(hyundaiIoniqFive);

                ElectricVehicle hyundaiKona = new ElectricVehicle("Hyundai", "Kona", "Alabama Whitman", "Crossover",
                                37900, true, 725, 258, 120, 6.4, 96, "FWD", 9, 54, 5, false, true, false, 19.2, 0, 5.0,
                                false,
                                "./images/ev05.jpg",
                                "https://cdn.motor1.com/images/mgl/qz7Eg/s1/hyundai-kona-electric-restyling-2021.webp",
                                "Among hybrid and electric SUVs, the Hyundai Kona Electric offers great driving range and swift acceleration.  It provides punchy performance from its 201-horsepower electric motor and can go more than 250 miles before recharging.\n"
                                                + "\n"
                                                + "Like the regular Kona, the Electric version drives well and has decently zippy acceleration. Being electric, it doesn't suffer the regular Kona's turbo lag.\n"
                                                + "\n"
                                                + "The Kona is an excellent choice if you're looking for a smaller SUV with carlike driving manners.");
                electricVehicleStorage.saveElectricVehicle(hyundaiKona);

                ElectricVehicle jaguarIpace = new ElectricVehicle("Jaguar", "I-Pace", "Mallory Knox", "Crossover",
                                69900, true, 725, 234, 76, 4.5, 124, "AWD", 10.2, 90, 5, false, true, true, 23.2, 1.0,
                                5.0, false,
                                "./images/ev06.jpg",
                                "https://cdn.motor1.com/images/mgl/qvVZR/s1/jaguar-i-pace-lo-show-di-presentazione-dalle-19-del-1-marzo.jpg",
                                "2021 Jaguar I-Pace electric vehicle\n" + "\n" + "The best of the best of the best\n"
                                                + "\n" + "The biggest problem I'm trying to solve\n" + "\n"
                                                + "The car I want to purchase\n" + "\n"
                                                + "The guy who thinks I'm crazy\n" + "\n"
                                                + "This article is about, for example, the car I bought. The car I wanted could not meet the 'rules' for a successful sale. This car, though I'd consider it, might well be an exception.\n"
                                                + "\n"
                                                + "At the least, this doesn't mean that the car I wanted didn't come with a few different reasons. I'm just as likely to be a customer for a certain thing as someone who buys a vehicle at the local auto dealer.\n"
                                                + "\n"
                                                + "At the risk of sounding a bit paranoid here, car buyers and dealers love to put car prices on the table. That's why we often overlook or minimize high interest purchases. The most often overlooked item is the interest they pay to buy a car.\n"
                                                + "\n"
                                                + "It's possible for a buyer to make an investment of money by buying a car, for example, at a discount. However, such investments tend not to result in high rates of interest.\n"
                                                + "\n" + "It is important to note two general points:\n" + "\n"
                                                + "- If the car being offered at the dealership makes a purchase, that item will be accepted by some buyer as something that they'd purchase at their local car retailer.\n"
                                                + "\n"
                                                + "- A 'price on the street' comparison isn't a very efficient way to measure the...");
                electricVehicleStorage.saveElectricVehicle(jaguarIpace);

                ElectricVehicle jeepMagneto = new ElectricVehicle("Jeep", "Wrangler Magneto", "Shakima Greggs",
                                "Crossover", 52500, true, 725, 200, 95, 6.8, 120, "AWD", 9, 45, 4, false, true, false,
                                17, 0, 4.0, false, "./images/ev28.jpg",
                                "https://cdn.vox-cdn.com/uploads/chorus_asset/file/22389233/CN021_005JPphmt54ub7fcb67dcvs39kjmttl.jpg",
                                "The Jeep Magneto is of particular interest—first because it's electric, and second because it has a manual transmission.\n"
                                                + "\n"
                                                + "Even though most of the current crop of electric cars have their motors geared directly to the drive axle via single-speed drive, we're already starting to see some EVs with multi-speed transmissions, including the Porsche Taycan and Audi E-Tron GT. A second forward speed (or more) allows these EVs to operate over a broader speed range, minimizing needless motor spinning at higher speeds and adding extra gut-punch to low-end torque electrics are known for.");
                electricVehicleStorage.saveElectricVehicle(jeepMagneto);

                ElectricVehicle kiaEvSix = new ElectricVehicle("Kia", "EV6", "Lester Freamon", "Crossover", 45000, true,
                                725, 270, 110, 5.2, 115, "RWD", 7, 18, 5, false, true, false, 28, 0, 4.5, true,
                                "./images/ev29.jpg",
                                "https://www.electrive.com/wp-content/uploads/2021/03/kia-ev6-2021-002-min.png",
                                "It is clear that Kia is quite serious about EVs, with the EV6 boasting impressive capabilities from fast-charging to rapid acceleration that could position it among the more elite models. Kia promises that the EV6 can sprint 0-60 mph in a scant 7 seconds. The company targets 250 miles of range and claims to have the world’s first 800V multi-charging architecture that enables up to 210 miles of range to be charged in under 18 minutes.");
                electricVehicleStorage.saveElectricVehicle(kiaEvSix);

                ElectricVehicle kiaNiro = new ElectricVehicle("Kia", "Niro", "Seth Gecko", "Crossover", 39090, true,
                                725, 239, 112, 6.5, 103, "FWD", 9.5, 60, 5, false, true, false, 18.5, 0, 5.0, false,
                                "./images/ev07.jpg",
                                "https://electrek.co/wp-content/uploads/sites/3/2021/06/2021-Kia-Niro-EV.jpg?quality=82&strip=all",
                                "2021 Kia Niro Electric vehicle. The Niro is a smart-chargable electric vehicle that combines electrical power, lithium ion batteries, and electrical surge storage with remote charging. It is powered by electric motor and is equipped with the latest generation of lithium-ion batteries. It's designed to be ready to walk in to anywhere in the United States within two years, and can then be transported on rail to its destination in less than a month. The Niro is available with a range of 300 kilometers from a factory in the Bay Area to Alaska.\n"
                                                + "\n" + "About the Niro Motorsports\n" + "\n"
                                                + "The Niro is the latest generation of the most innovative electric vehicle, developed and produced by Niro, a maker of electric cars. In October 2016, Niro Motorsports began developing the Niro, known for providing an alternative vision to Tesla, the electric car company. Niro Motorsports is the company that developed the latest generation of electric vehicle, the Niro 4.4. That means Niro Motorsports provides a top-of-the-line electric vehicle, with high performance and safety features, with a range of 6,000 kilometers and a range of 6,400 kilometers. In October, 2016, the company announced a partnership between Tesla Motorsports and Niro to develop Niro for the future of the electric mobility market.");
                electricVehicleStorage.saveElectricVehicle(kiaNiro);

                ElectricVehicle lucidAir = new ElectricVehicle("Lucid", "Air Touring", "Kate Fuller", "Sedan", 87500,
                                true, 725, 406, 100, 3.2, 168, "AWD", 6, 20, 5, false, true, true, 26.1, 9.9, 4.5, true,
                                "./images/ev08.jpg",
                                "https://i.ytimg.com/vi/X0f0LuA6Qvk/maxresdefault.jpg",
                                "Overheating Earth, meet the 2021 Lucid Air, the newest electric vehicle to join Tesla in the green fleet of luxury sedans.\n"
                                                + "\n"
                                                + "The 2021 Lucid Air electric sedan has the Tesla Model S in its crosshairs.\n"
                                                + "\n" + "EV Power Meets Ultimate Luxury.");
                electricVehicleStorage.saveElectricVehicle(lucidAir);

                ElectricVehicle mazdaMx = new ElectricVehicle("Mazda", "MX-30", "Kate Austen", "Crossover", 38000, true,
                                725, 130, 100, 9, 90, "RWD", 5, 30, 5, false, true, false, 28, 0, 4.5, false,
                                "./images/ev30.jpg", "https://cdn.motor1.com/images/mgl/kJOyQ/s1/2020-mazda-mx-30.jpg",
                                "The MX-30 is Mazda's most unconventional SUV yet. It's the brand's first EV, and it's Mazda's first SUV with RX-8-style doors. The crossover features a rather small 35.5kWh battery, which allows for range numbers to reside in the low 100s.  The MX-30's motor makes just over 140 horsepower, which permits a zero-to-sixty time of around nine seconds. To combat the lackluster range, the automaker will offer a range-extended variant featuring a rotary engine as a generator.");
                electricVehicleStorage.saveElectricVehicle(mazdaMx);

                ElectricVehicle mercedesEqa = new ElectricVehicle("Mercedes-Benz", "EQA", "Reginald 'Bubbles' Cousins",
                                "Crossover", 57000, true, 725, 250, 100, 7.0, 99, "AWD", 7.25, 35, 5, false, true,
                                false, 12, 0, 4.5, true, "./images/ev31.jpg",
                                "https://cdn.motor1.com/images/mgl/6y7J7/s1/illustration-mercedes-benz-eqa.jpg",
                                "The 2022 Mercedes-Benz EQA is a new all-electric crossover SUV that's based on the regular subcompact GLA-class.  Power comes from an all-electric powertrain that generates 188 horsepower on front-drive models and 268 horses on all-wheel-drive versions, which both source their juice from a battery pack mounted under the floor of the vehicle.");
                electricVehicleStorage.saveElectricVehicle(mercedesEqa);

                ElectricVehicle miniCooperSE = new ElectricVehicle("Mini Cooper", "SE", "Santanico Pandemonium",
                                "Sedan", 29900, true, 725, 114, 108, 6.9, 93, "FWD", 4, 36, 4, false, true, false, 8.7,
                                0, 4.0, false,
                                "./images/ev09.jpg",
                                "https://cdn.motor1.com/images/mgl/kNN7x/s1/mini-cooper-se.jpg",
                                "2021 Mini Cooper SE Electric vehicle features a new, lower-powered electric propulsion system and comes with a redesigned steering wheel using less energy in direct sunlight.\n"
                                                + "\n"
                                                + "In terms of features, the EV is available with the S-Penetration Pro, which helps reduce the battery voltage by 15%, while the Paddle mode offers two more modes for increased stability and additional power levels.\n"
                                                + "\n"
                                                + "The EV version offers only one option for the user after the user activates the app for two minutes in the EV Comfort mode.\n"
                                                + "\n"
                                                + "The EV version also features additional LED lights available to help you take a look or just take a video.");
                electricVehicleStorage.saveElectricVehicle(miniCooperSE);

                ElectricVehicle nissaAriya = new ElectricVehicle("Nissan", "Ariya", "Russell 'Stringer' Bell",
                                "Crossover", 40000, true, 725, 300, 105, 7.5, 99, "FWD", 10, 31, 5, true, true, false,
                                16.5, 0, 4.5, false, "./images/ev32.jpg",
                                "https://cdn.mos.cms.futurecdn.net/ARwne5T6bP4KnybiqG59qc.jpg",
                                "Nissan is expanding its line of electric vehicles with the 2022 Ariya SUV, which is on sale in the U.S. in 2021. The Ariya will join the Leaf hatchback in the Nissan showroom and will offer up to 300 miles of driving range, which beats the Leaf's maximum of 226. The Ariya's design represents a shift from the current sharp, angular lines seen on many of Nissan's vehicles. The low, wide stance of the Ariya differentiates it from the Rogue and gives it a sportier look. Two different battery sizes will be offered—a 63.0-kWh battery is standard, and a larger 87.0-kWh pack is optional—as well as either front- or all-wheel drive. A host of driver-assistance features, infotainment tech, and convenience items will be included here, helping the 2022 Ariya compete with similarly sized EV crossovers, such as the Tesla Model Y and Hyundai Kona Electric.");
                electricVehicleStorage.saveElectricVehicle(nissaAriya);

                ElectricVehicle nissanLeaf = new ElectricVehicle("Nissan", "Leaf S Plus", "Max Cherry", "Crossover",
                                37400, true, 725, 226, 114, 7.4, 90, "FWD", 11, 60, 5, false, true, false, 23.6, 0, 5.0,
                                false,
                                "./images/ev10.jpg",
                                "https://cdn.motor1.com/images/mgl/42lOZ/s1/2021-nissan-leaf.jpg",
                                "2021 Nissan Leaf Electric vehicle\n" + "\n"
                                                + "In June 2015, Nissan introduced the 'Polarizer' of the model year and went on to have this year's models from Nissan.\n"
                                                + "\n"
                                                + "The new electric version of the Leaf may still be a bit less powerful than the 2017 model and the update was supposed to last two months, meaning that the brand will still need to develop a good test-drive to compare it to the previous generation models. But the test-drive test was, frankly, not good.\n"
                                                + "\n"
                                                + "The Tesla Model S was more powerful than the Nissan Leaf as a real test road car. But, after some testing, the Model S took all three test-driving sessions off. This test was run by Tesla Motors, Hyundai Motors, and Mitsubishi Motors in Tokyo.");
                electricVehicleStorage.saveElectricVehicle(nissanLeaf);

                ElectricVehicle polestarTwo = new ElectricVehicle("Polestar", "Two", "Ray Nicolette", "Crossover",
                                59900, true, 725, 233, 92, 4.5, 127, "AWD", 8, 47, 5, false, true, true, 14.3, 1.23,
                                5.0, true,
                                "./images/ev11.jpg",
                                "https://i.insider.com/5f36af5fe89ebf001f04496b?width=1136&format=jpeg",
                                "One of the most complete electric cars money can buy. Superb build quality, and decent to drive.\n"
                                                + "\n"
                                                + "The 2021 Polestar 2 pairs handsome design with adequate performance.\n"
                                                + "\n"
                                                + "The Polestar has a higher ride height than most sedans, and SUV-like body cladding, making it a bit of a pseudo-crossover. However you classify it, the Polestar 2 is an extremely handsome car, with minimal body surfacing and great proportions.");
                electricVehicleStorage.saveElectricVehicle(polestarTwo);

                ElectricVehicle porscheTaycan = new ElectricVehicle("Porsche", "Taycan", "Elle Driver", "Sedan", 103800,
                                true, 725, 200, 69, 3.4, 155, "RWD", 12, 15, 4, false, true, true, 12.9, 2.8, 5.0,
                                false,
                                "./images/ev12.jpg",
                                "https://i.insider.com/5f36af5fe89ebf001f04496b?width=1136&format=jpeg",
                                "Highs: Incredible and repeatable acceleration, drives a lot like a Porsche sports car, can charge quickly.\n"
                                                + "\n"
                                                + "Lows: A pain to get in and out of, missing some traditional EV traits, exorbitant price.\n"
                                                + "\n"
                                                + "Verdict: The Taycan takes everything good about electric performance cars and amplifies it.");
                electricVehicleStorage.saveElectricVehicle(porscheTaycan);

                ElectricVehicle rivianROneT = new ElectricVehicle("Rivian", "R1T", "Omar Little", "Truck", 73000, true,
                                725, 300, 80, 3.0, 100, "AWD", 10, 35, 5, true, true, true, 57, 11.0, 4.5, false,
                                "./images/ev33.jpg",
                                "https://cdn.motor1.com/images/mgl/vkP1b/s1/check-out-the-possible-rivian-r1t-production-colors-revealed-by-rivianforums.com.jpg",
                                "The futuristic R1T is an all-electric pickup truck from new American startup brand Rivian, and it promises 300 miles of driving range and lightning-quick acceleration. The company says that the revealed truck is no concept vehicle—what you see here is what will enter production as the 2021 R1T. At 215.6 inches long, the crew-cab-only R1T splits the difference in size between mid-size pickups such as the Ford Ranger and full-size trucks such as the Ram 1500. The R1T will be one of the first electric pickup trucks in what seems to be a burgeoning market, soon to include the Tesla Cybertruck and the GMC Hummer EV SUT.");
                electricVehicleStorage.saveElectricVehicle(rivianROneT);

                ElectricVehicle teslaCybertruck = new ElectricVehicle("Tesla", "Cybertruck", "James ‘Sawyer’ Ford",
                                "Truck", 70000, false, 725, 500, 90, 3.0, 130, "AWD", 10, 44, 6, true, true, true, 90,
                                10.0, 5.0, true, "./images/ev34.jpg",
                                "https://www.tesla.com/xNVh4yUEc3B9/10_Desktop.jpg",
                                "Cybertruck is designed to have the utility of a truck with sports car performance. Built to be durable, versatile, capable and high-performance both on-road and off.\n"
                                                + "\n"
                                                + "The Tesla Cybertruck looks like it was dropped off by an alien race, but it has the capabilities to challenge all of the top-selling pickup trucks. With a sharp-edged exterior that is made of scratch- and dent-resistant stainless steel, Tesla's all-electric truck is seriously tough. Along with available all-wheel drive, the Cybertruck can tow up to 14,000 pounds and has an estimated driving range of 500-plus miles. While that applies only to the most expensive model, the cheapest one starts at $39,900.");
                electricVehicleStorage.saveElectricVehicle(teslaCybertruck);

                ElectricVehicle teslaThree = new ElectricVehicle("Tesla", "Model 3 SR+", "Aldo Raine", "Sedan", 39900,
                                false, 725, 263, 133, 5.3, 140, "RWD", 5.5, 21, 5, true, true, true, 18, 5, 5.0, true,
                                "./images/ev13.jpg",
                                "https://cdn.mos.cms.futurecdn.net/yX7odtjFCfE9fZZpDtsda6.jpg",
                                "Tesla Model 3 Standard Range +  There are four main versions of the Model 3 -- the standard Model 3, the SR+, the Long Range, and the Model 3 Performance.\n"
                                                + "\n"
                                                + "So what are all of the possibilities for the Model 3? The two main options? Well, while it sounds like some companies have more to offer than others, the company behind the Model 3 and Model X are both clearly not making it very expensive. Musk told CNBC in February:\n"
                                                + "\n"
                                                + "Every new generation of the Model 3 is going to be a little smaller, a little faster, a little sharper and, perhaps most importantly, a little thinner. There's no question that our product line-up is coming along fine, and we're doing very well. It just doesn't seem like that many people are getting this right now. At some point, it's just getting to the point that the Model 3 is one of the most important aspects of our future product.\n"
                                                + "\n" + "He continued:\n" + "\n"
                                                + "The next one will probably be the new Model X, but it will be the first and will be even higher. The only thing we're really aware of is the fact that the Model X was just built as a box for the Model S, which is very different from the box we have now. That's kind of the way that things changed in the past. Now we're working very, very closely with OEMs and manufacturers to make sure that");
                electricVehicleStorage.saveElectricVehicle(teslaThree);

                ElectricVehicle teslaSPlaid = new ElectricVehicle("Tesla", "Model S Plaid", "Bridget Von Hammersmark",
                                "Sedan", 129990, false, 725, 396, 101, 1.99, 200, "AWD", 6.5, 27, 5, true, true, true,
                                25, 3, 5.0, true, "https://i.insider.com/605ce29e106eb50019d05a89?width=700",
                                "./images/ev14.jpg",
                                "With the longest range and quickest acceleration of any electric vehicle in production, Model S Plaid is the highest performing sedan ever built.\n"
                                                + "\n"
                                                + "With up to 412-miles of estimated driving range—depending upon model—the S can easily be used for long drives, and the 1020-hp Plaid version can deliver supercar acceleration while seating four adults. The Model S is also practical, with a large rear cargo area and a secondary front-trunk for extra space.");
                electricVehicleStorage.saveElectricVehicle(teslaSPlaid);

                ElectricVehicle teslaX = new ElectricVehicle("Tesla", "Model X LR", "Calvin Candie", "Crossover", 94990,
                                false, 725, 360, 96, 3.8, 155, "AWD", 12, 22, 7, true, true, true, 83, 5, 5.0, true,
                                "./images/ev15.jpg",
                                "https://i.guim.co.uk/img/media/202f28f9d64bcbf12340369c1dfc91c306bc3d49/122_245_1666_999/master/1666.jpg?width=1200&height=900&quality=85&auto=format&fit=crop&s=c80bca7e348e480a531673976412f90c",
                                "Tesla Model X – The Tesla Model X is a 'premium' electric vehicle delivered at a premium price. Tesla's low profit margin, lower fuel cost, greater comfort, low cost vehicle manufacturing facilities and low mass production prices have propelled it to the top of US electric vehicle sales in 2021. Its low cost to ownership (LEOV) system has resulted in its high end, affordable Model X being considered the single most affordable luxury electric vehicle crossover under construction for the electric vehicles market.\n"
                                                + "\n"
                                                + "The Model X is powered by an NV Energy Model X (formerly dubbed the EV2) and boasts a powerful, battery operated, and battery operated technology that delivers greater reliability and efficiency.");
                electricVehicleStorage.saveElectricVehicle((teslaX));

                ElectricVehicle teslaY = new ElectricVehicle("Tesla", "Model Y LR", "Marquis Warren", "Crossover",
                                53990, false, 725, 326, 121, 4.8, 135, "AWD", 10, 40, 5, true, true, true, 71, 5, 5.0,
                                true, "./images/ev16.jpg",
                                "https://cdn.motor1.com/images/mgl/Bjw4A/s1/tesla-model-y.jpg",
                                "Tesla Model Y: 'To Buy, or Not to Buy?\n" + "\n"
                                                + "But there's way more than just a simple answer to the question of whether to buy or not to buy a Tesla Model Y, and to do that, you need to consider what is already possible here. It's easy to see why this is: Tesla has a much more sophisticated and ambitious plan to drive the market. But what's less obvious is just when — because if the Model Y, like most things, is priced so high, that is, until Tesla is forced to sell you a new Model 3, it'll be just fine.\n"
                                                + "\n"
                                                + "To put both the Tesla Model Y as a driver-free Tesla Model 3 into the equation, to be a Model 3, or to become an electric driving luxury, it will be Tesla (or not Tesla), and the Model Y will be one of their very own. And so far we've been able to build models that make the cars we love driving more comfortable for use in public or business areas, like in public transit. But, when we find ourselves stranded in a vehicle where there is no Tesla, or a Tesla Model and we need to turn off the car, like a passenger in a car for an entire trip — like with my current Tesla Model Y, the most likely scenario is that we will have to move. In that case, we'll be forced to pay to maintain our Tesla Model Y's ability to reach into its windshield or floor to power itself.");
                electricVehicleStorage.saveElectricVehicle(teslaY);

                ElectricVehicle teslaRoadsterTwo = new ElectricVehicle("Tesla", "Roadster 2", "Dr. Jack Shephard",
                                "Sedan", 200000, false, 725, 620, 90, 1.9, 250, "AWD", 8, 44, 4, true, true, true, 15,
                                4.0, 5.0, true, "./images/ev35.jpg",
                                "https://upload.wikimedia.org/wikipedia/commons/8/89/NextGenTeslaRoadster_%28cropped%29.jpg",
                                "An all-electric vehicle, the Tesla Roadster is the quickest car in the world, with record-setting acceleration, range and performance.\n"
                                                + "\n"
                                                + "The original Tesla Roadster put the all-electric automaker on the map, even if most Model S and Model X buyers don't remember it.  The second-generation Roadster bests it predecessor by adding two small rear seats, significantly more driving range, and a much higher level of performance. Tesla CEO Elon Musk boasted about a 1.9-second 60-mph time and a 250-mph top speed when the Roadster 2 was unveiled.");
                electricVehicleStorage.saveElectricVehicle(teslaRoadsterTwo);

                ElectricVehicle volksIdFour = new ElectricVehicle("Volkswagen", "ID.4", "Chris Mannix", "Crossover",
                                44495, true, 725, 250, 99, 5.7, 112, "AWD", 7.5, 38, 5, false, true, true, 30, 0, 4.5,
                                false,
                                "./images/ev17.jpg",
                                "https://cdn.vox-cdn.com/thumbor/xR4t-SjdEMKcIjFPcVQgBLOYVk0=/0x0:1080x809/1200x800/filters:focal(454x319:626x491)/cdn.vox-cdn.com/uploads/chorus_image/image/67274209/VW_ID4_Uncovered_2_copy.0.jpg",
                                "Superbly designed well balanced EV at a good price. Loving the white steering wheel, roomy interior, good acceleration (yes, not as good as a Tesla), and adequate handling.\n"
                                                + "\n"
                                                + "It has a roomy cabin, loads of clever storage spaces, good electric range for the price, and a smooth, silent driving experience.");
                electricVehicleStorage.saveElectricVehicle(volksIdFour);

                ElectricVehicle volvoXcForty = new ElectricVehicle("Volvo", "XC40 Recharge", "Joe Gage", "Crossover",
                                53990, true, 725, 208, 80, 4.3, 112, "AWD", 11, 40, 5, false, true, true, 20, 5, 5.0,
                                true, "./images/ev18.jpg",
                                "https://assets.volvocars.com/au/~/media/australia/images/blog-i-roll/2020/july/xc40_recharge_plug-in_hybrid---main-image950x497.jpg?h=497&la=en-AU&mw=950&w=950",
                                "The First Fully Electric Compact Luxury SUV To Win A Top Safety Pick Plus Award. Pure Electric. Setting A New Industry Benchmark In Safety.\n"
                                                + "\n"
                                                + "With the favorable weight distribution, the XC40 Recharge feels well planted on the pavement when navigating sharp or fast turns.  This car has a huge 408hp and 660Nm of torque, delivered to all four wheels via a dual-motor system.");
                electricVehicleStorage.saveElectricVehicle(volvoXcForty);

        }
}
