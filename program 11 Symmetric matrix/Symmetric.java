import java.util.Scanner;
class Symmetric{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size of the square matrix:");
int s=sc.nextInt();
int[][] Mat1=new int[s][s];
System.out.println("Enter the matrix:");
for(int i=0;i<s;i++){
for(int j=0;j<s;j++){
Mat1[i][j]=sc.nextInt();
}
}
System.out.println("Matrix:");
for(int i=0;i<s;i++){
for(int j=0;j<s;j++){
System.out.print(Mat1[i][j]+ "\t");
}
System.out.println();
}
for(int i=0;i<s;i++){
for(int j=0;j<s;j++){
if(Mat1[i][j]!=Mat1[j][i]){
System.out.println("Matrices are not symmetric :");
return;
}
}
}
System.out.println("Matrices are Symmetric:");
}
}

