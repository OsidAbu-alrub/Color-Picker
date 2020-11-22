package logic;

public class ColorConverter {

	
	public static int[] rgbToCmy_cmyToRgb(int colorOne,int colorTwo,int colorThree) {
		return new int[] {255-colorOne,255-colorTwo,255-colorThree};
	}
	
	public static double[] toHSV(double r,double g,double b) {
		
        r = r / 255.0; 
        g = g / 255.0; 
        b = b / 255.0; 
  
        double max = Math.max(r, Math.max(g, b)); // maximum of r, g, b
        double min = Math.min(r, Math.min(g, b)); // minimum of r, g, b         
        double range = max - min; // range of max and min. 
        
        double h, s, v;
        
        if (max == min)  
        	h = 0; //if min == max, then its on grey scale, so hue doesn't matter
        
        // if max equal r then compute h in first quarter
        // 0 - 60 and 300 - 360
        //if (g - b) negative -> 300 <= hue < 360
        //if (g - b) positive -> 0 <= hue < 60
        else if (max == r) 
            h = (60 * ((g - b) / range) + 360) % 360;
      
        // if max equal g then compute h
        // 60 - 120 and 120 - 180
        //if (b - r) negative -> 60 <= hue < 120
        //if (b - r) positive -> 120 <= hue < 180
        else if (max == g) 
            h = (60 * ((b - r) / range) + 120) % 360; 
        
        
        // if max equal b then compute h 
        // 180 - 240 and 240 - 300
        //if (r - g) negative -> 180 <= hue < 240
        //if (r - g) positive -> 240 <= hue < 300
        else 
            h = (60 * ((r - g) / range) + 240) % 360;
        
        
        //saturation
        if (max == 0) 
            s = 0; 
        else
            s = (range / max)*100; //multiplied by 100 to scale value
  
        //value 
        v = max*100; //multiplied by 100 to scale value
        
        return new double[] {h,s,v};
	}
	
	public static int[] hsvToRgb(double h,double s,double v) {
		
		double high = v;
		double low = high*(1-s);
		
		//which section color is in (0 through 5)
		int section = (int) h/60;
		
		//angle
		double alpha = (h/60) - section;
		
		//if odd, then we take complement
		if(section % 2 == 1)
			alpha = 1 - alpha;
		
		//comes from (mid - low)/(high-low) ==> but without the 60 because we got it from alpha 
		double mid = low + alpha*(high-low);
		
		double r,g,b;
		if(h >= 0 && h < 60) {
			r = high;
			g = mid;
			b = low;
		}
		else if(h >= 60 && h < 120) {
			r = mid;
			g = high;
			b = low;
		}
		else if (h >= 120 && h < 180) {
			r = low;
			g = high;
			b = mid;

		} else if (h >= 180 && h < 240) {
			r = low;
			g = mid;
			b = high;

		} else if (h >= 240 && h < 300) {
			r = mid;
			g = low;
			b = high;

		}
		else {
			r = high;
			g = low;
			b = mid;
		}
		
		return new int[] {(int)((r)*255),(int)((g)*255),(int)((b)*255)};
	}
	

}
	

