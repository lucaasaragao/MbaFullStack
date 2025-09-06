import { Component } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatIconModule } from '@angular/material/icon';
import { MatButtonModule } from '@angular/material/button';

@Component({
  selector: 'app-nave-bar',
  imports: [ MatToolbarModule, MatIconModule, MatButtonModule ],
  templateUrl: './nave-bar.html',
  styleUrl: './nave-bar.scss'
})
export class NaveBar {

}
