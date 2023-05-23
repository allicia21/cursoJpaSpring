package com.cursojpa;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cursojpa.domain.Categoria;
import com.cursojpa.domain.Cidade;
import com.cursojpa.domain.Cliente;
import com.cursojpa.domain.Endereco;
import com.cursojpa.domain.Estado;
import com.cursojpa.domain.Produto;
import com.cursojpa.domain.enums.TipoCliente;
import com.cursojpa.repositories.CategoriaRepository;
import com.cursojpa.repositories.CidadeRepository;
import com.cursojpa.repositories.ClienteRepository;
import com.cursojpa.repositories.EnderecoRepository;
import com.cursojpa.repositories.EstadoRepository;
import com.cursojpa.repositories.ProdutoRepository;


@EnableAutoConfiguration
@SpringBootApplication
public class CursojpaApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursojpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Urbelandia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
		Cliente cli1 = new Cliente(null, "Ana Maria", "maria.ana@gmail.com" , "61266254855", TipoCliente.PESSOA_FISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("937523245", "37524166"));
		
		Endereco e1 = new Endereco(null, "Rua flores", "250", "casa 20", "Renascença", "65051120", c1, cli1);
		Endereco e2 = new Endereco(null, "Rua das Mercedes", "20", "casa 224", "Forquilha", "61182004", c2, cli1);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
	}

}
