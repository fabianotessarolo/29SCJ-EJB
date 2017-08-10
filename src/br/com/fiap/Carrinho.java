package br.com.fiap;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Carrinho extends Remote {
	
	void cadastrarItem(Item item) throws RemoteException;


}
