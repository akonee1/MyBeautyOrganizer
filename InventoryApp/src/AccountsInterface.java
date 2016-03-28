 import java.awt.event.ActionListener;

import javafx.application.Application;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AccountsInterface extends BorderPane {

	  Login login;
	  Button newItem = new Button("Add New Item");
	  Button goBack = new Button("Go Back");
	//  String currentUser;  
	  Customer loggedUser = new Customer();
	  Database data;
	
	  Label username = new Label("Username");
	  Label password = new Label("Password");
	  Label name = new Label("Name");
	  Label lastName = new Label("LastName");
	  Label address = new Label("Address");
	  Label age = new Label("Age");
	
	AccountsInterface(Login login, String user){
		
		  this.login = login;
		  data = new Database();
		  loggedUser = data.customerData(user);

		  
		  Label selected = new Label("Item Selected");
		  Button withdraw = new Button("ADD");
		  withdraw.setMaxWidth(200);
		  Button deposit = new Button(" REMOVE ");
		  withdraw.setMaxWidth(200);
		  Label balance = new Label("Price:");
		  Label money = new Label("$ 0.00");
		  Label amount = new Label("Amount");
		  TextField quantity = new TextField();

		  ImageView icon = new ImageView(new Image(getClass().getResourceAsStream("/res/beauty.png"),300,300,true,true));
	//	  ImageView icon2 = new ImageView(new Image(getClass().getResourceAsStream("/res/logo.png"),300,300,true,true));
		  
		  ChoiceBox theAccounts = new ChoiceBox(FXCollections.observableArrayList("Quantity On Hand", "Quantity Ordered"));
	      
		  VBox hBox = new VBox(10);
		  hBox.setMinWidth(400);
		  hBox.setMinHeight(100);
		  hBox.setSpacing(1);
		  hBox.setAlignment(Pos.TOP_CENTER);
		  Text text1 = new Text(0, 10, "Inventory Control Program Test");
		  text1.setFont(Font.font("Courier", FontWeight.BOLD,FontPosture.ITALIC, 15));  
		  text1.setFill(Color.GREEN);
		  text1.setUnderline(true);
		  hBox.setPadding(new Insets(30,30,30,30)); // padding added for test remove if doesnt work
		  hBox.getChildren().add(icon);
		  hBox.getChildren().add(text1);
		  // Main Panel
		  
          GridPane grid = new GridPane();
		  grid.setAlignment(Pos.TOP_CENTER);
		  grid.setPadding(new Insets(10,25,25,25));
		  grid.setVgap(10);
		  grid.setHgap(10);
		  grid.add(selected, 3, 0);
		  grid.add(balance, 2, 1);
		  grid.add(amount,2,2);
		  grid.add(withdraw,2,4);
		  grid.add(money, 3, 1);
		  grid.add(quantity, 3, 2);
		  grid.add(deposit, 3, 4);
		
		  
		  // left pane
		  
		  VBox leftPanel = new VBox(10);
		  leftPanel.setPadding(new Insets(30));
		  newItem.setMaxWidth(100);
		  goBack.setMaxWidth(100);
		  leftPanel.setSpacing(20);
		  leftPanel.setAlignment(Pos.TOP_CENTER);
		  leftPanel.getChildren().add(new Label("Select Option"));
		  leftPanel.getChildren().add(theAccounts);
		  leftPanel.getChildren().add(newItem);
		  leftPanel.getChildren().add(goBack);
		  // all the action listeners here for the components
		  
		  
		  // this is the code for the withdraw button
		  withdraw.setOnAction((e) -> {
			   
		    if(theAccounts.getValue().toString().equalsIgnoreCase("Quantity On Hand")){
				 try {
				//	savings2.withdraw(Double.parseDouble(quantity.getText()));
				//	money.setText(savings2.getBalance() + " $");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			 } else if (theAccounts.getValue().toString().equalsIgnoreCase("Quantity Ordered")){
				 
				 try {
				//		checking2.withdraw(Double.parseDouble(quantity.getText()));
					//	money.setText(checking2.getBalance() + " $");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				 }
		  });
		  
		   // this is the code for the deposit button handler
		  
		     deposit.setOnAction((e) -> {
			   
		    	 if(theAccounts.getValue().toString().equalsIgnoreCase("Quantity On Hand")){
		    	//	 savings2.deposit(Double.parseDouble(quantity.getText()));
		    	//     money.setText(savings2.getBalance() + " $");
		    	 }else if(theAccounts.getValue().toString().equalsIgnoreCase("Quantity Ordered")){
		    	//	 checking2.deposit(Double.parseDouble(quantity.getText()));
		    	//     money.setText(checking2.getBalance() + " $");
		    	 }
						
			  });
		  
		     
		     goBack.setOnAction((e) -> {
				  login.theStage.setScene(login.scene);
				  login.userID.clear();
				  login.userPasswordField.clear();
		     });
		     
		     newItem.setOnAction((e) -> {
				  login.theStage.setScene(login.scene4);
				  
		     });
		  
		  // this is the code for the drop down menu
       
	        theAccounts.getSelectionModel().selectFirst();
	       theAccounts.getSelectionModel().selectedItemProperty().addListener((ObservableValue observable, 
	                    Object oldValue, Object newValue) -> {
	               selected.setText(newValue.toString());
	                if(newValue.toString().equalsIgnoreCase("Quantity On Hand")){
	                //	money.setText(savings2.getBalance() + " $");
	                }else if(newValue.toString().equalsIgnoreCase("Quantity Ordered")){
	                //	money.setText( checking2.getBalance() + " $");
	                }
	        });

		 
	    //    loanRequest.setOnAction(e-> ButtonClicked(e));
	        
	        //bottom panel
	        HBox bottomPane = new HBox(10);
	        bottomPane.setMinWidth(400);
			bottomPane.setMinHeight(100);
			bottomPane.setSpacing(1);
			bottomPane.setAlignment(Pos.TOP_CENTER);
	     
			// picture other		bottomPane.getChildren().add(icon2);
			  
		  setBackground(new Background(new BackgroundFill(Color.PINK, CornerRadii.EMPTY, Insets.EMPTY)));
		  super.setTop(hBox);
		  super.setCenter(grid);
		  super.setLeft(leftPanel);
	      super.setBottom(bottomPane);
	 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	/*	  
		  
		  
		  HBox bottomPanel = new HBox();
		  bottomPanel.setPadding(new Insets(10,25,25,25));
		  Button signOut = new Button("Sign Out");
		  
		  ImageView icon = new ImageView(new Image(getClass().getResourceAsStream("/res/FastCash.png"),300,300,true,true));
		  
		  //Create the Header Box.
		  HBox hBox = new HBox(10);
		  hBox.setMinWidth(400);
		  hBox.setMinHeight(100);
		  hBox.setSpacing(1);
		  hBox.setAlignment(Pos.TOP_CENTER);
		  hBox.getChildren().add(icon);  
		  
		
		//  Label username = new Label("Username");
		//  Label password = new Label("Password");
		  
		  Label name = new Label("Name");
		  Label lastName = new Label("LastName");
		  Label address = new Label("Address");
		  Label age = new Label("Age");
		  
		  name.setText(loggedUser.getName());
		  lastName.setText(loggedUser.getLastName());
		  address.setText(loggedUser.getAddress());
		  age.setText(loggedUser.getAge());
		  
		  GridPane grid = new GridPane();
		  grid.setAlignment(Pos.CENTER);
		  grid.setPadding(new Insets(10,25,25,25));
		  grid.setVgap(10);
		  grid.setHgap(10);
		//  grid.add(username, 1, 0);
		//  grid.add(usernameText,2,0);
		//  grid.add(password,1,1);
		//  grid.add(passwordText, 2, 1);
		  grid.add(name, 1, 2);
		//  grid.add(nameText, 2, 2);
		  grid.add(lastName, 1, 3);
		//  grid.add(lastNameText, 2, 3);
		  grid.add(address, 1, 4);
		//  grid.add(addressText, 2, 4);
		  grid.add(age, 1, 5);
		//  grid.add(ageText, 2, 5);
		
		  signOut.setOnAction((e) -> {
			  
			  login.theStage.setScene(login.scene);
			  login.userID.clear();
			  login.userPasswordField.clear();
		  });
		  
		  bottomPanel.getChildren().add(signOut);
		  
		  setTop(hBox);
		  setCenter(grid);
		  setBottom(bottomPanel);
		}
	 
	
	//  public String getCurrentUser() {
	//		return currentUser;
	//	}

	//	public void setCurrentUser(String currentUser) {
	//		this.currentUser = currentUser;
	//	}
	
	
	


*/














	}



}
