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

public class ColorCMY {
	public static void cmyColorUserInterface(Stage stage, Button rgbBtn, Button cmyBtn, Button hsvBtn, ImageView logo) {
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

		// horozintal lines
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

		// Slider for Cyan
		Slider leftCyanSlider = new Slider(0, 255, 0);
		leftCyanSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(leftCyanSlider, 50.0);
		AnchorPane.setTopAnchor(leftCyanSlider, 50.0);
		anchor.getChildren().add(leftCyanSlider);

		// Slider for Magenta
		Slider leftMagentaSlider = new Slider(0, 255, 0);
		leftMagentaSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(leftMagentaSlider, 50.0);
		AnchorPane.setTopAnchor(leftMagentaSlider, 150.0);
		anchor.getChildren().add(leftMagentaSlider);

		// Slider for yellow
		Slider leftYellowSlider = new Slider(0, 255, 0);
		leftYellowSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(leftYellowSlider, 50.0);
		AnchorPane.setTopAnchor(leftYellowSlider, 250.0);
		anchor.getChildren().add(leftYellowSlider);

		// rectangle for first segment of colors
		Rectangle leftRectangleColorSegment = new Rectangle(200, 110);
		leftRectangleColorSegment.setStroke(Color.BLACK);
		leftRectangleColorSegment.setFill(Color.WHITE);
		anchor.getChildren().add(leftRectangleColorSegment);
		AnchorPane.setLeftAnchor(leftRectangleColorSegment, 50.0);
		AnchorPane.setTopAnchor(leftRectangleColorSegment, 350.0);

		// label to indicate that this is the first color
		Label colorOne = new Label("Color One");
		colorOne.setTextFill(Color.WHITE);
		colorOne.setFont(Font.font("Arial", FontWeight.BOLD, 24));
		anchor.getChildren().add(colorOne);
		AnchorPane.setBottomAnchor(colorOne, 65.0);
		AnchorPane.setLeftAnchor(colorOne, 90.0);

		// cyan text box and label
		Label leftCyanLabel = new Label("Cyan");
		leftCyanLabel.setTextFill(Color.CYAN);
		anchor.getChildren().add(leftCyanLabel);
		AnchorPane.setTopAnchor(leftCyanLabel, 20.0);
		AnchorPane.setLeftAnchor(leftCyanLabel, 200.0);

		TextField leftCyanField = new TextField("0");
		leftCyanField.setPrefWidth(50);
		leftCyanField.setEditable(true);
		anchor.getChildren().add(leftCyanField);
		AnchorPane.setTopAnchor(leftCyanField, 40.0);
		AnchorPane.setLeftAnchor(leftCyanField, 200.0);

		// magenta text box and label
		Label leftMagentaLabel = new Label("Magenta");
		leftMagentaLabel.setTextFill(Color.MAGENTA);
		anchor.getChildren().add(leftMagentaLabel);
		AnchorPane.setTopAnchor(leftMagentaLabel, 120.0);
		AnchorPane.setLeftAnchor(leftMagentaLabel, 200.0);

		TextField leftMagentaField = new TextField("0");
		leftMagentaField.setPrefWidth(50);
		leftMagentaField.setEditable(true);
		anchor.getChildren().add(leftMagentaField);
		AnchorPane.setTopAnchor(leftMagentaField, 140.0);
		AnchorPane.setLeftAnchor(leftMagentaField, 200.0);

		// yellow text box and label
		Label leftYellowLabel = new Label("Yellow");
		leftYellowLabel.setTextFill(Color.YELLOW);
		anchor.getChildren().add(leftYellowLabel);
		AnchorPane.setTopAnchor(leftYellowLabel, 220.0);
		AnchorPane.setLeftAnchor(leftYellowLabel, 200.0);

		TextField leftYellowField = new TextField("0");
		leftYellowField.setPrefWidth(50);
		leftYellowField.setEditable(true);
		anchor.getChildren().add(leftYellowField);
		AnchorPane.setTopAnchor(leftYellowField, 240.0);
		AnchorPane.setLeftAnchor(leftYellowField, 200.0);

		/*
		 * End Left
		 */

		/*
		 * Center
		 */

		// Slider for cyan
		Slider centerCyanSlider = new Slider(0, 255, 0);
		centerCyanSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(centerCyanSlider, 350.0);
		AnchorPane.setTopAnchor(centerCyanSlider, 50.0);

		anchor.getChildren().add(centerCyanSlider);

		// Slider for magenta
		Slider centerMagentaSlider = new Slider(0, 255, 0);
		centerMagentaSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(centerMagentaSlider, 350.0);
		AnchorPane.setTopAnchor(centerMagentaSlider, 150.0);

		anchor.getChildren().add(centerMagentaSlider);

		// Slider for yellow
		Slider centerYellowSlider = new Slider(0, 255, 0);
		centerYellowSlider.setOrientation(Orientation.HORIZONTAL);
		AnchorPane.setLeftAnchor(centerYellowSlider, 350.0);
		AnchorPane.setTopAnchor(centerYellowSlider, 250.0);

		anchor.getChildren().add(centerYellowSlider);

		// rectangle for first segment of colors
		Rectangle centerRectangleColorSegment = new Rectangle(200, 110);
		centerRectangleColorSegment.setStroke(Color.BLACK);
		centerRectangleColorSegment.setFill(Color.WHITE);
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

		// cyan text box and label
		Label centerCyanLabel = new Label("Cyan");
		centerCyanLabel.setTextFill(Color.CYAN);
		anchor.getChildren().add(centerCyanLabel);
		AnchorPane.setTopAnchor(centerCyanLabel, 20.0);
		AnchorPane.setLeftAnchor(centerCyanLabel, 500.0);

		TextField centerCyanField = new TextField("0");
		centerCyanField.setPrefWidth(50);
		centerCyanField.setEditable(true);
		anchor.getChildren().add(centerCyanField);
		AnchorPane.setTopAnchor(centerCyanField, 40.0);
		AnchorPane.setLeftAnchor(centerCyanField, 500.0);

		// magenta text box and label
		Label centerMagentaLabel = new Label("Magenta");
		centerMagentaLabel.setTextFill(Color.MAGENTA);
		anchor.getChildren().add(centerMagentaLabel);
		AnchorPane.setTopAnchor(centerMagentaLabel, 120.0);
		AnchorPane.setLeftAnchor(centerMagentaLabel, 500.0);

		TextField centerMagentaField = new TextField("0");
		centerMagentaField.setPrefWidth(50);
		centerMagentaField.setEditable(true);
		anchor.getChildren().add(centerMagentaField);
		AnchorPane.setTopAnchor(centerMagentaField, 140.0);
		AnchorPane.setLeftAnchor(centerMagentaField, 500.0);

		// yellow text box and label
		Label centerYellowLabel = new Label("Yellow");
		centerYellowLabel.setTextFill(Color.YELLOW);
		anchor.getChildren().add(centerYellowLabel);
		AnchorPane.setTopAnchor(centerYellowLabel, 220.0);
		AnchorPane.setLeftAnchor(centerYellowLabel, 500.0);

		TextField centerYellowField = new TextField("0");
		centerYellowField.setPrefWidth(50);
		centerYellowField.setEditable(true);
		anchor.getChildren().add(centerYellowField);
		AnchorPane.setTopAnchor(centerYellowField, 240.0);
		AnchorPane.setLeftAnchor(centerYellowField, 500.0);

		/*
		 * End Center
		 */

		/*
		 * Right
		 */

		// red label and field
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

		// green text box and label
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

		// cyan label and text field
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

		// magenta text box and label
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

		// yellow text box and label
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

		// rectangle and label for result
		Rectangle resultRectangle = new Rectangle(200, 110);
		resultRectangle.setStroke(Color.BLACK);
		resultRectangle.setFill(Color.WHITE);
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
		leftCyanField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayCMY(leftCyanField, leftMagentaField, leftYellowField, leftRectangleColorSegment,
					leftCyanSlider, leftMagentaSlider, leftYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		leftMagentaField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayCMY(leftCyanField, leftMagentaField, leftYellowField, leftRectangleColorSegment,
					leftCyanSlider, leftMagentaSlider, leftYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});
		leftYellowField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayCMY(leftCyanField, leftMagentaField, leftYellowField, leftRectangleColorSegment,
					leftCyanSlider, leftMagentaSlider, leftYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// leftCyanSlider
		leftCyanSlider.setOnMouseReleased(e -> {
			int cyanValue = (int) leftCyanSlider.getValue();
			leftCyanField.setText(String.valueOf(cyanValue));
			ColorDisplay.DisplayCMY(leftCyanField, leftMagentaField, leftYellowField, leftRectangleColorSegment,
					leftCyanSlider, leftMagentaSlider, leftYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		leftCyanSlider.setOnMouseDragged(e -> {
			int cyanValue = (int) leftCyanSlider.getValue();
			leftCyanField.setText(String.valueOf(cyanValue));
			ColorDisplay.DisplayCMY(leftCyanField, leftMagentaField, leftYellowField, leftRectangleColorSegment,
					leftCyanSlider, leftMagentaSlider, leftYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// leftMagentaSlider
		leftMagentaSlider.setOnMouseReleased(e -> {
			int magentaValue = (int) leftMagentaSlider.getValue();
			leftMagentaField.setText(String.valueOf(magentaValue));
			ColorDisplay.DisplayCMY(leftCyanField, leftMagentaField, leftYellowField, leftRectangleColorSegment,
					leftCyanSlider, leftMagentaSlider, leftYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		leftMagentaSlider.setOnMouseDragged(e -> {
			int magentaValue = (int) leftMagentaSlider.getValue();
			leftMagentaField.setText(String.valueOf(magentaValue));
			ColorDisplay.DisplayCMY(leftCyanField, leftMagentaField, leftYellowField, leftRectangleColorSegment,
					leftCyanSlider, leftMagentaSlider, leftYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// leftYellowSlider
		leftYellowSlider.setOnMouseReleased(e -> {
			int yellowValue = (int) leftYellowSlider.getValue();
			leftYellowField.setText(String.valueOf(yellowValue));
			ColorDisplay.DisplayCMY(leftCyanField, leftMagentaField, leftYellowField, leftRectangleColorSegment,
					leftCyanSlider, leftMagentaSlider, leftYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		leftYellowSlider.setOnMouseDragged(e -> {
			int yellowValue = (int) leftYellowSlider.getValue();
			leftYellowField.setText(String.valueOf(yellowValue));
			ColorDisplay.DisplayCMY(leftCyanField, leftMagentaField, leftYellowField, leftRectangleColorSegment,
					leftCyanSlider, leftMagentaSlider, leftYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
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
		centerCyanField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayCMY(centerCyanField, centerMagentaField, centerYellowField, centerRectangleColorSegment,
					centerCyanSlider, centerMagentaSlider, centerYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		centerMagentaField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayCMY(centerCyanField, centerMagentaField, centerYellowField, centerRectangleColorSegment,
					centerCyanSlider, centerMagentaSlider, centerYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});
		centerYellowField.setOnKeyReleased(e -> {
			ColorDisplay.DisplayCMY(centerCyanField, centerMagentaField, centerYellowField, centerRectangleColorSegment,
					centerCyanSlider, centerMagentaSlider, centerYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// centerCyanSlider
		centerCyanSlider.setOnMouseReleased(e -> {
			int cyanValue = (int) centerCyanSlider.getValue();
			centerCyanField.setText(String.valueOf(cyanValue));
			ColorDisplay.DisplayCMY(centerCyanField, centerMagentaField, centerYellowField, centerRectangleColorSegment,
					centerCyanSlider, centerMagentaSlider, centerYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		centerCyanSlider.setOnMouseDragged(e -> {
			int cyanValue = (int) centerCyanSlider.getValue();
			centerCyanField.setText(String.valueOf(cyanValue));
			ColorDisplay.DisplayCMY(centerCyanField, centerMagentaField, centerYellowField, centerRectangleColorSegment,
					centerCyanSlider, centerMagentaSlider, centerYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// centerMagentaSlider
		centerMagentaSlider.setOnMouseReleased(e -> {
			int magentaValue = (int) centerMagentaSlider.getValue();
			centerMagentaField.setText(String.valueOf(magentaValue));
			ColorDisplay.DisplayCMY(centerCyanField, centerMagentaField, centerYellowField, centerRectangleColorSegment,
					centerCyanSlider, centerMagentaSlider, centerYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		centerMagentaSlider.setOnMouseDragged(e -> {
			int magentaValue = (int) centerMagentaSlider.getValue();
			centerMagentaField.setText(String.valueOf(magentaValue));
			ColorDisplay.DisplayCMY(centerCyanField, centerMagentaField, centerYellowField, centerRectangleColorSegment,
					centerCyanSlider, centerMagentaSlider, centerYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		// centerYellowSlider
		centerYellowSlider.setOnMouseReleased(e -> {
			int yellowValue = (int) centerYellowSlider.getValue();
			centerYellowField.setText(String.valueOf(yellowValue));
			ColorDisplay.DisplayCMY(centerCyanField, centerMagentaField, centerYellowField, centerRectangleColorSegment,
					centerCyanSlider, centerMagentaSlider, centerYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
					rightMagentaField, rightYellowField, resultRectangle, rightRedField, rightGreenField,
					rightBlueField, rightHueField, rightSaturationField, rightValueField);
		});

		centerYellowSlider.setOnMouseDragged(e -> {
			int yellowValue = (int) centerYellowSlider.getValue();
			centerYellowField.setText(String.valueOf(yellowValue));
			ColorDisplay.DisplayCMY(centerCyanField, centerMagentaField, centerYellowField, centerRectangleColorSegment,
					centerCyanSlider, centerMagentaSlider, centerYellowSlider);

			ColorDisplay.resultCMY(new TextField[] { leftCyanField, leftMagentaField, leftYellowField },
					new TextField[] { centerCyanField, centerMagentaField, centerYellowField }, rightCyanField,
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

		// for logo
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
		stage.setTitle("Color Picker - CMY");
		stage.setHeight(600);
		stage.setScene(scene);
		stage.show();

	}

}
