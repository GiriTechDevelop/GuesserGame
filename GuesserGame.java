import java.util.Scanner;
class Guesser
{
int gnum;
int guessingNum()
{
System.out.println("Guesser,kindly guess a number!");
Scanner scan=new Scanner(System.in);
gnum=scan.nextInt();
return gnum;
}
}
class Player 
{
int pnum;
int predictNum()
{
System.out.println("Player,kindly Predict a number!");
Scanner scan=new Scanner(System.in);
pnum=scan.nextInt();
return pnum;
}
}
class Umpire
{
int numFromGuesser;
int numFromPlayer1;
int numFromPlayer2;
int numFromPlayer3;
void collectNumFromGuesser()
{
Guesser g=new Guesser();
numFromGuesser=g.guessingNum();
}
void collectNumFromPlayer()
{
Player p1=new player();
Player p2=new player();
Player p3=new player();
numFromPlayer1=p1.predictNum();
numFromPlayer1=p2.predictNum();
numFromPlayer1=p3.predictNum();
}
void compare()
{
if(numFromPlayer1==numFromGuesser)
{
System.out.println("Player1 has won the Game!");
}
elseif(numFromPlayer2==numFromGuesser)
{
System.out.println("Player2 has won the Game!");
}
if(numFromPlayer3==numFromGuesser)
{
System.out.println("Player3 has won the Game!");
}
else
{
System.out.println("Game lost.Try again!");
}
}
}
class main
{
pubic static void main(String[]args)
{
Umpire u=new Umpire();
u.collectNumFromGuesser();
u.collectNumFromPlayer();
u.compare();
}
}