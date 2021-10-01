package logic.dao;

import logic.entity.Players;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class PlayerDAOImpl implements PlayerDAO{


    @Override
    public boolean addPlayer(Statement statement, Players player) throws SQLException {
        String query = "INSERT INTO PLAYERS (COUNTRY_KEY, NAME, SURNAME, YEAR_OF_BORN, CLUB_KEY, NUMBER_IN_NT_KEY, NUMBER_IN_CLUB_KEY, STATUS) VALUES("+player.getCountryKey()+", '"
                +player.getName()+"', '"
                +player.getSurname()+"', "
                +player.getYearOfBorn()+", "
                +player.getClubKey()+", "
                +player.getNumberNTKey()+", "
                +player.getNumberClubKey()+", "
                +((player.isStatus()==true)?1:0)+")";

        return statement.execute(query);

    }

    @Override
    public void addPlayers(Connection conn, List<Players> listOfplayers) {

    }

    @Override
    public List<Players> getPlayers(Connection conn) {
        return null;
    }

    @Override
    public Players getPlayerById(Connection conn, int id) {
        return null;
    }

    @Override
    public boolean updatePlayerById(Connection conn, Players player) {
        return false;
    }

    @Override
    public boolean deletePlayer(Connection conn, int id) {
        return false;
    }
}
