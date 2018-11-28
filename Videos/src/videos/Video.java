package videos;


public class Video {

	private String url;
	private String title;
	private String[] tag;
	
	public Video(String url, String title, String[] tag) throws Exception {
		if (url.equals(""))
			throw new Exception();
		if (title.equals(""))
			throw new Exception();
		
		this.url = url;
		this.title = title;
		this.tag = tag;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) throws Exception {
		if (url.equals(""))
			throw new Exception();
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		if (title.equals(""))
			throw new Exception();
		this.title = title;
	}

	public String[] getTag() {
		return tag;
	}

	public void setTag(String[] tag) {
		this.tag = tag;
	}
	
	
}
