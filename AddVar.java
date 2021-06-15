public class AddVar{
static int add(int ...x){
int sum=0;
for(int i:x){
sum=sum+i;
}
return sum;
}
public static void main(String args[]){
int a=add(2,3,4);
int b=add(2,5);
int c=add(5,6,9,4);
System.out.println(a);
System.out.println(b);
System.out.println(c);

}


}