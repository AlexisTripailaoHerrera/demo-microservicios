package cl.amisoft.tramiteapp.service.impl;

import cl.amisoft.tramiteapp.dao.TramiteCausaDao;
import cl.amisoft.tramiteapp.model.TramiteCausa;
import cl.amisoft.tramiteapp.service.TramiteCausaService;
import cl.amisoft.tramiteapp.vo.TramiteCausaVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TramiteCausaServiceImpl implements TramiteCausaService {

    private final TramiteCausaDao tramiteCausaDao;

    @Autowired
    public TramiteCausaServiceImpl(TramiteCausaDao tramiteCausaDao) {
        this.tramiteCausaDao = tramiteCausaDao;
    }

    @Override
    public List<TramiteCausaVo> obtenerTodosPorCausa(Long idCausa) {
        TramiteCausa tc = new TramiteCausa.Builder().causa(idCausa).build();
        List<TramiteCausa> tramitesCausa = tramiteCausaDao.obtenerTodosPorCausa(tc);
        if (!tramitesCausa.isEmpty()) {
            return tramitesCausa.stream().map(t -> new TramiteCausaVo.Builder()
                    .id(t.getId())
                    .causa(t.getCausa())
                    .fechaCreacion(t.getFechaCreacion())
                    .nombreTramite(t.getNombreTramite())
                    .build()).collect(Collectors.toList());
        }
        return Collections.emptyList();
    }
}
