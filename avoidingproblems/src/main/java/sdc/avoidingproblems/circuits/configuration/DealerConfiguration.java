package sdc.avoidingproblems.circuits.configuration;

import java.util.List;

/**
 *
 * @author Vitor Enes (vitorenesduarte ~at~ gmail ~dot~ com)
 */
public class DealerConfiguration {
   // for now the dealer also generates the circuit and sends everything to the players;

   private final Long numberOfInputs;
   private final Long batchCheckSize;
   private final Boolean generateInputs;
   private final Long MOD;
   private final List<String> players; // host and port. e.g.: localhost:4567

   public DealerConfiguration(Long numberOfInputs, Long batchCheckSize, Boolean generateInputs, Long MOD, List<String> players) {
      this.numberOfInputs = numberOfInputs;
      this.batchCheckSize = batchCheckSize;
      this.generateInputs = generateInputs;
      this.MOD = MOD;
      this.players = players;
   }

   public Long getNumberOfInputs() {
      return numberOfInputs;
   }

   public Long getBatchCheckSize() {
      return batchCheckSize;
   }

   public Boolean getGenerateInputs() {
      return generateInputs;
   }

   public Long getMOD() {
      return MOD;
   }

   public List<String> getPlayers() {
      return players;
   }

}
