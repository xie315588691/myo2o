package zjhr.com.utils;

public class PathUtils {
	private static String seperatpor =System.getProperty("file.separator");
	/**
	 * 返回项目图片的根路径
	 * @return
	 */
	public static String getImgBasePath(){
		String os = System.getProperty("os.name");
		String basePath ="";
		if(os.toLowerCase().startsWith("win")){
			basePath ="F:/myImage";
		}else{
			basePath="/home/";
		}
		basePath = basePath.replace("/", seperatpor);
		
		return basePath;
	}
	/*
	 * 根据不同的要求返回项目的子路径
	 * */
	public static String getShopImagePath(long shopId){
		String imagePath ="/upload/item/shop/"+shopId +"/";
		
		return imagePath.replace("/", seperatpor);
	}
	

}
