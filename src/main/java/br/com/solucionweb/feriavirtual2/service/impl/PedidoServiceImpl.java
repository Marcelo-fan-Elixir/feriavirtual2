package br.com.solucionweb.feriavirtual2.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.solucionweb.feriavirtual2.form.PedidoForm;
import br.com.solucionweb.feriavirtual2.model.Pedido;
import br.com.solucionweb.feriavirtual2.repository.PedidoRepository;
import br.com.solucionweb.feriavirtual2.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Override
	@Transactional
	public Pedido savePedido(PedidoForm pedidoForm) {
		return pedidoRepository.save(pedidoForm.convert());
	}

	@Override
	public Optional<Pedido> getPedido(Long id) {
		return pedidoRepository.findById(id);
	}

	@Override
	@Transactional
	public Optional<Pedido> deletePedido(Long id) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		if (pedido.isPresent()) {
			pedidoRepository.deleteById(id);
			return pedido;
		}
		return pedido;
	}

	@Override
	@Transactional
	public Optional<Pedido> updatePedido(Long id, PedidoForm pedidoForm) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		if (pedido.isPresent()) {
			Pedido pedidoUpdated = pedidoRepository.getOne(id);
			pedidoUpdated.setDetallePedido(pedidoForm.getDetallePedido() != null? pedidoForm.getDetallePedido() :
				(pedidoUpdated.getDetallePedido() != null? pedidoUpdated.getDetallePedido() : null));
			
			pedidoUpdated.setFechaPedido(pedidoForm.getFechaPedido() != null? pedidoForm.getFechaPedido() :
				(pedidoUpdated.getFechaPedido() != null? pedidoUpdated.getFechaPedido() : null));
			
			pedidoUpdated.setEstadoPedido(pedidoForm.getEstadoPedido() != null? pedidoForm.getEstadoPedido() :
				(pedidoUpdated.getEstadoPedido() != null? pedidoUpdated.getEstadoPedido() : null));			
			return pedido;
		}
		return pedido;
	}

	@Override
	public List<Pedido> listPedido() {
		return pedidoRepository.findAll();
	}
}
