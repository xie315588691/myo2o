package zjhr.com.utils;

import java.io.File;

import javax.imageio.ImageIO;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImgUtils {
	
	private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
	
	/**
	 * 列缩图
	 */
	public static String generateThmbnail(CommonsMultipartFile thumbnail,String targetAddr){
		String realFileName = IDUtils.genImageName();
		//扩展名
		String extension = getFileExtension(thumbnail);
		//目录名称
		makeDirPath(targetAddr);
		//相对路径
		String relativeAddr =targetAddr+realFileName+extension;
		//新的文件的路径
		File dest = new File(PathUtils.getImgBasePath()+relativeAddr);
		try{
			Thumbnails.of(thumbnail.getInputStream()).size(200,200)
			.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath+"/123.png")), 0.5f)
			.outputQuality(0.8f).toFile(dest);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return relativeAddr;
	}
	
	
	/**
	 * 获取输入文件流的扩展名
	 * @param args
	 */
	
	public static String getFileExtension(CommonsMultipartFile cFile){
		String originalfileName =cFile.getOriginalFilename();
		return originalfileName.substring(originalfileName.lastIndexOf("."));
	}
	
	/**
	 * 创建目标路径所涉及到的目录，即/home/work/xiangze/xx.jpg,
	 * /home/work/xiangze/自动创建
	 * @param args
	 */
	public static void makeDirPath(String stargetAddr){
		String realParentPath = PathUtils.getImgBasePath()+stargetAddr;
		File dirPath = new File(realParentPath);
		if (!dirPath.exists()) {
			dirPath.mkdirs();
		}
	}
	
	/*public static void main(String[] args) throws Exception {
		System.out.println(basePath);
		Thumbnails.of(new File("E:/myImg/timg.jpg"))
			.size(200, 200)
				.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("E:/myImg/123.png")), 0.5f)
				.outputQuality(0.2f).toFile("E:/myImg/timg2.jpg");
	}*/

}
