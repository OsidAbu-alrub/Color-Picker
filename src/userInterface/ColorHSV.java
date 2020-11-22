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

public class ColorHSV {
	
	public static void hsvColorUserInterface(Stage stage,Button rgbBtn,Button cmyBtn,Button hsvBtn,ImageView logo){
		
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
		hsvBtn.setOnMouseEntered(e -> {
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
		
		// Slider for Hue
		Slider leftHueSlider = new Slider(0, 360, 0);
		leftHueSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(leftHueSlider, 35.0);
		AnchorPane.setTopAnchor(leftHueSlider, 50.0);
		anchor.getChildren().add(leftHueSlider);

		// Slider for Saturation
		Slider leftSaturationSlider = new Slider(0.0, 100, 0.0);
		leftSaturationSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(leftSaturationSlider, 35.0);
		AnchorPane.setTopAnchor(leftSaturationSlider, 150.0);
		anchor.getChildren().add(leftSaturationSlider);
		
		// Slider for Value
		Slider leftValueSlider = new Slider(0.0, 100, 0.0);
		leftValueSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(leftValueSlider, 35.0);
		AnchorPane.setTopAnchor(leftValueSlider, 250.0);
		anchor.getChildren().add(leftValueSlider);

		// rectangle for first segment of colors
		Rectangle leftRectangleColorSegment = new Rectangle(200, 110);
		leftRectangleColorSegment.setStroke(Color.WHITE);
		leftRectangleColorSegment.setFill(Color.BLACK);
		anchor.getChildren().add(leftRectangleColorSegment);
		AnchorPane.setLeftAnchor(leftRectangleColorSegment, 35.0);
		AnchorPane.setTopAnchor(leftRectangleColorSegment, 350.0);
		
		// label to indicate that this is the first color
		Label colorOne = new Label("Color One");
		colorOne.setTextFill(Color.WHITE);
		colorOne.setFont(Font.font("Arial",FontWeight.BOLD,24));
		anchor.getChildren().add(colorOne);
		AnchorPane.setBottomAnchor(colorOne, 65.0);
		AnchorPane.setLeftAnchor(colorOne, 90.0);

		// Hue text box and label
		Label leftHueLabel = new Label("Hue");
		leftHueLabel.setTextFill(Color.WHITE);
		anchor.getChildren().add(leftHueLabel);
		AnchorPane.setTopAnchor(leftHueLabel, 20.0);
		AnchorPane.setLeftAnchor(leftHueLabel, 180.0);

		TextField leftHueField = new TextField("0");
		leftHueField.setPrefWidth(75);
		leftHueField.setEditable(true);
		anchor.getChildren().add(leftHueField);
		AnchorPane.setTopAnchor(leftHueField, 40.0);
		AnchorPane.setLeftAnchor(leftHueField, 180.0);

		// Saturation text box and label
		Label leftSaturationLabel = new Label("Saturation");
		leftSaturationLabel.setTextFill(Color.WHITE);
		anchor.getChildren().add(leftSaturationLabel);
		AnchorPane.setTopAnchor(leftSaturationLabel, 120.0);
		AnchorPane.setLeftAnchor(leftSaturationLabel, 180.0);

		TextField leftSaturationField = new TextField("0");
		leftSaturationField.setPrefWidth(75);
		leftSaturationField.setEditable(true);
		anchor.getChildren().add(leftSaturationField);
		AnchorPane.setTopAnchor(leftSaturationField, 140.0);
		AnchorPane.setLeftAnchor(leftSaturationField, 180.0);

		// value text box and label
		Label leftValueLabel = new Label("Value");
		leftValueLabel.setTextFill(Color.WHITE);
		anchor.getChildren().add(leftValueLabel);
		AnchorPane.setTopAnchor(leftValueLabel, 220.0);
		AnchorPane.setLeftAnchor(leftValueLabel, 180.0);

		TextField leftValueField = new TextField("0");
		leftValueField.setPrefWidth(75);
		leftValueField.setEditable(true);
		anchor.getChildren().add(leftValueField);
		AnchorPane.setTopAnchor(leftValueField, 240.0);
		AnchorPane.setLeftAnchor(leftValueField, 180.0);
		
		/*
		 *End Left
		 */
		
		
		/*
		 * Center
		 */
		
		// Slider for Hue
		Slider centerHueSlider = new Slider(0, 360, 0);
		centerHueSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(centerHueSlider, 335.0);
		AnchorPane.setTopAnchor(centerHueSlider, 50.0);
		anchor.getChildren().add(centerHueSlider);

		// Slider for Saturation
		Slider centerSaturationSlider = new Slider(0, 100.0, 0);
		centerSaturationSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(centerSaturationSlider, 335.0);
		AnchorPane.setTopAnchor(centerSaturationSlider, 150.0);
		anchor.getChildren().add(centerSaturationSlider);

		// Slider for Value
		Slider centerValueSlider = new Slider(0, 100.0, 0);
		centerValueSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(centerValueSlider, 335.0);
		AnchorPane.setTopAnchor(centerValueSlider, 250.0);
		anchor.getChildren().add(centerValueSlider);

		// rectangle for first segment of colors
		Rectangle centerRectangleColorSegment = new Rectangle(200, 110);
		centerRectangleColorSegment.setStroke(Color.WHITE);
		centerRectangleColorSegment.setFill(Color.BLACK);
		anchor.getChildren().add(centerRectangleColorSegment);
		AnchorPane.setLeftAnchor(centerRectangleColorSegment, 350.0);
		AnchorPane.setTopAnchor(centerRectangleColorSegment, 350.0);
		
		// label to indicate that this is the second color
		Label colorTwo = new Label("Color Two");
		colorTwo.setTextFill(Color.WHITE);
		colorTwo.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		anchor.getChildren().add(colorTwo);
		AnchorPane.setBottomAnchor(colorTwo, 65.0);
		AnchorPane.setLeftAnchor(colorTwo, 390.0);
		
		// Hue text box and label
		Label centerHueLabel = new Label("Hue");
		centerHueLabel.setTextFill(Color.WHITE);
		anchor.getChildren().add(centerHueLabel);
		AnchorPane.setTopAnchor(centerHueLabel, 20.0);
		AnchorPane.setLeftAnchor(centerHueLabel, 480.0);

		TextField centerHueField = new TextField("0");
		centerHueField.setPrefWidth(75);
		centerHueField.setEditable(true);
		anchor.getChildren().add(centerHueField);
		AnchorPane.setTopAnchor(centerHueField, 40.0);
		AnchorPane.setLeftAnchor(centerHueField, 480.0);

		// Saturation text box and label
		Label centerSaturationLabel = new Label("Saturation");
		centerSaturationLabel.setTextFill(Color.WHITE);
		anchor.getChildren().add(centerSaturationLabel);
		AnchorPane.setTopAnchor(centerSaturationLabel, 120.0);
		AnchorPane.setLeftAnchor(centerSaturationLabel, 480.0);

		TextField centerSaturationField = new TextField("0");
		centerSaturationField.setPrefWidth(75);
		centerSaturationField.setEditable(true);
		anchor.getChildren().add(centerSaturationField);
		AnchorPane.setTopAnchor(centerSaturationField, 140.0);
		AnchorPane.setLeftAnchor(centerSaturationField, 480.0);

		// Value text box and label
		Label centerValueLabel = new Label("Value");
		centerValueLabel.setTextFill(Color.WHITE);
		anchor.getChildren().add(centerValueLabel);
		AnchorPane.setTopAnchor(centerValueLabel, 220.0);
		AnchorPane.setLeftAnchor(centerValueLabel, 480.0);

		TextField centerValueField = new TextField("0");
		centerValueField.setPrefWidth(75);
		centerValueField.setEditable(true);
		anchor.getChildren().add(centerValueField);
		AnchorPane.setTopAnchor(centerValueField, 240.0);
		AnchorPane.setLeftAnchor(centerValueField, 480.0);
		
		/*
		 * End Center
		 */
		
		/*
		 * Right
		 */
		
		//red label and field
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
		
		//cyan label and text field
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
		
		// hue field and label
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
		
		//rectangle and label for result
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
		leftHueField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayHSV(leftHueField, leftSaturationField, leftValueField, leftRectangleColorSegment, leftHueSlider, leftSaturationSlider, leftValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] {leftHueField,leftSaturationField,leftValueField},
					new TextField[] {centerHueField,centerSaturationField,centerValueField},
					rightCyanField,rightMagentaField,rightYellowField,resultRectangle,
					rightRedField,rightGreenField,rightBlueField,
					rightHueField,rightSaturationField,rightValueField);
		});

