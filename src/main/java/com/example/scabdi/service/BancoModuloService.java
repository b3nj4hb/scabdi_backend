package com.example.scabdi.service;
import java.util.List;
import com.example.scabdi.entity.BancoModulo;

public interface BancoModuloService {
	List<BancoModulo> readAll();
	BancoModulo create(BancoModulo bm);
	BancoModulo read(int bm);
	void delete(int bm);
	BancoModulo update(BancoModulo bm);
}
