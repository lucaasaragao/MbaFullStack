import { Component, signal } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NaveBar } from '../shared/components/nave-bar/nave-bar';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [ NaveBar],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {
  protected readonly title = signal('Primeiro_Projeto');
}
