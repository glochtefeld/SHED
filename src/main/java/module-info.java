module shed {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gavinlochtefeld.shed to javafx.fxml;
    exports com.gavinlochtefeld.shed;
}