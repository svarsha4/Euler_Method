
public class EulerMethod {
    private double [] xcoordinates;
	private double [] ycoordinates;
	
	
	public EulerMethod(int n) //where n indicates the number of steps for Euler's method
	{
		xcoordinates = new double[n+1];
		ycoordinates = new double[n+1];
		
	}
    
   
   
	public void determineYF(double x0, int n, double xF, double y0, double a, double b) //where equation: ax + b
	{
		
		int position = 0;
		
		double m = 0;
        double xC = (xF - x0)/n;
       
        
        
        xcoordinates[0] = x0;
        ycoordinates[0] = y0;
        System.out.print("(" + xcoordinates[0] + ", " + ycoordinates[0] + ")" + "\t");
       
        while(position < n)
        {
            position++;
            m = (a*xcoordinates[position-1]) + b;
            
            xcoordinates[position] = xcoordinates[position-1] + xC;
           
            
            ycoordinates[position] = (m*xC) + ycoordinates[position-1];
        	System.out.print("(" + xcoordinates[position] + ", " + ycoordinates[position] + ")" + "\t");
        	
        }
		
		
		

	}
	
	
	
	
	
	

}