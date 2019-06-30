export interface AtendimentoDto {
  id?: string;
  fregues: any;
  funcionario: any;
  dataAtendimento: string;
  valorTotal: number;
  servicos: Array<any>;
  createdBy?: string;
  createdDate?: Date;
  lastModifiedBy?: string;
  lastModifiedDate?: Date;
  custom?: any;
}
