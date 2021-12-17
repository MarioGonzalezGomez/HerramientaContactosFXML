module mggcode.personasfxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens mggcode.personasfxml to javafx.fxml;
    exports mggcode.personasfxml;
}