package br.com.fiap.aula1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoBean extends UnicastRemoteObject implements Carrinho  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -704590090924472434L;

	protected CarrinhoBean() throws RemoteException {
		super();
	}

	private List<Item> itens = new ArrayList<Item>();
	
	public void cadastrarItem(Item item) throws RemoteException{
	itens.add(item);
	System.out.println("Item cadastrado com sucesso: " + item.getNome());
	}
	
	

}
