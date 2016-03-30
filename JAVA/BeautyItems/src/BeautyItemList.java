
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BeautyItemList {
	private ArrayList<BeautyItem> beautyItemList = new ArrayList<BeautyItem>();

	public BeautyItemList() {
		// read some Beauty Products from a file
		// open text file
		File beautyItemListFile = new File("beauty.txt");
		// open a Scanner to read data from File
		Scanner beautyItemReader = null;
		try {
			beautyItemReader = new Scanner(beautyItemListFile);
		} catch (FileNotFoundException e) {

			System.out.println("No Inventory Item found- Inventory is empty");

		}

		// read one item at a time
		while (beautyItemReader != null && beautyItemReader.hasNext()) {

			String type = beautyItemReader.nextLine();
			String beautyItemName = beautyItemReader.nextLine();
			String idString = beautyItemReader.nextLine();
			int idNumber = Integer.parseInt(idString);
			String numItemsString = beautyItemReader.nextLine();
			int numBeautyItems = Integer.parseInt(numItemsString);
			String brand = beautyItemReader.nextLine();
			String colorName = beautyItemReader.nextLine();
			String colorFamily = beautyItemReader.nextLine();
			String productType = beautyItemReader.nextLine();

			if (type.equalsIgnoreCase("Skincare")) {
				
				Skincare product = new Skincare(idNumber, beautyItemName, brand, type, numBeautyItems, colorName,
						colorFamily, productType);

				beautyItemList.add(product);

			} else if (type.equalsIgnoreCase("Nailcare")) {
				
				Nailcare product = new Nailcare(idNumber, beautyItemName, brand, type, numBeautyItems, colorName,
						colorFamily, productType);

				beautyItemList.add(product);

			} else if (type.equalsIgnoreCase("Haircare")) {
				
				Haircare product = new Haircare(idNumber, beautyItemName, brand, type, numBeautyItems, colorName,
						colorFamily, productType);

				beautyItemList.add(product);

			} else if (type.equalsIgnoreCase("Makeup")) {
				
				Makeup product = new Makeup(idNumber, beautyItemName, brand, type, numBeautyItems, colorName,
						colorFamily, productType);

				beautyItemList.add(product);

			} else {
				System.out.println("Unknown BeautyItem type " + type);
			}

		}

	}

	public ArrayList<BeautyItem> getList() {
		return beautyItemList;
	}
}
