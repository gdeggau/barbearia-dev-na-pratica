import * as moment from 'moment';
import { FreguesDto } from './fregues-dto';

export class Fregues {
    public id?: string;
    public nome: string;
    public dataNascimento: string;
    public email: string;
    public cpf: string;
    public telefone: string;
    public endereco: string;
    public idFoto: string;
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(freguesDto: FreguesDto, originEntity?: string): Fregues {
        const model: any = { ...freguesDto };

        model.dataNascimento = model.dataNascimento && moment(model.dataNascimento).toDate();
        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Fregues;
    }

    public static toDto(fregues: Fregues, originEntity?: string): FreguesDto {
        const dto: any = { ...fregues };

        dto.dataNascimento = dto.dataNascimento && moment(dto.dataNascimento).format('YYYY-MM-DD');
        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
