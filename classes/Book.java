package classes;

public class Book {
    private String subjectName;
    private String subjectCode;
    private String subjectBookPicture;
    private int subjectBookPrice;
    public Book() {
    }
    public Book(String subjectName, String subjectCode, String subjectBookPicture, int subjectBookPrice) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
        this.subjectBookPicture = subjectBookPicture;
        this.subjectBookPrice = subjectBookPrice;
    }
    public String getSubjectName() {
        return subjectName;
    }
    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    public String getSubjectCode() {
        return subjectCode;
    }
    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }
    public String getSubjectBookPicture() {
        return subjectBookPicture;
    }
    public void setSubjectBookPicture(String subjectBookPicture) {
        this.subjectBookPicture = subjectBookPicture;
    }
    public int getSubjectBookPrice() {
        return subjectBookPrice;
    }
    public void setSubjectBookPrice(int i) {
        this.subjectBookPrice = i;
    }
    
}
