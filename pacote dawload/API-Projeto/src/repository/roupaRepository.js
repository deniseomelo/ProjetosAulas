import { con } from "./connection.js";


export async function salvar(roupa) {
  const comando = `
      INSERT INTO tb_roupas (categoria, tamanho, preco, descricao)
      VALUES (?, ?, ?, ?)
  `;
  const [info] = await con.query(comando, [roupa.categoria, roupa.tamanho, roupa.preco, roupa.descricao]);
  roupa.id_codigo = info.insertId;
  
  return roupa;
}

export async function listar() {
  const comando = `
     SELECT id_codigo      as id,
            categoria      as categoria,
            tamanho        as tamanho,
            preco          as preco,
            descricao      as descricao
       FROM tb_roupas
  `;

  const [linhas] = await con.query(comando);
  return linhas;
}


export async function buscarPorCategoria(categoria) {
  const comando = `
     SELECT id_codigo      as id,
            categoria      as categoria,
            tamanho        as tamanho,
            preco          as preco,
            descricao      as descricao
       FROM tb_roupas
      WHERE categoria like ?
  `;

  const [linhas] = await con.query(comando, ['%' + categoria + '%']);
  return linhas;
}

export async function alterar(id, novosDadosRoupa) {
  const { categoria, tamanho, preco, descricao } = novosDadosRoupa;

  const comando = `
    UPDATE tb_roupas
    SET categoria = ?, tamanho = ?, preco = ?, descricao = ?
    WHERE id_codigo = ?
  `;

  try {
    const [info] = await con.query(comando, [categoria, tamanho, preco, descricao, id]);
    if (info.affectedRows === 0) {
     
    }

   
        return { message: 'Clothing item updated successfully' };
      } catch (error) {
        
        console.error('Error updating clothing item:', error);
        
       
    throw error; // Optionally, re-throw the error to handle it at a higher level.
      }
    }
export async function remover(id) {
  const comando = 'DELETE FROM tb_roupas WHERE id_codigo = ?';

  const [info] = await con.query(comando, [id]);
  return info.affectedRows;
}
