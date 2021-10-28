package com.wx.designPhilosophy;

import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * @version 1.0
 * @author 王兴
 * @date 2021/10/27 22:10
 */
public class DrawUtil {


	public static List<Prize> draw(List<Prize> prizes, List<Member> members, DrawHandler drawHandler){
		if (CollectionUtils.isEmpty(prizes)){
			System.out.println("price 为空" + prizes);
		}
		if (CollectionUtils.isEmpty(members)){
			System.out.println("members 为空" + members);
		}
		return drawHandler.handler(prizes, members);
	}

}
