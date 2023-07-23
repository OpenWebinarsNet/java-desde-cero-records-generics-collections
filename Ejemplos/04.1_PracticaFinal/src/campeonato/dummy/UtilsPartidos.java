package campeonato.dummy;

import java.util.List;
import java.util.Random;

import campeonato.model.base.ParticipanteAbstracto;
import campeonato.model.base.Partido;

public interface UtilsPartidos {
	
	public static <T extends ParticipanteAbstracto> Partido<T> simularPartido(Partido<T> partido) {
		Random r = new Random();
		
		int n = r.nextInt(2);
		
		if (n == 0) {
			partido.setGanador(partido.getParticipanteUno());
			partido.setPerdedor(partido.getParticipanteDos());
		} else {
			partido.setGanador(partido.getParticipanteDos());
			partido.setPerdedor(partido.getParticipanteUno());
		}
		
		return partido;
	}
	
	public static <T extends ParticipanteAbstracto> List<Partido<T>> simularPartidos(List<Partido<T>> partidos) {
		for(int i = 0; i < partidos.size(); i++) {
			simularPartido(partidos.get(i));
		}
		return partidos;
	}
	

}
