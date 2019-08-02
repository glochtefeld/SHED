module shed {
    requires javafx.controls;
    requires javafx.fxml;
    requires gson;

    opens com.gavinlochtefeld.shed to javafx.fxml;
    exports com.gavinlochtefeld.shed;
}