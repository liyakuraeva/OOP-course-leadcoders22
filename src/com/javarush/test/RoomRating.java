package com.javarush.test;

public class RoomRating {
    private int reviews; //отзывы
    private int popularity;//популярность
    private int numberOfRooms; //Количество комнат
    private int getNumberOfRoomsRooms;

    public RoomRating(int reviews, int popularity, int NumberOfRooms){
        this();
        this.reviews = reviews;
        this.popularity = popularity;
        this.numberOfRooms = numberOfRooms;

    }

    public RoomRating(){
    }

    public int getReviews() {
        return reviews;
    }
    public void setReviews(int reviews){
        if (reviews >= 0 && reviews <= 5){
            this.reviews = reviews;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }
    public int getPopularity() {
        return popularity;
    }
    public void setPopularity(int popularity){
        if (popularity >= 0 && popularity <= 5){
            this.popularity = popularity;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getNumberOfcopies() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms){
        if (numberOfRooms >= 0 && this.numberOfRooms <= 3){
            this.numberOfRooms = this.numberOfRooms;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 3");
        }

    }

}

