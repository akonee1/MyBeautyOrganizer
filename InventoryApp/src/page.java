/*=============================================================================
 |   Assignment:  My Beauty Application
 |       Author:  Abubakar Kone, Laura Arevalo
 |       Grader:  Dr. Gunay ITEC 3860
 |
 |       Course:  ITEC 3860
 |   Instructor:  Dr. Gunay
 |     Due Date:  3/14/2016
 |
 |  Description:  This is a generic test window for future products.
 |
 |     Language:  JAVA and SQL
 | Ex. Packages:  JAVAFX
 |                                
 *===========================================================================*/

import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class page extends BorderPane{

	public page(){
		
		Button one = new Button("Ho");
		VBox hbox = new VBox();
		hbox.getChildren().add(one);
		
		super.setTop(hbox);
	}
	
	
}
