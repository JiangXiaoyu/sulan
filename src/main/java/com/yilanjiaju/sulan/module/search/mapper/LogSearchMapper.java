package com.yilanjiaju.sulan.module.search.mapper;

import com.yilanjiaju.sulan.module.search.pojo.InstanceInfo;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface LogSearchMapper {

     List<InstanceInfo> queryInstanceListByAppId(String appId);
}
