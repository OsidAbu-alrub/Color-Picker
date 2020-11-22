package logic;

import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ColorDisplay {
	
	// to display RGB values chosen by user
	public static void DisplayRGB(TextField redField, TextField greenField, TextField blueField, Rectangle rectangle,Slider redSlider,Slider greenSlider,Slider blueSlider) {
		try {
			
			int red = (redField.getText() == null || redField.getText().trim().length() == 0) ? 0 : Integer.valueOf(redField.getText());
			
			int green = (greenField.getText() == null || greenField.getText().trim().length() == 0) ? 0 :  Integer.valueOf(greenField.getText());
			
			int blue = (blueField.getText() == null || blueField.getText().trim().length() == 0) ? 0 : Integer.valueOf(blueField.getText());
			
			
			if(red < 0) {
				red = Math.abs(red);
				redField.setText(String.valueOf(red));
			}
			
			if(green < 0) {
				green = Math.abs(green);
				greenField.setText(String.valueOf(green));
				
			}
			
			if(blue < 0) {
				blue = Math.abs(blue);
				blueField.setText(String.valueOf(blue));
			}
			
			if(red >255 || green > 255 || blue > 255)
				throw new IllegalArgumentException();
			
			redSlider.setValue(red);
			greenSlider.setValue(green);
			blueSlider.setValue(blue);

			rectangle.setFill(Color.rgb(red,green,blue));
			
			}
			catch(Exception ex) {}
	}
	
	// to display the two RGB values in CMY and HSV
	public static void resultRGB(TextField[] colorOne, TextField[] colorTwo,TextField redField,TextField greenField,TextField blueField,
			Rectangle rectangle,TextField cyanField,TextField magentaField,TextField yellowField,
			TextField hueField,TextField saturationField,TextField valueField) {
		try {
			int[] colorOneInt = new int[3];
			int[] colorTwoInt = new int[3];

			//parsing values to int
			for (int i = 0; i < colorOne.length; i++) {
				colorOneInt[i] = (colorOne[i].getText() == null || colorOne[i].getText().trim().length() == 0) ? 0
						: Integer.valueOf(colorOne[i].getText());
				
				colorTwoInt[i] = (colorTwo[i].getText() == null || colorTwo[i].getText().trim().length() == 0) ? 0
						: Integer.valueOf(colorTwo[i].getText());
			}
			
			//making sure no negative numbers are present
			if(colorOneInt[0] < 0) 
				colorOneInt[0] = Math.abs(colorOneInt[0]);
			
			if(colorOneInt[1] < 0) 
				colorOneInt[1] = Math.abs(colorOneInt[1]);
			
			if(colorOneInt[2] < 0) 
				colorOneInt[2] = Math.abs(colorOneInt[2]);
			
			if(colorTwoInt[0] < 0) 
				colorTwoInt[0] = Math.abs(colorTwoInt[0]);
			
			if(colorTwoInt[1] < 0) 
				colorTwoInt[1] = Math.abs(colorTwoInt[1]);
			
			if(colorTwoInt[2] < 0) 
				colorTwoInt[2] = Math.abs(colorTwoInt[2]);
			
			//checking for numbers that are greater than our threshold
			if(colorOneInt[0] >255 || colorOneInt[1] > 255 || colorOneInt[2]> 255)
				throw new IllegalArgumentException();
			
			if(colorTwoInt[0] >255 || colorTwoInt[1] > 255 || colorTwoInt[2] > 255)
				throw new IllegalArgumentException();
			
			int[] result = new int[3];

			//adding values of colors
			for (int i = 0; i < result.length; i++) 
				result[i] = ((colorOneInt[i] + colorTwoInt[i]));
						
			for (int i = 0; i < result.length; i++) 
				result[i] /= 2;
			
			
			int[] resultCMY = ColorConverter.rgbToCmy_cmyToRgb(result[0], result[1], result[2]);
			double[] resultHSV = ColorConverter.toHSV(result[0], result[1], result[2]);
			
			redField.setText(String.valueOf(result[0]));
			greenField.setText(String.valueOf(result[1]));
			blueField.setText(String.valueOf(result[2]));
			
			cyanField.setText(String.valueOf(resultCMY[0]));
			magentaField.setText(String.valueOf(resultCMY[1]));
			yellowField.setText(String.valueOf(resultCMY[2]));
			
			hueField.setText(String.format("%3.2f", resultHSV[0]));
			saturationField.setText(String.format("%3.2f", resultHSV[1]/100));
			valueField.setText(String.format("%3.2f", resultHSV[2]/100));
			
			rectangle.setFill(Color.rgb(result[0],result[1],result[2]));
			
		} catch (Exception ex) {}
		
		
		
	}
	
	public static void DisplayCMY(TextField cyanField, TextField magentaField, TextField yellowField, Rectangle rectangle,Slider cyanSlider,Slider magentaSlider,Slider yellowSlider) {
		try {
			
			int cyan = (cyanField.getText() == null || cyanField.getText().trim().length() == 0) ? 0 :  Integer.valueOf(cyanField.getText());
			int magenta = (magentaField.getText() == null || magentaField.getText().trim().length() == 0) ? 0 : Integer.valueOf(magentaField.getText());
			int yellow = (yellowField.getText() == null || yellowField.getText().trim().length() == 0) ? 0 :  Integer.valueOf(yellowField.getText());
			
			if(cyan < 0) {
				cyan = Math.abs(cyan);
				cyanField.setText(String.valueOf(cyan));
			}
			if(magenta < 0) {
				magenta = Math.abs(magenta);
				magentaField.setText(String.valueOf(magenta));
			}
			if(yellow < 0) {
				yellow = Math.abs(yellow);
				yellowField.setText(String.valueOf(yellow));
			}
			
			if(cyan >255 || magenta > 255 || yellow > 255)
				throw new IllegalArgumentException();
			
			cyanSlider.setValue(cyan);
			magentaSlider.setValue(magenta);
			yellowSlider.setValue(yellow);

			rectangle.setFill(Color.rgb(255 - cyan,255 - magenta,255 - yellow));
			}
			catch(Exception ex) {}
	}
	
	public static void resultCMY(TextField[] colorOne, TextField[] colorTwo,TextField cyanField,TextField magentaField,TextField yellowField,
			Rectangle rectangle,TextField redField,TextField greenField,TextField blueField
			,TextField hueField,TextField saturationField,TextField valueField) {
		try {
			int[] colorOneInt = new int[3];
			int[] colorTwoInt = new int[3];

			//parsing values to int
			for (int i = 0; i < colorOne.length; i++) {
				colorOneInt[i] = (colorOne[i].getText() == null || colorOne[i].getText().trim().length() == 0) ? 0
						: Integer.valueOf(colorOne[i].getText());
				
				colorTwoInt[i] = (colorTwo[i].getText() == null || colorTwo[i].getText().trim().length() == 0) ? 0
						: Integer.valueOf(colorTwo[i].getText());
			}
			
			//making sure there's no negative numbers
			if(colorOneInt[0] < 0) 
				colorOneInt[0] = Math.abs(colorOneInt[0]);
			
			if(colorOneInt[1] < 0) 
				colorOneInt[1] = Math.abs(colorOneInt[1]);
			
			if(colorOneInt[2] < 0) 
				colorOneInt[2] = Math.abs(colorOneInt[2]);
			
			if(colorTwoInt[0] < 0) 
				colorTwoInt[0] = Math.abs(colorTwoInt[0]);
			
			if(colorTwoInt[1] < 0) 
				colorTwoInt[1] = Math.abs(colorTwoInt[1]);
			
			if(colorTwoInt[2] < 0) {
				colorTwoInt[2] = Math.abs(colorTwoInt[2]);
			}
			
			if(colorOneInt[0] >255 || colorOneInt[1] > 255 || colorOneInt[2]> 255)
				throw new IllegalArgumentException();
			
			if(colorTwoInt[0] >255 || colorTwoInt[1] > 255 || colorTwoInt[2] > 255)
				throw new IllegalArgumentException();
			
			int[] result = new int[3];
			
			//adding values of colors
			for (int i = 0; i < result.length; i++) 
				result[i] = ((colorOneInt[i] + colorTwoInt[i]));
			
						
			for (int i = 0; i < result.length; i++) {
				result[i] /= 2;
			}
			
			int[] resultRGB = ColorConverter.rgbToCmy_cmyToRgb(result[0], result[1], result[2]);
			double[] resultHSV = ColorConverter.toHSV(255 - result[0], 255 - result[1], 255- result[2]);
			
			cyanField.setText(String.valueOf(result[0]));
			magentaField.setText(String.valueOf(result[1]));
			yellowField.setText(String.valueOf(result[2]));
			
			redField.setText(String.valueOf(resultRGB[0]));
			greenField.setText(String.valueOf(resultRGB[1]));
			blueField.setText(String.valueOf(resultRGB[2]));
			
			hueField.setText(String.format("%3.2f", resultHSV[0]));
			saturationField.setText(String.format("%3.2f", resultHSV[1]/100));
			valueField.setText(String.format("%3.2f", resultHSV[2]/100));
			
			rectangle.setFill(Color.rgb(255 - result[0],255 - result[1],255 - result[2]));
			
		} catch (Exception ex) {}
		
		
		
	}
	
	public static void DisplayHSV(TextField hueField, TextField saturationField, TextField valueField,
			Rectangle rectangle, Slider hueSlider, Slider saturationSlider, Slider valueSlider) 
	{
		try {
			
			double hue = (hueField.getText() == null || hueField.getText().trim().length() == 0) ? 0
					: Double.valueOf(String.format("%3.2f", Double.valueOf((hueField.getText()))));
			
			double saturation = (saturationField.getText() == null || saturationField.getText().trim().length() == 0) ? 0
					: Double.valueOf(String.format("%3.2f", Double.valueOf(saturationField.getText())));
			
			double value = (valueField.getText() == null || valueField.getText().trim().length() == 0) ? 0
					: Double.valueOf(String.format("%3.2f", Double.valueOf(valueField.getText())));

			if (hue < 0)
				while (hue < 0)
					hue += 360;

			if (hue > 360)
				while (hue > 360)
					hue -= 360;

			if (saturation > 1.0 || saturation < 0.0) {
				saturation = (saturation > 1.0) ? 1.0 : 0.0;
				saturationField.setText(String.valueOf(saturation));
			}

			if (value > 1.0 || value < 0.0) {
				value = (value > 1.0) ? 1.0 : 0.0;
				valueField.setText(String.valueOf(value));
			}

			hueSlider.setValue(hue);
			saturationSlider.setValue(saturation * 100);
			valueSlider.setValue(value * 100);

			int[] rgb = ColorConverter.hsvToRgb(hue, saturation, value);
			rectangle.setFill(Color.rgb(rgb[0], rgb[1], rgb[2]));
		}
		catch(Exception ex) {}

	}
	
	public static void resultHSV(TextField[] colorOne, TextField[] colorTwo,TextField cyanField,TextField magentaField,TextField yellowField,
			Rectangle rectangle,TextField redField,TextField greenField,TextField blueField,TextField hueField,TextField saturationField,TextField valueField) 
	{
		try {

			// for hue,sat,and value vales
			double[] colorOneDouble = new double[3];
			double[] colorTwoDouble = new double[3];

			// for rgbs
			int[] colorOneInt = new int[3];
			int[] colorTwoInt = new int[3];

			for (int i = 0; i < colorOne.length; i++) {
				colorOneDouble[i] = (colorOne[i].getText() == null || colorOne[i].getText().trim().length() == 0) ? 0
						: Double.valueOf(String.format("%3.2f", Double.valueOf((colorOne[i].getText()))));
				
				colorTwoDouble[i] = (colorTwo[i].getText() == null || colorTwo[i].getText().trim().length() == 0) ? 0
						: Double.valueOf(String.format("%3.2f", Double.valueOf((colorTwo[i].getText()))));
			}

			// for color one
			if (colorOneDouble[0] < 0) {
				while (colorOneDouble[0] < 0)
					colorOneDouble[0] += 360;

			}

			if (colorOneDouble[0] > 360) {
				while (colorOneDouble[0] > 360)
					colorOneDouble[0] -= 360;
			}

			if (colorOneDouble[1] > 1.0 || colorOneDouble[1] < 0) {
				colorOneDouble[1] = (colorOneDouble[1] > 1.0) ? 1.0 : 0.0;
			}

			if (colorOneDouble[2] > 1.0 || colorOneDouble[2] < 0) {
				colorOneDouble[1] = (colorOneDouble[2] > 1.0) ? 1.0 : 0.0;
			}

			// for color two
			if (colorTwoDouble[0] < 0)
				while (colorOneDouble[0] < 0)
					colorOneDouble[0] += 360;

			else if (colorTwoDouble[0] > 360)
				while (colorTwoDouble[0] > 360)
					colorTwoDouble[0] -= 360;

			if (colorTwoDouble[1] > 1.0 || colorTwoDouble[1] < 0) {
				colorTwoDouble[1] = (colorTwoDouble[1] > 1.0) ? 1.0 : 0.0;
			}

			if (colorTwoDouble[2] > 1.0 || colorTwoDouble[2] < 0) {
				colorTwoDouble[2] = (colorTwoDouble[2] > 1.0) ? 1.0 : 0.0;
			}

			// get colors as rgb
			colorOneInt = ColorConverter.hsvToRgb(colorOneDouble[0], colorOneDouble[1], colorOneDouble[2]);
			colorTwoInt = ColorConverter.hsvToRgb(colorTwoDouble[0], colorTwoDouble[1], colorTwoDouble[2]);

			int[] result = new int[3];

			// adding values of colors
			for (int i = 0; i < result.length; i++) {
				result[i] = ((colorOneInt[i] + colorTwoInt[i]));
			}

			for (int i = 0; i < result.length; i++) {
				result[i] /= 2;
			}

			int[] resultCMY = ColorConverter.rgbToCmy_cmyToRgb(result[0], result[1], result[2]);
			double[] resultHSV = ColorConverter.toHSV(result[0], result[1], result[2]);

			redField.setText(String.valueOf(result[0]));
			greenField.setText(String.valueOf(result[1]));
			blueField.setText(String.valueOf(result[2]));

			cyanField.setText(String.valueOf(resultCMY[0]));
			magentaField.setText(String.valueOf(resultCMY[1]));
			yellowField.setText(String.valueOf(resultCMY[2]));

			hueField.setText(String.format("%3.2f", resultHSV[0]));
			saturationField.setText(String.format("%3.2f", resultHSV[1] / 100));
			valueField.setText(String.format("%3.2f", resultHSV[2] / 100));

			rectangle.setFill(Color.rgb(result[0], result[1], result[2]));
		}
		catch(Exception e) {}
		
		
	}
		
}
