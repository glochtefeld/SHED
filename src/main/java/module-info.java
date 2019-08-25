module shed {
    requires javafx.controls;
    requires javafx.fxml;
    requires gson;
    requires org.controlsfx.controls;

    opens com.gavinlochtefeld.shed to javafx.fxml;
    exports com.gavinlochtefeld.shed;
}