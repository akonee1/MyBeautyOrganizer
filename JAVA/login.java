@author Laura Arevalo March 20, 2016
 * @version 2.0 Course : ITEC 3160, Spring, 2016 Written: March 20, 2016
 * 
 * 
 *          The first scene of the app that provides the login fields.
 *





import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.Border.*;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;


public class Login extends Application{
    
	Scene scene,scene2,scene3,scene4;
	String userNameText;
	String userNamePassword;
	Stage theStage;
	//Scene sceneThree;

	TextField userID;
	TextField userPass;
	PasswordField userPasswordField;
	ItemPage ha = new ItemPage(this);
	final double MAX_VALUE = 180;
	
	CreateAccount accountPage = new CreateAccount(this);
	AccountsInterface InventoryPage;// = new AccountsInterface(this);
	
	Database data;
	
	public void start(Stage primaryStage) throws Exception {
		  
		
		  theStage = primaryStage;
		  scene2 = new Scene(accountPage,960,1024,Color.PURPLE);
	//	  scene3 = new Scene(bankingPage,700,600);
		  scene4 = new Scene(ha,700,600, Color.PURPLE);
		  
		  ImageView icon = new ImageView(new Image(getClass().getResourceAsStream("/res/MBO_logo.png"),300,300,true,true));
		  
		  Popup pop = new Popup();
		  pop.setX(500); 
		  pop.setY(300); 
          VBox popPane = new VBox(10);
		  popPane.setSpacing(2);
		  popPane.setAlignment(Pos.CENTER);
		  Button popButton = new Button("Acknowlege");
		  Text popText = new Text(0, 10, "The Password or username you have entered is incorrect");
		  popText.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));  
		  popText.setFill(Color.PINK);
		  popText.setUnderline(true);
		  popPane.getChildren().addAll(popText,popButton);
		  pop.getContent().addAll(popPane); 
		  
		  
		  Button create = new Button("Create Account");
		  create.setFont(Font.font("Harrington", FontWeight.BOLD,FontPosture.ITALIC, 20));
		  //Button btNew = new Button("New");
	     // Button btOpen = new Button("Open");
		  //Button btSave = new Button("Save");
		  Button btLogin = new Button("Login");
		  btLogin.setFont(Font.font("Harrington", FontWeight.BOLD,FontPosture.ITALIC, 20));
		 // Button comments = new Button("Add Comments");
		  userID = new TextField();
		  userPass = new TextField();
		  userPasswordField = new PasswordField();
		  
		  create.setMaxWidth(100);
		 // btLogin.setMaxWidth(Double.MAX_VALUE);
		  btLogin.setMaxWidth(100);
		  
		  
		  Label userName = new Label("Username");
		  userName.setFont(Font.font("Harrington", FontWeight.BOLD,FontPosture.ITALIC, 20));
		  userName.setTextFill(Color.PINK);
		  
		  Label passWord = new Label("Password");
		  passWord.setFont(Font.font("Harrington", FontWeight.BOLD,FontPosture.ITALIC, 20));
		  passWord.setTextFill(Color.PINK);
		  
		  //  Create Bottom Panel
	//	  VBox bottomBox = new VBox(10);
	//	  bottomBox.setSpacing(2);
	//	  Text text1 = new Text(0, 10, "For testing purposes only use student as username and password as password");
	//	  text1.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));  
	//	  text1.setFill(Color.GREEN);
	//	  text1.setUnderline(true);
	//	  bottomBox.getChildren().add(text1);
		  
			   
		  //Create the Header Box.
		  HBox hBox = new HBox(50);
		  hBox.setMinWidth(200);
		  hBox.setMinHeight(100);
		  hBox.setPadding(new Insets(30,30,30,30));  // new padding created add to all classes
		  hBox.setSpacing(1);
		  hBox.setAlignment(Pos.TOP_CENTER);
		  hBox.getChildren().add(icon);
		  hBox.setStyle("-fx-border-style: solid;"
				  	+ "-fx-background-color: purple;"
	                + "-fx-border-width: 10;"
	                + "-fx-border-color: pink;");
		  
			   
		  //Create Main Panel
		  
		  GridPane grid = new GridPane();
		  grid.setAlignment(Pos.TOP_CENTER);
		  grid.setPadding(new Insets(10,25,25,25));
		  grid.setStyle("-fx-background-color:PURPLE;");
		  grid.setVgap(10);
		  grid.setHgap(10);
		  grid.add(userName, 1, 0);
		  grid.add(passWord,1,1);
		  grid.add(btLogin,2,3);
		  grid.add(create, 2, 4);
		  grid.add(userID, 2, 0);
	      grid.add(userPass, 2, 1);
	      

	     // grid.setMargin(userID, new Insets(5, 10, 5, 10));
		  grid.add(userPasswordField,2,1);
		  BorderPane borders = new BorderPane();
		  borders.setTop(hBox);
		  borders.setCenter(grid);
	//	  borders.setBottom(bottomBox);
		    
		  
		  data = new Database();
		  
		  btLogin.setOnAction((e) -> {
			
		// data.login(userID.getText(),userPass.getText());
			 
		if(data.checkLogin(userID.getText(),userPasswordField.getText()) == true){
			//bankingPage.setCurrentUser(userID.getText());
			InventoryPage = new AccountsInterface(this,userID.getText());
			scene3 = new Scene(InventoryPage,700,600);
			theStage.setScene(scene3);
		}
			  
		
	      });
		  
		  
		  create.setOnAction((e) -> {
				 
			     accountPage.clearText();
				 theStage.setScene(scene2);
				 
			             
			  });
		  
		  
		  
		  
		  popButton.setOnAction(e -> pop.hide());
		 
		 
		
		 scene = new Scene (borders,1200,600);
		
		 primaryStage.setTitle("LOGIN"); // Set title
		 primaryStage.setScene(scene); // Place the scene in the stage
		 primaryStage.show();	
		
	}



	public static void main(String[] args) {
		 launch(args);
		 }

}
