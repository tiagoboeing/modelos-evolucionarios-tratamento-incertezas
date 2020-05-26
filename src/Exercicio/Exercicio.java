package exercicio;

import smile.Network;

public class Exercicio {
    String resultNode;
    String evidence;
    String value;

    public String getResult(){
        Network net = new Network();
        net.readFile("gato.xdsl");
        net.setEvidence(this.evidence, this.value);
        net.updateBeliefs();
        double[] beliefs = net.getNodeValue(this.resultNode);

        String result = "";
        for(int i=0; i < beliefs.length; i++){
            result += String.format("%s = %s \n",
                    net.getOutcomeId(this.resultNode, i),
                    beliefs[i]);
        }

        return result;
    }


    public String getResultNode() {
        return resultNode;
    }

    public void setResultNode(String resultNode) {
        this.resultNode = resultNode;
    }

    public String getEvidence() {
        return evidence;
    }

    public void setEvidence(String evidence) {
        this.evidence = evidence;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
