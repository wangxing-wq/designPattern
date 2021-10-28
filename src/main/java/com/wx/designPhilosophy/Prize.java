package com.wx.designPhilosophy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @version 1.0
 * @author 王兴
 * @date 2021/10/27 22:07
 * 奖品
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor()
public class Prize extends Commodity{

	private int count;
	private List<Member> members;

	public Prize(String name, double price, int count, List<Member> members){
		this.setName(name);
		this.setPrice(price);
		this.count = count;
		this.members = members;
	}
	public Prize(String name){
		this.setName(name);
	}

}
