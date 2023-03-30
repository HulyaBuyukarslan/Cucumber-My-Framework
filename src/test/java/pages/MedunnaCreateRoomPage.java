package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MedunnaCreateRoomPage {

   public MedunnaCreateRoomPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='Items&Titles']")
    public WebElement items_titles;

    @FindBy (xpath = "(//*[text()='Room'])[1]")
    public WebElement room;

    @FindBy (xpath = "//*[text()='Create a new Room']")
    public WebElement create_room;

    @FindBy(id = "room-roomNumber")
    public WebElement room_number;

    @FindBy (id = "room-roomType")
    public WebElement room_type;

    @FindBy (id = "room-status")
    public WebElement status;

    @FindBy (id = "room-price")
    public WebElement room_price;


    @FindBy (id = "room-description")
    public WebElement description;

     @FindBy (xpath = "//*[text()='Save']")
    public WebElement save_button;


     @FindBy (xpath = "//*[text()='Created Date']")
     public WebElement created_date;









}
