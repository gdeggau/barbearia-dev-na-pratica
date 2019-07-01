import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.scss']
})
export class SideNavComponent implements OnInit {

  items = [
    {
      label: 'Freguês',
      routerLink: '/fregueses'
    },
    {
      label: 'Funcionário',
      routerLink: '/funcionarios'
    },
    {
      label: 'Serviço',
      routerLink: '/servicos'
    },
    {
      label: 'Atendimento',
      routerLink: '/atendimentos'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
