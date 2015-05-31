package sdc.avoidingproblems.circuits.message;

/**
 *
 * @author Vitor Enes (vitorenesduarte ~at~ gmail ~dot~ com)
 */
public class Commit extends Message {

    private final String player; // host:port
    private final Long value;

    public Commit(String player, Long value) {
        this.player = player;
        this.value = value;
    }

    public String getPlayer() {
        return player;
    }

    public Long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Commit{" + "player=" + player + ", value=" + value + '}';
    }
}
