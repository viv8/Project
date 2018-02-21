package com.employee;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class EmpTest 
{
	private static final String MALE = "male";
	public static Map<Integer, EmpDto> map1 = new TreeMap<Integer, EmpDto>();// id,emp
	public static Map<String, Integer> map2 = new TreeMap<String, Integer>();// mailid,id
	public static Map<String,Integer> map3 = new TreeMap<String,Integer>();// gender,empid
	public static void main(String[] args) 
	{
		while (true) 
		{
			@SuppressWarnings("resource")
			Scanner scn = new Scanner(System.in);
			System.out.println("welcome !!!");
			System.out.println("enter 1 to add data");
			System.out.println("enter 2 to modify data");
			System.out.println("enter 3 to delete data");
			System.out.println("enter 4 to read data");
			while (true) 
			{
				try 
				{
					int n1 = scn.nextInt();
					switch (n1) 
					{
						case 1:
							EmpDto emp1 = new EmpDto();
							// setting id
							System.out.println("enter the id of new employee");
							int id = scn.nextInt();
							if (verifyId(id)) 
							{
								emp1.setId(id);
								System.out.println("id set success fullly");
							}
							// setting name
							System.out.println("enter the name of new employee");
							scn.nextLine();
							String nameString = scn.nextLine();
							nameString = nameString.replaceAll("[0-9]", "");
							nameString = nameString.replaceAll("( )+", " ");
							emp1.setName(nameString);
							System.out.println("name setted successfully");
							// setting mailid
							System.out.println("enter the mailid of new employee");
							String emailString = scn.next();
							if (verifyMailId(emailString)) 
							{
								emp1.setMailid(emailString);
								System.out.println("email id setted");
							}
							// setting dob
							System.out.println("enter the DOB of new employee");
							System.out.println("enter dob in dd/mm/yyyy format");
							String dobString = scn.next();
							emp1.setDob(verifyDob(dobString));
							System.out.println("dob setted successfully");
							// setting salary
							System.out.println("enter sallary of employee");
							double salDouble = scn.nextDouble();
							emp1.setSal(salDouble);
							System.out.println("sal setted success fully");
							// setting gender
							System.out.println("enter the gender of employee");
							String genderString = scn.next();
							if (verifyGender(genderString)) 
							{
								emp1.setGender(genderString);
								System.out.println("gender setted successfully");
							} 
							else
							{
								throw new EmployeeException("enter valid data");
							}
							map1.put(emp1.getId(), emp1);
							map2.put(emp1.getMailid(), emp1.getId());
							map3.put(emp1.getGender(),emp1.getId());
						
							System.out.println("all data entered and validated");
							break;
					
					case 2:
						System.out.println("data modification section");
						System.out.println("enter the id whose data you want to modify");
						int num2 = scn.nextInt();
						if(map1.containsKey(num2))
						{
							EmpDto emp2=map1.get(num2);
								while (true) 
								{
									System.out.println("old name is: "+ emp2.getName());
									System.out.println("press 1 to change name");
									int num7 = scn.nextInt();
									if (num7 == 1) 
									{
										System.out.println("enter new name");
										scn.nextLine();
										String nameString1 = scn.nextLine();
										nameString1 = nameString1.replaceAll(
												"[0-9]", "");
										emp2.setName(nameString1);
										System.out.println("name changed !!");
										break;
									} 
									else 
									{
										throw new EmployeeException(
												"plz give valid input");
									}
								}
								while (true) 
								{
									System.out.println("old mail id is: "+ emp2.getMailid());
									System.out.println("press 1 to change mailid");
									int num7 = scn.nextInt();
									if (num7 == 1) 
									{
										System.out.println("enter new mailid");
										String emailString1 = scn.next();
										if (verifyMailId(emailString1)) 
										{
											emp2.setMailid(emailString1);
											System.out.println("mail id changed");
											break;
										} 
										else 
										{
											throw new EmployeeException("invalid mailid");
										}
									} 
									else 
									{
										throw new EmployeeException("invalid entry");
									}
								}
								while (true) 
								{
									System.out.println("old dob is: "+ emp2.getDob());
									System.out.println("press 1 to change");
									int num7 = scn.nextInt();
									if (num7 == 1) 
									{
										System.out.println("enter new dob");
										System.out.println("enter dob format in dd/mm/yyyy");
										String dobString1 = scn.next();
										emp2.setDob(verifyDob(dobString1));
										System.out.println("date changed");
										break;
									} 
									else 
									{
										throw new EmployeeException("invalid entry by user");
									}
								}
								while (true) 
								{
									System.out.println("old sal is: "+ emp2.getSal());
									System.out.println("press 1 to change");
									int num7 = scn.nextInt();
									if (num7 == 1) 
									{
										System.out.println("enter new sal");
										double salDouble1 = scn.nextDouble();
										emp2.setSal(salDouble1);
										System.out.println("sal changed");
										break;
									}
									else 
									{
										throw new EmployeeException("invalid entry by user");
									}
								}
								while (true) 
								{
									System.out.println("old gender is: "+ emp2.getGender());
									System.out.println("press 1 to change");
									int num7 = scn.nextInt();
									if (num7 == 1) 
									{
										System.out.println("enter new gender");
										String genString1 = scn.next();
										if (verifyGender(genString1)) 
										{
											emp2.setGender(genString1);
											System.out.println("gender changed successfully");
											break;
										} 
										else 
										{
											throw new EmployeeException("enter proper gender data");
										}
									} 
									else 
									{
										throw new EmployeeException("enter proper data");
									}
								}
							}
						
						break;

					case 3:
						System.out.println("data deletion section");
						System.out.println("press 1 to enter the id of the person");
						System.out.println("press 2 to enter the mailid of the person");
						int num4 = scn.nextInt();
						switch (num4)
						{
						case 1:
							System.out.println("enter the id");
							int num5 = scn.nextInt();
							if(map1.containsKey(num5))
							{	
								map1.remove(num5);
								System.out.println("data deleted");
								break;
							}
							else
							{
								System.out.println("invalid id entered");
							}
							break;

						case 2:
							System.out.println("enter the mailid");
							String str1 = scn.next();
							for (Map.Entry<Integer, EmpDto> entry : map1.entrySet()) 
							{
								EmpDto emp2 = entry.getValue();
								if (emp2.getMailid().equals(str1)) 
								{
									map1.remove(entry.getKey());
									System.out.println("data deleted");
									break;
								}
							}
							break;

						default:
							System.out.println("invalid entry");
							break;
						}
						break;
					case 4:
						System.out.println("date reading zone");
						System.out.println("enter 1 to read according to id");
						System.out.println("enter 2 to read all data");
						System.out.println("enter 3 to read according to gender");
						int num6 = scn.nextInt();
						switch (num6) 
						{
						case 1:
							System.out.println("enter id of the employee");
							int id2 = scn.nextInt();
							for (Map.Entry<Integer,EmpDto> entry3 : map1.entrySet()) 
							{
								if (entry3.getValue().getId() == id2) 
									System.out.println(entry3.getValue());
							}
							
							System.out.println("========================");
							break;
						case 2:
							System.out.println("showing all emp details");
							for (Map.Entry<Integer,EmpDto> entry3 : map1.entrySet()) 
							{
								System.out.println(entry3.getValue());
								System.out.println("-----------------------------");
							}
							System.out.println("========================");
							break;

						case 3:
							System.out.println("press 1 to see all male emp details");
							System.out.println("press 2 to see all female emp details");
							System.out.println("press 3 to see all transgender emp details");
							int num8=scn.nextInt();
							if(num8==1)
							{
								System.out.println("showing all male emp details");
								System.out.println("========================");
								for (Map.Entry<Integer, EmpDto> entry3 : map1.entrySet()) 
								{
									if (entry3.getValue().getGender().equals(MALE)) 
									{
										System.out.println(entry3.getValue());
										System.out.println("-----------------------------");
									}
								}
							}
							else if(num8==2)
							{
								System.out.println("showing all fe-male emp details");
								System.out.println("========================");
								for (Map.Entry<Integer, EmpDto> entry3 : map1.entrySet()) 
								{
									if (entry3.getValue().getGender().equals("female")) 
									{
										System.out.println(entry3.getValue());
										System.out.println("-----------------------------");
									}
								}
							}
							else if(num8==3)
							{
								System.out.println("showing all transgender emp details");
								System.out.println("========================");
								for (Map.Entry<Integer, EmpDto> entry3 : map1.entrySet()) 
								{
									if (entry3.getValue().getGender().equals("transgender")) 
									{
										System.out.println(entry3.getValue());
										System.out.println("-----------------------------");
									}
								}
							}
							else
							{
								System.out.println("invalid gender data entry!!");
								throw new EmployeeException("invalid gender entry");
							}
							
							break;

						default:
							System.out.println("invalid entry");
							break;
					}
					break;

					default:
						System.out.println("plz do valid entry");
						break;
				}
			} 
				
			catch (EmployeeException e) 
			{
				System.out.println("plz enter valid data");
				break;
			} 
				catch (Exception e) 
				{
					System.out.println("plz enter valid data");
					break;
				}
				break;
			}
		}
	}

	public static boolean verifyMailId(String mail1) throws EmployeeException 
	{
		String emailregex = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Boolean boolean0 = mail1.matches(emailregex);
		if (boolean0) 
		{
			if(map2.containsKey(mail1))
			{
				System.out.println("data already exists");
				throw new EmployeeException("data already exists");
			}
			return true;
		}
		else if (boolean0 == false) 
		{
			System.out.println("plz enter a valid email");
			throw new EmployeeException("invalid email id");
		}
		return false;
	}
	
	public static Date verifyDob(String dob1) throws EmployeeException 
	{
		DateFormat formatter1 = new SimpleDateFormat("dd/MM/yyyy");
		formatter1.setLenient(false);
		Date dobString2;
		try 
		{
			String dob2=dob1.substring(6,10);
			int num1=Integer.parseInt(dob2);
			if(num1>2016)
			{
				System.out.println("put date before 2016");
				throw new EmployeeException("put proper date");
			}
			dobString2 = formatter1.parse(dob1);
		} 
		catch (ParseException e) 
		{
			System.out.println("invalid data entry");
			throw new EmployeeException("enter valid dob");
		}
		return dobString2;
	}
	
	public static boolean verifyId(int id1) throws EmployeeException 
	{
		if(map1.containsKey(id1))
		{
			System.out.println("data already exists");
			throw new EmployeeException("data already exists");
		}
		return true;
	}
	
	public static boolean verifyGender(String s) 
	{
		s=s.trim();
		s = s.toLowerCase();
		if (s.equalsIgnoreCase(MALE) || s.equalsIgnoreCase("female")|| s.equalsIgnoreCase("transgender"))
			return true;
		else {
			System.out.println("invalid gender entered");
			return false;
			}	
	}
}
