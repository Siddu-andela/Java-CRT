import java.util.Scanner;
public class JaggedArray
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int age[][][]= new int[2][3][5];
for(int i=0;i<age.length;i++)
{
for(int j=0;j<age[i].length; j++)
{
for(int k=0;k<age[i][j].length; k++)
{
System.out.println("Enter the age of student "+k+" classroom "+j+" branch "+i);
age[i][j][k]=s. nextInt();
}
}
}
System.out.println(".......ages are.......");
    }
}