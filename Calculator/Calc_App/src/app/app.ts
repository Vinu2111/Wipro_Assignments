import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CalculatorComponent } from "./calc/calc";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [CommonModule, CalculatorComponent],
  templateUrl: './app.html',
  styleUrls: ['./app.css']
})
export class AppComponent {
  myMessage = 'Welcome to My Angular Calculator!';
}
