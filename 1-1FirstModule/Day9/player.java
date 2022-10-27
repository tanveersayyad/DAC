class player{

String name;
int score,match; 

player()
{
name="Sachin Tendulkar";
score=15921;
match=200;
}
player(String name,int score)
{
this.name=name;
this.score=score;

}
player(String name,int score,int match){
this.name=name;
this.score=score;
this.match=match;


}
void display(){

System.out.println("Player Name: "+name);
System.out.println("Score: "+score);
System.out.println("Matches: "+match);


}
public static void main(String args[])
{
player p1=new player();
p1.display();
player p2=new player("M.S. Dhoni",4876);
p2.display();
player p3=new player("Virat Kohli",8074,102);
p3.display();
}



}
