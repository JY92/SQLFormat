module com.geek.sqlformat {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.geek.sqlformat to javafx.fxml;
    exports com.geek.sqlformat;
    exports com.geek.sqlformat.controller;
    opens com.geek.sqlformat.controller to javafx.fxml;
}