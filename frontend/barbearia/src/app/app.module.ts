import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { FeaturesModule } from './features/features.module';
import { CoreModule } from './core/core.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { PreloadAllModules, RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { BreadcrumbModule, CyclicJsonInterceptorModule, HttpInterceptorModule } from '@seniorsistemas/angular-components';
import { GrowlModule } from 'primeng/growl';
import { MessageService } from 'primeng/api';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    RouterModule.forRoot([], { paramsInheritanceStrategy: 'always', preloadingStrategy: PreloadAllModules, useHash: true }),
    HttpClientModule,
    HttpInterceptorModule,
    CyclicJsonInterceptorModule,
    BreadcrumbModule,
    GrowlModule,
    FeaturesModule,
    CoreModule,
  ],
  providers: [MessageService],
  bootstrap: [AppComponent]
})
export class AppModule { }