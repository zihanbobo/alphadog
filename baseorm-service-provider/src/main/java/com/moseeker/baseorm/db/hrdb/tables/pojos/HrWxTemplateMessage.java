/*
 * This file is generated by jOOQ.
*/
package com.moseeker.baseorm.db.hrdb.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 微信模板消息
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HrWxTemplateMessage implements Serializable {

    private static final long serialVersionUID = 127723927;

    private Integer id;
    private Integer sysTemplateId;
    private String  wxTemplateId;
    private Integer display;
    private Integer priority;
    private Integer wechatId;
    private Integer disable;
    private String  url;
    private String  topcolor;
    private String  first;
    private String  remark;

    public HrWxTemplateMessage() {}

    public HrWxTemplateMessage(HrWxTemplateMessage value) {
        this.id = value.id;
        this.sysTemplateId = value.sysTemplateId;
        this.wxTemplateId = value.wxTemplateId;
        this.display = value.display;
        this.priority = value.priority;
        this.wechatId = value.wechatId;
        this.disable = value.disable;
        this.url = value.url;
        this.topcolor = value.topcolor;
        this.first = value.first;
        this.remark = value.remark;
    }

    public HrWxTemplateMessage(
        Integer id,
        Integer sysTemplateId,
        String  wxTemplateId,
        Integer display,
        Integer priority,
        Integer wechatId,
        Integer disable,
        String  url,
        String  topcolor,
        String  first,
        String  remark
    ) {
        this.id = id;
        this.sysTemplateId = sysTemplateId;
        this.wxTemplateId = wxTemplateId;
        this.display = display;
        this.priority = priority;
        this.wechatId = wechatId;
        this.disable = disable;
        this.url = url;
        this.topcolor = topcolor;
        this.first = first;
        this.remark = remark;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSysTemplateId() {
        return this.sysTemplateId;
    }

    public void setSysTemplateId(Integer sysTemplateId) {
        this.sysTemplateId = sysTemplateId;
    }

    public String getWxTemplateId() {
        return this.wxTemplateId;
    }

    public void setWxTemplateId(String wxTemplateId) {
        this.wxTemplateId = wxTemplateId;
    }

    public Integer getDisplay() {
        return this.display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Integer getWechatId() {
        return this.wechatId;
    }

    public void setWechatId(Integer wechatId) {
        this.wechatId = wechatId;
    }

    public Integer getDisable() {
        return this.disable;
    }

    public void setDisable(Integer disable) {
        this.disable = disable;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTopcolor() {
        return this.topcolor;
    }

    public void setTopcolor(String topcolor) {
        this.topcolor = topcolor;
    }

    public String getFirst() {
        return this.first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("HrWxTemplateMessage (");

        sb.append(id);
        sb.append(", ").append(sysTemplateId);
        sb.append(", ").append(wxTemplateId);
        sb.append(", ").append(display);
        sb.append(", ").append(priority);
        sb.append(", ").append(wechatId);
        sb.append(", ").append(disable);
        sb.append(", ").append(url);
        sb.append(", ").append(topcolor);
        sb.append(", ").append(first);
        sb.append(", ").append(remark);

        sb.append(")");
        return sb.toString();
    }
}