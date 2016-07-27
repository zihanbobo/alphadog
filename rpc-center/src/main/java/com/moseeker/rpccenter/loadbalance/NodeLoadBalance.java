package com.moseeker.rpccenter.loadbalance;

import java.util.HashMap;

import com.moseeker.rpccenter.listener.ZKPath;

public enum NodeLoadBalance {

	LoadBalance;

	private HashMap<String, Integer> index = new HashMap<>();

	public ZKPath getNextNode(ZKPath root, String name) {
		ZKPath node = null;
		if (root != null && root.getChirldren() != null && root.getChirldren().size() > 0) {
			for (ZKPath parentPath : root.getChirldren()) {
				if (parentPath.getName().equals(name) && parentPath.getChirldren() != null
						&& parentPath.getChirldren().size() > 0) {
					if(!index.containsKey(name)) {
						index.put(name, 0);
					}
					int position = index.get(name);
					node = parentPath.getChirldren().get(position);
					System.out.println("loadbalance position:"+position);
					System.out.println(node);
					if(position+1 >= parentPath.getChirldren().size()) {
						index.put(name, 0);
					} else {
						index.put(name, position+1);
					}
				}
			}
		}
		return node;
	}
}
