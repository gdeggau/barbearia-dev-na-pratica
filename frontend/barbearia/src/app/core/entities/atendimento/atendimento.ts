import * as moment from 'moment';
import { AtendimentoDto } from './atendimento-dto';
import { Fregues } from '../fregues/fregues';
import { Funcionario } from '../funcionario/funcionario';
import { Servico } from '../servico/servico';

export class Atendimento {
    public id?: string;
    public fregues: Fregues;
    public funcionario: Funcionario;
    public dataAtendimento: string;
    public valorTotal: number;
    public servicos: Array<Servico>;
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(atendimentoDto: AtendimentoDto, originEntity?: string): Atendimento {
        const model: any = { ...atendimentoDto };

        model.dataAtendimento = model.dataAtendimento && moment(model.dataAtendimento).toDate();
        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Atendimento;
    }

    public static toDto(atendimento: Atendimento, originEntity?: string): AtendimentoDto {
        const dto: any = { ...atendimento };

        dto.dataAtendimento = dto.dataAtendimento && moment(dto.dataAtendimento).format('YYYY-MM-DD');
        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
