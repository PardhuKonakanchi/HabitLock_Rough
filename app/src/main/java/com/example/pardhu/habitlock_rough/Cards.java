package com.example.pardhu.habitlock_rough;


//Information for all the cards in cardview. Will be constructed during new habit and then fetch to construct graphview and be added to CardViewListFragment
public class Cards {
    private String imgURL;
    private String habitName;
    private String dateInfo;

    public Cards(String imgURL, String habitName, String dateInfo) {
        this.imgURL = imgURL;
        this.habitName = habitName;
        this.dateInfo = dateInfo;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }

    public String getHabitName() {
        return habitName;
    }

    public void setHabitName(String habitName) {
        this.habitName = habitName;
    }

    public String getDateInfo() {
        return dateInfo;
    }

    public void setDateInfo(String dateInfo) {
        this.dateInfo = dateInfo;
    }
}
