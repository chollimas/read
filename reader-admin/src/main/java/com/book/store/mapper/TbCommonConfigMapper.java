package com.book.store.mapper;

import com.book.store.model.TbCommonConfig;
import com.book.store.model.TbCommonConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommonConfigMapper {
    int countByExample(TbCommonConfigExample example);

    int deleteByExample(TbCommonConfigExample example);

    int deleteByPrimaryKey(String commonConfigId);

    int insert(TbCommonConfig record);

    int insertSelective(TbCommonConfig record);

    List<TbCommonConfig> selectByExample(TbCommonConfigExample example);

    TbCommonConfig selectByPrimaryKey(String commonConfigId);

    int updateByExampleSelective(@Param("record") TbCommonConfig record, @Param("example") TbCommonConfigExample example);

    int updateByExample(@Param("record") TbCommonConfig record, @Param("example") TbCommonConfigExample example);

    int updateByPrimaryKeySelective(TbCommonConfig record);

    int updateByPrimaryKey(TbCommonConfig record);
}