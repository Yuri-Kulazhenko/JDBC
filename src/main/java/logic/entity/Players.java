package logic.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Players {

       // select PLAYER_ID, COUNTRY_KEY, NAME, SURNAME, YEAR_OF_BORN, CLUB_KEY, NUMBER_IN_NT_KEY, NUMBER_IN_CLUB_KEY, STATUS from PLAYERS;

    private int playerId;
    private int countryKey;
    private String name;
    private String surname;
    private int yearOfBorn;
    private int clubKey;
    private int numberNTKey;
    private int numberClubKey;
    private boolean status;

    public Players(int countryKey, String name, String surname, int yearOfBorn, int clubKey, int numberNTKey, int numberClubKey, boolean status) {
        this.countryKey = countryKey;
        this.name = name;
        this.surname = surname;
        this.yearOfBorn = yearOfBorn;
        this.clubKey = clubKey;
        this.numberNTKey = numberNTKey;
        this.numberClubKey = numberClubKey;
        this.status = status;
    }
}
