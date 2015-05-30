package sdc.avoidingproblems.circuits.message;

/**
 *
 * @author Vitor Enes (vitorenesduarte ~at~ gmail ~dot~ com)
 */
public class MultiplicationShare extends Message {

    private final Long multID;
    private final Long d;
    private final Long e;

    public MultiplicationShare(Long multID, Long d, Long e) {
        this.multID = multID;
        this.d = d;
        this.e = e;
    }

    public Long getMultID() {
        return multID;
    }

    public Long getD() {
        return d;
    }

    public Long getE() {
        return e;
    }

    @Override
    public String toString() {
        return multID + ":{d=" + d + ", e=" + e + '}';
    }
    
    @Override
    public MultiplicationShare clone(){
        MultiplicationShare clone = new MultiplicationShare(multID, d, e);
        return clone;
    }
}