package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comment;
import entities.Post;

public class PostApplication {

	public static void main(String[] args) throws ParseException {
		
	/***********************************************************************/
		
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date moment = formato.parse("21/06/2019 13:05:44");
		String title = "Traveling to New Zeland";
		String content = "I'm going to vistit this wonderful county!";
		Integer likes = 12;
		
		Post p1 = new Post(moment, title, content, likes); 
		p1.addComments(new Comment("Have a nice trip"));
		p1.addComments(new Comment("Wow that's awesome"));
		
		//print(p1);
		System.out.println(p1);
		
	/***********************************************************************/	
		
		Date moment2 = formato.parse("28/07/2019 23:14:19");
		String title2 = "Good night guys";
		String content2 = "see you tomorrow";
		Integer likes2 = 5;
		
		
		Post p2 = new Post(moment2, title2, content2, likes2); 
		p2.addComments(new Comment("good night"));
		p2.addComments(new Comment("may the force be with you"));
	
		//print(p2);
		System.out.println(p2);
		
	/***********************************************************************/	

	}
	
	public static void print(Post p) {
		System.out.println(p.getTitle());
		System.out.println(p.getLikes() + " Likes - " + p.getMoment());
		System.out.println(p.getContent());
		for (Comment c : p.getComments()) {
			System.out.println(c.getText());
		}
		System.out.println();
		
	}

}
