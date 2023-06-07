interface Student{
int score=20;
void displayscore();
}
interface Sports{
int score=35;
void displaySportsscore();
}
class Result implements Student,Sports{
public void displayscore(){
System.out.println("Academic score:"+Student.score);
}
public void displaySportsscore(){
System.out.println("sports score:"+Sports.score);
}
}
class SportStudent {
public static void main(String[]args){
Result r=new Result();
r.displayscore();
r.displaySportsscore();
}
}
