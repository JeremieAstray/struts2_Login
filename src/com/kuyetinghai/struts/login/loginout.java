package com.kuyetinghai.struts.login;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class loginout extends ActionSupport implements SessionAware {
	Map<String, Object> session;

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
		if(!this.session.isEmpty())
			this.session.clear();
	}
}
