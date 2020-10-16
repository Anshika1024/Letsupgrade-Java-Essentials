package quiz_application;

public class Game 
{
	Question[] questions=new Question[3];
	Player player=new Player();
	String[] quesdata= {"Which is the largest planet","When java was introduced","What is the national game of India"};
	String[] op1= {"Mars","1991","Cricket"};
	String[] op2= {"Jupiter","2006","Basketball"};
	String[] op3= {"Earth","1995","Tennis"};
	String[] op4= {"None of these","2000","Hockey"};
	int[] answers= {2,3,4};
	public void init()
	{
		for(int i=0;i<3;i++)
		{
			questions[i]=new Question();
		}
		for(int i=0;i<3;i++)
		{
			questions[i].ques=quesdata[i];
		    questions[i].o1=op1[i];
		    questions[i].o2=op2[i];
		    questions[i].o3=op3[i];
		    questions[i].o4=op4[i];
		    questions[i].correct=answers[i];
		}
	}
	public void play()
	{
		player.getDetails();
		for(int i=0;i<3;i++)
		{
			boolean s=questions[i].askQuestion();
			if(s==true)
			{
				System.out.println("Well done");
				player.score+=10;
			}
			else
			{
				System.out.println("Better Luck Next Time!!!!!");
				player.score-=5;
			}
		}
		System.out.println(player.name+" has score "+player.score);
	}
}


