import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

// Angular Material Modules
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatCardModule } from '@angular/material/card';
import { MatSelectModule } from '@angular/material/select';
import { MatIconModule } from '@angular/material/icon';
import { MatGridListModule } from '@angular/material/grid-list';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatButtonModule } from '@angular/material/button';
import { MatInputModule } from '@angular/material/input';
import { FormsModule } from '@angular/forms';
import { MatButtonToggle } from '@angular/material/button-toggle';

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    MatToolbarModule,
    MatCardModule,
    MatSelectModule,
    MatIconModule,
    MatGridListModule,
    MatFormFieldModule,
    MatButtonModule,
    MatInputModule,
    FormsModule,
    MatButtonToggle
  ],
  exports: [
     CommonModule,
    MatToolbarModule,
    MatCardModule,
    MatSelectModule,
    MatIconModule,
    MatGridListModule,
    MatFormFieldModule,
    MatButtonModule,
    MatInputModule,
    FormsModule,
    MatButtonToggle
  ]
})
export class MaterialModule {}
