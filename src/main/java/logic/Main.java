package logic;

import logic.dao.PlayerDAOImpl;
import logic.data.Common;
import logic.entity.Players;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import static logic.data.Common.*;

public class Main {

    public static void main(String[] args) {

        List<Players> listOfPlayers = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection(DB_URL,USER, PASSWORD);
            Statement statment = connection.createStatement()){






            String sql_query = "select * from PLAYERS";
            ResultSet result1 = statment.executeQuery(sql_query);
            while(result1.next()){
                listOfPlayers.add(new Players(result1.getInt("PLAYER_ID"),
                        result1.getInt("COUNTRY_KEY"),
                        result1.getString("NAME"),
                        result1.getString("SURNAME"),
                        result1.getInt("YEAR_OF_BORN"),
                        result1.getInt("CLUB_KEY"),
                        result1.getInt("NUMBER_IN_NT_KEY"),
                        result1.getInt("NUMBER_IN_CLUB_KEY"),
                        result1.getInt("STATUS")==1?true:false));
            }
            System.out.println(listOfPlayers);
            PlayerDAOImpl playerDAO = new PlayerDAOImpl();

            Players player = new Players(5, "Denis", "Boyko", 1988, 1927, 1, 1, true);
            playerDAO.addPlayer(statment, player);

            ResultSet result2 = statment.executeQuery(sql_query);
            while(result2.next()){
                listOfPlayers.add(new Players(result2.getInt("PLAYER_ID"),
                        result2.getInt("COUNTRY_KEY"),
                        result2.getString("NAME"),
                        result2.getString("SURNAME"),
                        result2.getInt("YEAR_OF_BORN"),
                        result2.getInt("CLUB_KEY"),
                        result2.getInt("NUMBER_IN_NT_KEY"),
                        result2.getInt("NUMBER_IN_CLUB_KEY"),
                        result2.getInt("STATUS")==1?true:false));
            }
            System.out.println(listOfPlayers);
           




        }catch (SQLException ex){
            ex.printStackTrace();
        }



    }

}
