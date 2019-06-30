import * as moment from 'moment';
import { ServicoDto } from './servico-dto';

export class Servico {
    public id?: string;
    public descricao: string;
    public valor: number;
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(servicoDto: ServicoDto, originEntity?: string): Servico {
        const model: any = { ...servicoDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Servico;
    }

    public static toDto(servico: Servico, originEntity?: string): ServicoDto {
        const dto: any = { ...servico };

        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
