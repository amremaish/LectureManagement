package Server.model;

public class slides {
    int slide_id , numberofwatechers ;
    String slide_name , slide_path , slide_course ;

    public slides(int slide_id, String slide_name, String slide_path, String slide_course, int numberofwatechers) {
        this.slide_id = slide_id;
        this.numberofwatechers = numberofwatechers;
        this.slide_name = slide_name;
        this.slide_path = slide_path;
        this.slide_course = slide_course;
    }

    public int getSlide_id() {
        return slide_id;
    }

    public void setSlide_id(int slide_id) {
        this.slide_id = slide_id;
    }

    public int getNumberofwatechers() {
        return numberofwatechers;
    }

    public void setNumberofwatechers(int numberofwatechers) {
        this.numberofwatechers = numberofwatechers;
    }

    public String getSlide_name() {
        return slide_name;
    }

    public void setSlide_name(String slide_name) {
        this.slide_name = slide_name;
    }

    public String getSlide_path() {
        return slide_path;
    }

    public void setSlide_path(String slide_path) {
        this.slide_path = slide_path;
    }

    public String getSlide_course() {
        return slide_course;
    }

    public void setSlide_course(String slide_course) {
        this.slide_course = slide_course;
    }

}
