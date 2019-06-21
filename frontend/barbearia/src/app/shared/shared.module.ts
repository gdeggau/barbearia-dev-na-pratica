import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { ReactiveFormsModule, FormsModule } from "@angular/forms";
import { CurrencyMaskModule } from "ng2-currency-mask";
import { TranslateModule } from "@ngx-translate/core";
import {
    CustomFieldsModule,
    ControlErrorsModule,
    EmptyStateModule,
    LookupModule,
    DynamicFormModule,
    TokenListModule,
} from "@seniorsistemas/angular-components";
import { PanelModule } from "primeng/panel";
import { InputTextModule } from "primeng/inputtext";
import { ButtonModule } from "primeng/button";
import { CheckboxModule } from "primeng/checkbox";
import { TableModule } from "primeng/table";
import { ConfirmDialogModule } from "primeng/confirmdialog";
import { CalendarModule } from "primeng/calendar";
import { DropdownModule } from "primeng/dropdown";
import { TabViewModule } from "primeng/tabview";
import { SharedModule as PrimeSharedModule } from "primeng/shared";

@NgModule({
    exports: [
        FormsModule,
        ReactiveFormsModule,
        CommonModule,
        CurrencyMaskModule,
        TranslateModule,
        CustomFieldsModule,
        ControlErrorsModule,
        EmptyStateModule,
        LookupModule,
        DynamicFormModule,
        TokenListModule,
        PanelModule,
        InputTextModule,
        ButtonModule,
        CheckboxModule,
        TableModule,
        ConfirmDialogModule,
        CalendarModule,
        DropdownModule,
        TabViewModule,
        PrimeSharedModule,
    ],
})
export class SharedModule {}