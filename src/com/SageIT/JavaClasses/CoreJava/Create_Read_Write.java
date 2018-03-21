package com.SageIT.JavaClasses.CoreJava;
import java.io.*;

public class Create_Read_Write
{
public static void main(String[] args)throws Exception
{

File file = new File("\\Users\\neppalliratnamounica\\Desktop\\test.docx");

BufferedReader br = new BufferedReader(new FileReader(file));

String st;
while ((st = br.readLine()) != null)
 System.out.println(st);
}
}


