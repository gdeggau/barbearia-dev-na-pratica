export interface FuncionarioDto {
  id?: string;
  nome: string;
  dataNascimento: string;
  email: string;
  cpf: string;
  endereco: string;
  nomeUsuario: string;
  senha: string;
  tipo: string;
  salario: number;
  idFoto?: string;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
