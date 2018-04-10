package com.jk.service.impl;


import com.jk.dao.TypeDao;
import com.jk.model.T_Type;
import com.jk.service.TypeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by 我？ on 2018/4/10.
 */
@Service("typeService")
public class TypeServiceImpl implements TypeService{
    @Autowired
    private TypeDao typeDao;

    public List<T_Type> querytype() {
        List<T_Type> typelist=typeDao.querytype();
        return typelist;
    }
}
