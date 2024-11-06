module es.liernisarraoa.dein_ejerciciop_lsj {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.liernisarraoa.dein_ejerciciop_lsj to javafx.fxml;
    exports es.liernisarraoa.dein_ejerciciop_lsj;
    exports es.liernisarraoa.dein_ejerciciop_lsj.Controlador;
    opens es.liernisarraoa.dein_ejerciciop_lsj.Controlador to javafx.fxml;
}