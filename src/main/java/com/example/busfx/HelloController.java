package com.example.busfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField kolvo;
    @FXML
    TextField vysoty;

    @FXML
    Label crash;

    @FXML
    Label noCrash;
    @FXML
    private Label wrongFormat;

    @FXML
    protected void mainCheck() {
        wrongFormat.setVisible(false);
        try {
            int n = Integer.parseInt(kolvo.getText());
            int[] heights = getHeights();

            int x = BridgesChecker.findCrash(heights);
            boolean wasCrashed = x>0;
            noCrash.setVisible(!wasCrashed);
            crash.setVisible(wasCrashed);
            crash.setText("Crash "+x);
        } catch (NumberFormatException e) {
            wrongFormat.setVisible(true);
        }
    }

    private int[] getHeights() {
        String strVysoty = vysoty.getText();
        String[] arr = strVysoty.split(" ");
        int[] heights = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            heights[i] = Integer.parseInt(arr[i]);
        }
        return heights;
    }
}