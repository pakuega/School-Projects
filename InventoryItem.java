import java.util.*;
public class InventoryItem {
    String itemID;
    float unitItemPrice;
    int itemCount;

    //constructor
    public InventoryItem()
    {
         itemID = "";
         unitItemPrice = 0.0f;
         itemCount = 0;
    }
    //accessor method

    //method  mutator
    public void setItemID(String id)
    {
         itemID = id;
    }
    public void setUnitItemPrice(float newItemPrice)
    {
         unitItemPrice = newItemPrice;
    } 
    //method mutator setUnitItemPrice      
    public void setUnitItemCount(int count)
    {
         itemCount = count;
    } 
    public String toString()
     { 
          return "ITEM: " + itemID + " – " + unitItemPrice + " – " + itemCount;
     }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
}
