package app05.bean;

public class MovieStar {
	private String name;
    private String sex;
    private String description;

    public MovieStar() {
    }

    public MovieStar(String name, String sex, String description) {
        this.name = name;
        this.sex = sex;
        this.description = description;
    }
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    }
}