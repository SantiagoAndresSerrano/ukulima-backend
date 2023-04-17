package ufps.ukulima.infrastructure.db.springdata.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;
import ufps.ukulima.domain.model.IntercambioCationico.IntercambioCationico;
import ufps.ukulima.infrastructure.db.springdata.entity.IntercambioCationico.IntercambioCationicoEntity;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-17T01:51:24-0500",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 17.0.6 (Amazon.com Inc.)"
)
@Component
public class IntercambioCationicoEntityMapperImpl implements IntercambioCationicoEntityMapper {

    @Override
    public IntercambioCationico toDomain(IntercambioCationicoEntity IntercambioCationicoEntity) {
        if ( IntercambioCationicoEntity == null ) {
            return null;
        }

        IntercambioCationico intercambioCationico = new IntercambioCationico();

        intercambioCationico.setId( IntercambioCationicoEntity.getId() );
        intercambioCationico.setValorMin( IntercambioCationicoEntity.getValorMin() );
        intercambioCationico.setValorMax( IntercambioCationicoEntity.getValorMax() );
        intercambioCationico.setInterpretacion( IntercambioCationicoEntity.getInterpretacion() );

        return intercambioCationico;
    }

    @Override
    public IntercambioCationicoEntity toEntity(IntercambioCationico IntercambioCationico) {
        if ( IntercambioCationico == null ) {
            return null;
        }

        IntercambioCationicoEntity intercambioCationicoEntity = new IntercambioCationicoEntity();

        intercambioCationicoEntity.setInterpretacion( IntercambioCationico.getInterpretacion() );
        intercambioCationicoEntity.setId( IntercambioCationico.getId() );
        intercambioCationicoEntity.setValorMin( IntercambioCationico.getValorMin() );
        intercambioCationicoEntity.setValorMax( IntercambioCationico.getValorMax() );

        return intercambioCationicoEntity;
    }

    @Override
    public List<IntercambioCationico> toDomain(List<IntercambioCationicoEntity> intercambioCationicoEntities) {
        if ( intercambioCationicoEntities == null ) {
            return null;
        }

        List<IntercambioCationico> list = new ArrayList<IntercambioCationico>( intercambioCationicoEntities.size() );
        for ( IntercambioCationicoEntity intercambioCationicoEntity : intercambioCationicoEntities ) {
            list.add( toDomain( intercambioCationicoEntity ) );
        }

        return list;
    }
}
