package es.liernisarraoa.dein_ejerciciop_lsj.Controlador;

import es.liernisarraoa.dein_ejerciciop_lsj.Productos;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controlador para asociar los estilos segun el stock y crear los productos
 *
 * @author Lierni
 * @version 1.0
 */
public class ControladorProductos implements Initializable {
    private String style = "";

    @FXML
    public Pane panel2;
    @FXML
    public Pane panel3;
    @FXML
    public Pane panel1;
    @FXML
    public ImageView imagenProducto1;
    @FXML
    public Label nombreProducto1;
    @FXML
    public Label stockProducto1;
    @FXML
    public ImageView imagenProducto2;
    @FXML
    public Label nombreProducto2;
    @FXML
    public Label stockProducto2;
    @FXML
    public ImageView imagenProducto;
    @FXML
    public Label nombreProducto;
    @FXML
    public Label stockProducto;

    /**
     * Poner un Stock y segun la cantidad cambiar le fondo
     *
     * @param cantidad
     */
    public void setStock(Label stockText, double cantidad, Pane panel) {
        if (cantidad > 100) {
            style = "verde";
        } else if (cantidad > 20) {
            style = "azul";
        } else {
            style = "rojo";
        }
        stockText.setText(String.valueOf(cantidad));
        panel.getStyleClass().add(style);
    }

    /**
     * Para poner una imagen
     *
     * @param imagen
     */
    public void setImage(ImageView imagenProd, Image imagen) {
        imagenProd.setImage(imagen);
    }

    /**
     * Poner un nombre
     *
     * @param nombre
     */
    public void setName(Label nombreText, String nombre) {
        nombreText.setText(nombre);
    }

    /**
     * AL implementar la clase Initializable hay que implementar este metodo.
     * Este metodo hace que todo el codigo que este dentro se ejecute al iniciarse al aplicacion.
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setStock(stockProducto, 10, panel1);
        setImage(imagenProducto, new Image(String.valueOf(Productos.class.getResource("Imagenes/pan.png"))));
        setName(nombreProducto, "Pan");


        setStock(stockProducto1, 200, panel2);
        setImage(imagenProducto1, new Image(String.valueOf(Productos.class.getResource("Imagenes/manzana.png"))));
        setName(nombreProducto1, "Manzana");

        setStock(stockProducto2, 50, panel3);
        setImage(imagenProducto2, new Image(String.valueOf(Productos.class.getResource("Imagenes/leche.png"))));
        setName(nombreProducto2, "Leche");
    }
}