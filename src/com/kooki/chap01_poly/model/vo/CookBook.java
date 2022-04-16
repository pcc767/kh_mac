package com.kooki.chap01_poly.model.vo;

public class CookBook extends Book {
	private boolean coupon; // �丮�п� ��������

	public CookBook(boolean coupon) {
		super();
		this.coupon = coupon;
	}

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	public boolean isCoupon() {
		return coupon;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", coupon=" + coupon + "]";
	}
	
	
}
