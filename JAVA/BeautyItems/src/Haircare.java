
/**
 * Class: Haircare
 * 
 * @author Laura Arevalo
 * @version 1.0 Course : ITEC 3860, Spring, 2016 Written: March 28, 2016
 * 
 * 
 *          This class describes a subclass of BeautyItem called Haircare
 * 
 *          Purpose: Contains the attributes specific to a type of BeautyItem
 *          called Haircare.
 *
 */
public class Haircare extends BeautyItem {
	private String hairProductType;

	/**
	 * Method:Haircare() Constructor method that accepts values for all the
	 * attributes and sets them.
	 *
	 * @param idNumber
	 * @param beautyItemName
	 * @param generalBeautyItemtype
	 * @param numOfBeautyItems
	 * @param brand
	 * @param hairProductType
	 */

	public Haircare(int idNumber, String beautyItemName, String brand, String generalBeautyItemType,
			int numOfBeautyItems, String colorName, String colorFamily, String hairProductType) {
		super(idNumber, beautyItemName, brand, generalBeautyItemType, numOfBeautyItems, colorName, colorFamily);
		this.hairProductType = hairProductType;

	}

	/**
	 * @return the hairProductType
	 */
	public String getshairProductType() {
		return hairProductType;
	}

	/**
	 * @param hairProductType
	 *            the hairProductType to set
	 */
	public void sethairProductType(String hairProductType) {
		this.hairProductType = hairProductType;
	}

	/*
	 * Method:toString() Converts the attributes of the class to a text readable
	 * format.
	 * 
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return super.toString() + " Haircare [hairProductType=" + hairProductType + "]";
	}

}
