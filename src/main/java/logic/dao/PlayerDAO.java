package logic.dao;

import logic.entity.Players;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public interface PlayerDAO {

    boolean addPlayer(Statement statement, Players player) throws SQLException;
    void addPlayers(Connection conn, List<Players> listOfplayers);
    List<Players> getPlayers(Connection conn);
    Players getPlayerById(Connection conn, int id);
    boolean updatePlayerById(Connection conn, Players player);
    boolean deletePlayer(Connection conn, int id);

}
