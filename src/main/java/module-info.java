module com.haliuk.genshinexpcalc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.haliuk.genshinexpcalc to javafx.fxml;
    exports com.haliuk.genshinexpcalc;
    exports com.haliuk.genshinexpcalc.helper;
    opens com.haliuk.genshinexpcalc.helper to javafx.fxml;
}