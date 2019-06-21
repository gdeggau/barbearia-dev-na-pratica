import { Component, OnInit } from "@angular/core";
import { MessageService } from "primeng/components/common/messageservice";
import { Message } from "primeng/components/common/api";

@Component({
  selector: "app-root",
  template: `
            <p-growl [(value)]="msgs"></p-growl>
            <div class="sds-container">
            <s-breadcrumb></s-breadcrumb>
                <router-outlet></router-outlet>
            </div>
        `,
})
export class AppComponent implements OnInit {
  public msgs: Message[] = [];

  constructor(private messageService: MessageService) {}

  public ngOnInit() {
    this.messageService.messageObserver.subscribe(this.onMessageAdded);
  }

  public onMessageAdded(msg: Message) {
    if (!this.msgs) this.msgs = [];
    this.msgs.push(msg);
  }
}
