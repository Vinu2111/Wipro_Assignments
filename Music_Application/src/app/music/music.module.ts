import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MusicComponent } from './music.component';
import { FormsModule } from '@angular/forms';
import { MaterialModule } from '../material/material.module';

@NgModule({
  declarations: [MusicComponent],
  imports: [
    CommonModule,
    FormsModule,
    MaterialModule   // All Angular Material modules from your MaterialModule
  ],
  exports: [MusicComponent]
})
export class MusicModule { }
