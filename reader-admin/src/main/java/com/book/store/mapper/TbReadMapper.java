package com.book.store.mapper;

import com.book.store.model.TbRead;
import com.book.store.model.TbReadExample;
import com.book.store.model.TbReadKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbReadMapper {
    int countByExample(TbReadExample example);

    int deleteByExample(TbReadExample example);

    int deleteByPrimaryKey(TbReadKey key);

    int insert(TbRead record);

    int insertSelective(TbRead record);

    List<TbRead> selectByExample(TbReadExample example);

    TbRead selectByPrimaryKey(TbReadKey key);

    int updateByExampleSelective(@Param("record") TbRead record, @Param("example") TbReadExample example);

    int updateByExample(@Param("record") TbRead record, @Param("example") TbReadExample example);

    int updateByPrimaryKeySelective(TbRead record);

    int updateByPrimaryKey(TbRead record);
}