import java.util.*;
public class Array2D{
public static void main(String []args){
Random r=new Random();
int a[][]=new int[3][3];
int min=1;
int max=100;
for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
a[i][j]=min+r.nextInt(max);
}
}

for(int i=0;i<a.length;i++){
for(int j=0;j<a[i].length;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}