export interface ServicoDto {
  id?: string;
  descricao: string;
  valor: number;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
