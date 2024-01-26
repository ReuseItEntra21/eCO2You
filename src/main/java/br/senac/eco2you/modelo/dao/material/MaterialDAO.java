package br.senac.eco2you.modelo.dao.material;

import br.senac.eco2you.modelo.entidade.material.Material;

public interface MaterialDAO {

	void inserirMaterial(Material material);

	void deletarMaterial(Material material);

	void atualizarMaterial(Material material);
	
	Material recuperarMaterialPorId(long id);
}
