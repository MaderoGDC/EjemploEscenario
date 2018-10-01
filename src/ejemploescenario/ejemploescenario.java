/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploescenario;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.StrokeLineCap;
public class ejemploescenario extends Application {

    @Override
    //el nombre d elo que esta en parentresis define la escena(variable stage)
    public void start(Stage stage) throws Exception {
        //comtiene informacion
        Pane panel = new Pane();
        Canvas canvas = new Canvas (300,300);
        panel.getChildren().add(canvas);
        Scene scene = new Scene(panel,300,300,Color.ANTIQUEWHITE);
            //obtener lapiz para dibujar sobre el tablero (canvas)
            GraphicsContext gc = canvas.getGraphicsContext2D();
            
            LoopJuego loop = new  LoopJuego(gc);
            loop.start();


            //titulo
            stage.setTitle("Ejemplo animacion");
            //establecerlo y mostrarlo
            stage.setScene(scene);
            stage.show();
            

            
       
    }
    public static void main(String[] args) {
        Application.launch(args);
    }

    /**
     * @param args the command line arguments
     */
  
}

