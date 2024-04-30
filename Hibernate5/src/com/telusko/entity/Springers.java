package com.telusko.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Springers {

	     @Id
		@Column(name="SID")
		private Integer id;
		
		@Column(name="SNAME")
		private String name;
		
		@Temporal(TemporalType.DATE)   // THese are for the mapping purpose because we have to mention here whether is date type or time type.
		@Column(name="DATE")
		
		private Date dt1;
		
		@Temporal(TemporalType.TIME)
		@Column(name="TIME")
		private Date dt2;
		
		@Temporal(TemporalType.TIMESTAMP)
		@Column(name="DATETIME")
		private Date dt3;

		
		public Springers() {
			System.out.println("SPringers obje is created"); //This is just to check whether springer object is created or not
		}
		@Override
		public String toString() {
			return "Springers [id=" + id + ", name=" + name + ", dt1=" + dt1 + ", dt2=" + dt2 + ", dt3=" + dt3 + "]";
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getDt1() {
			return dt1;
		}

		public void setDt1(Date dt1) {
			this.dt1 = dt1;
		}

		public Date getDt2() {
			return dt2;
		}

		public void setDt2(Date dt2) {
			this.dt2 = dt2;
		}

		public Date getDt3() {
			return dt3;
		}

		public void setDt3(Date dt3) {
			this.dt3 = dt3;
		}
	}


