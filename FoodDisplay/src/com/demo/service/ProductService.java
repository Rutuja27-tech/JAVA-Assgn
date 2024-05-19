package com.demo.service;

import com.demo.dao.ProductDao;
import com.demo.bean.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class ProductService implements IProductService {
	private ProductDao pdao;

	public ProductService() {
		super();
		pdao = new ProductDao();
	}

	@Override
	public boolean addNewProduct() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Pid");
		int pid = sc.nextInt();
		System.out.println("Enter Product Name");
		String nm = sc.next();
		System.out.println("Enter Quantity");
		int qty = sc.nextInt();
		System.out.println("Enter Price");
		float price = sc.nextFloat();
		System.out.println("Enter Expiry Date in format (dd/MM/yyyy)");
		String expdt = sc.next();
		LocalDate ldt = LocalDate.parse(expdt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Product p = new Product(pid, nm, qty, price, ldt);
		
		return pdao.save(p);
	}

	@Override
	public List<Product> displayAll() {
		
		return pdao.findAll();
	}

	@Override
	public Product displayById(int pid) {
		return pdao.findById(pid);
	}

	@Override
	public List<Product> displayByName(String nm) {
		
		
		
		return pdao.findByName(nm);
	}

	@Override
	public List<Product> displayByPrice(float price) {
		
		return pdao.findByPrice(price);
	}

	@Override
	public boolean removeById(int id) {
		
		return pdao.deleteById(id);
	}

	@Override
	public boolean modifyById(int pid, int qty, float price) {
		
		return pdao.updateById(pid,qty,price);
	}

}
