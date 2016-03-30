
/**
 * Class: Makeup
 * 
 * @author Laura Arevalo
 * @version 1.0 Course : ITEC 3860, Spring, 2016 Written: March 28, 2016
 * 
 * 
 *          This class describes a subclass of BeautyItem called Makeup
 * 
 *          Purpose: Contains the attributes specific to a type of BeautyItem
 *          called Makeup.
 *
 */
public class Makeup extends BeautyItem {
	private String makeupProductType;
	
	/**
	 * Method:Makeup() Constructor method that accepts values for all the
	 * attributes and sets them.
	 *
	 * @param idNumber
	 * @param beautyItemName
	 * @param generalBeautyItemtype
	 * @param numOfBeautyItems
	 * @param brand
	 * @param makeupProductType
	 * @param colorName
	 * @param colorFamily
	 */

	public Makeup(int idNumber, String beautyItemName, String brand, String generalBeautyItemType, int numOfBeautyItems,
		String colorName, String colorFamily,String makeupProductType) {
		super(idNumber, beautyItemName, brand, generalBeautyItemType, numOfBeautyItems, colorName, colorFamily);
		this.makeupProductType = makeupProductType;
		

	}

	/**
	 * @return the makeupProductType
	 */
	public String getMakeupProductType() {
		return makeupProductType;
	}

	/**
	 * @param makeupProductType
	 *            the makeupProductType to set
	 */
	public void setMakeupProductType(String makeupProductType) {
		this.makeupProductType = makeupProductType;
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
		return super.toString() + " Makeup [makeupProductType=" + makeupProductType + "]";
	}

}
