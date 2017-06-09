package com.qmm.front.service.impl;

import com.qmm.front.dao.ScoreMapper;
import com.qmm.front.entity.Score;
import com.qmm.front.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/6/9.
 */

@Service("ScoreService")
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public Score getScore(Integer id) {
        return this.scoreMapper.selectByPrimaryKey(id);
    }

}
