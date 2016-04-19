/*=============================================================================
 |   Assignment:  My Beauty Application
 |       Author:  Roland Abrahantes
 |       Grader:  Dr. Gunay ITEC 3860
 |
 |       Course:  ITEC 3860
 |   Instructor:  Dr. Gunay
 |     Due Date:  3/14/2016
 |
 |  Description:  Orginize beauty products in a database.
 |
 |     Language:  JAVA and SQL
 | Ex. Packages:  JAVAFX
 |                                
 *===========================================================================*/


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.util.Callback;


public class DatabaseTable {

	private ObservableList<ObservableList> data;
	private ObservableList<Item> items;
	Item itemsarray;
	
    ResultSet rs = null;
 	 Connection con = null;
      Statement stmt = null;
     
     String itemID = "";
  	 String itemName = "";
  	 String quantity = "";
  	 String price = "";
  	 String itemDescription = "";
  	
      public DatabaseTable(){
    	
    	
    	
    	
    	
    }
	
    public ObservableList<Item> buildData (){
       
    	
    	
    	Connection c ;
        items = FXCollections.observableArrayList();
        try{
        	 
        	String sql = "SELECT * FROM ITEM";
        	Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:DEVELOPER/developer@localhost");
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

        

          /********************************
           * Data added to ObservableList *
           ********************************/
          while(rs.next()){
              //Iterate Row
        	   
        	   itemID = rs.getString(1);
       	       itemName = rs.getString(2);
       	       quantity = rs.getString(3);
        	   price = rs.getString(4);
        	   itemDescription = rs.getString(5);
        	  
        	 
        //	  ObservableList<String> row = FXCollections.observableArrayList();
        //      for(int i=1 ; i<=rs.getMetaData().getColumnCount(); i++){
                  //Iterate Column
         //         row.add(rs.getString(i));
         //     }
        	  items.add(new Item(itemID,itemName,quantity,price,itemDescription));
      //        

          }
//
         
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error on Building Data");             
        }
    
    return items;
    
    }



}
