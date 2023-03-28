class cpu{
int price=3400;
class processor{
int noofcores=4;
String manufacturer="intel Corp";
void display()
{
System.out.println("Manufacturer:"+manufacturer);
System.out.println("No.of cores:"+noofcores);
}
}
void display()
{
processor p= new processor();
p.display();
System.out.println("price:"+price);
}
static class Ram
{
int memory=8;
String manufacturer=" Microsoft";
void display()
{
System.out.println("Memory:"+memory);
System.out.println("Manufacturer:"+manufacturer);
}
}
}
class Cpu{
public static void main(String args[])
{
cpu c1= new cpu();
c1.display();
cpu.Ram r1= new cpu.Ram();
r1.display();
}
}


