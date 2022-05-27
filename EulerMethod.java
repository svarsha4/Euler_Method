
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

//next small goal may be to create a file of different differential equations, and have a file reader print the given equation it retrieves from the file; using that information, two arrays can be created, with one
//storing a double and another storing an x value, and both of these values from two different arrays can be multiplied together to help with Euler's Method
//may be good to use vector function in r, as it is very efficient
//Goal: Having a solid Euler's method running and graphed by the end of the semester;
//talk about PDE Models

//equation: dy/dx = ax + b (have a and b be the parameters for the method that will utilize the equation to perform Euler's Method)
//the above equation is a great starting point and then you can work from there