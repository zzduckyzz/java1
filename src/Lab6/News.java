package Lab6;

import java.util.ArrayList;

public class News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;
    public int[] RateList = new int[3];

    public News(){

    }

    public int[] getRateList() {
        return RateList;
    }

    public void setRateList(int[] rateList) {
        RateList = rateList;
    }

    public News(int ID, String title, String publishDate, String author, String content, float averageRate) {
        this.ID = ID;
        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }


    @Override
    public void Display() {
        System.out.println(getTitle()+getPublishDate()+getAuthor()+getContent()+getAverageRate());
    }
    public void  setRate(int a, int b, int c) {

    }
    public void Calculate(){
        int Tong = 0;
        for ( int i = 0; i< RateList.length; i++){
            Tong += RateList[i];

        }
        this.AverageRate = Tong/3;
    }

    public void showInfo(){
        System.out.println(getID());
        System.out.println(getTitle());
        System.out.println(getPublishDate());
        System.out.println(getAuthor());
        System.out.println(getContent());
        System.out.println(getAverageRate());
    }


}
