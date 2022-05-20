package com.spring.web.model;

public class Criteria {
	
	  /* ���� ������ */
    private int pageNum;
    
    /* �� ������ �� ������ �Խù� ���� */
    private int amount;
    
    /* ��ŵ �� �Խù� ��( (pageNum-1) * amount ) */
    private int skip;
    
    /* �⺻ ������ -> �⺾ ���� : pageNum = 1, amount = 10 */
    public Criteria() {
        this(1,10);
        this.skip = 0;
    }
    
    
    /* ������ => ���ϴ� pageNum, ���ϴ� amount */
    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
        this.skip = (pageNum-1)*amount;
    }

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.skip = (pageNum-1) * this.amount;
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.skip = (this.pageNum-1) * amount;
		this.amount = amount;
	}
	
	
	public int getSkip() {
		return skip;
	}

	public void setSkip(int skip) {
		this.skip = skip;
	}

	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", getPageNum()=" + getPageNum()
				+ ", getAmount()=" + getAmount() + "]";
	}
    
    
}