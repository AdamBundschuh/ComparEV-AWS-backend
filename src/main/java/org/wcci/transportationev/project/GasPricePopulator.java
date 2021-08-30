package org.wcci.transportationev.project;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.transportationev.project.resources.GasPrice;
import org.wcci.transportationev.project.storage.GasPriceRepository;

@Component
public class GasPricePopulator implements CommandLineRunner {
    private GasPriceRepository gasPriceRepository;

    public GasPricePopulator(GasPriceRepository gasPriceRepository) {
        this.gasPriceRepository = gasPriceRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        GasPrice alabama = new GasPrice("Alabama", 2.84f, 1060);
        gasPriceRepository.save(alabama);

        GasPrice alaska = new GasPrice("Alaska", 3.67f, 824);
        gasPriceRepository.save(alaska);

        GasPrice arizona = new GasPrice("Arizona", 3.12f, 961);
        gasPriceRepository.save(arizona);

        GasPrice arkansas = new GasPrice("Arkansas", 2.87f, 1052);
        gasPriceRepository.save(arkansas);

        GasPrice california = new GasPrice("California", 4.39f, 693);
        gasPriceRepository.save(california);

        GasPrice colorado = new GasPrice("Colorado", 3.63f, 847);
        gasPriceRepository.save(colorado);

        GasPrice connecticut = new GasPrice("Connecticut", 3.17f, 952);
        gasPriceRepository.save(connecticut);

        GasPrice dc = new GasPrice("District of Columbia", 3.29f, 923);
        gasPriceRepository.save(dc);

        GasPrice delaware = new GasPrice("Delaware", 3.01f, 984);
        gasPriceRepository.save(delaware);

        GasPrice florida = new GasPrice("Florida", 3.01f, 1009);
        gasPriceRepository.save(florida);

        GasPrice georgia = new GasPrice("Georgia", 2.96f, 1011);
        gasPriceRepository.save(georgia);

        GasPrice hawaii = new GasPrice("Hawaii", 4.09f, 736);
        gasPriceRepository.save(hawaii);

        GasPrice idaho = new GasPrice("Idaho", 3.80f, 800);
        gasPriceRepository.save(idaho);

        GasPrice illinois = new GasPrice("Illinois", 3.40f, 890);
        gasPriceRepository.save(illinois);

        GasPrice indiana = new GasPrice("Indiana", 3.12f, 963);
        gasPriceRepository.save(indiana);

        GasPrice iowa = new GasPrice("Iowa", 2.99f, 1005);
        gasPriceRepository.save(iowa);

        GasPrice kansas = new GasPrice("Kansas", 2.93f, 1028);
        gasPriceRepository.save(kansas);

        GasPrice kentucky = new GasPrice("Kentucky", 2.96f, 1031);
        gasPriceRepository.save(kentucky);

        GasPrice louisiana = new GasPrice("Louisiana", 2.82f, 1067);
        gasPriceRepository.save(louisiana);

        GasPrice maine = new GasPrice("Maine", 3.11f, 964);
        gasPriceRepository.save(maine);

        GasPrice mary = new GasPrice("Maryland", 3.06f, 976);
        gasPriceRepository.save(mary);

        GasPrice mass = new GasPrice("Massachusetts", 3.04f, 992);
        gasPriceRepository.save(mass);
        
        GasPrice mich = new GasPrice("Michigan", 3.28f, 933);
        gasPriceRepository.save(mich);

        GasPrice minn = new GasPrice("Minnesota", 3.03f, 1001);
        gasPriceRepository.save(minn);

        GasPrice mississippi = new GasPrice("Mississippi", 2.79f, 1080);
        gasPriceRepository.save(mississippi);

        GasPrice missouri = new GasPrice("Missouri", 2.87f, 1062);
        gasPriceRepository.save(missouri);
        
        GasPrice mont = new GasPrice("Montana", 3.29f, 934);
        gasPriceRepository.save(mont);

        GasPrice neb = new GasPrice("Nebraska", 3.02f, 1002);
        gasPriceRepository.save(neb);

        GasPrice nev = new GasPrice("Nevada", 4.04f, 758);
        gasPriceRepository.save(nev);

        GasPrice newhamp = new GasPrice("New Hampshire", 3.00f, 1006);
        gasPriceRepository.save(newhamp);

        GasPrice jersey = new GasPrice("New Jersey", 3.20f, 944);
        gasPriceRepository.save(jersey);

        GasPrice newmex = new GasPrice("New Mexico", 3.09f, 973);
        gasPriceRepository.save(newmex);

        GasPrice york = new GasPrice("New York", 3.22f, 939);
        gasPriceRepository.save(york);

        GasPrice ncar = new GasPrice("North Carolina", 2.93f, 1037);
        gasPriceRepository.save(ncar);

        GasPrice ndak = new GasPrice("North Dakota", 3.12f, 975);
        gasPriceRepository.save(ndak);
        
        GasPrice ohio = new GasPrice("Ohio", 3.05f, 957);
        gasPriceRepository.save(ohio);

        GasPrice ok = new GasPrice("Oklahoma", 2.89f, 1051);
        gasPriceRepository.save(ok);

        GasPrice oregon = new GasPrice("Oregon", 3.76f, 899);
        gasPriceRepository.save(oregon);

        GasPrice penn = new GasPrice("Pennsylvania", 3.28f, 922);
        gasPriceRepository.save(penn);

        GasPrice rhode = new GasPrice("Rhode Island", 3.06f, 989);
        gasPriceRepository.save(rhode);

        GasPrice scar = new GasPrice("South Carolina", 2.88f, 1038);
        gasPriceRepository.save(scar);

        GasPrice sdak = new GasPrice("South Dakota", 3.18f, 966);
        gasPriceRepository.save(sdak);

        GasPrice tenn = new GasPrice("Tennessee", 2.88f, 1045);
        gasPriceRepository.save(tenn);

        GasPrice texas = new GasPrice("Texas", 2.83f, 1063);
        gasPriceRepository.save(texas);

        GasPrice utah = new GasPrice("Utah", 3.87f, 775);
        gasPriceRepository.save(utah);

        GasPrice vermont = new GasPrice("Vermont", 3.07f, 977);
        gasPriceRepository.save(vermont);

        GasPrice virginia = new GasPrice("Virginia", 2.97f, 1008);
        gasPriceRepository.save(virginia);

        GasPrice wash = new GasPrice("Washington", 3.87f, 782);
        gasPriceRepository.save(wash);

        GasPrice wv = new GasPrice("West Virginia", 3.03f, 988);
        gasPriceRepository.save(wv);

        GasPrice wisc = new GasPrice("Wisconsin", 3.03f, 995);
        gasPriceRepository.save(wisc);
        
        GasPrice wyoming = new GasPrice("Wyoming", 3.58f, 857);
        gasPriceRepository.save(wyoming);

        GasPrice nationalAverage = new GasPrice("National Average", 3.16f, 950);
        gasPriceRepository.save(nationalAverage);
    }
}
