module co.edu.uniquindio.poo.gestion_hospitalaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.gestion_hospitalaria to javafx.fxml;
    exports co.edu.uniquindio.poo.gestion_hospitalaria;
}