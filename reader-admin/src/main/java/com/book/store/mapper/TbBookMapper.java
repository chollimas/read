package com.book.store.mapper;

import com.book.store.model.TbBook;
import com.book.store.model.TbBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBookMapper {
    int countByExample(TbBookExample example);

    int deleteByExample(TbBookExample example);

    int deleteByPrimaryKey(String bookId);

    int insert(TbBook record);

    int insertSelective(TbBook record);

    List<TbBook> selectByExample(TbBookExample example);

    TbBook selectByPrimaryKey(String bookId);

    int updateByExampleSelective(@Param("record") TbBook record, @Param("example") TbBookExample example);

    int updateByExample(@Param("record") TbBook record, @Param("example") TbBookExample example);

    int updateByPrimaryKeySelective(TbBook record);

    int updateByPrimaryKey(TbBook record);
}