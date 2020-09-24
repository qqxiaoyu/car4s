package com.xiaoyu.car4s.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.xiaoyu.car4s.entity.Menu;

public interface MenuMapper {

	List<Menu> menuAll(Map<String, Object> map);
	
	@Insert("insert into t_4s_menu(name,url,parent_id,use_flag,del_flag,mlevel) "
			+ "values(#{name},#{url},#{parentId},#{useFlag},#{delFlag},#{mlevel})")
	void save(Menu menu);
	
	@Select("select * from t_4s_menu where id=#{id}")
	Menu findMenu(Integer id);
	
	@Update("update t_4s_menu set name=#{name},url=#{url},parent_id=#{parentId},use_flag=#{useFlag} where id=#{id}")
	void update(Menu menu);
	
	void deleteMenu(String[] ids);
	
	@Select("select * from t_4s_menu")
	List<Menu> menuParent();
}
