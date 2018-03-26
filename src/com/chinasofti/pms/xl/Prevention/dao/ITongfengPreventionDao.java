package com.chinasofti.pms.xl.Prevention.dao;

import java.util.List;

import com.chinasofti.pms.xl.Prevention.entity.Tongfeng;

/**
 * ClassName:TongfengDao
 * Function: TODO ADD FUNCTION
 * Reason:	 TODO ADD REASON
 *
 * @author   xl
 * @version  
 * @since    Ver 1.1
 * @Date	 2018��1��26��		����9:25:42
 *
 * @see 	 
 *  
 */
public interface ITongfengPreventionDao {
	public List<Tongfeng> showTongfengDaily();
	public List<Tongfeng> showTongfengWeekly();
	public List<Tongfeng> showTongfengMonthly();
	public boolean insertTongfeng(Tongfeng tongfeng);
	public List<Tongfeng> showTongfeng();
	public List<Tongfeng> showTongfengToOne();
	public boolean updateTongfeng(Tongfeng tongfeng);
}

