package cn.ioms.dubbo.service.impl;

import cn.ioms.dubbo.service.ProviderService;

public class ProviderServiceImpl implements ProviderService{

	@Override
	public void provider() {
		// TODO Auto-generated method stub
		System.out.println("提供者");
	}

	@Override
	public String helloWorld(String str) {
		// TODO Auto-generated method stub
		return "Provider"+str;
	}

}
