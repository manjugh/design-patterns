package com.designpatterns;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MedalSort {
    public static void main(String[] args) {

        Comparator<CountryMedalDetails> countryMedalDetailsComparator = Comparator.comparing(countryMedalDetails -> countryMedalDetails.getGold().getNos());
        countryMedalDetailsComparator = countryMedalDetailsComparator.thenComparing(countryMedalDetails -> countryMedalDetails.getSilver().getNos()).reversed();
        List<CountryMedalDetails> countryMedalDetails = List.of(buildMedalForCountry("India", 10, 5, 4),
                buildMedalForCountry("US", 9, 5, 4),
                buildMedalForCountry("Japan", 8, 5, 4),
                buildMedalForCountry("Ban", 0, 5, 4),
                buildMedalForCountry("SL", 0, 15, 4),
                buildMedalForCountry("AS", 1, 0, 4));
        List<CountryMedalDetails> collect = countryMedalDetails.stream().sorted(countryMedalDetailsComparator).collect(Collectors.toList());

        collect.forEach(sortedMedals -> System.out.println(sortedMedals.getCountry()));
    }

    private static CountryMedalDetails buildMedalForCountry(final String country, int gold, int silver, int bronze) {
        CountryMedalDetails countryMedalDetails = new CountryMedalDetails();
        countryMedalDetails.setGold(buildMedals(MedalType.GOLD.name(), gold));
        countryMedalDetails.setBronze(buildMedals(MedalType.BRONZE.name(), bronze));
        countryMedalDetails.setSilver(buildMedals(MedalType.SILVER.name(), silver));
        countryMedalDetails.setCountry(country);
        return countryMedalDetails;
    }

    private static Medal buildMedals(final String type, int nos) {
        Medal medal = new Medal();
        medal.setMedalType(type);
        medal.setNos(nos);
        return medal;
    }
}

enum MedalType {
    GOLD, SILVER, BRONZE
}

class CountryMedalDetails {

    private String country;

    private Medal gold;
    private Medal silver;
    private Medal bronze;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Medal getGold() {
        return gold;
    }

    public void setGold(Medal gold) {
        this.gold = gold;
    }

    public Medal getSilver() {
        return silver;
    }

    public void setSilver(Medal silver) {
        this.silver = silver;
    }

    public Medal getBronze() {
        return bronze;
    }

    public void setBronze(Medal bronze) {
        this.bronze = bronze;
    }


}

class Medal {
    private String medalType;

    private Integer nos;

    public String getMedalType() {
        return medalType;
    }

    public void setMedalType(String medalType) {
        this.medalType = medalType;
    }

    public Integer getNos() {
        return nos;
    }

    public void setNos(Integer nos) {
        this.nos = nos;
    }
}

