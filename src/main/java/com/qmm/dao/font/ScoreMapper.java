package com.qmm.dao.font;

import com.qmm.common.BaseMapper;
import com.qmm.entity.font.Score;
import org.springframework.stereotype.Repository;

@Repository("scoreMapper")
public interface ScoreMapper extends BaseMapper<Score,Integer> {
}