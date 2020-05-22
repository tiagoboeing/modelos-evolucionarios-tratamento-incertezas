package Aula21mai20;

import smile.Network;

public class Main {
    public static void main(String[] args) {
        new smile.License(
                "SMILE LICENSE cdd9da38 90b9c16d 4d00c0d4 " +
                        "THIS IS AN ACADEMIC LICENSE AND CAN BE USED " +
                        "SOLELY FOR ACADEMIC RESEARCH AND TEACHING, " +
                        "AS DEFINED IN THE BAYESFUSION ACADEMIC " +
                        "SOFTWARE LICENSING AGREEMENT. " +
                        "Serial #: 213qrtcqm6pf5edvq7stisusf " +
                        "Issued for: Tiago Boeing (tiagoboeing11@gmail.com) " +
                        "Academic institution: UNISUL - University of South of Santa Catarina " +
                        "Valid until: 2020-11-22 " +
                        "Issued by BayesFusion activation server",
                new byte[] {
                        79,-96,55,-120,-55,39,127,-23,84,100,41,103,-14,-9,-57,56,
                        -73,-113,-40,26,69,108,17,-103,80,127,-97,18,123,46,-92,-92,
                        -61,60,18,124,-85,126,-17,77,18,-43,-92,6,-73,126,-33,-4,
                        -47,109,94,-44,1,-4,-72,38,-39,-128,40,-50,-120,-95,63,25
                }
        );

        String resultNode = "Gato";

        Network net = new Network();
        net.readFile("gato.xdsl");
        net.setEvidence("Espirro", "V");
        net.updateBeliefs();
        double[] beliefs = net.getNodeValue(resultNode);
        for(int i=0; i < beliefs.length; i++){
            System.out.format("%s = %s \n",
                    net.getOutcomeId(resultNode, i),
                    beliefs[i]
            );
        }

    }
}
