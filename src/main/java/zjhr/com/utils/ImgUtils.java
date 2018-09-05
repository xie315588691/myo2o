package zjhr.com.utils;

import java.io.File;

import javax.imageio.ImageIO;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

public class ImgUtils {
	
	public static void main(String[] args) throws Exception {
		String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
		System.out.println(basePath);
		Thumbnails.of(new File("E:/myImg/timg.jpg"))
			.size(200, 200)
				.watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("E:/myImg/123.png")), 0.5f)
				.outputQuality(0.2f).toFile("E:/myImg/timg2.jpg");
	}

}
