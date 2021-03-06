package sdc.spdz.algebra;

import sdc.spdz.algebra.mac.SimpleRepresentation;
import sdc.spdz.circuit.ExecutionMode;
import sdc.spdz.exception.InvalidParamException;
import sdc.spdz.exception.ExecutionModeNotSupportedException;

/**
 *
 * @author Vitor Enes (vitorenesduarte ~at~ gmail ~dot~ com)
 */
public class MultFunction implements Function {

    @Override
    public SimpleRepresentation apply(ExecutionMode mode, BeaverTriple triple, FieldElement d, FieldElement e, SimpleRepresentation... params) throws InvalidParamException, ExecutionModeNotSupportedException {
        switch (mode) {
            case LOCAL:
                if (params.length != 2) {
                    throw new InvalidParamException("Invalid param number");
                } else {
                    SimpleRepresentation x = params[0];
                    SimpleRepresentation y = params[1];
                    return x.mult(y);
                }
            case DISTRIBUTED:
                if (params.length != 1) {
                    throw new InvalidParamException("Invalid param number");
                }
                if (d == null || e == null) {
                    throw new InvalidParamException("d and e cannot be null");
                }
                SimpleRepresentation dShare = params[0];
                SimpleRepresentation a = triple.getA();
                SimpleRepresentation b = triple.getB();
                SimpleRepresentation c = triple.getC();

                // [xy] = [c] + e[b] + d[a] + d[e]
                // [xy] = [c] + e[b] + d[a] + [d]e
                //return dShare.mult(e).add(a.mult(e)).add(b.mult(d)).add(c);
                return dShare.mult(e).add(a.mult(e)).add(b.mult(d)).add(c);
            default:
                throw new ExecutionModeNotSupportedException();
        }
    }
}
