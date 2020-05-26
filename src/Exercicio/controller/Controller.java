package exercicio.controller;

import exercicio.Exercicio;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller {
    @FXML TextField textEvidence;
    @FXML TextField textValue;
    @FXML TextField textResultFor;
    @FXML TextArea textResult;
    @FXML Button buttonCalc;
    @FXML GridPane grid;

    @FXML
    private void calcSolution(){
        if(this.textResultFor.getText() == null || this.textEvidence.getText() == null || this.textValue.getText() == null)
            throw new Error("One or more parameters not filled!");

        Exercicio ex = new Exercicio();
        ex.setResultNode(this.textResultFor.getText());
        ex.setEvidence(this.textEvidence.getText());
        ex.setValue(this.textValue.getText());

        this.textResult.setText(ex.getResult());
    }

}
