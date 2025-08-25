import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-calculator',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './calc.html',
  styleUrls: ['./calc.css']
})
export class CalculatorComponent {
  num1: number = 0;
  num2: number = 0;
  result: number | string = '';

  add() { this.result = this.num1 + this.num2; }
  subtract() { this.result = this.num1 - this.num2; }
  multiply() { this.result = this.num1 * this.num2; }
  divide() {
    if (this.num2 === 0) {
      this.result = 'Cannot divide by zero';
    } else {
      this.result = this.num1 / this.num2;
    }
  }
}
