package com.spring.web.model;

import java.util.Date;

public class MemberVO {
	/* ȸ�� ��ȣ */
    private int bno;
    
    /* ���̵� */
    private String id;
    
    /* ��й�ȣ */
    private String password;
    
    /* �г��� */
    private String nickname;
    
    /* ��� ��¥ */
    private Date regdate;
    
    /* ���� ��¥ */
    private Date updateDate;

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		return "MemberVO [bno=" + bno + ", id=" + id + ", password=" + password + ", nickname=" + nickname
				+ ", regdate=" + regdate + ", updateDate=" + updateDate + ", getBno()=" + getBno() + ", getId()="
				+ getId() + ", getPassword()=" + getPassword() + ", getNickname()=" + getNickname() + ", getRegdate()="
				+ getRegdate() + ", getUpdateDate()=" + getUpdateDate() + "]";
	}
    
    
}