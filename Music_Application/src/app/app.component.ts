import { Component } from '@angular/core';
import { MaterialModule } from './material/material.module';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  imports: [MaterialModule, RouterModule] // ✅ Only RouterModule, no forRoot
})
export class AppComponent {
  title = 'MovieAssiment';
}
