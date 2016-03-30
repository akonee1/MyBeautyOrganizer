
/**
 * Class: Skincare
 * 
 * @author Laura Arevalo
 * @version 1.0 Course : ITEC 3860, Spring, 2016 Written: March 28, 2016
 * 
 * 
 *          This class describes a subclass of BeautyItem called Skincare
 * 
 *          Purpose: Contains the attributes specific to a type of BeautyItem
 *          called Skincare.
 *
 */
public class Skincare extends BeautyItem {
	private String skinProductType;

	/**
	 * Method:Skincare() Constructor method that accepts values for all the
	 * attributes and sets them.
	 *
	 * @param idNumber
	 * @param beautyItemName
	 * @param generalBeautyItemtype
	 * @param numOfBeautyItems
	 * @param brand
	 * @param skinProductType
	 */

	public Skincare(int idNumber, String beautyItemName, String brand, String generalBeautyItemType,
			int numOfBeautyItems, String colorName, String colorFamily, String skinProductType) {
		super(idNumber, beautyItemName, brand, generalBeautyItemType, numOfBeautyItems, colorName, colorFamily);
		this.skinProductType = skinProductType;

	}

	/**
	 * @return the skinProductType
	 */
	public String getsSkinProductType() {
		return skinProductType;
	}

	/**
	 * @param skinProductType
	 *            the skinProductType to set
	 */
	public void setSkinProductType(String skinProductType) {
		this.skinProductType = skinProductType;
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
		return super.toString() + " Skincare [skinProductType=" + skinProductType + "]";
	}

}
