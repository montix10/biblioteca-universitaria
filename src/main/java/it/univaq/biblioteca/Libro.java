public class Libro{
    private String author;
    private String title;
    private int publishedDate;
    private String isbn;
    private String editor;
    private String category; 
    private String language;
    private int pages;
    private float price;
    private String _abstract;// private String bookAbstract (sinossi?)


    /**
     * 
     * @param author
     * @param title
     * @param publishdDate
     * @param ISBN 
     * @param editor
     * @param category
     * @param language
     * @param pages
     * @param price
     * @param _abstract
     */


    public Libro(String author, String title, int publishedDate, String isbn, String editor, String category,
            String language, int pages, float price, String _abstract) {
        this.author = author;
        this.title = title;
        this.publishedDate = publishedDate;
        this.isbn = isbn;
        this.editor = editor;
        this.category = category;
        this.language = language;
        this.pages = pages;
        this.price = price;
        this._abstract = _abstract;
    } 






    