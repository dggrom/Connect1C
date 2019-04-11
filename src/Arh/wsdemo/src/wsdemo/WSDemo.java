package wsdemo;

import wsdemo.client.ДанныеНоменклатуры;
import wsdemo.client.ДанныеНоменклатурыPortType;
import wsdemo.client.Номенклатура;
import wsdemo.client.НоменклатураГруппа;

/**
 * Демо-пример иллюстрирует использование JAX-WS для вызова web-сервисов 1С:Предприятия.
 * 
 * @author Medvedev_A
 */
public class WSDemo 
{
	/**
	 * Главный метод
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Создаем Jax-WS прокси на демо web-сервис 1С:Предприятия
		ДанныеНоменклатуры nomenclature = new ДанныеНоменклатуры();

		// Получаем порт для вызова операции web-сервиса
		ДанныеНоменклатурыPortType portType = nomenclature.getДанныеНоменклатурыSoap();
		
		// Выполняем вызов web-сервиса
		НоменклатураГруппа group = portType.получить();
		
		// Печатаем результаты
		printNomenclatureGroup(group, "");
	}
	
	/**
	 * Вывести результаты в окно стандартного вывода.
	 *  
	 * @param group номенклатурная группа
	 * @param indent отступ
	 */
	private static void printNomenclatureGroup(НоменклатураГруппа group, String indent)
	{
		System.out.println(indent + "Номенклатурная группа: " + group.getНаименование());
		
		if (!group.getЭлементы().isEmpty())
		{
			System.out.println(indent + "  Элементы:");
			for (Номенклатура nomenclature : group.getЭлементы())
				printNomenclature(nomenclature, indent + "    ");
		}
		
		if (!group.getГруппы().isEmpty())
		{
			for (НоменклатураГруппа child : group.getГруппы())
				printNomenclatureGroup(child, indent + "    ");
		}
	}

	/**
	 * Вывести результаты в окно стандартного вывода.
	 *  
	 * @param nomenclature номенклатура
	 * @param indent отступ
	 */
	private static void printNomenclature(Номенклатура nomenclature, String indent) 
	{
		System.out.println(indent + "Номенклатура: " + nomenclature.getНаименование());
		System.out.println(indent + "  Полное наименование: " + nomenclature.getПолноеНаименование());
		System.out.println(indent + "  Закупочная цена: " + nomenclature.getЗакупочнаяЦена());
		System.out.println(indent + "  Штрихкод: " + nomenclature.getШтрихКод());
	}
}
