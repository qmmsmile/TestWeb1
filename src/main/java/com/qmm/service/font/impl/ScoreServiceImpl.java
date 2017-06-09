package com.qmm.service.font.impl;

import com.qmm.dao.font.ScoreMapper;
import com.qmm.entity.font.Score;
import com.qmm.service.font.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/9.
 */

@Service("ScoreService")
public class ScoreServiceImpl implements ScoreService{

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public Score getScore(Integer id) {
        return this.scoreMapper.selectByPrimaryKey(id);
    }

}
