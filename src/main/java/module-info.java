module sample.hangman3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample.hangman3 to javafx.fxml;
    exports sample.hangman3;
}