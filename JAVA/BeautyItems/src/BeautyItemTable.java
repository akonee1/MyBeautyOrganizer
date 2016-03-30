
import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Callback;

/**
 * 
 */

/**
 * @author laura arevalo
 *
 */
public class BeautyItemTable extends Application {

	private TableView<BeautyItem> table = new TableView<BeautyItem>();
	private ObservableList<BeautyItem> data;
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage stage) throws Exception {
		// get an arrayList of Beauty Items
		BeautyItemList list = new BeautyItemList();
		ArrayList<BeautyItem> aList = list.getList();

		data = FXCollections.observableArrayList(aList);

		// create a table to hold them (see private attributes)
		// create the scene to hold the table
		Scene scene = new Scene(new Group());
		stage.setTitle("Beauty Item Grand Inventory");
		stage.setWidth(1000);
		stage.setHeight(800);

		ImageView logo = new ImageView(new Image(getClass().getResourceAsStream("beauty.png"),300,300,true,true));


		table.setEditable(true);
		//table.setBackground(Color.AQUA);

		// create three columns to hold some information about games
		TableColumn<BeautyItem, String> nameCol = new TableColumn<BeautyItem, String>("Name");
		TableColumn<BeautyItem, Integer> idCol = new TableColumn<BeautyItem, Integer>("ID Number");
		TableColumn<BeautyItem, Integer> copiesCol = new TableColumn<BeautyItem, Integer>("Quantity");
		TableColumn<BeautyItem, String> brandCol = new TableColumn<BeautyItem, String>("Brand");
		TableColumn<BeautyItem, String> typeCol = new TableColumn<BeautyItem, String>("Category");
		TableColumn<BeautyItem, String> colorNameCol = new TableColumn<BeautyItem, String>("Color");
		TableColumn<BeautyItem, String> colorFamilyCol = new TableColumn<BeautyItem, String>("Color Family");


		// link the TableColumn (view) to the BeautyItem object
		// attribute to be displayed (model)
		nameCol.setCellValueFactory(new PropertyValueFactory<BeautyItem, String>("beautyItemName"));
		idCol.setCellValueFactory(new PropertyValueFactory<BeautyItem, Integer>("idNumber"));
		copiesCol.setCellValueFactory(new PropertyValueFactory<BeautyItem, Integer>("numOfBeautyItems"));
		brandCol.setCellValueFactory(new PropertyValueFactory<BeautyItem, String>("brand"));
		typeCol.setCellValueFactory(new PropertyValueFactory<BeautyItem, String>("generalBeautyItemType"));
		colorNameCol.setCellValueFactory(new PropertyValueFactory<BeautyItem,String>("colorName"));
		colorFamilyCol.setCellValueFactory(new PropertyValueFactory<BeautyItem, String>("colorFamily"));

		
		// add the columns to the table
		table.getColumns().addAll(nameCol, idCol, copiesCol, brandCol, typeCol, colorNameCol, colorFamilyCol);
		// set size of table
		table.setMinSize(1000, 300);
		// add the list to the table
		table.setItems(data);
		
		
		VBox VBox = new VBox(10);
		  VBox.setMinWidth(400);
		  VBox.setMinHeight(100);
		  VBox.setSpacing(1);
		  VBox.setAlignment(Pos.TOP_CENTER);
		  VBox.setPadding(new Insets(30,30,30,30)); // padding added for test remove if doesnt work
		  VBox.getChildren().add(logo);
		// add the table to a VBox
		BorderPane mainPane = new BorderPane();
		mainPane.setPadding(new Insets(10, 0, 0, 10));

		mainPane.setTop(VBox);
		mainPane.setCenter(table);

		// add vBox to the scene
		((Group) scene.getRoot()).getChildren().addAll(mainPane);

		// display the GUI
		stage.setScene(scene);
		stage.show();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);

	}

}
