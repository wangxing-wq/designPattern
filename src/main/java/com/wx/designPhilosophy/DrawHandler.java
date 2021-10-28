package com.wx.designPhilosophy;

import java.util.List;

/**
 * @version 1.0
 * @author 王兴
 * @date 2021/10/27 23:04
 */
public interface DrawHandler {

	public List<Prize> handler(List<Prize> prizes, List<Member> members);

}
