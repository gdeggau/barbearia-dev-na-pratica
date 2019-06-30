export interface FreguesDto {
  id?: string;
  nome: string;
  dataNascimento: string;
  email: string;
  cpf?: string;
  telefone?: string;
  endereco: string;
  idFoto?: string;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
