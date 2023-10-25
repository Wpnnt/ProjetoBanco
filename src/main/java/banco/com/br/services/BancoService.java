package banco.com.br.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import banco.com.br.entities.Usuario;
import banco.com.br.repositories.BancoRepository;

@Service
public class BancoService {
	@Autowired
	private BancoRepository repository;

	public List<Usuario> procuraTodos() {
		return repository.findAll();
	}

	public Usuario procuraPorId(Integer id) {
		return repository.findById(id).get();
	}

	public String adicionarUsuario(Usuario usuario) {
		repository.save(usuario);
		return "usuario adicionado com sucesso!";
	}

	public String editarUsuario(Integer id, Usuario usuario) {
		Usuario response = repository.findById(id).get();

		response.setNome(usuario.getNome());
		response.setCpf(usuario.getCpf());
		response.setSenha(usuario.getSenha());
		response.setTelefone(usuario.getTelefone());

		repository.save(response);
		return "Usuario Editado tudo ok.";
	}

	public void excluirUsuario(Integer id) {
		Usuario response = repository.findById(id).get();
		repository.delete(response);
	}
}