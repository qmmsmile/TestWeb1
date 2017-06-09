package com.qmm.front.dao;

import com.qmm.common.BaseMapper;
import com.qmm.front.entity.Score;
import org.springframework.stereotype.Repository;

@Repository("scoreMapper")
public interface ScoreMapper extends BaseMapper<Score,Integer> {
}