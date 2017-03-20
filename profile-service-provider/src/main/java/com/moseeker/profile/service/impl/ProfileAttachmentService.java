package com.moseeker.profile.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.thrift.TException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moseeker.common.annotation.iface.CounterIface;
import com.moseeker.common.providerutils.bzutils.JOOQBaseServiceImpl;
import com.moseeker.common.util.BeanUtils;
import com.moseeker.db.profiledb.tables.records.ProfileAttachmentRecord;
import com.moseeker.profile.dao.AttachmentDao;
import com.moseeker.profile.dao.ProfileDao;
import com.moseeker.thrift.gen.common.struct.CommonQuery;
import com.moseeker.thrift.gen.common.struct.Response;
import com.moseeker.thrift.gen.profile.struct.Attachment;

@Service
@CounterIface
public class ProfileAttachmentService extends JOOQBaseServiceImpl<Attachment, ProfileAttachmentRecord> {
	
	Logger logger = LoggerFactory.getLogger(ProfileAttachmentService.class);
	
	@Override
	public Response getResources(CommonQuery query) throws TException {
		return super.getResources(query);
	}

	@Override
	public Response postResources(List<Attachment> structs) throws TException {
		Response response = super.postResources(structs);
		if(response != null && response.getStatus() == 0) {
			Set<Integer> profileIds = new HashSet<>();
			for(Attachment attachement : structs) {
				if(attachement.getProfile_id() > 0) {
					profileIds.add(attachement.getProfile_id());
				}
			}
			profileDao.updateUpdateTime(profileIds);
		}
		return response;
	}

	@Override
	public Response putResources(List<Attachment> structs) throws TException {
		Response response = super.putResources(structs);
		updateUpdateTime(structs, response);
		return response;
	}

	@Override
	public Response delResources(List<Attachment> structs) throws TException {
		Response response = super.delResources(structs);
		updateUpdateTime(structs, response);
		return response;
	}
	
	@Override
	public Response postResource(Attachment struct) throws TException {
		Response response = super.postResource(struct);
		if(response != null && response.getStatus() == 0) {
			Set<Integer> profileIds = new HashSet<>();
			profileIds.add(struct.getProfile_id());
			profileDao.updateUpdateTime(profileIds);
		}
		return response;
	}

	@Override
	public Response putResource(Attachment struct) throws TException {
		Response response =  super.putResource(struct);
		updateUpdateTime(struct, response);
		return response;
	}

	@Override
	public Response delResource(Attachment struct) throws TException {
		Response response = super.delResource(struct);
		updateUpdateTime(struct, response);
		return response;
	}

	@Autowired
	private AttachmentDao dao;
	
	@Autowired
	private ProfileDao profileDao;
	
	public AttachmentDao getDao() {
		return dao;
	}

	public void setDao(AttachmentDao dao) {
		this.dao = dao;
	}

	public ProfileDao getProfileDao() {
		return profileDao;
	}

	public void setProfileDao(ProfileDao profileDao) {
		this.profileDao = profileDao;
	}

	@Override
	protected void initDao() {
		super.dao = this.dao;
	}

	@Override
	protected Attachment DBToStruct(ProfileAttachmentRecord r) {
		return (Attachment)BeanUtils.DBToStruct(Attachment.class, r);
	}

	@Override
	protected ProfileAttachmentRecord structToDB(Attachment attachment) throws ParseException {
		return (ProfileAttachmentRecord)BeanUtils.structToDB(attachment, ProfileAttachmentRecord.class);
	}
	
	private void updateUpdateTime(List<Attachment> attachments, Response response) {
		if(response.getStatus() == 0) {
			HashSet<Integer> attachmentIds = new HashSet<>();
			attachments.forEach(attachment -> {
				attachmentIds.add(attachment.getId());
			});
			dao.updateProfileUpdateTime(attachmentIds);
		}
	}
	
	private void updateUpdateTime(Attachment attachment, Response response) {
		if(response.getStatus() == 0) {
			List<Attachment> attachments = new ArrayList<>();
			attachments.add(attachment);
			updateUpdateTime(attachments, response);
		}
	}
}