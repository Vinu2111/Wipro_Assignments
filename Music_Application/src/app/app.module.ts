// app.module.ts
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { MaterialModule } from './material/material.module';
import { AppRoutingModule } from './app-routing.module'; // ✅ Root router
import { MovieListComponent } from './components/movie-list/movie-list.component';
import { MusicComponent } from './components/music/music.component';

@NgModule({
  declarations: [
    AppComponent,
    MovieListComponent,
    MusicComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    FormsModule,
    MaterialModule,
    AppRoutingModule// ✅ Only here
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
