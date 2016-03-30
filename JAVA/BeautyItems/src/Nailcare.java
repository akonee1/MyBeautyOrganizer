
/**
 * Class: Nailcare
 * 
 * @author Laura Arevalo
 * @version 1.0 Course : ITEC 3860, Spring, 2016 Written: March 28, 2016
 * 
 * 
 *          This class describes a subclass of BeautyItem called Nailcare
 * 
 *          Purpose: Contains the attributes specific to a type of BeautyItem
 *          called Nailcare.
 *
 */
public class Nailcare extends BeautyItem {
	private String NailcareProductType;

	/**
	 * Method:Nailcare() Constructor method that accepts values for all the
	 * attributes and sets them.
	 *
	 * @param idNumber
	 * @param beautyItemName
	 * @param generalBeautyItemtype
	 * @param numOfBeautyItems
	 * @param brand
	 * @param NailcareProductType
	 * @param colorName
	 * @param colorFamily
	 */

	public Nailcare(int idNumber, String beautyItemName, String brand, String generalBeautyItemType,
			int numOfBeautyItems,  String colorName, String colorFamily, String NailcareProductType) {
		super(idNumber, beautyItemName, brand, generalBeautyItemType, numOfBeautyItems, colorName, colorFamily);
		this.NailcareProductType = NailcareProductType;

	}

	/**
	 * @return the NailcareProductType
	 */
	public String getNailcareProductType() {
		return NailcareProductType;
	}

	/**
	 * @param NailcareProductType
	 *            the NailcareProductType to set
	 */
	public void setNailcareProductType(String NailcareProductType) {
		this.NailcareProductType = NailcareProductType;
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
		return super.toString() + " Nailcare [NailcareProductType=" + NailcareProductType + " Nailcare [colorFamily="
				+ "]";
	}

}
