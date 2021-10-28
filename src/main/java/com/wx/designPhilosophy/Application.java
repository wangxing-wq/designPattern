package com.wx.designPhilosophy;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * @version 1.0
 * @author 王兴
 * @date 2021/10/27 22:09
 */
public class Application {

	public static void main(String[] args) {
		//有个三个步骤
		//1. 传入参数,奖品,参与会员,抽奖人数,抽奖方式
		List<Member> members = Lists.newArrayList(new Member("王兴","河南"),
				new Member("宋鼎","河南"),
				new Member("小龙","河南"));
		List<Prize> prizes = Lists.newArrayList(
				new Prize("布加迪威龙",999.9D,1,Lists.newArrayList()),
				new Prize("布加迪威龙模型机",99.9D,2,Lists.newArrayList()),
				new Prize("布加迪威龙plus",9999.9D,3,Lists.newArrayList())
		);
		List<Prize> draw = DrawUtil.draw(prizes,members, new DrawHandler() {
			@Override
			public List<Prize> handler(List<Prize> prizes, List<Member> members) {
				int sum = prizes.stream().mapToInt(Prize::getCount).sum();
				boolean flag = sum > members.size();
				System.out.println(sum);
				Random random = new Random();
				for (int i = 0; i < prizes.size(); i++) {
					for (int j = 0; j < prizes.get(i).getCount(); j++) {
						if (flag){
							// TODO 非去重话处理
							Member member = members.get(random.nextInt(members.size()));
							prizes.get(i).getMembers().add(member);
						}else{
							//去重化处理
							Member member = members.get(random.nextInt(members.size()));
							prizes.get(i).getMembers().add(member);
						}
					}
				}
				return prizes;
			}
		});
		for (Prize prize : draw) {
			System.out.println(prize);
		}
	}

}
