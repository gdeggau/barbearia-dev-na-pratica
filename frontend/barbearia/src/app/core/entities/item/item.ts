import * as moment from 'moment';
import { ItemDto } from './item-dto';

export class Item {
    public id?: string;
    public descricao?: string;
    public quantidade?: string;
    public valorUnitario?: string;
    public createdBy?: string;
    public createdDate?: Date;
    public lastModifiedBy?: string;
    public lastModifiedDate?: Date;
    public custom?: any;

    public static fromDto(clienteDto: ItemDto, originEntity?: string): Item {
        const model: any = { ...clienteDto };

        model.createdDate = model.createdDate && moment(model.createdDate).toDate();
        model.lastModifiedDate = model.lastModifiedDate && moment(model.lastModifiedDate).toDate();

        return model as Item;
    }

    public static toDto(cliente: Item, originEntity?: string): Item {
        const dto: any = { ...cliente };

        dto.createdDate = dto.createdDate && moment(dto.createdDate).format();
        dto.lastModifiedDate = dto.lastModifiedDate && moment(dto.lastModifiedDate).format();

        delete dto.label;

        return dto;
    }
}
