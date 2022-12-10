module com.example.finalprojectv1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.naming;
    requires java.sql;

    requires org.controlsfx.controls;
    requires org.hibernate.orm.core;
    requires java.persistence;

    opens com.example.finalprojectv1 to javafx.fxml;
    exports com.example.finalprojectv1;
}