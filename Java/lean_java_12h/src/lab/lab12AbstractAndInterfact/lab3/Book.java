package lab.lab12AbstractAndInterfact.lab3;

public class Book {
    private String name;
    private double price;
    private Author[] authors;
    public Book(String name, double price, Author[] authors) {
        this.name = name;
        this.price = price;
        this.authors = authors;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public Author[] getAuthors() {
        return authors;
    }
    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    public String getAuthorNames() {
        String authorNames = "";
        for (int i = 0; i < authors.length ; i++) {
			authorNames += authors[i].getName() + ", ";
		}
		// authorNames += authors[authors.length - 1].getName();
		return authorNames;

    }
    
}
