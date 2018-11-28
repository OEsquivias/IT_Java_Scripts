package videos;


public class Main {

	public static void main(String[] args) throws Exception {
		
		User user1 = new User("My name", "And surname", "My password");
		String[] tags1_1 = {"tag1", "tag2"};
		user1.addVideo("www.video1.com", "My first video", tags1_1);
		String[] tags1_2 = {"tag231", "tag4322"};
		user1.addVideo("www.video2.com", "My second video", tags1_2);
		for(Video v : user1.getMyVideos()) {
			System.out.println(v.getTitle() + ": " + v.getUrl());
		}
		System.out.println(user1.getSignupString());
	}

}
