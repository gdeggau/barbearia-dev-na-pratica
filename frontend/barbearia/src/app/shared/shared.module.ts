import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { SideNavComponent } from './common/side-nav/side-nav.component';
import { TopBarComponent } from './common/top-bar/top-bar.component';

@NgModule({
  declarations: [SideNavComponent, TopBarComponent],
  imports: [
    CommonModule
  ]
})
export class SharedModule { }
