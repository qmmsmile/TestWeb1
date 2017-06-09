package com.qmm.dao.front;

import com.qmm.common.BaseMapper;
import com.qmm.entity.front.Score;
import org.springframework.stereotype.Repository;

@Repository("scoreMapper")
public interface ScoreMapper extends BaseMapper<Score,Integer> {
}