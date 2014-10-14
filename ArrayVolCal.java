import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class ArrayVolCal {

	    static int[][]  ActualInputArray ;
		static String s,sn,sm;
		public static int n,m;


	public static void main(String[] args) throws IOException {
		

	   System.out.println("Enter the Dimenstiosn of the array n * M : ");
	   BufferedReader bufferRead1 = new BufferedReader(new InputStreamReader(System.in));
	   sn = bufferRead1.readLine();
		 n=Integer.parseInt(sn);
	   sm =  bufferRead1.readLine();
	     m = Integer.parseInt(sm);
		
		ActualInputArray = new int[n][m];
		
		// taking array input 
		
		
		for(int i=0;i<n;i++) {
		  for(int j=0;j<m;j++) {
			  System.out.println("Enter "+ i + "," + j+ " value in array and press enter ");
			  BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			    try {
					s = bufferRead.readLine();
					 ActualInputArray[i][j]=Integer.parseInt(s);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		 
			
		  }
			
		}
			

		

		for(int i=0;i<ActualInputArray.length;i++) {
			   System.out.println("");
			 for(int j=0;j<ActualInputArray[i].length;j++) {
				 
				 System.out.print(ActualInputArray[i][j] + "  ");	
			 }
		}
		
		 System.out.println("");
		 System.out.println("Sub Array Values " ); 
	     volumeCal();
		
		
		
		} // end of main
		
	//method to find smallest value in outer array 	


	public static void  volumeCal(){
		int r=0,c=0;
		int r1=1,c1=1;
		int volume;
		
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		    	if( ((i>0 && i != n-1) && (j>0 && j !=m-1 )) ){
		    		  //a[i][j]='&';
		    		if(ActualInputArray[r1][c1] > ActualInputArray[i][j]){
		    			r1=i;
		    			c1=j;
		    		}
		    		 
		    		//continue;
		    		}
		       else {
		    		//a[i][j]= ActualInputArray[i][j];	
		    	   if( ActualInputArray[r][c] > ActualInputArray[i][j]){
		    		     r=i;
		    		     c=j;
		    	       }
		    	     }
			
				}
			}
		System.out.println("Small value in the Outer  array is "+ "" + ActualInputArray[r][c]);
		System.out.println("Small value in the inner array is  " + "" + ActualInputArray[r1][c1]);
		
		if(ActualInputArray[r][c]< 0 ){
			ActualInputArray[r][c] = Math.abs(ActualInputArray[r][c]);
		}
			 
		if(ActualInputArray[r1][c1] <0){
			ActualInputArray[r1][c1] = Math.abs(ActualInputArray[r1][c1]);
		}
		
		volume = n*m*ActualInputArray[r][c]*ActualInputArray[r1][c1];
		
		System.out.println("Volume is " + volume);
		
		
		  } //method end 
		
		
	} // end of class 

	
