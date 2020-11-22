package userInterface;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import logic.ColorDisplay;

public class ColorRGB {

	public static void rgbColorUserInterface(Stage stage,Button rgbBtn,Button cmyBtn,Button hsvBtn,ImageView logo) {
		AnchorPane anchor = new AnchorPane();
		
		// Rectangles for looks
		Rectangle leftRectangle = new Rectangle(250, 700);
		leftRectangle.setFill(Color.rgb(48, 48, 48));
		anchor.getChildren().add(leftRectangle);
		AnchorPane.setLeftAnchor(leftRectangle, 25.0);

		Rectangle centerRectangle = new Rectangle(250, 700);
		centerRectangle.setFill(Color.rgb(48, 48, 48));
		anchor.getChildren().add(centerRectangle);
		AnchorPane.setLeftAnchor(centerRectangle, 325.0);

		Rectangle rightRectangle = new Rectangle(250, 700);
		rightRectangle.setFill(Color.rgb(48, 48, 48));
		anchor.getChildren().add(rightRectangle);
		AnchorPane.setLeftAnchor(rightRectangle, 625.0);
		
		// VBox for buttons
		VBox vBox = new VBox(15);
		AnchorPane.setRightAnchor(vBox, 35.0);
		AnchorPane.setTopAnchor(vBox, 200.0);
		anchor.getChildren().add(vBox);

		// properties for rgbBtn
		rgbBtn.setCursor(Cursor.HAND);
		rgbBtn.setPrefWidth(150);
		rgbBtn.setPrefHeight(50);
		rgbBtn.setTextFill(Color.WHITE);
		rgbBtn.setStyle("-fx-background-color: #303030;");

		rgbBtn.setOnMouseEntered(e -> {
			rgbBtn.setStyle("-fx-background-color: #505050;");
		});

		rgbBtn.setOnMousePressed(e -> {
			rgbBtn.setStyle("-fx-background-color: #606060;");
		});

		rgbBtn.setOnMouseExited(e -> {
			rgbBtn.setStyle("-fx-background-color: #303030;");
		});
		vBox.getChildren().add(rgbBtn);

		// properties for cmyBtn
		cmyBtn.setCursor(Cursor.HAND);
		cmyBtn.setPrefWidth(150);
		cmyBtn.setPrefHeight(50);
		cmyBtn.setTextFill(Color.WHITE);
		cmyBtn.setStyle("-fx-background-color: #303030;");

		cmyBtn.setOnMouseEntered(e -> {
			cmyBtn.setStyle("-fx-background-color: #505050;");
		});

		cmyBtn.setOnMousePressed(e -> {
			cmyBtn.setStyle("-fx-background-color: #606060;");
		});

		cmyBtn.setOnMouseExited(e -> {
			cmyBtn.setStyle("-fx-background-color: #303030;");
		});
		vBox.getChildren().add(cmyBtn);

		// properties for hsvBtn
		hsvBtn.setCursor(Cursor.HAND);
		hsvBtn.setPrefWidth(150);
		hsvBtn.setPrefHeight(50);
		hsvBtn.setTextFill(Color.WHITE);

		hsvBtn.setStyle("-fx-background-color: #303030;");
		
		hsvBtn.setOnMouseEntered(e ->{
			hsvBtn.setStyle("-fx-background-color: #505050;");
		});
		
		hsvBtn.setOnMousePressed(e -> {
			hsvBtn.setStyle("-fx-background-color: #606060;");
		});
		
		hsvBtn.setOnMouseExited(e -> {
			hsvBtn.setStyle("-fx-background-color: #303030;");
		});
		
		vBox.getChildren().add(hsvBtn);

		// separating line between segments
		Separator leftSeperate = new Separator();
		leftSeperate.setPrefHeight(700);
		leftSeperate.setOrientation(Orientation.VERTICAL);
		leftSeperate.setPadding(new Insets(0, 0, 0, 300));
		anchor.getChildren().add(leftSeperate);

		Separator rightSeperate = new Separator();
		rightSeperate.setPrefHeight(700);
		rightSeperate.setOrientation(Orientation.VERTICAL);
		rightSeperate.setPadding(new Insets(0, 0, 0, 600));
		anchor.getChildren().add(rightSeperate);
		
		//horozintal lines
		Separator horDownSeperate = new Separator();
		horDownSeperate.setPrefWidth(200);
		horDownSeperate.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setRightAnchor(horDownSeperate, 10.0);
		AnchorPane.setBottomAnchor(horDownSeperate, 160.0);
		anchor.getChildren().add(horDownSeperate);
		
		Separator horUpSeperate = new Separator();
		horUpSeperate.setPrefWidth(200);
		horUpSeperate.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setRightAnchor(horUpSeperate, 10.0);
		AnchorPane.setTopAnchor(horUpSeperate, 175.0);
		anchor.getChildren().add(horUpSeperate);

		/*
		 * Left
		 */
		
		// Slider for Red
		Slider leftRedSlider = new Slider(0, 255, 0);
		leftRedSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(leftRedSlider, 50.0);
		AnchorPane.setTopAnchor(leftRedSlider, 50.0);
		anchor.getChildren().add(leftRedSlider);

		// Slider for green
		Slider leftGreenSlider = new Slider(0, 255, 0);
		leftGreenSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(leftGreenSlider, 50.0);
		AnchorPane.setTopAnchor(leftGreenSlider, 150.0);
		anchor.getChildren().add(leftGreenSlider);
		
		// Slider for blue
		Slider leftBlueSlider = new Slider(0, 255, 0);
		leftBlueSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(leftBlueSlider, 50.0);
		AnchorPane.setTopAnchor(leftBlueSlider, 250.0);
		anchor.getChildren().add(leftBlueSlider);

		// rectangle for first segment of colors
		Rectangle leftRectangleColorSegment = new Rectangle(200, 110);
		leftRectangleColorSegment.setStroke(Color.WHITE);
		leftRectangleColorSegment.setFill(Color.BLACK);
		anchor.getChildren().add(leftRectangleColorSegment);
		AnchorPane.setLeftAnchor(leftRectangleColorSegment, 50.0);
		AnchorPane.setTopAnchor(leftRectangleColorSegment, 350.0);
		
		// label to indicate that this is the first color
		Label colorOne = new Label("Color One");
		colorOne.setTextFill(Color.WHITE);
		colorOne.setFont(Font.font("Arial",FontWeight.BOLD,24));
		anchor.getChildren().add(colorOne);
		AnchorPane.setBottomAnchor(colorOne, 65.0);
		AnchorPane.setLeftAnchor(colorOne, 90.0);

		// red text box and label
		Label leftRedLabel = new Label("Red");
		leftRedLabel.setTextFill(Color.RED);
		anchor.getChildren().add(leftRedLabel);
		AnchorPane.setTopAnchor(leftRedLabel, 20.0);
		AnchorPane.setLeftAnchor(leftRedLabel, 200.0);

		TextField leftRedField = new TextField("0");
		leftRedField.setPrefWidth(50);
		leftRedField.setEditable(true);
		anchor.getChildren().add(leftRedField);
		AnchorPane.setTopAnchor(leftRedField, 40.0);
		AnchorPane.setLeftAnchor(leftRedField, 200.0);

		// green text box and label
		Label leftGreenLabel = new Label("Green");
		leftGreenLabel.setTextFill(Color.FORESTGREEN);
		anchor.getChildren().add(leftGreenLabel);
		AnchorPane.setTopAnchor(leftGreenLabel, 120.0);
		AnchorPane.setLeftAnchor(leftGreenLabel, 200.0);

		TextField leftGreenField = new TextField("0");
		leftGreenField.setPrefWidth(50);
		leftGreenField.setEditable(true);
		anchor.getChildren().add(leftGreenField);
		AnchorPane.setTopAnchor(leftGreenField, 140.0);
		AnchorPane.setLeftAnchor(leftGreenField, 200.0);

		// blue text box and label
		Label leftBlueLabel = new Label("Blue");
		leftBlueLabel.setTextFill(Color.rgb(0, 0, 255));
		anchor.getChildren().add(leftBlueLabel);
		AnchorPane.setTopAnchor(leftBlueLabel, 220.0);
		AnchorPane.setLeftAnchor(leftBlueLabel, 200.0);

		TextField leftBlueField = new TextField("0");
		leftBlueField.setPrefWidth(50);
		leftBlueField.setEditable(true);
		anchor.getChildren().add(leftBlueField);
		AnchorPane.setTopAnchor(leftBlueField, 240.0);
		AnchorPane.setLeftAnchor(leftBlueField, 200.0);
		
		/*
		 *End Left
		 */
		
		
		/*
		 * Center
		 */
		
		// Slider for Red
		Slider centerRedSlider = new Slider(0, 255, 0);
		centerRedSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(centerRedSlider, 350.0);
		AnchorPane.setTopAnchor(centerRedSlider, 50.0);

		anchor.getChildren().add(centerRedSlider);

		// Slider for green
		Slider centerGreenSlider = new Slider(0, 255, 0);
		centerGreenSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(centerGreenSlider, 350.0);
		AnchorPane.setTopAnchor(centerGreenSlider, 150.0);

		anchor.getChildren().add(centerGreenSlider);

		// Slider for blue
		Slider centerBlueSlider = new Slider(0, 255, 0);
		centerBlueSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(centerBlueSlider, 350.0);
		AnchorPane.setTopAnchor(centerBlueSlider, 250.0);

		anchor.getChildren().add(centerBlueSlider);

		// rectangle for first segment of colors
		Rectangle centerRectangleColorSegment = new Rectangle(200, 110);
		centerRectangleColorSegment.setStroke(Color.WHITE);
		centerRectangleColorSegment.setFill(Color.BLACK);
		anchor.getChildren().add(centerRectangleColorSegment);
		AnchorPane.setLeftAnchor(centerRectangleColorSegment, 350.0);
		AnchorPane.setTopAnchor(centerRectangleColorSegment, 350.0);
		
		// label to indicate that this is the first color
		Label colorTwo = new Label("Color Two");
		colorTwo.setTextFill(Color.WHITE);
		colorTwo.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		anchor.getChildren().add(colorTwo);
		AnchorPane.setBottomAnchor(colorTwo, 65.0);
		AnchorPane.setLeftAnchor(colorTwo, 390.0);
		
		// red text box and label
		Label centerRedLabel = new Label("Red");
		centerRedLabel.setTextFill(Color.RED);
		anchor.getChildren().add(centerRedLabel);
		AnchorPane.setTopAnchor(centerRedLabel, 20.0);
		AnchorPane.setLeftAnchor(centerRedLabel, 500.0);

		TextField centerRedField = new TextField("0");
		centerRedField.setPrefWidth(50);
		centerRedField.setEditable(true);
		anchor.getChildren().add(centerRedField);
		AnchorPane.setTopAnchor(centerRedField, 40.0);
		AnchorPane.setLeftAnchor(centerRedField, 500.0);

		// green text box and label
		Label centerGreenLabel = new Label("Green");
		centerGreenLabel.setTextFill(Color.FORESTGREEN);
		anchor.getChildren().add(centerGreenLabel);
		AnchorPane.setTopAnchor(centerGreenLabel, 120.0);
		AnchorPane.setLeftAnchor(centerGreenLabel, 500.0);

		TextField centerGreenField = new TextField("0");
		centerGreenField.setPrefWidth(50);
		centerGreenField.setEditable(true);
		anchor.getChildren().add(centerGreenField);
		AnchorPane.setTopAnchor(centerGreenField, 140.0);
		AnchorPane.setLeftAnchor(centerGreenField, 500.0);

		// blue text box and label
		Label centerBlueLabel = new Label("Blue");
		centerBlueLabel.setTextFill(Color.rgb(0, 0, 255));
		anchor.getChildren().add(centerBlueLabel);
		AnchorPane.setTopAnchor(centerBlueLabel, 220.0);
		AnchorPane.setLeftAnchor(centerBlueLabel, 500.0);

		TextField centerBlueField = new TextField("0");
		centerBlueField.setPrefWidth(50);
		centerBlueField.setEditable(true);
		anchor.getChildren().add(centerBlueField);
		AnchorPane.setTopAnchor(centerBlueField, 240.0);
		AnchorPane.setLeftAnchor(centerBlueField, 500.0);
		
		/*
		 * End Center
		 */
		
		/*
		 * Right
		 */


		// red text box and label
		Label rightRedLabel = new Label("Red");
		rightRedLabel.setTextFill(Color.RED);
		anchor.getChildren().add(rightRedLabel);
		AnchorPane.setTopAnchor(rightRedLabel, 20.0);
		AnchorPane.setLeftAnchor(rightRedLabel, 650.0);
		
		TextField rightRedField = new TextField("0");
		rightRedField.setEditable(false);
		rightRedField.setPrefWidth(50);
		anchor.getChildren().add(rightRedField);
		AnchorPane.setTopAnchor(rightRedField, 40.0);
		AnchorPane.setLeftAnchor(rightRedField, 650.0);
		
		//green text box and label
		Label rightGreenLabel = new Label("Green");
		rightGreenLabel.setTextFill(Color.GREEN);
		anchor.getChildren().add(rightGreenLabel);
		AnchorPane.setTopAnchor(rightGreenLabel, 20.0);
		AnchorPane.setLeftAnchor(rightGreenLabel, 725.0);
		
		TextField rightGreenField = new TextField("0");
		rightGreenField.setEditable(false);
		rightGreenField.setPrefWidth(50);
		anchor.getChildren().add(rightGreenField);
		AnchorPane.setTopAnchor(rightGreenField, 40.0);
		AnchorPane.setLeftAnchor(rightGreenField, 725.0);
		
		// blue text box and label
		Label rightBlueLabel = new Label("Blue");
		rightBlueLabel.setTextFill(Color.BLUE);
		anchor.getChildren().add(rightBlueLabel);
		AnchorPane.setTopAnchor(rightBlueLabel, 20.0);
		AnchorPane.setLeftAnchor(rightBlueLabel, 800.0);
		
		TextField rightBlueField = new TextField("0");
		rightBlueField.setEditable(false);
		rightBlueField.setPrefWidth(50);
		anchor.getChildren().add(rightBlueField);
		AnchorPane.setTopAnchor(rightBlueField, 40.0);
		AnchorPane.setLeftAnchor(rightBlueField, 800.0);
		
		//cyan field and label
		Label rightCyanLabel = new Label("Cyan");
		rightCyanLabel.setTextFill(Color.CYAN);
		anchor.getChildren().add(rightCyanLabel);
		AnchorPane.setTopAnchor(rightCyanLabel, 120.0);
		AnchorPane.setLeftAnchor(rightCyanLabel, 650.0);
		
		TextField rightCyanField = new TextField("0");
		rightCyanField.setEditable(false);
		rightCyanField.setPrefWidth(50);
		anchor.getChildren().add(rightCyanField);
		AnchorPane.setTopAnchor(rightCyanField, 140.0);
		AnchorPane.setLeftAnchor(rightCyanField, 650.0);
		
		//magenta text box and label
		Label rightMagentaLabel = new Label("Magenta");
		rightMagentaLabel.setTextFill(Color.MAGENTA);
		anchor.getChildren().add(rightMagentaLabel);
		AnchorPane.setTopAnchor(rightMagentaLabel, 120.0);
		AnchorPane.setLeftAnchor(rightMagentaLabel, 725.0);
		
		TextField rightMagentaField = new TextField("0");
		rightMagentaField.setEditable(false);
		rightMagentaField.setPrefWidth(50);
		anchor.getChildren().add(rightMagentaField);
		AnchorPane.setTopAnchor(rightMagentaField, 140.0);
		AnchorPane.setLeftAnchor(rightMagentaField, 725.0);
		
		//yellow text box and label
		Label rightYellowLabel = new Label("Yellow");
		rightYellowLabel.setTextFill(Color.YELLOW);
		anchor.getChildren().add(rightYellowLabel);
		AnchorPane.setTopAnchor(rightYellowLabel, 120.0);
		AnchorPane.setLeftAnchor(rightYellowLabel, 800.0);
		
		TextField rightYellowField = new TextField("0");
		rightYellowField.setEditable(false);
		rightYellowField.setPrefWidth(50);
		anchor.getChildren().add(rightYellowField);
		AnchorPane.setTopAnchor(rightYellowField, 140.0);
		AnchorPane.setLeftAnchor(rightYellowField, 800.0);
		
		VBox vHueSatVal = new VBox(20);
		
		Label rightHueLabel = new Label("Hue");
		rightHueLabel.setTextFill(Color.WHITE);
		anchor.getChildren().add(rightHueLabel);
		AnchorPane.setTopAnchor(rightHueLabel, 210.0);
		AnchorPane.setLeftAnchor(rightHueLabel, 730.0);

		TextField rightHueField = new TextField("0");
		rightHueField.setEditable(false);
		rightHueField.setPrefWidth(75);
		vHueSatVal.getChildren().add(rightHueField);
//		AnchorPane.setTopAnchor(rightHueField, 240.0);
//		AnchorPane.setLeftAnchor(rightHueField, 630.0);

		// saturation text box and label
		Label rightSaturationLabel = new Label("Saturation");
		rightSaturationLabel.setTextFill(Color.WHITE);
		anchor.getChildren().add(rightSaturationLabel);
		AnchorPane.setTopAnchor(rightSaturationLabel, 260.0);
		AnchorPane.setLeftAnchor(rightSaturationLabel, 730.0);

		TextField rightSaturationField = new TextField("0");
		rightSaturationField.setEditable(false);
		rightSaturationField.setPrefWidth(75);
		vHueSatVal.getChildren().add(rightSaturationField);
//		AnchorPane.setTopAnchor(rightSaturationField, 240.0);
//		AnchorPane.setLeftAnchor(rightSaturationField, 725.0);

		// value text box and label
		Label rightValueLabel = new Label("Value");
		rightValueLabel.setTextFill(Color.WHITE);
		anchor.getChildren().add(rightValueLabel);
		AnchorPane.setTopAnchor(rightValueLabel, 310.0);
		AnchorPane.setLeftAnchor(rightValueLabel, 730.0);

		TextField rightValueField = new TextField("0");
		rightValueField.setEditable(false);
		rightValueField.setPrefWidth(75);
		vHueSatVal.getChildren().add(rightValueField);
//		AnchorPane.setTopAnchor(rightValueField, 240.0);
//		AnchorPane.setLeftAnchor(rightValueField, 780.0);
		
		anchor.getChildren().add(vHueSatVal);
		AnchorPane.setTopAnchor(vHueSatVal, 200.0);
		AnchorPane.setLeftAnchor(vHueSatVal, 650.0);
		
		//rectangle for color
		Rectangle resultRectangle = new Rectangle(200, 110);
		resultRectangle.setStroke(Color.WHITE);
		resultRectangle.setFill(Color.BLACK);
		anchor.getChildren().add(resultRectangle);
		AnchorPane.setLeftAnchor(resultRectangle, 650.0);
		AnchorPane.setTopAnchor(resultRectangle, 350.0);
		
		Label resultLabel = new Label("Result");
		resultLabel.setTextFill(Color.WHITE);
		resultLabel.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		anchor.getChildren().add(resultLabel);
		AnchorPane.setBottomAnchor(resultLabel, 65.0);
		AnchorPane.setLeftAnchor(resultLabel, 715.0);
		
		/*
		 * End of Right
		 */
		
				
		/*
		 * Left functionality		
		 */

		// to display colors upon entering them
		leftRedField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayRGB(leftRedField, leftGreenField, leftBlueField, leftRectangleColorSegment, leftRedSlider, leftGreenSlider, leftBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});