		leftSaturationField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayHSV(leftHueField, leftSaturationField, leftValueField, leftRectangleColorSegment,
					leftHueSlider, leftSaturationSlider, leftValueSlider);

			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});
		
		leftValueField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayHSV(leftHueField, leftSaturationField, leftValueField, leftRectangleColorSegment,
					leftHueSlider, leftSaturationSlider, leftValueSlider);

			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// leftHueSlider
		leftHueSlider.setOnMouseReleased(e -> {
			double hueValue = (double) (leftHueSlider.getValue());
			leftHueField.setText(String.format("%3.2f", hueValue));
			
			ColorDisplay.DisplayHSV(leftHueField, leftSaturationField, leftValueField, leftRectangleColorSegment,
					leftHueSlider, leftSaturationSlider, leftValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
			
		});
		
		leftHueSlider.setOnMouseDragged(e -> {
			double hueValue = (double) (leftHueSlider.getValue());
			leftHueField.setText(String.format("%3.2f", hueValue));
			
			ColorDisplay.DisplayHSV(leftHueField, leftSaturationField, leftValueField, leftRectangleColorSegment,
					leftHueSlider, leftSaturationSlider, leftValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
			
		});

		// leftSaturationSlider
		leftSaturationSlider.setOnMouseReleased(e -> {
			double saturationValue = (double) (leftSaturationSlider.getValue()/100.0);
			leftSaturationField.setText(String.format("%1.2f", saturationValue));
			
			ColorDisplay.DisplayHSV(leftHueField, leftSaturationField, leftValueField, leftRectangleColorSegment,
					leftHueSlider, leftSaturationSlider, leftValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});
		
		leftSaturationSlider.setOnMouseDragged(e -> {
			double saturationValue = (double) (leftSaturationSlider.getValue()/100.0);
			leftSaturationField.setText(String.format("%1.2f", saturationValue));
			
			ColorDisplay.DisplayHSV(leftHueField, leftSaturationField, leftValueField, leftRectangleColorSegment,
					leftHueSlider, leftSaturationSlider, leftValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// leftValueSlider
		leftValueSlider.setOnMouseReleased(e -> {
			double valueValue = (double) (leftValueSlider.getValue()/100.0);
			leftValueField.setText(String.format("%1.2f", valueValue));
			
			ColorDisplay.DisplayHSV(leftHueField, leftSaturationField, leftValueField, leftRectangleColorSegment,
					leftHueSlider, leftSaturationSlider, leftValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});
		
		leftValueSlider.setOnMouseDragged(e -> {
			double valueValue = (double) (leftValueSlider.getValue()/100.0);
			leftValueField.setText(String.format("%1.2f", valueValue));
			
			ColorDisplay.DisplayHSV(leftHueField, leftSaturationField, leftValueField, leftRectangleColorSegment,
					leftHueSlider, leftSaturationSlider, leftValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});
		
		/*
		 * End Left functionality		
		 */
		
		/*
		 * Center functionality
		 */
		
		// to display colors upon entering them
		centerHueField.setOnKeyReleased(e -> {
			
			ColorDisplay.DisplayHSV(centerHueField, centerSaturationField, centerValueField, centerRectangleColorSegment,
					centerHueSlider, centerSaturationSlider, centerValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		centerSaturationField.setOnKeyReleased(e -> {
			
			ColorDisplay.DisplayHSV(centerHueField, centerSaturationField, centerValueField, centerRectangleColorSegment,
					centerHueSlider, centerSaturationSlider, centerValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
			
		});
		centerValueField.setOnKeyReleased(e -> {
			
			ColorDisplay.DisplayHSV(centerHueField, centerSaturationField, centerValueField, centerRectangleColorSegment,
					centerHueSlider, centerSaturationSlider, centerValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// centerHueSlider
		centerHueSlider.setOnMouseReleased(e -> {
			double hueValue = (double) centerHueSlider.getValue();
			centerHueField.setText(String.format("%3.2f",hueValue));
			
			ColorDisplay.DisplayHSV(centerHueField, centerSaturationField, centerValueField, centerRectangleColorSegment,
					centerHueSlider, centerSaturationSlider, centerValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});
		
		centerHueSlider.setOnMouseDragged(e -> {
			double hueValue = (double) centerHueSlider.getValue();
			centerHueField.setText(String.format("%3.2f",hueValue));
			
			ColorDisplay.DisplayHSV(centerHueField, centerSaturationField, centerValueField, centerRectangleColorSegment,
					centerHueSlider, centerSaturationSlider, centerValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// centerSaturationSlider
		centerSaturationSlider.setOnMouseReleased(e -> {
			double saturationValue = (double) (centerSaturationSlider.getValue()/100.0);
			centerSaturationField.setText(String.format("%3.2f",saturationValue));
			
			ColorDisplay.DisplayHSV(centerHueField, centerSaturationField, centerValueField, centerRectangleColorSegment,
					centerHueSlider, centerSaturationSlider, centerValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});
		
		centerSaturationSlider.setOnMouseDragged(e -> {
			double saturationValue = (double) (centerSaturationSlider.getValue()/100.0);
			centerSaturationField.setText(String.format("%3.2f",saturationValue));
			
			ColorDisplay.DisplayHSV(centerHueField, centerSaturationField, centerValueField, centerRectangleColorSegment,
					centerHueSlider, centerSaturationSlider, centerValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// centerValueSlider
		centerValueSlider.setOnMouseReleased(e -> {
			double valueValue = (double) (centerValueSlider.getValue()/100.0);
			centerValueField.setText(String.format("%3.2f",valueValue));
			
			ColorDisplay.DisplayHSV(centerHueField, centerSaturationField, centerValueField, centerRectangleColorSegment,
					centerHueSlider, centerSaturationSlider, centerValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});
		
		centerValueSlider.setOnMouseDragged(e -> {
			double valueValue = (double) (centerValueSlider.getValue()/100.0);
			centerValueField.setText(String.format("%3.2f",valueValue));
			
			ColorDisplay.DisplayHSV(centerHueField, centerSaturationField, centerValueField, centerRectangleColorSegment,
					centerHueSlider, centerSaturationSlider, centerValueSlider);
			
			ColorDisplay.resultHSV(new TextField[] { leftHueField, leftSaturationField, leftValueField },
					new TextField[] { centerHueField, centerSaturationField, centerValueField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
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

		// Label logo
		Label logoLabel = new Label("Color\nPicker");
		logoLabel.setAlignment(Pos.CENTER);
		logoLabel.setRotate(-10);
		logoLabel.setTextFill(Color.WHITE);
		logoLabel.setFont(Font.font("Lucida Handwriting", FontWeight.BOLD, 36));
		anchor.getChildren().add(logoLabel);
		AnchorPane.setRightAnchor(logoLabel, 55.0);
		AnchorPane.setTopAnchor(logoLabel, 35.0);

		// showing main stage
		Scene scene = new Scene(anchor);
		anchor.setStyle("-fx-background-color: #212121;");
		stage.setResizable(false);
		stage.setWidth(1100);
		stage.setTitle("Color Picker - HSV");
		stage.setHeight(600);
		stage.setScene(scene);
		stage.show();
	
	}

}
