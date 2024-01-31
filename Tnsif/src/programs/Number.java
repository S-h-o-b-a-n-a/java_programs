package programs;

public class Number {

	public static void main(String[] args) {
				int n = 5,m=6;

				//Loop to iterate over each row
				for(int i=1;i<=n;i++){
					//Loop to iterate over each column
					for(int j=i;j<=m;j++){
						if(i==1||i==n||j==1||j==m){
						
						System.out.print(1+ " "); 
						}
						else {
							System.out.print(" ");
						}
					}

					
					
					System.out.println("\n");
				}
			}
		}