		leftGreenField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayRGB(leftRedField, leftGreenField, leftBlueField, leftRectangleColorSegment, leftRedSlider, leftGreenSlider, leftBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		leftBlueField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayRGB(leftRedField, leftGreenField, leftBlueField, leftRectangleColorSegment, leftRedSlider, leftGreenSlider, leftBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});

		// leftRedSlider
		leftRedSlider.setOnMouseDragged(e -> {
			int redValue = (int) leftRedSlider.getValue();
			leftRedField.setText(String.valueOf(redValue));
			ColorDisplay.DisplayRGB(leftRedField, leftGreenField, leftBlueField, leftRectangleColorSegment, leftRedSlider, leftGreenSlider, leftBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		
		leftRedSlider.setOnMouseReleased(e -> {
			int redValue = (int) leftRedSlider.getValue();
			leftRedField.setText(String.valueOf(redValue));
			ColorDisplay.DisplayRGB(leftRedField, leftGreenField, leftBlueField, leftRectangleColorSegment, leftRedSlider, leftGreenSlider, leftBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		
		

		// leftGreenSlider
		leftGreenSlider.setOnMouseReleased(e -> {
			int greenValue = (int) leftGreenSlider.getValue();
			leftGreenField.setText(String.valueOf(greenValue));
			ColorDisplay.DisplayRGB(leftRedField, leftGreenField, leftBlueField, leftRectangleColorSegment, leftRedSlider, leftGreenSlider, leftBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		
		leftGreenSlider.setOnMouseDragged(e -> {
			int greenValue = (int) leftGreenSlider.getValue();
			leftGreenField.setText(String.valueOf(greenValue));
			ColorDisplay.DisplayRGB(leftRedField, leftGreenField, leftBlueField, leftRectangleColorSegment, leftRedSlider, leftGreenSlider, leftBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});

		// leftBlueSlider
		leftBlueSlider.setOnMouseReleased(e -> {
			int blueValue = (int) leftBlueSlider.getValue();
			leftBlueField.setText(String.valueOf(blueValue));
			
			ColorDisplay.DisplayRGB(leftRedField, leftGreenField, leftBlueField, leftRectangleColorSegment, leftRedSlider, leftGreenSlider, leftBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		
		leftBlueSlider.setOnMouseDragged(e -> {
			int blueValue = (int) leftBlueSlider.getValue();
			leftBlueField.setText(String.valueOf(blueValue));
			
			ColorDisplay.DisplayRGB(leftRedField, leftGreenField, leftBlueField, leftRectangleColorSegment, leftRedSlider, leftGreenSlider, leftBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		
		/*
		 * End Left functionality		
		 */
		
		/*
		 * Center functionality
		 */
		
		// to display colors upon entering them
		centerRedField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayRGB(centerRedField, centerGreenField, centerBlueField, centerRectangleColorSegment,
					centerRedSlider, centerGreenSlider, centerBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});

		centerGreenField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayRGB(centerRedField, centerGreenField, centerBlueField, centerRectangleColorSegment,
					centerRedSlider, centerGreenSlider, centerBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		centerBlueField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayRGB(centerRedField, centerGreenField, centerBlueField, centerRectangleColorSegment,
					centerRedSlider, centerGreenSlider, centerBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});

		// centerRedSlider
		centerRedSlider.setOnMouseReleased(e -> {
			int redValue = (int) centerRedSlider.getValue();
			centerRedField.setText(String.valueOf(redValue));
			ColorDisplay.DisplayRGB(centerRedField, centerGreenField, centerBlueField, centerRectangleColorSegment,
					centerRedSlider, centerGreenSlider, centerBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		
		centerRedSlider.setOnMouseDragged(e -> {
			int redValue = (int) centerRedSlider.getValue();
			centerRedField.setText(String.valueOf(redValue));
			ColorDisplay.DisplayRGB(centerRedField, centerGreenField, centerBlueField, centerRectangleColorSegment,
					centerRedSlider, centerGreenSlider, centerBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});

		// centerGreenSlider
		centerGreenSlider.setOnMouseReleased(e -> {
			int greenValue = (int) centerGreenSlider.getValue();
			centerGreenField.setText(String.valueOf(greenValue));
			ColorDisplay.DisplayRGB(centerRedField, centerGreenField, centerBlueField, centerRectangleColorSegment,
					centerRedSlider, centerGreenSlider, centerBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		
		centerGreenSlider.setOnMouseDragged(e -> {
			int greenValue = (int) centerGreenSlider.getValue();
			centerGreenField.setText(String.valueOf(greenValue));
			ColorDisplay.DisplayRGB(centerRedField, centerGreenField, centerBlueField, centerRectangleColorSegment,
					centerRedSlider, centerGreenSlider, centerBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});

		// centerBlueSlider
		centerBlueSlider.setOnMouseReleased(e -> {
			int blueValue = (int) centerBlueSlider.getValue();
			centerBlueField.setText(String.valueOf(blueValue));
			ColorDisplay.DisplayRGB(centerRedField, centerGreenField, centerBlueField, centerRectangleColorSegment,
					centerRedSlider, centerGreenSlider, centerBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		
		centerBlueSlider.setOnMouseDragged(e -> {
			int blueValue = (int) centerBlueSlider.getValue();
			centerBlueField.setText(String.valueOf(blueValue));
			ColorDisplay.DisplayRGB(centerRedField, centerGreenField, centerBlueField, centerRectangleColorSegment,
					centerRedSlider, centerGreenSlider, centerBlueSlider);
			
			ColorDisplay.resultRGB(new TextField[] {leftRedField,leftGreenField,leftBlueField},
					new TextField[] {centerRedField,centerGreenField,centerBlueField},
					rightRedField,rightGreenField,rightBlueField,resultRectangle,
					rightCyanField,rightMagentaField,rightYellowField,
					rightHueField, rightSaturationField, rightValueField);
		});
		
		/*
		 * End of Center
		 */
		
		/*
		 * Right
		 */
		
		/*
		 * End of Right
		 */
		
		//for logo
		anchor.getChildren().add(logo);
		logo.setRotate(30);
		logo.setFitHeight(50);
		logo.setFitWidth(70);
		logo.setPreserveRatio(true);
		AnchorPane.setLeftAnchor(logo, 1010.0);
		AnchorPane.setTopAnchor(logo, 15.0);
		
		//Label logo
		Label logoLabel = new Label("Color\nPicker");
		logoLabel.setAlignment(Pos.CENTER);
		logoLabel.setRotate(-10);
		logoLabel.setTextFill(Color.WHITE);
		logoLabel.setFont(Font.font("Lucida Handwriting",FontWeight.BOLD,36));
		anchor.getChildren().add(logoLabel);
		AnchorPane.setRightAnchor(logoLabel, 55.0);
		AnchorPane.setTopAnchor(logoLabel, 35.0);

		
		// showing main stage
		Scene scene = new Scene(anchor);
		anchor.setStyle("-fx-background-color: #212121;");
		stage.setResizable(false);
		stage.setWidth(1100);
		stage.setTitle("Color Picker - RGB");
		stage.setHeight(600);
		stage.setScene(scene);
		stage.show();
	}

}
