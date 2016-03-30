
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Class: BeautyItem
 * 
 * @author Laura Arevalo
 * @version 1.0 Course : ITEC 3860, Spring, 2016 Written: March 28, 2016
 * 
 * 
 *          This class describes the common attributes and methods of the
 *          BeautyItem being collected into an inventory
 * 
 *          Purpose: This class is intended to serve a parent class only for all
 *          different types of Beauty Items.
 *
 */
public class BeautyItem {

	private SimpleIntegerProperty idNumber;
	private SimpleIntegerProperty numOfBeautyItems;
	private SimpleStringProperty beautyItemName;
	private SimpleStringProperty brand;
	private SimpleStringProperty generalBeautyItemType;
	private SimpleStringProperty colorName;
	private SimpleStringProperty colorFamily;
	

	/**
	 * Method:BeautyItem ()
	 * 
	 * Constructor method that accepts values for all the attributes and sets
	 * them.
	 * 
	 * @param idNumber
	 * @param numOfBeautyItems
	 * @param beautyItemName
	 * @param generalBeautyItemType
	 * @param brand
	 * @param colorName
	 * @param colorFamily
	 */
	public BeautyItem(int idNumber, String beautyItemName, String brand, String generalBeautyItemType,
			int numOfBeautyItems, String colorName, String colorFamily) {

		this.idNumber = new SimpleIntegerProperty(idNumber);
		this.beautyItemName = new SimpleStringProperty(beautyItemName);
		this.generalBeautyItemType = new SimpleStringProperty(generalBeautyItemType);
		this.brand = new SimpleStringProperty(brand);
		this.numOfBeautyItems = new SimpleIntegerProperty(numOfBeautyItems);
		this.colorName = new SimpleStringProperty(colorName);
		this.colorFamily = new SimpleStringProperty(colorFamily);
	}
	/**
	 * Method:getIdNumber() Getter method for the idNumber attribute
	 * 
	 * @return the idNumber
	 */
	public int getIdNumber() {
		return idNumber.intValue();
	}

	/**
	 * Method:getNumOfBeautyItems() Getter method for the getNumOfBeautyItems
	 * attribute
	 * 
	 * @return the numOfBeautyItems
	 */
	public int getNumOfBeautyItems() {

		return numOfBeautyItems.intValue();
	}

	/**
	 * Method:getBeautyItemName() Getter method for the getBeautyItemName
	 * attribute
	 * 
	 * @return the beautyItemName
	 */
	public String getBeautyItemName() {
		return beautyItemName.getValue();
	}

	/**
	 * Method:getGeneralBeautyItemType() Getter method for the
	 * generalBeautyItemType attribute
	 * 
	 * @return the generalBeautyItemtype
	 */
	public String getGeneralBeautyItemType() {
		return generalBeautyItemType.getValue();
	}

	/**
	 * Method:getBrand() Getter method for the brand attribute
	 * 
	 * @return the brand
	 */
	public String getBrand() {
		return brand.getValue();
	}

	
	/**
	 * @return the colorName
	 */
	public SimpleStringProperty getColorName() {
		return colorName;
	}
	/**
	 * @return the colorFamily
	 */
	public SimpleStringProperty getColorFamily() {
		return colorFamily;
	}
	/**
	 * @param idNumber
	 *            the idNumber to set
	 */
	public void setIdNumber(SimpleIntegerProperty idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * @param numOfBeautyItems
	 *            the numOfBeautyItems to set
	 */
	public void setNumOfBeautyItems(SimpleIntegerProperty numOfBeautyItems) {
		this.numOfBeautyItems = numOfBeautyItems;
	}

	/**
	 * @param beautyItemName
	 *            the beautyItemName to set
	 */
	public void setBeautyItemName(SimpleStringProperty beautyItemName) {
		this.beautyItemName = beautyItemName;
	}

	/**
	 * @param brand
	 *            the brand to set
	 */
	public void setBrand(SimpleStringProperty brand) {
		this.brand = brand;
	}

	/**
	 * @param generalBeautyItemType
	 *            the generalBeautyItemType to set
	 */
	public void setGeneralBeautyItemType(SimpleStringProperty generalBeautyItemType) {
		this.generalBeautyItemType = generalBeautyItemType;
	}

	
	/**
	 * @param colorName the colorName to set
	 */
	public void setColorName(SimpleStringProperty colorName) {
		this.colorName = colorName;
	}
	/**
	 * @param colorFamily the colorFamily to set
	 */
	public void setColorFamily(SimpleStringProperty colorFamily) {
		this.colorFamily = colorFamily;
	}
	
	/**
	 * Method:toString()
	 * 
	 * Converts attributes of class to a String
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "BeautyItem [idNumber=" + idNumber + ", numOfBeautyItems=" + numOfBeautyItems + ", beautyiitemName="
				+ beautyItemName +  ", brand=" + brand + ", colorName=" + colorName + ",colorFamily=" +
				colorFamily + ", generalBeautyItemType=" + generalBeautyItemType + "]";
	}
}
