import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SideNavComponent } from './shared/common/side-nav/side-nav.component';
import { TopBarComponent } from './shared/common/top-bar/top-bar.component';
import { FeaturesModule } from './features/features.module';
import { PermissionsModule } from '@seniorsistemas/platform-components';
import { TranslateModule } from '@ngx-translate/core';
import { HotkeyModule } from 'angular2-hotkeys';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { GrowlModule } from 'primeng/growl';
import {
    HttpInterceptorModule,
    CyclicJsonInterceptorModule,
    LocaleModule,
    RestUrl,
    BreadcrumbModule,
    LoadingStateModule,
    ProductHeaderModule,
} from '@seniorsistemas/angular-components';
import { CoreModule } from './core/core.module';
import { MessageService } from 'primeng/components/common/messageservice';


@NgModule({
  declarations: [
    AppComponent,
    SideNavComponent,
    TopBarComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    CyclicJsonInterceptorModule,
    LocaleModule.forRoot(),
    BreadcrumbModule,
    LoadingStateModule,
    GrowlModule,
    HotkeyModule.forRoot(),
    ProductHeaderModule,
    TranslateModule.forRoot(),
    FeaturesModule,
    CoreModule,
  ],
  providers: [
    MessageService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
