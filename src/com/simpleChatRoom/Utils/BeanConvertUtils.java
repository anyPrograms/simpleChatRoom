package com.simpleChatRoom.Utils;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BeanConvertUtils {

	public static <T> T copyBean(Object sourceObj, Class<T> targetCls) {
		T targetObj = null;
		if(sourceObj != null){
			try {
				targetObj = BeanUtils.instantiate(targetCls);
				BeanUtils.copyProperties(sourceObj, targetObj);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return targetObj;
	}

	public static <T> List<T> copyList(Collection<?> list, Class<T> targetCls) {
		List<T> result = new ArrayList<T>();
		if (list==null || list.size() == 0) {
			return result;
		}

		for(Object obj : list){
			result.add(copyBean(obj, targetCls));
		}

		return result;
	}

}
