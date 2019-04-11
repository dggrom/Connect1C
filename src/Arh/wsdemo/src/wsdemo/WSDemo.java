package wsdemo;

import wsdemo.client.������������������;
import wsdemo.client.������������������PortType;
import wsdemo.client.������������;
import wsdemo.client.������������������;

/**
 * ����-������ ������������ ������������� JAX-WS ��� ������ web-�������� 1�:�����������.
 * 
 * @author Medvedev_A
 */
public class WSDemo 
{
	/**
	 * ������� �����
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// ������� Jax-WS ������ �� ���� web-������ 1�:�����������
		������������������ nomenclature = new ������������������();

		// �������� ���� ��� ������ �������� web-�������
		������������������PortType portType = nomenclature.get������������������Soap();
		
		// ��������� ����� web-�������
		������������������ group = portType.��������();
		
		// �������� ����������
		printNomenclatureGroup(group, "");
	}
	
	/**
	 * ������� ���������� � ���� ������������ ������.
	 *  
	 * @param group �������������� ������
	 * @param indent ������
	 */
	private static void printNomenclatureGroup(������������������ group, String indent)
	{
		System.out.println(indent + "�������������� ������: " + group.get������������());
		
		if (!group.get��������().isEmpty())
		{
			System.out.println(indent + "  ��������:");
			for (������������ nomenclature : group.get��������())
				printNomenclature(nomenclature, indent + "    ");
		}
		
		if (!group.get������().isEmpty())
		{
			for (������������������ child : group.get������())
				printNomenclatureGroup(child, indent + "    ");
		}
	}

	/**
	 * ������� ���������� � ���� ������������ ������.
	 *  
	 * @param nomenclature ������������
	 * @param indent ������
	 */
	private static void printNomenclature(������������ nomenclature, String indent) 
	{
		System.out.println(indent + "������������: " + nomenclature.get������������());
		System.out.println(indent + "  ������ ������������: " + nomenclature.get������������������());
		System.out.println(indent + "  ���������� ����: " + nomenclature.get��������������());
		System.out.println(indent + "  ��������: " + nomenclature.get��������());
	}
}
