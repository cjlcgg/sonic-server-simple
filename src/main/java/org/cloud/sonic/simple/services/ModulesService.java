package org.cloud.sonic.simple.services;

import com.baomidou.mybatisplus.extension.service.IService;
import org.cloud.sonic.simple.models.domain.Modules;

import java.util.List;

public interface ModulesService extends IService<Modules> {

    boolean delete(int id);

    List<Modules> findByProjectId(int projectId);

    Modules findById(int id);

    boolean deleteByProjectId(int projectId);
}
