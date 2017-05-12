package service.impl;

import mapper.RoleMapper;
import entity.Role;
import service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 角色Service实现类
 *
 * @author StarZou
 * @since 2014年6月10日 下午4:16:33
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleMapper roleMapper;


    public List<Role> selectRolesByUserId(Long userId) {
        return roleMapper.selectRolesByUserId(userId);
    }

}
