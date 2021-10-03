package com.example.soapside.service;

import org.springframework.data.annotation.Id;

import javax.xml.bind.annotation.XmlElement;

public class User {

        protected String name;
        @Id
        protected int empId;
        protected double salary;

        /**
         * Gets the value of the name property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the empId property.
         *
         */
        public int getEmpId() {
            return empId;
        }

        /**
         * Sets the value of the empId property.
         *
         */
        public void setEmpId(int value) {
            this.empId = value;
        }

        /**
         * Gets the value of the salary property.
         *
         */
        public double getSalary() {
            return salary;
        }

        /**
         * Sets the value of the salary property.
         *
         */
        public void setSalary(double value) {
            this.salary = value;
        }



}
