package FIFA_Data_Base;

import java.io.Serializable;

public class FIFADataBase implements Serializable {
    private static final long serialVersionUID = 1L;

    private String playerId;
    private String playerName;
    private Byte playerOverall;
    private String playerClub;

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public byte getPlayerOverall() {
        return playerOverall;
    }

    public String getPlayerClub() {
        return playerClub;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerOverall(byte playerOverall) {
        this.playerOverall = playerOverall;
    }

    public void setPlayerClub(String playerClub) {
        this.playerClub = playerClub;
    }

    public FIFADataBase() {
    }

    public FIFADataBase(String playerId, String playerName, Byte playerOverall, String playerClub) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playerOverall = playerOverall;
        this.playerClub = playerClub;
    }

    public String toString() {
        return playerId + ", " + playerName + ", " + playerOverall + ", " + playerClub;
    }

}