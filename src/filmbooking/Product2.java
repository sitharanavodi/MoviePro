/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filmbooking;

/**
 *
 * @author Acer
 */
public class Product2 {
    private int id;
    private String title;
    private String language;
    private String movieprice;
    private String hallnumber;
    private String description;
    private byte[] image;
    
    public Product2(){
    }
    
    public Product2(int MovieID, String Title, String Language, String MoviePrice,String HallNumber,String Description,byte[] Image){
    
        this.id = MovieID;
        this.title = Title;
        this.language = Language;
        this.movieprice = MoviePrice;
        this.hallnumber=HallNumber;
        this.description=Description;
        this.image = Image;
       
       
    }

//    Product2(String string, String string0, int aInt, String string1, byte[] bytes, int aInt0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
    
    public int getMovieID(){
      return id;
    }
    
    public void setMovieID(int MovieID){
        this.id = MovieID;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String Title){
        this.title = Title;
    }
    
    public String getLanguage(){
        return language;
    }
    
    public void setLanguage(String Language){
        this.language = Language;
    }
    
    public String getMoviePrice(){
        return movieprice;
    }
    
    public void setMoviePrice(String MoviePrice){
        this.movieprice = MoviePrice;
    }
    
    public String getHallNumber(){
        return hallnumber;
    }
    
    public void setHallNumber(String HallNumber){
        this.hallnumber = HallNumber;
    }
    public String getDescription(){
        return description;
    }
    
    public void setDescrition(String Description){
        this.description = Description;
    }
    
    public byte[] getMyImage(){
        return image;
    }
//    public void setMyImage(byte[] Image){
//       this.Image=Image;
        
    //}
    
}
