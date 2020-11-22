package userInterface;

import java.io.File;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Driver extends Application{
	
	
	private static final Button rgbBtn = new Button("RGB");
	private static final Button cmyBtn = new Button("CMY");
	private static final Button hsvBtn = new Button("HSV");
	private static ImageView logo;

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		
		logo = new ImageView(new Image(new File("Logo3.png").toURI().toURL().toExternalForm()));
		
		ColorRGB.rgbColorUserInterface(stage,rgbBtn,cmyBtn,hsvBtn,logo);
	
		rgbBtn.setOnAction(e ->{
			ColorRGB.rgbColorUserInterface(stage,rgbBtn,cmyBtn,hsvBtn,logo);
		});
		
		cmyBtn.setOnAction(e ->{
			ColorCMY.cmyColorUserInterface(stage,rgbBtn,cmyBtn,hsvBtn,logo);
		});
		
		hsvBtn.setOnAction(e ->{
			ColorHSV.hsvColorUserInterface(stage,rgbBtn,cmyBtn,hsvBtn,logo);
		});
	}

}
