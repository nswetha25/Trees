class Patterns{
	public static void main(String args[]){
		int n=22;
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j||i+j==n-1||i+j==(n-1)/2||i-j==(n-1)/2||j-i==(n-1)/2||i+j==(n-1)+(n-1)/2||i==0||i==n-1||j==0||j==n-1){
					System.out.print("*");
				}
				else{
					System.out.print(' ');
				}

			}
			System.out.println();
		}*/
//Printing letter K,Z
		
		/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i+j==(n-1)/2||i-j==(n-1)/2){
					System.out.print("*");
				}
				else{
					System.out.print(' ');
				}

			}
			System.out.print(" ");
		*/
		// For letter Z
		/*	for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==(n-1)||i+j==(n-1)){
					System.out.print("*");
				}
				else{
					System.out.print(' ');
				}
				
			}
			System.out.println();
		}*/
		//For Letter M
			/*for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||j==n-1||i==j&&i<=(n-1)/2||(i+j)==n-1&&j>=(n-1)/2){
					System.out.print("*");
				}
				else{
					System.out.print(' ');
				}
				
			}
			System.out.println();
		}*/

		// For letter Q

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==(n-1)/4&&i>0&&i<(3*n)/4||j==3*n/4&&i>0&&i<3*n/4||i==0&&j>(n-1)/4&&j<3*n/4||i==3*n/4&&j>(n-1)/4&&j<3*n/4||i==j&&i>(n-1)/2){
					System.out.print("*");
				}
				else{
					System.out.print(' ');
				}
				
			}
			System.out.println();
		}
			/* 
			System.out.print(" ");
			for(int j=0;j<n;j++)
			{
				if(j==0||i==j&&i<(n-1)/2){
					System.out.print("*");
				}
				else{
					System.out.print(' ');
				}

			}
			System.out.print(" ");

		}*/

}
}