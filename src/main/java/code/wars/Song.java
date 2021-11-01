package code.wars;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Song {

    private final String title;
    private final String artist;
    private final Set<String> peoples = new HashSet<>();

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int howMany(List<String> currentPeoples) {
        return howMany2(currentPeoples);
    }

    private int howMany1(List<String> currentPeoples) {
        int newPeopleCount = 0;
        for (String currentPeople : currentPeoples) {
            if (peoples.add(currentPeople.toLowerCase())) {
                newPeopleCount++;
            }
        }

        return newPeopleCount;
    }

    private int howMany2(List<String> currentPeoples) {
        return currentPeoples.stream()
                      .mapToInt(value -> peoples.add(value.toLowerCase()) ? 1 : 0)
                      .sum();
    }
}
