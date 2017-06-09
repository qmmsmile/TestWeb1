package com.qmm.service.front.impl;

import com.qmm.dao.front.ScoreMapper;
import com.qmm.entity.front.Score;
import com.qmm.service.front.ScoreService;
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
