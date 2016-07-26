package com.ssa.adventure;

import java.util.Scanner;

public class AdventureStory 
{

	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{	
		
		System.out.println("You wake up in a dimly lit and damp saloon.\nYou have no memory of how you arrived there.");
		
		System.out.println("As you look around the saloon you see 3 people. \n1)A young barmaid standing behind the bar, cleaning it.\n2)A man sitting in the corner dressed in black like an outlaw, eating food.\n3)A sheriff who appears to have fallen asleep in his chair.\n"
			+ "\nWho would you like to interact with?\n"
			+ "\tB: The Barmaid\n"
			+ "\tO: The Outlaw\n"
			+ "\tS: The Sheriff");
		String whoToTalkTo = sc.nextLine();
		
		whoAmITalkingTo(whoToTalkTo);

	}

	public static void whoAmITalkingTo(String thePersonITalkTo)
	{
		switch (thePersonITalkTo.toLowerCase())
		{
			case "b":
				whatDoesTheBarmaidSay();
				//heres where jedi talks to me
				break;
				
			case "o":
				whatDoesTheOutlawSay();
				//heres where droid talks to me
				break;
				
			case "s":
				whatDoesTheSheriffSay();
				//heres where sith talks to me
				break;
				
			default:
				System.out.println("I'm sorry, you've made an error. Please restart the game");
				System.exit(0);
		}
	}
	
	public static void whatDoesTheBarmaidSay()
	{
		System.out.println("You've decided to speak to the Barmaid.\n");
		
		System.out.println("Barmaid: How are you tonight, honey?"
			+"\nBarmaid: Would you like a drink?"
			+"\n\tY: Sure, I'm pretty thirsty."
			+"\n\tN: No thanks, I'm okay.");
		
		String barmaidWho = sc.nextLine();
		
		barmaidTalk(barmaidWho);
	}
	public static void barmaidTalk(String theBarmaid)
	{
		switch (theBarmaid.toLowerCase())
		{
			case "y":
				whatDoesTheBarmaidSayYes();
				//heres where jedi talks to me
				break;
				
			case "n":
				whatDoesTheBarmaidSayNo();
				//heres where droid talks to me
				break;
				
			default:
				System.out.println("I'm sorry, you've made an error. Please restart the game");
				System.exit(0);
		}
	}
		
	public static void whatDoesTheBarmaidSayYes()
	{
		System.out.println("The Barmaid makes grabs you a drink as you sit down on a stool and ponder your life.");
	}
	
	public static void whatDoesTheBarmaidSayNo()
	{
		System.out.println("The Barmaid shrugs and continues to clean while you sit down in a chair and rub your eyes.");
	}
	
	public static void whatDoesTheOutlawSay()
	{
		System.out.println("You've decided to speak to the Outlaw.\n");
		
		System.out.println("You approach and greet the outlaw who glares at you from under his hat."
			+"\nOutlaw: What do you want?"
			+"\n\tY: I was... Uh... Wondering if you knew where we were?"
			+"\n\tN: Nevermind. I'm sorry I bothered you.");
		
		String outlawWho = sc.nextLine();
		
		outlawTalk(outlawWho);
	}
	public static void outlawTalk(String theOutlaw)
	{
		switch (theOutlaw.toLowerCase())
		{
			case "y":
				whatDoesTheOutlawSayYes();
				//heres where jedi talks to me
				break;
				
			case "n":
				whatDoesTheOutlawSayNo();
				//heres where droid talks to me
				break;
				
			default:
				System.out.println("I'm sorry, you've made an error. Please restart the game");
				System.exit(0);
		}
	}
	
	public static void whatDoesTheOutlawSayYes()
	{
		System.out.println("Outlaw: Are you stupid or something? Don't you ever talk to me again.");
	}
	
	public static void whatDoesTheOutlawSayNo()
	{
		System.out.println("Outlaw: That's right, walk away, and don't come back.");
	}
	
	public static void whatDoesTheSheriffSay()
	{
		System.out.println("You've decided to speak to the Sheriff.\n");
		
		System.out.println("You walk up to the Sheriff, place your hand on his shoulder and shake him awake."
			+"\nThe Sheriff wakes up, almost falling out of his chair in the process before asking just who do you think you are."
			+"\n\tY: Attempt to introduce yourself to the Sheriff."
			+"\n\tN: Apologize to the Sheriff and return to your seat.");
		
		String sheriffWho = sc.nextLine();
		
		sheriffTalk(sheriffWho);
	}
	public static void sheriffTalk(String theSheriff)
	{
		switch (theSheriff.toLowerCase())
		{
			case "y":
				whatDoesTheSheriffSayYes();
				//heres where jedi talks to me
				break;
				
			case "n":
				whatDoesTheSheriffSayNo();
				//heres where droid talks to me
				break;
				
			default:
				System.out.println("I'm sorry, you've made an error. Please restart the game");
				System.exit(0);
		}
	}
		
	public static void whatDoesTheSheriffSayYes()
	{
		System.out.println("The Sheriff cuts you off and tells you to leave him alone. He is busying working.");
	}
	
	public static void whatDoesTheSheriffSayNo()
	{
		System.out.println("Before you can walk away, the Sheriff stands up, and places you under arrest for assualting an officer of the law.");
	}
}
