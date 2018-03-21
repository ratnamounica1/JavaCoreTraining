package com.SageIT.JavaClasses.CoreJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ser_Deser implements Serializable {

	public static void main(String[] args) throws ClassNotFoundException {

		int i;
		Item[] items = new Item[2];

		Ser_Deser c = new Ser_Deser();
		for (i = 0; i < items.length; i++) {

			items[i] = c.new Item();
		}

		// hard-coded values of id, desc, cost, qty
		items[0].setItemID("ITEM101");
		items[1].setItemID("ITEM102");

		items[0].setDesc("iPad");
		items[1].setDesc("iPhone");

		items[0].setCost(499);
		items[1].setCost(599);

		items[0].setQuantity(1);
		items[1].setQuantity(3);

		System.out.println("Item Details.....");
		for (Item d : items) {
			System.out.print(d.getItemID());
			System.out.print("\t" + d.getDesc());
			System.out.print("\t" + d.getCost());
			System.out.println("\t" + d.getQuantity());
		}

		List<Item> obj;
		obj = new ArrayList<Item>();

		for (i = 0; i < items.length; i++) {
			obj.add(items[i]);
		}

		// Let's serialize an Object
		try {
			FileOutputStream fileOut = new FileOutputStream(
					"\\Users\\neppalliratnamounica\\Desktop\\Ser_Deser.RTF");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			out.close();
			fileOut.close();
			System.out.println("\nSerialization Successful... Checkout your specified output file..\n");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Let's deserialize an Object
		try {
			FileInputStream fileIn = new FileInputStream(
					"\\Users\\neppalliratnamounica\\Desktop\\Ser_Deser.RTF");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			System.out.println("Deserialized Data: \n" + in.readObject().toString());
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public class Item implements Serializable {

		private String itemID;
		private String desc;
		private double cost;
		private int quantity;

		public Item() {
			itemID = "";
			desc = "";
			cost = 0;
			quantity = 0;
		}

		public Item(String id, String d, double c, int q) {
			itemID = id;
			desc = d;
			cost = c;
			quantity = q;

		}

		public String getItemID() {
			return itemID;
		}

		public void setItemID(String itemID) {
			this.itemID = itemID;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public double getCost() {
			return cost;
		}

		public void setCost(double cost) {
			this.cost = cost;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "Item [itemID=" + itemID + ", desc=" + desc + ", cost=" + cost + ", quantity=" + quantity + "]";
		}

	}
}