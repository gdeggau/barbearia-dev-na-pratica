export interface ClienteDto {
  id?: string;
  nome: string;
  dataNascimento: string;
  creditoHabilitado: string;
  cpf: string;
  idFoto: string;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
