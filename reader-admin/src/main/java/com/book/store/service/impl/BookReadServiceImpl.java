package com.book.store.service.impl;

import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.store.mapper.TbBookMapper;
import com.book.store.mapper.TbReadMapper;
import com.book.store.model.TbBook;
import com.book.store.model.TbRead;
import com.book.store.model.TbReadKey;
import com.book.store.service.BookReadService;
import com.book.store.util.FileUtil;

@Service
public class BookReadServiceImpl implements BookReadService {

	@Autowired
	TbBookMapper bookMapper;

	@Autowired
	TbReadMapper readMapper;

	@Override
	public Map<String, Object> readPosition(Map<String, Object> context) {
		Map<String, Object> result = null;
		String fileName = getFileName(context);
		if (null == fileName) {
			return result;
		}

		long offset = (long) context.get("currentPosition");
		try {
			result = FileUtil.readFile(fileName, (int) offset, (int) context.get("pageSize"),
					(int) context.get("isNext"));
			recordRead((String) context.get("bookId"), (String) context.get("openid"),
					String.valueOf(result.get("currentPosition")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	private String getFileName(Map<String, Object> context) {
		TbBook book = bookMapper.selectByPrimaryKey((String) context.get("bookId"));
		return book.getPath();
	}

	private void recordRead(String bookId, String openid, String currentPosition) {
		TbReadKey key = new TbReadKey();
		key.setBookId(bookId);
		key.setOpenid("oVb0p48nf362o7YYeQSLSH9MGOnU");
		TbRead read = readMapper.selectByPrimaryKey(key);
		TbRead record = new TbRead();
		record.setBookId(bookId);
		record.setOpenid("oVb0p48nf362o7YYeQSLSH9MGOnU");
		record.setCurrentPosition(currentPosition);
		if (read == null) {
			readMapper.insert(record);
		} else {
			readMapper.updateByPrimaryKey(record);
		}
	}
}
