package br.com.sistema.main;

import java.util.ArrayList;

import br.com.sistema.cidade.Cidade;
import br.com.sistema.cliente.Cliente;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList clientes = new ArrayList<Cliente>();
		Cliente c = new Cliente("laura");
		
		c.setEmail("laura@gmail.com");
		c.setTelefone("48 8888-9999");
				
		Cidade cid = new Cidade("Florianópolis");
		cid.setEstado("Santa Catarina");
		
		c.setCidade(cid);
		
		clientes.add(c);
		
		Cliente c1 = new Cliente("João");
		
		c1.setEmail("joão@gmail.com");
		c1.setTelefone("48 9999-9999");
				
		Cidade cid1 = new Cidade("Curitiba");
		cid1.setEstado("Paraná");
		
		c1.setCidade(cid1);
		
		clientes.add(c1);
		System.out.println(clientes);
		
		Cliente c2 = new Cliente("Vitória");
		
		c2.setEmail("vitoria@gmail.com");
		c2.setTelefone("48 9999-8888");
				
		Cidade cid2 = new Cidade("Rio de Janeiro");
		cid2.setEstado("Rio de Janeiro");
		
		c2.setCidade(cid2);
		
		clientes.add(c2);
		System.out.println(clientes);
		
		
		
		
	}

}
