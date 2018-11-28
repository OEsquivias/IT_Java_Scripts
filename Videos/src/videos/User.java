package videos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

//Check if information is ok

public class User {

	private String name;
	private String surname;
	private String password;
	private List<Video> myVideos = new ArrayList<>();
	private LocalDateTime signup;

	public User(String name, String surname, String password) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (surname.equals(""))
			throw new Exception();
		if (password.equals(""))
			throw new Exception();
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.signup = LocalDateTime.now();

	}

	public void addVideo(String url, String title, String[] tag) throws Exception {
		Video newVideo = new Video(url, title, tag);
		this.myVideos.add(newVideo);
	}

	public List<Video> getMyVideos() {
		return myVideos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name.equals(""))
			throw new Exception();
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) throws Exception {
		if (surname.equals(""))
			throw new Exception();
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws Exception {
		if (password.equals(""))
			throw new Exception();
		this.password = password;
	}

	public LocalDateTime getSignupCalendar() {
		return signup;
	}

	public String getSignupString() {
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String signupString = format1.format(signup);
		return signupString;
	}

	public void setSignup(LocalDateTime signup) {
		this.signup = signup;
	}

//
//	public int[] getSignupArray() {
//		int[] signupArray = {day, month, year};
//		return signupArray;
//	}
//	public String getSignupString() {
//		String date = day + "/" + month + "/" + year;
//		return date;
//	}
//
//	public void setSignup(int day, int month, int year) {
//		this.day = day;
//		this.month = month;
//		this.year = year;
//	}

}
