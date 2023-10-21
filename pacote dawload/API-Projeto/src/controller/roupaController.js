import { buscarPorCategoria, listar, remover, salvar,alterar } from "../repository/roupaRepository.js";
import { Router } from "express";
const endpoints = Router();

endpoints.post('/roupa', async (req, resp) => {
  try {
    let roupa = req.body;

    if (!roupa.codigo)
      throw new Error('Código da roupa é obrigatório!');

    if (isNaN(roupa.preco) || roupa.preco <= 0)
      throw new Error('Preço inválido!');

    // outras validações específicas para a loja

    let r = await salvar(roupa);

    resp.send(r);
  }
  catch (err) {
    resp.status(400).send({
      erro: err.message
    });
  }
});

endpoints.get('/roupas', async (req, resp) => {
  try {
    let r = await listar();
    resp.send(r);
  }
  catch (err) {
    resp.status(400).send({
      erro: err.message
    });
  }
});

endpoints.get('/roupa/:id', async (req, resp) => {
  try {
    const id = req.params.id; 
    const roupas = await buscarPorId(id); 

    resp.send(roupas); 
  } catch (err) {
    resp.status(400).send({
      erro: err.message
    });
  }
});
endpoints.delete('/roupas/:id', async (req, resp) => {
  try {
    let id = req.params.id;
    let linhasAfetadas = await remover(id);

    if (linhasAfetadas === 0)
      throw new Error('Roupa não encontrada!');

    resp.send();
  }
  catch (err) {
    resp.status(400).send({
      erro: err.message
    });
  }
});
endpoints.put('/roupa/:id', async (req, resp) => {
  try {
    const id = req.params.id; 
    const novosDadosRoupa = req.body; 
    
    const roupaAtualizada = await alterar(id, novosDadosRoupa);

    if (!roupaAtualizada) {
      resp.status(404).send({ erro: 'Roupa não encontrada' });
    } else {
      resp.send(roupaAtualizada);
    }
  } catch (err) {
    resp.status(400).send({ erro: err.message });
  }
});

export default endpoints;
