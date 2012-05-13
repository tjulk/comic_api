package com.nodejs.comicapi;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;

import com.nodejs.comicapi.model.Classify;

public class API {
	
	/**
	 * 返回分类列表
	 * TODO 现在为array保存类别，/分隔符第一个为类别，其余为每一类别对应列表
	 * @return
	 */
	public static List<Classify> getClassifies(Context context) {
		List<Classify> classifies = new ArrayList<Classify>();
		String[] classifyStrings = context.getResources().getStringArray(R.array.ClassifyList);
		for (String classifyString : classifyStrings) {
			String[] classifyLists = classifyString.split("/");
			final Classify classify = new Classify();
			classify.type = classifyLists[0];
			for (int i = 1 ; i < classifyLists.length ;i++) {
				classify.names.add(classifyLists[i]);
			}
			classifies.add(classify);
		}
		return classifies;
	}

}
