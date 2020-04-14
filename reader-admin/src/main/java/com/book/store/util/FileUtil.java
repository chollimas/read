package com.book.store.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @ClassName: FileUtil
 * @Description: 文件操作类
 * @author: king
 * @Version 1.0
 * @date: 2020年1月4日 上午7:18:37
 */
public class FileUtil {
	private static final Logger LOG = LoggerFactory.getLogger(FileUtil.class);

	/**
	 * 
	 * @Title: readFile
	 * @Description: 按指定位置读取文件
	 * @param fileName
	 * @param offset
	 * @return
	 * @throws IOException Map<String,Object>
	 * @author king
	 * @date 2020年1月4日 下午8:37:55
	 */
	public static Map<String, Object> readFile(String fileName, int offset, int pageSize, int next) throws IOException {
		Map<String, Object> result = new HashMap<String, Object>(2);

		File f = new File(fileName);
		long size = 0;
		if (!f.exists()) {
			LOG.error(fileName + " is not exists.");
			return result;
		}
		size = f.length();
		FileInputStream fi = new FileInputStream(f);

		InputStreamReader isr = new InputStreamReader(fi, "utf-8");
		char[] cbuf = new char[pageSize];
		if (next == 0) {
			offset = offset - pageSize * 2;
			if (offset < 0) {
				offset = 0;
			}
		}
		isr.skip(offset);
		int length = isr.read(cbuf, 0, pageSize);

		int curOffset = offset + length;

		isr.close();
		fi.close();
		result.put("currentPosition", curOffset);
		result.put("content", new String(cbuf));
		result.put("wordCount", size);
		result.put("pages", size / pageSize);
		return result;
	}
}
