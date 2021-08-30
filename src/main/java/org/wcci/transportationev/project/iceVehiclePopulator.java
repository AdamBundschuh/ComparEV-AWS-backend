package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.IceVehicle;
import org.wcci.transportationev.project.resources.Make;
import org.wcci.transportationev.project.resources.Model;
import org.wcci.transportationev.project.resources.Year;
import org.wcci.transportationev.project.storage.IceVehicleStorage;
import org.wcci.transportationev.project.storage.MakeStorage;
import org.wcci.transportationev.project.storage.ModelStorage;
import org.wcci.transportationev.project.storage.YearStorage;

@Component
public class iceVehiclePopulator implements CommandLineRunner {

    private MakeStorage makeStorage;
    private ModelStorage modelStorage;
    private YearStorage yearStorage;
    private IceVehicleStorage iceVehicleStorage;

    public iceVehiclePopulator(MakeStorage makeStorage, ModelStorage modelStorage,
                               YearStorage yearStorage, IceVehicleStorage iceVehicleStorage) {
        this.makeStorage = makeStorage;
        this.modelStorage = modelStorage;
        this.yearStorage = yearStorage;
        this.iceVehicleStorage = iceVehicleStorage;
    }

    @Override
    public void run(String... args) throws Exception {

        Year twoFive = new Year(2005);
        yearStorage.saveYear(twoFive);
        
        Year twoSix = new Year(2006);
        yearStorage.saveYear(twoSix);
        
        Year twoSeven = new Year(2007);
        yearStorage.saveYear(twoSeven);
        
        Year twoEight = new Year(2008);
        yearStorage.saveYear(twoEight);
        
        Year twoNine = new Year(2009);
        yearStorage.saveYear(twoNine);
        
        Year twoTen = new Year(2010);
        yearStorage.saveYear(twoTen);

        Year twoEleven = new Year(2011);
        yearStorage.saveYear(twoEleven);

        Year twoTwelve = new Year(2012);
        yearStorage.saveYear(twoTwelve);

        Year twoThirteen = new Year(2013);
        yearStorage.saveYear(twoThirteen);

        Year twoFourteen = new Year(2014);
        yearStorage.saveYear(twoFourteen);

        Year twoFifteen = new Year(2015);
        yearStorage.saveYear(twoFifteen);

        Year twoSixteen = new Year(2016);
        yearStorage.saveYear(twoSixteen);

        Year twoSeventeen = new Year(2017);
        yearStorage.saveYear(twoSeventeen);

        Year twoEighteen = new Year(2018);
        yearStorage.saveYear(twoEighteen);

        Year twoNineteen = new Year(2019);
        yearStorage.saveYear(twoNineteen);

        Year twoTwenty = new Year(2020);
        yearStorage.saveYear(twoTwenty);

        //2012 MAKES
        Make ford = new Make("Ford",twoTwelve);
        makeStorage.saveMake(ford);
        
        Make honda = new Make("Honda",twoTwelve);
        makeStorage.saveMake(honda);

        Make vw = new Make("Volkswagen",twoTwelve);
        makeStorage.saveMake(vw);

        Make kia = new Make("Kia",twoTwelve);
        makeStorage.saveMake(kia);

        Make mazda = new Make("Mazda",twoTwelve);
        makeStorage.saveMake(mazda);

        Make toyota = new Make("Toyota",twoTwelve);
        makeStorage.saveMake(toyota);

        Make mitsubishi = new Make("Mitsubishi",twoTwelve);
        makeStorage.saveMake(mitsubishi);

        //2013 Makes
        Make dodge2013 = new Make("Dodge", twoThirteen);
        makeStorage.saveMake(dodge2013);

        Make mercedes2013 = new Make("Mercedes-Benz", twoThirteen);
        makeStorage.saveMake(mercedes2013);

        //2014 Makes
        Make chevrolet2014 = new Make("Chevrolet", twoFourteen);
        makeStorage.saveMake(chevrolet2014);

        Make lexus2014 = new Make("Lexus", twoFourteen);
        makeStorage.saveMake(lexus2014);

        //2015 Makes
        Make cadillac2015 = new Make("Cadillac", twoFifteen);
        makeStorage.saveMake(cadillac2015);

        Make jeep2015 = new Make("Jeep", twoFifteen);
        makeStorage.saveMake(jeep2015);

        //2016 Makes
        Make acura2016 = new Make("Acura", twoSixteen);
        makeStorage.saveMake(acura2016);

        Make jaguar2016 = new Make("Jaguar", twoSixteen);
        makeStorage.saveMake(jaguar2016);

        Make lincoln2016 = new Make("Lincoln", twoSixteen);
        makeStorage.saveMake(lincoln2016);

        //2017 Makes
        Make bmw2017 = new Make("BMW", twoSeventeen);
        makeStorage.saveMake(bmw2017);

        Make genesis2017 = new Make("Genesis", twoSeventeen);
        makeStorage.saveMake(genesis2017);

        Make mazda2017 = new Make("Mazda", twoSeventeen);
        makeStorage.saveMake(mazda2017);

        //2018 MAKES
        Make audi2018 = new Make("Audi", twoEighteen);
        makeStorage.saveMake(audi2018);

        Make ford2018 = new Make("Ford",twoEighteen);
        makeStorage.saveMake(ford2018);

        Make gmc2018 = new Make("GMC", twoEighteen);
        makeStorage.saveMake(gmc2018);

        //2019 Makes
        Make hyundai2019 = new Make("Hyundai", twoNineteen);
        makeStorage.saveMake(hyundai2019);

        Make kia2019 = new Make("Kia", twoNineteen);
        makeStorage.saveMake(kia2019);

        //Acura Models
        Model mdx4wd = new Model("MDX 4WD", acura2016);
        modelStorage.saveModel(mdx4wd);

        //Audi Models
        Model a6 = new Model("A6", audi2018);
        modelStorage.saveModel(a6);

        //BMW Models
        Model five30i = new Model("530i", bmw2017);
        modelStorage.saveModel(five30i);

        //Cadillac Models
        Model ctsSedanAwd = new Model("CTS Sedan AWD", cadillac2015);
        modelStorage.saveModel(ctsSedanAwd);

        //Chevrolet Models
        Model camaro = new Model("Camaro", chevrolet2014);
        modelStorage.saveModel(camaro);

        //Dodge Models
        Model challenger = new Model("Challenger", dodge2013);
        modelStorage.saveModel(challenger);

        //Ford Models
        Model f150 = new Model("F-150",ford);
        Model mustang = new Model("Mustang",ford);
        Model explorer = new Model("Explorer",ford);
        Model fiesta = new Model("Fiesta",ford);
        Model taurus = new Model("Taurus",ford);
        Model fusion = new Model("Fusion",ford2018);
        Model focus = new Model("Focus", ford2018);
        Model escape = new Model("Ford", ford2018);

        modelStorage.saveModel(f150);
        modelStorage.saveModel(mustang);
        modelStorage.saveModel(explorer);
        modelStorage.saveModel(fiesta);
        modelStorage.saveModel(taurus);
        modelStorage.saveModel(fusion);
        modelStorage.saveModel(focus);
        modelStorage.saveModel(escape);

        //Genesis Models
        Model g80Awd = new Model("G80 AWD", genesis2017);
        modelStorage.saveModel(g80Awd);

        //GMC Models
        Model terrainAwd = new Model("Terrain AWD", gmc2018);
        modelStorage.saveModel(terrainAwd);

        //Honda Models
        Model civic = new Model("Civic",honda);
        Model accord = new Model("Accord",honda);
        modelStorage.saveModel(civic);
        modelStorage.saveModel(accord);

        //Hyundai Models
        Model konaAwd = new Model("Kona AWD", hyundai2019);
        modelStorage.saveModel(konaAwd);

        //Jaguar Models
        Model fTypeCoupe = new Model("F-Type Coupe", jaguar2016);
        modelStorage.saveModel(fTypeCoupe);

        //Jeep Models
        Model wrangler4Wd = new Model("Wrangler 4WD", jeep2015);
        modelStorage.saveModel(wrangler4Wd);

        //Kia Models
        Model niro = new Model("Niro", kia2019);
        modelStorage.saveModel(niro);

        //Lexus Models
        Model rx350Awd = new Model("RX350 AWD", lexus2014);
        modelStorage.saveModel(rx350Awd);

        //Lincoln Models
        Model mksAwd = new Model("MKS AWD", lincoln2016);
        modelStorage.saveModel(mksAwd);

        //Mazda Models
        Model cx54Wd = new Model("CX-5 4WD", mazda2017);
        modelStorage.saveModel(cx54Wd);

        //Mercedes-Benz Models
        Model cls550 = new Model("CLS550", mercedes2013);
        modelStorage.saveModel(cls550);

        IceVehicle userVehicle = new IceVehicle(24,350,24000,1800,
                7f,120, twoTwelve,ford,f150,"https://images.hgmsites.net/hug/2012-ford-f-150-2wd-supercab-163-xl-side-exterior-view_100373810_h.jpg");
        iceVehicleStorage.saveIceVehicle(userVehicle);

        IceVehicle fordMustang2012 = new IceVehicle(25,325,16000,1500,
                6.5f,160, twoTwelve,ford,mustang,"https://s.aolcdn.com/commerce/autodata/images/CAC20FOC051B0101.jpg");
        iceVehicleStorage.saveIceVehicle(fordMustang2012);

        IceVehicle fordExplorer2012 = new IceVehicle(24,275,12000,1500,
                8.5f,140, twoTwelve,ford,explorer,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/7597/2012-Ford-Explorer-front_7597_032_1812x872_HT_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordExplorer2012);

        IceVehicle fordFiesta2012 = new IceVehicle(35,375,7000,1200,
                8f,140, twoTwelve,ford,fiesta,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/7657/2012-Ford-Fiesta-front_7657_032_1753x812_SQ_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordFiesta2012);

        IceVehicle fordTaurus2012 = new IceVehicle(30,375,12000,1250,
                7f,135, twoTwelve,ford,taurus,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/7677/2012-Ford-Taurus-front_7677_032_1785x739_HT_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordTaurus2012);

        IceVehicle fordFusion2018 = new IceVehicle(28,375,20000,1250,
                6.5f,150, twoEighteen,ford2018,fusion,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/12239/2018-Ford-Fusion-front_12239_032_1795x753_G1_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordFusion2018);

        IceVehicle fordFocus2018 = new IceVehicle(31,375,25000,1250,
                7.5f,120, twoEighteen,ford2018,focus,"https://file.kelleybluebookimages.com/kbb/base/evox/CP/12239/2018-Ford-Fusion-front_12239_032_1795x753_G1_cropped.png");
        iceVehicleStorage.saveIceVehicle(fordFocus2018);

        IceVehicle acuraMdx4wd2016 = new IceVehicle(21, 410, 52875, 1800,
                6.4f, 140, twoSixteen, acura2016, mdx4wd,
                "https://file.kelleybluebookimages.com/kbb/base/evox/CP/10335/2016-Acura-MDX-front_10335_032_1880x853_RX_cropped.png");
        iceVehicleStorage.saveIceVehicle(acuraMdx4wd2016);

        IceVehicle audiA62018 = new IceVehicle(28, 554, 51900, 1800,
                6.7f, 155, twoEighteen, audi2018, a6,
                "https://s.aolcdn.com/commerce/autodata/images/USC60AUC021B021001.jpg");
        iceVehicleStorage.saveIceVehicle(audiA62018);

        IceVehicle bmw530i2017 = new IceVehicle(27, 486, 51200, 1800,
                6.2f, 130, twoSeventeen, bmw2017, five30i,
                "https://www.cnet.com/a/img/x9ZfFI924xPXrLrDX3jFuCLYvpU=/1200x675/2017/03/23/a9971f89-d80a-4d8f-8b07-692d2d5af046/2017bmw530i-07406.jpg");
        iceVehicleStorage.saveIceVehicle(bmw530i2017);
        
        IceVehicle cadillacCts2015 = new IceVehicle(21, 389, 55345, 1800,
                5.5f, 155, twoFifteen, cadillac2015, ctsSedanAwd,
                "https://s.aolcdn.com/commerce/autodata/images/USC50CAC112F021001.jpg");
        iceVehicleStorage.saveIceVehicle(cadillacCts2015);

        IceVehicle camaro2014 = new IceVehicle(21, 399, 24450, 1800,
                5.8f, 155, twoFourteen, chevrolet2014, camaro,
                "https://cars.usnews.com/static/images/Auto/izmo/i4521/2014_chevrolet_camaro_angularfront.jpg");
        iceVehicleStorage.saveIceVehicle(camaro2014);

        IceVehicle challenger2013 = new IceVehicle(21, 401, 29995, 1800,
                5.4f, 182, twoThirteen, dodge2013, challenger,
                "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRRL-QrnvfOz5lk_ORMm9omZgfauCV1MO0MfQQeD2alevdGGSu0");
        iceVehicleStorage.saveIceVehicle(challenger2013);

        IceVehicle escape2018 = new IceVehicle(24, 377, 30050, 1800,
                7.2f, 141, twoEighteen, ford2018, escape,
                "https://di-uploads-pod11.dealerinspire.com/depaulaford/uploads/2020/06/2018-Ford-Escape-Albany-NY-Left.jpg");
        iceVehicleStorage.saveIceVehicle(escape2018);

        IceVehicle g80Awd2017 = new IceVehicle(19, 386, 43900, 1800,
                5.2f, 154, twoSeventeen, genesis2017, g80Awd,
                "https://pictures.topspeed.com/IMG/jpg/201611/genesis-beefs-up-lin-5.jpg");
        iceVehicleStorage.saveIceVehicle(g80Awd2017);

        IceVehicle terrainAwd2018 = new IceVehicle(32, 499, 35570, 1800,
                6.8f, 140, twoEighteen, gmc2018, terrainAwd,
                "https://cars.usnews.com/static/images/Auto/izmo/i33960653/2018_gmc_terrain_angularfront.jpg");
        iceVehicleStorage.saveIceVehicle(terrainAwd2018);

        IceVehicle konaAwd2019 = new IceVehicle(27, 356, 26390, 1800,
                6.6f, 127, twoNineteen, hyundai2019, konaAwd,
                "https://cars.usnews.com/static/images/Auto/izmo/i108385764/2019_hyundai_kona_angularfront.jpg");
        iceVehicleStorage.saveIceVehicle(konaAwd2019);

        IceVehicle fTypeCoupe2016 = new IceVehicle(22, 407, 65000, 1800,
                5.1f, 161, twoSixteen, jaguar2016, fTypeCoupe,
                "https://hips.hearstapps.com/hmg-prod/amv-prod-cad-assets/images/15q3/660572/2016-jaguar-f-type-s-coupe-manual-test-review-car-and-driver-photo-661077-s-original.jpg?fill=2:1&resize=1200:*");
        iceVehicleStorage.saveIceVehicle(fTypeCoupe2016);

        IceVehicle wrangler4Wd2015 = new IceVehicle(18, 335, 31995, 1800,
                6.1f, 103, twoFifteen, jeep2015, wrangler4Wd,
                "https://images.hgmsites.net/hug/2015-jeep-wrangler_100479434_h.jpg");
        iceVehicleStorage.saveIceVehicle(wrangler4Wd2015);
                
        IceVehicle niro2019 = new IceVehicle(49, 583, 25900, 1800,
                9.4f, 100, twoNineteen, kia2019, niro,
                "https://www.motortrend.com/uploads/sites/5/2019/02/2019-Kia-Niro-EV-front-three-quarter-4.jpg");
        iceVehicleStorage.saveIceVehicle(niro2019);

        IceVehicle rx350Awd2014 = new IceVehicle(20, 384, 44160, 1800,
                7.7f, 124, twoFourteen, lexus2014, rx350Awd,
                "https://s.aolcdn.com/commerce/autodata/images/USC40LES122A021001.jpg");
        iceVehicleStorage.saveIceVehicle(rx350Awd2014);

        IceVehicle mksAwd2016 = new IceVehicle(19, 361, 43605, 1800,
                6.4f, 161, twoSixteen, lincoln2016, mksAwd,
                "https://s.aolcdn.com/commerce/autodata/images/USC30LIC091A021001.jpg");
        iceVehicleStorage.saveIceVehicle(mksAwd2016);
        
        IceVehicle cx54Wd2017 = new IceVehicle(26, 398, 27845, 1800,
                6.1f, 125, twoSeventeen, mazda2017, cx54Wd,
                "https://www.motortrend.com/uploads/sites/5/2017/05/2017-Mazda-CX-5-GT-AWD-front-three-quarter-in-motion-e1496184016611.jpg?fit=around%7C875:492");
        iceVehicleStorage.saveIceVehicle(cx54Wd2017);

        IceVehicle cls5502013 = new IceVehicle(20, 422, 72000, 1800,
                5.5f, 168, twoThirteen, mercedes2013, cls550,
                "https://cars.usnews.com/static/images/Auto/izmo/353639/2013_mercedes_benz_cls_class_angularfront.jpg");
        iceVehicleStorage.saveIceVehicle(cls5502013);
    }


}
