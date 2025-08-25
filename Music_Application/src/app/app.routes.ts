import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MovieListComponent } from './movie-list/movie-list/movie-list.component';
import { MusicComponent } from './music/music.component';

export const routes: Routes = [
    { path: '', redirectTo: 'movie', pathMatch: 'full' }, // default route
  { path: 'movie', component: MovieListComponent },
  { path: 'music', component: MusicComponent },
  { path: '**', redirectTo: 'movie' } // fallback route
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }