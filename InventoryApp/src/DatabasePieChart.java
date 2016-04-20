import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.PieChart.Data;


public class DatabasePieChart {

	ObservableList<PieChart.Data> pieChartData;
	PieChart pie;
	
	ResultSet rs = null;
	 Connection con = null;
     Statement stmt = null;
     
     String itemID = "";
  	 String itemName = "";
  	 String quantity = "";
  	 double quantityNumber = 0;
  	 String itemDescription = "";
  	 
  	 
	
	public DatabasePieChart(){
		
		
	}
	
	
	public ObservableList<Data> getPieData(){
		
		Connection c ;
        pieChartData = FXCollections.observableArrayList();
		
        try{
       	 
        	String sql = "SELECT * FROM ITEM";
        	Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:DEVELOPER/developer@localhost");
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

        

          
          while(rs.next()){
        	   
        	   itemName = rs.getString(2);
               quantity = rs.getString(3);
        	   quantityNumber = Integer.parseInt(quantity);
               pieChartData.add(new PieChart.Data(itemName, quantityNumber));

          }

         
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Error on Building Data");             
        }
        
		return pieChartData;
	}
	
}
