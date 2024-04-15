module basics.chapter002 {
    requires javafx.controls;
    requires javafx.fxml;


    opens basics.chapter002 to javafx.fxml;
    exports basics.chapter002;
    exports basics.chapter003;
}