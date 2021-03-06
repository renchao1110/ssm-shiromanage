package mapper;

import entity.Grade;

import java.util.List;

/**
 * @Author qq_emial1002139909@qq.com
 * @Date 2017/5/8 16:51
 */
public interface GradeMapper {
    public List<Grade> getall();
    public void add(Grade grade);
    public void delete(String grade_id);
    public void update(Grade grade);
    public Grade findById(String grade_id);
    public List<Grade> findbyGradeMapperByMajorId(String gmajor_id);
}
