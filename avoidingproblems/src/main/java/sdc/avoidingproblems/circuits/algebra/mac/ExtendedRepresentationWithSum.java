package sdc.avoidingproblems.circuits.algebra.mac;

import java.util.Map;
import sdc.avoidingproblems.circuits.algebra.FieldElement;

/**
 *
 * @author Vitor Enes
 */
public class ExtendedRepresentationWithSum extends ExtendedRepresentation {

    private final FieldElement sum;

    public ExtendedRepresentationWithSum(FieldElement beta, FieldElement value, FieldElement sum, Map<Integer, FieldElement> playersMACShares) {
        super(beta, value, playersMACShares);
        this.sum = sum;
    }

    public FieldElement getSum() {
        return sum;
    }
}
