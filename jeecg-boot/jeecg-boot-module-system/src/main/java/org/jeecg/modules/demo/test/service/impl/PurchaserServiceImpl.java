package org.jeecg.modules.demo.test.service.impl;

import org.jeecg.modules.demo.test.entity.Purchaser;
import org.jeecg.modules.demo.test.mapper.PurchaserMapper;
import org.jeecg.modules.demo.test.service.IPurchaserService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @Description: 订购企业信息表
 * @Author: jeecg-boot
 * @Date:   2019-10-12
 * @Version: V1.0
 */
@Service
public class PurchaserServiceImpl extends ServiceImpl<PurchaserMapper, Purchaser> implements IPurchaserService {

}
