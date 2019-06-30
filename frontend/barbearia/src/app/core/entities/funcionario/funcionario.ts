import * as moment from 'moment';
import { FuncionarioDto } from './funcionario-dto';

export class Funcionario {
    public id?: string;
    public nome: string;
    public dataNascimento: string;
    public email: string;
    public cpf: string;
    public endereco: string;
    public nomeUsuario: string;
    public senha: string;
    public tipo: string;
    public salario: number;
    public idFoto: string;
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(funcionarioDto: FuncionarioDto, originEntity?: string): Funcionario {
        const model: any = { ...funcionarioDto };

        model.dataNascimento = model.dataNascimento && moment(model.dataNascimento).toDate();
        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Funcionario;
    }

    public static toDto(funcionario: Funcionario, originEntity?: string): FuncionarioDto {
        const dto: any = { ...funcionario };

        dto.dataNascimento = dto.dataNascimento && moment(dto.dataNascimento).format('YYYY-MM-DD');
        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
