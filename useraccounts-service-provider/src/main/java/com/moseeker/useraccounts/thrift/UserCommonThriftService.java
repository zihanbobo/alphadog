package com.moseeker.useraccounts.thrift;

import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.foundation.wordpress.struct.NewsletterForm;
import com.moseeker.thrift.gen.useraccounts.service.UserCommonService.Iface;
import com.moseeker.useraccounts.service.impl.UserCommonService;

@Service
public class UserCommonThriftService implements Iface {
	
	@Autowired
	UserCommonService userCommonService;

	@Override
	public Response newsletter(NewsletterForm form) throws TException {
		return userCommonService.newsletter(form);
	}
}
