import java.util.Scanner;
class Product
{
int pcode,price;
String pname;
Product(int pcode,int price,String pname)
{
this.pcode=pcode;
this.price=price;
this.pname=pname;
}
}
public class Products
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter product code:");
int pcode=sc.nextInt();
System.out.println("\nEnter price:");
int price=sc.nextInt();
System.out.println("\nEnter product name:");
String pname=sc.next();
Product[]ps=new Product[3];
ps[0]=new Product(pcode,price,pname);
ps[1]=new Product(124,200,"Book");
ps[2]=new Product(104,180,"calendar");
int minprice=ps[0].price;
System.out.println("\npcode\tpname\tprice");
System.out.println("\n.......................");
for(Product p:ps)
{
System.out.println("\n"+p.pcode+"\t"+p.pname+"\t"+p.price);
if(minprice>p.price)
{
 minprice=p.price;
}
}
System.out.println("\n.......................");
System.out.println("\nlowest cost price:");
System.out.println("\n.......................");
for(Product p:ps)
{
if(minprice==p.price)
{
System.out.print("\nproductcode:"+p.pcode);
System.out.print("\nproductname:"+p.pname);
System.out.print("\nprice:"+p.price);
}
}
}
}



